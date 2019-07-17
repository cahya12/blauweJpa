package com.verzinen.ugm.bean;


import org.primefaces.model.chart.PieChartModel;

import com.verzinen.ugm.ejb.JMXRestClient;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;

@Named
public class DNJvmMetrics {
    private PieChartModel model;
    @EJB JMXRestClient data;
    //private DatanodeView data = new DatanodeView();

    @PostConstruct
    public void init() {
    	
    //	data = new DatanodeView();
    	
    	
        model = new PieChartModel();
        model.set("Heap Max", data.getDNJvmMetrics().getMemHeapMaxM() );//jobs in thousands
        model.set("Heap Used", data.getDNJvmMetrics().getMemHeapUsedM());
        model.set("Heap Committed", data.getDNJvmMetrics().getMemHeapCommittedM());
        model.set("Non Heap Committed", data.getDNJvmMetrics().getMemNonHeapCommittedM());
        model.set("Non Heap Max", data.getDNJvmMetrics().getMemNonHeapMaxM());
        model.set("Non Heap Used", data.getDNJvmMetrics().getMemNonHeapUsedM());
        
    
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