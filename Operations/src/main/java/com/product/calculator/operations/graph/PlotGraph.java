package com.product.calculator.operations.graph;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.operations.interfaces.BasicOperation;
import com.product.calculator.operations.interfaces.PlotFunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


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
    private static Logger LOGGER = LoggerFactory.getLogger(PlotGraph.class);

    @Override
    public double setEquationY() throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int setNoOfPoints() throws CalculatorException {
        return 0;
    }

    @Override
    public double setMinXValue() throws CalculatorException {
        return 0;
    }

    @Override
    public double setMaxXXValue() throws CalculatorException {
        return 0;
    }

    @Override
    public void plot() throws CalculatorException {

    }
}