package com.verzinen.ugm.bean;


import org.primefaces.model.chart.PieChartModel;

import com.verzinen.ugm.ejb.JMXRestClient;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;

@Named
public class OSDataBean {
    private PieChartModel model;
    @EJB JMXRestClient data;
    //private DatanodeView data = new DatanodeView();

    @PostConstruct
    public void init() {
    	
    //	data = new DatanodeView();
    	
    	
        model = new PieChartModel();
        model.set("Committed Virtual Memory Size", data.getOperatingSystemData().getCommittedVirtualMemorySize() );//jobs in thousands
        model.set("Total Swap Space Size", data.getOperatingSystemData().getTotalSwapSpaceSize());
        model.set("FreeSwap Space Size", data.getOperatingSystemData().getFreeSwapSpaceSize());
        model.set("Free Physical Memory Size", data.getOperatingSystemData().getFreePhysicalMemorySize() );
        model.set("Total Physical Memory Size", data.getOperatingSystemData().getTotalPhysicalMemorySize() );
        
        
    
        //followings are some optional customizations:
        //set title
        model.setTitle("OS Data");
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
    }
    
    

    public PieChartModel getModel() {
        return model;
    }
}