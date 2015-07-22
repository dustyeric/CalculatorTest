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
public class Factorial implements SpecialFunctions {

    private final static Logger LOGGER = LoggerFactory.getLogger(Factorial.class);

   
  @Override
    public double perform(double arg1, double arg2) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double perform(double arg1) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/**
 * finds the factorial of a single argument
 * @param arg1
 * @return
 * @throws CalculatorException 
 */
    @Override
    public long perform(long arg1) throws CalculatorException {
         long factorial = fact(arg1);
        LOGGER.info("finding the factorial of a value");
        return (long) factorial;
    }

    static long fact(long n) {
        long output;
        if (n == 1) {
            return 1;
        }
        //Recursion
        output = fact(n - 1) * n;
        return output;
    }
    }
    
   
