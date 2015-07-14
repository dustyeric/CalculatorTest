package com.product.calculator.operations.basic;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.operations.interfaces.BasicOperation;

/**
 * Created by dusty on 7/10/15.
 */
public class Addition implements BasicOperation {

    /**
     * Example implementation of the perform method
     * returns an integer 1
     * @param arg1 first argument
     * @param arg2 second argument
     * @return result
     */
    public double perform(double arg1, double arg2) throws CalculatorException{

        //sample implementation for addition
        return  arg2 + arg1;
    }
}
