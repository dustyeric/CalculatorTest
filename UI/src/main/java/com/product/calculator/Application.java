package com.product.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dusty on 7/10/15.
 * Main application thread
 * do not touch this class
 */
@Configuration
@ComponentScan
public class Application {


    public static void main(String[] args) {

        //initialise spring context
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);

        //start the calculator application
        CalculatorApp calculatorApp = context.getBean(CalculatorApp.class);
        calculatorApp.startApplication();

    }
}
