package com.product.calculator;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.util.Functions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dusty on 7/14/15.
 * the application calculator start class
 */
@Component
public class CalculatorApp {


    @Autowired
    Functions functions;

    /**
     * starts the whole application
     */
    public void startApplication(){

        testAddition();
        startUi();
        //ui team probably start your ui thread from here for instance using a function called
        //startUi()
    }

    /**
     * example ui start function
     */
    public void startUi(){

    }
    /**
     * tests the addtion bean
     */
    public void testAddition() {

        try{

            System.out.println("The answer for 2 + 3 is " + functions.addition.perform(2,3));

        }catch(CalculatorException ex)
        {

        }
    }
}
