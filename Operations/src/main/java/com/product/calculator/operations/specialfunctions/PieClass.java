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
public class PieClass implements SpecialFunctions{
    private static final Logger LOGGER= LoggerFactory.getLogger(PieClass.class);
/**
 * returns PIE value
 * @param arg1
 * @return double
 * @throws CalculatorException 
 */
    @Override
    public double perform(double arg1) throws CalculatorException {
        LOGGER.info("getting Pie value");
       return Math.PI;
       
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
