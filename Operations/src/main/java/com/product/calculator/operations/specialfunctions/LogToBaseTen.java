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
public class LogToBaseTen implements SpecialFunctions {
/**
     * initialize a logger to your function like so
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(LogToBaseTen.class);
    @Override
    public double perform(double num) throws CalculatorException {
  //System.out.println("Base 10 logarithm value is: "+Math.log10(num));
        LOGGER.info("about performing the LogToBaseTen function for a single argument");
        return Math.log10(num);
    }

    @Override
    public double perform(double arg1, double arg2) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long perform(long arg1) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
