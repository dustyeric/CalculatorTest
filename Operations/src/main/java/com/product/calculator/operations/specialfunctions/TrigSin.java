package com.product.calculator.operations.specialfunctions;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.operations.interfaces.SpecialFunctions;
//import java.math.BigDecimal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 *
 * @author Tofunmi Ibrahim
 */
@Component
public class TrigSin implements SpecialFunctions {

    /**
     * initialize a logger to your function like so
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TrigSin.class);

    @Override
    public double perform(double degree) throws CalculatorException {

        double radians = Math.toRadians(degree);

        LOGGER.info("about performing the trig sine function for a single argument");
        System.out.format("Value of sin %.1f degrees is %.4f%n", degree, Math.sin(radians));
        double sineValueBeforeRounding = Math.sin(radians);

        //double sineValueAfterRounding = (double) Math.round(sineValueBeforeRounding * 100000) / 100000;
        double sineValueAfterRounding = sineValueBeforeRounding;

        LOGGER.info(" the result from the trig sine function {}, is {} ", degree, sineValueAfterRounding);

        return sineValueAfterRounding;

    }

    @Override
    public double perform(double arg1, double arg2) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long perform(long arg1) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
