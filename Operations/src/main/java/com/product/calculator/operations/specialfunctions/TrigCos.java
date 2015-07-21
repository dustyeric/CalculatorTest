package com.product.calculator.operations.specialfunctions;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.operations.interfaces.SpecialFunctions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tofunmi Ibrahim
 */
@Component
public class TrigCos implements SpecialFunctions {

    /**
     * initialize a logger to your function like so
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TrigCos.class);

    @Override
    public double perform(double degree) throws CalculatorException {
        double radians = Math.toRadians(degree);
        LOGGER.info("about performing the trig cosine function for a single argument");
        System.out.println("Value of cos " + degree + " is: " + Math.cos(radians));
        double cosineValueBeforeRounding = Math.cos(radians);

        //double cosineValueAfterRounding = (double) Math.round(cosineValueBeforeRounding * 100000) / 100000;
        double cosineValueAfterRounding = cosineValueBeforeRounding;

        LOGGER.info(" the result from the trig cosine function {}, is {} ", degree, cosineValueAfterRounding);

        return cosineValueAfterRounding;            

        // return Math.cos(radians);
    }

    @Override
    public double perform(double arg1, double arg2) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
