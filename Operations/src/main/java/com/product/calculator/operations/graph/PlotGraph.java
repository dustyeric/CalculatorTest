package com.product.calculator.operations.basic;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.operations.interfaces.BasicOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ptolemy.plot.*;

/**
 * Created by dusty on 7/10/15.
 * @author Ekwueme CHukwudum
 * always annotate your new function with the "@Component" annotation
 */
@Component
public class PlotGraph implements PlotFunctions{

    /**
     * initialise a logger to your function like so
     */
    private static Logger LOGGER = LoggerFactory.getLogger(Addition.class);
    
    //Plot myPlot = new Plot();
    
    public double setPoints() throws CalculatorException{
    	
    }

    public double setAxes(String arg1, String arg1) throws CalculatorException{
    	
    }

    public void draw() throws CalculatorException{
    	
    }

}