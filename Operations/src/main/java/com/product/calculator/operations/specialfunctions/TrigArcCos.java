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
public class TrigArcCos implements SpecialFunctions {

    /**
     * initialize a logger to your function like so
     */

    private static final Logger LOGGER = LoggerFactory.getLogger(TrigArcCos.class);

    @Override
    public double perform(double radian) throws CalculatorException {

        double degrees = Math.toDegrees(radian);
        LOGGER.info("about performing the trig TrigArcsine function for a single argument");
        System.out.println("The arcsine of " + radian + " is degrees" + Math.toDegrees(Math.acos(radian)));
        double acosValueBeforeRounding = Math.toDegrees(Math.acos(radian));

        // double acosValueAfterRounding = (double) Math.round(acosValueBeforeRounding * 100000) / 100000;
        LOGGER.info(" the result from the trig tan function {}, is {}", radian, acosValueBeforeRounding);

        return acosValueBeforeRounding;

    }

    @Override
    public double perform(double arg1, double arg2) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
