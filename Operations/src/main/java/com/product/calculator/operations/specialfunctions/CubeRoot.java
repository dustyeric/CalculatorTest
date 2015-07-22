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
 * @author user
 */
@Component
public class CubeRoot implements SpecialFunctions {
/**
     * initialize a logger to your function like so
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(CubeRoot.class);
    @Override
    public double perform(double value) throws CalculatorException {
        LOGGER.info("about performing the cuberoot function for a single argument");
        return Math.cbrt(value);
    }

    @Override
    public double perform(double arg1, double arg2) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
