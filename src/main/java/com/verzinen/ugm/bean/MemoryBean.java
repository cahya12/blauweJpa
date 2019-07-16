package com.verzinen.ugm.bean;


import org.primefaces.model.chart.PieChartModel;
import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;

import com.verzinen.ugm.ejb.DatanodeClient;
import com.verzinen.ugm.model.datanode.Memory;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@Named
@ViewScoped
public class MemoryBean implements Serializable {
	
	static final long serialVersionUID = 123l;
	
    private PieChartModel model;
    private LineChartModel lineModel1;
    private LineChartSeries series1;
    private LineChartModel lineModel2;
    private LineChartSeries series2;
    private AtomicInteger  cpuUsage;
    private List<AtomicInteger> _mainTestList = new ArrayList<AtomicInteger>();
    
    
    @EJB DatanodeClient data;
    //private DatanodeView data = new DatanodeView();

    @PostConstruct
    public void init() {
    	
        model = new PieChartModel();
        model.set("MemoryFree", data.getMemory().getMemFree());//jobs in thousands
        model.set("MemoryFreeAvg", data.getMemory().getMemFreeAvg() );
        model.set("MemoryFreeMax", data.getMemory().getMemFreeMax());
        model.set("MemoryFreeMin", data.getMemory().getMemFreeMin() );
        
        model.set("SwapFree", data.getMemory().getSwapFree());//jobs in thousands
        model.set("SwapFreeAvg", data.getMemory().getSwapFreeAvg() );
        model.set("SwapFreeMax", data.getMemory().getSwapFreeMax());
        model.set("SwapFreeMin", data.getMemory().getSwapFreeMin() );
  
        //followings are some optional customizations:
        //set title
        model.setTitle("Memory free");
        //set legend position to 'e' (east), other values are 'w', 's' and 'n'
        model.setLegendPosition("e");
        //enable tooltips
        model.setShowDatatip(true);
        //show labels inside pie chart
        model.setShowDataLabels(true);
        //show label text  as 'value' (numeric) , others are 'label', 'percent' (default). Only one can be used.
        model.setDataFormat("value");
        //format: %d for 'value', %s for 'label', %d%% for 'percent'
        model.setDataLabelFormatString("%dK");
        //pie sector colors
        model.setSeriesColors("aaf,afa,faa,ffa,aff,faf,ddd");
        
        System.out.println("Goin init .. 1");
        
        createLineModels();
        
        System.out.println("Goin init .. 3 .. createLineModels() invoked");
        
        AtomicInteger e = new AtomicInteger(0);
        for (int i = 0 ;i<10; i++) _mainTestList.add(e);
        initSimulator();
        _simulator();
        
        System.out.println("Goin init .. 4 .. initSimulator() invoked");
        
    }
    
    
    
    private void createLineModels() {
    	
        lineModel1 = new LineChartModel();
        series1 = new LineChartSeries();
        series1.setLabel("Series 1");
        
        initLinearModel();
        
        System.out.println("Goin init .. 2");
        
        lineModel1.setTitle("Linear Chart");
        lineModel1.setLegendPosition("e");
        Axis yAxis = lineModel1.getAxis(AxisType.Y);
        yAxis.setMin(0);
        yAxis.setMax(10);
        
        lineModel2 = new LineChartModel();
        series2 = new LineChartSeries();
        series2.setLabel("Series 2");
        
        lineModel2.setTitle("Linear Chart");
        lineModel2.setLegendPosition("e");
        
        lineModel2.addSeries(series2);
        
        Axis y_Axis = lineModel2.getAxis(AxisType.Y);
        y_Axis.setMin(0);
        y_Axis.setMax(10);
         
    }
    
    private void initLinearModel() {
         
         System.out.println("Goin init .. _mm_size? ");
         
         List<Memory> mm = data.getViewMemoryList();
         
         int _mm_size = mm.size();
         
         System.out.println("Goin init .. _mm_size = "+ _mm_size);
         
         for (int i =0; i<10; i++) {
        	 series1.set(i+1, mm.get(i).getMemFreeMax());
         }
         
         lineModel1.addSeries(series1);
         
         System.out.println("Goin init .. populated");
    }
    
    
    private void initLinearModel2() {       

        
        System.out.println("Goin init .. _mm_? ");
        
        int idx = _mainTestList.size() - 10;
            
        for (int i =0; i<10; i++) {
       	 	series2.set(i+1, _mainTestList.get(idx+i));
        }
        
       // lineModel2.addSeries(series2);
        
        System.out.println("Goin init .. populated");
   }
    
    
    
    
    public void refrishList() {
    	data.populateMemoryViewList();
    	
    	initLinearModel();
    	
       // return lineModel1;
    }
    
    public PieChartModel getModel() {
        return model;
    }
    
    public LineChartModel getLineModel1() {
        return lineModel1;
    }
    
    public LineChartModel getLineModel2() {
        return lineModel2;
    }
    
    private void initSimulator() {
       cpuUsage = new AtomicInteger(50);
        
        ExecutorService es = Executors.newFixedThreadPool(1);
        
        es.execute(() -> {
        	
            while (true) {
            	
                int i = ThreadLocalRandom.current()
                                         .nextInt(-15, 16);
                
                int usage = cpuUsage.get();
                
                usage += i;
                if (usage < 0) {
                    usage = 0;
                } else if (usage > 100) {
                    usage = 100;
                }
                
                cpuUsage.set(usage);
                
                _mainTestList.add(cpuUsage);
                
                System.out.println("initSimulator .. _mainTestList size = "+ _mainTestList.size());
                
                try {
                	// sleep for 25000 millis = 25 detik
                    TimeUnit.MILLISECONDS.sleep(25000);
                } catch (InterruptedException e) {
                }
            }
        });
    }
    
    private void _simulator() {
          
         ExecutorService es = Executors.newFixedThreadPool(30);
         
         es.execute(() -> {
         	
             while (true) {
                  
            	 initLinearModel2();
                 System.out.println("_simulator .. running ... "+ _mainTestList.size());
                 
                 try {
                     TimeUnit.MILLISECONDS.sleep(30000);
                 } catch (InterruptedException e) {
                 }
             }
         });
     }
     
    
}