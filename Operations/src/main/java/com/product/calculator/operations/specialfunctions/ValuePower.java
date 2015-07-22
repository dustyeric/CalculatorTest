/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.calculator.operations.specialfunctions;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.operations.interfaces.SpecialFunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author TOMILOLA
 */
@Component
public class ValuePower implements SpecialFunctions {

    private static final Logger LOGGER = LoggerFactory.getLogger(ValuePower.class);

    /**
     * finds the value of 10 to the power of a single argument
     *
     * @param arg1
     * @return integer
     * @throws CalculatorException
     */
    @Override
    public double perform(double arg1) throws CalculatorException {
        LOGGER.info("10 raised to a specific value");
        return Math.pow(10, arg1);

    }

    @Override
    public double perform(double arg1, double arg2) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long perform(long arg1) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
