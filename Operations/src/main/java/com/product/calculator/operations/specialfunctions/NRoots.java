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
public class NRoots implements SpecialFunctions {
/**
     * initialize a logger to your function like so
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(NRoots.class);
    @Override
    public double perform(double arg1) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double perform(double x, double y) throws CalculatorException {
       //System.out.println("Answer:"+Math.pow(x,(1/y)));
         LOGGER.info("about performing the NAturalLog function for a single argument");
        return Math.pow(x, (1 / y));
    }

    @Override
    public long perform(long arg1) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
