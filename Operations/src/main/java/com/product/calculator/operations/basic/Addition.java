package com.product.calculator.operations.basic;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.operations.interfaces.BasicOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by dusty on 7/10/15.
 * always annotate your new function with the "@Component" annotation
 */
@Component
public class Addition implements BasicOperation {

    /**
     * initialise a logger to your function like so
     */
    private static Logger LOGGER = LoggerFactory.getLogger(Addition.class);
    /**
     * Example implementation of the perform method
     * returns an integer 1
     * @param arg1 first argument
     * @param arg2 second argument
     * @return result
     */
    public double perform(double arg1, double arg2) throws CalculatorException{

        LOGGER.info("will attempt to add the numbers "+arg1 + " " + arg2);
        //sample implementation for addition
        return  arg2 + arg1;
    }
}
