package com.product.calculator.operations.basic;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.operations.interfaces.BasicOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author .: Clement Nosariemen Ojo
 * @email ..: clement.ojo@live.com, clement.ojo@cwlgroup.com
 * @created : Jul 14, 2015 10:06 AM
 */
@Component
public class Subtraction implements BasicOperation{

    /**
     * initialise a logger to your function like so
     */
    private static Logger LOGGER = LoggerFactory.getLogger(Subtraction.class);

    /**
     * Example implementation of the perform method
     * returns an integer 1
     * @param arg1 first argument
     * @param arg2 second argument
     * @return result
     */
    @Override
    public double perform(double arg1, double arg2) throws CalculatorException {
        LOGGER.info("will attempt to subtract the numbers "+arg1 + " " + arg2);
        //sample implementation for subtraction
        return arg1-arg2;
    }
}
