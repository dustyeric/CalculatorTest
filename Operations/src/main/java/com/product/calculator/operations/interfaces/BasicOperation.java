package com.product.calculator.operations.interfaces;

import com.product.calculator.exceptions.CalculatorException;

/**
 * Created by dusty on 7/10/15.
 * BasicOperation Interface
 * all basic calculator com.product.calculator.operations must implement this interface
 */
public interface BasicOperation {
    /**
     * takes two arguments and returns a result Object
     * @param arg1
     * @param arg2
     * @return
     */
    double perform(double arg1 , double arg2) throws CalculatorException;

}
