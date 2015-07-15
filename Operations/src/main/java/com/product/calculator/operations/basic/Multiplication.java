package com.product.calculator.operations.basic;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.operations.interfaces.BasicOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by dusty on 7/15/15.
 * @author Ekwueme Chukwudum
 * This is the multiplication component
 * */


@Component
public class Multiplication implements BasicOperation {

    //this is my logger class
    Logger LOGGER = LoggerFactory.getLogger(Multiplication.class);

    @Override
    public double perform(double arg1, double arg2) throws CalculatorException {

        LOGGER.info("multiplication of "+arg1 + " and "+arg2);

        //an error occured
        if(arg1 < 0)
        {
            throw new CalculatorException("arg1 cannot be negative");
        }
        //multiplying two numbers
        double result = arg1 * arg2;

        LOGGER.info("Result = "+ result);
        return result;
    }
}
