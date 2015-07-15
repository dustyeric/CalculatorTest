/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.calculator.operations.basic;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.operations.interfaces.BasicOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Adedamola
 */
@Component
public class Division implements BasicOperation {
    
    Logger LOGGER = LoggerFactory.getLogger(Division.class);

    @Override
    public double perform(double arg1, double arg2) throws CalculatorException {
        LOGGER.info("division of "+arg1 + " and "+arg2);

        //an error occured
        if(arg2== 0)
        {
            throw new CalculatorException("division is not allowed");
        }
        //dividing two numbers
        double result = arg1 / arg2;

        
        return result;
       
    }
    
}
