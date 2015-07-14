package com.product.calculator.operations.interfaces;

import com.product.calculator.exceptions.CalculatorException;

/**
 * Created by dusty on 7/14/15.
 * this interface should be implemented by special functions, who require one
 * argument like
 * sin, cos , log
 */
public interface SpecialFunctions {

    /**
     * perform a special function
     * @param arg1 first argument
     * @return result
     * @throws CalculatorException
     */
    double perform(double arg1) throws CalculatorException;

    /**
     *
     * @param arg1 first argument
     * @param arg2 second argument
     * @return result
     * @throws CalculatorException
     */
    double perform(double arg1, double arg2) throws CalculatorException;

}
