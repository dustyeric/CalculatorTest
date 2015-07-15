package com.product.calculator;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.ui.AppUI;
import com.product.calculator.util.Functions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dusty on 7/14/15.
 * the application calculator start class
 */
@Component
public class CalculatorApp {



    private static Logger LOGGER = LoggerFactory.getLogger(CalculatorApp.class);

    @Autowired
    Functions functions;

    @Autowired
    AppUI appUI;
    /**
     * starts the whole application
     */
    public void startApplication(){

        try {
            double answer = functions.addition.perform(2,6);
            LOGGER.info("The ans of that is "+answer);

            answer = functions.subtraction.perform(3,4);
            LOGGER.info("The ans of that is "+answer);

            answer = functions.multiplication.perform(-3,4);
            LOGGER.info("The ans of that is "+answer);
            
            answer = functions.division.perform(10,2);
            LOGGER.info("The ans of that is "+answer);


        } catch (CalculatorException e) {
           // e.printStackTrace();
            LOGGER.error(e.getMessage());
        }


        appUI.startUI();
        testAddition();
        //ui team probably start your ui thread from here for instance using a function called
        //startUi()
    }


    /**
     * tests the addtion bean
     */
    public void testAddition() {

        try{

            System.out.println("The answer for 2 + 3 is "
                    + functions.addition.perform(2,3));

        }catch(CalculatorException ex)
        {

        }
    }
}
