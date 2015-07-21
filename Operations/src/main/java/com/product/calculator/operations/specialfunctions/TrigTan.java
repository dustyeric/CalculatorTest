
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
public class TrigTan implements SpecialFunctions {

    /**
     * initialize a logger to your function like so
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(TrigTan.class);
    @Override
    public double perform(double degree) throws CalculatorException {
       double radians = Math.toRadians(degree);
        LOGGER.info("about performing the trig tangent function for a single argument");
         System.out.println("Value of cos " +degree+ " is: "+Math.tan(radians));
        //return Math.tan(radians);
         double tanValueBeforeRounding = Math.tan(radians);

       //double tanValueAfterRounding = (double) Math.round(tanValueBeforeRounding * 100000) / 100000;

        LOGGER.info(" the result from the trig tan function {}, is {} ", degree, tanValueBeforeRounding);

        return tanValueBeforeRounding;
    }

    @Override
    public double perform(double arg1, double arg2) throws CalculatorException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
