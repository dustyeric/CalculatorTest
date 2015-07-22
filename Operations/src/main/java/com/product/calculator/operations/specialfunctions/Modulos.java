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
public class Modulos implements SpecialFunctions {

    private static final Logger LOGGER = LoggerFactory.getLogger(Modulos.class);

    @Override
    public double perform(double arg1) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet.");
    }
/**
 * 
 * @param arg1
 * @param arg2
 * @return result
 * @throws CalculatorException 
 */
    @Override
    public double perform(double arg1, double arg2) throws CalculatorException {
        LOGGER.info("about getting the remainder value of two arguments");
        return arg1 % arg2;
    }

    @Override
    public long perform(long arg1) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
