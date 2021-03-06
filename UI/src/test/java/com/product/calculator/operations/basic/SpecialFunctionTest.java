/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.calculator.operations.basic;

import com.product.calculator.Application;
import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.util.Functions;
import java.util.logging.Level;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author OLUWATOMILOA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class SpecialFunctionTest {

    @Resource
    private Functions functions;

    /**
     * initialise a logger to your function like so
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(SpecialFunctionTest.class);

    @Test
    public void modulosTest() {
        try {
            LOGGER.info("About carrying out the basic addition test");
            double num1 = functions.modulos.perform(15, 4);
            LOGGER.info("\n************\n\nthe modulos of the two numbers {},", num1);
            LOGGER.info("\n\n****************************\n");
            assertEquals(3.0, num1,Double.MAX_VALUE);
        } catch (CalculatorException ex) {
            java.util.logging.Logger.getLogger(SpecialFunctionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void reciprocalTest() {
        try {
            //LOGGER.info("About carrying out the basic addition test");
            double num1 = functions.reciprocal.perform(4.0);
            LOGGER.info("\n************\n\nthe inverse of the number {},", num1);
            LOGGER.info("\n\n****************************\n");
            assertEquals(0.25, num1,Double.MAX_VALUE);
        } catch (CalculatorException ex) {
            java.util.logging.Logger.getLogger(SpecialFunctionTest.class.getName()).log(Level.SEVERE, null, ex);
             
        }
       
    }

    @Test
    public void squareTest() {
        try {
            //LOGGER.info("finding the square value of a single argument");
            double num1 = functions.square.perform(9.0);
            LOGGER.info("\n************\n\nthe square valueof the number {},", num1);
            LOGGER.info("\n\n****************************\n");
            assertEquals(81.0, num1,Double.MAX_VALUE);
        } catch (CalculatorException ex) {
            java.util.logging.Logger.getLogger(SpecialFunctionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void cubeTest() {
        try {
            //  LOGGER.info("finding the cube value of a single argument");
            double num1 = functions.cube.perform(9.0);
            LOGGER.info("\n************\n\nthe cube valueof the number {},", num1);
            LOGGER.info("\n\n****************************\n");
            assertEquals(729.0, num1,Double.MAX_VALUE);
        } catch (CalculatorException ex) {
            java.util.logging.Logger.getLogger(SpecialFunctionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void nsquareTest() {
        try {
            LOGGER.info("finding the square value of two argument");
            double actualValue = functions.nsquare.perform(5, 3);
            LOGGER.info("\n************\n\nthe nsquare value of the number {},", actualValue);
            LOGGER.info("\n\n****************************\n");
            assertEquals(125.0, actualValue,Double.MAX_VALUE);
        } catch (CalculatorException ex) {
            java.util.logging.Logger.getLogger(SpecialFunctionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void Percenatage() {
        try {
            double Value = functions.percentage.perform(20, 50);
            LOGGER.info("\n************\n\the percentage the numbers {},", Value);
            LOGGER.info("\n\n****************************\n");
            assertEquals(40.0, Value,Double.MAX_VALUE);
        } catch (CalculatorException ex) {
            java.util.logging.Logger.getLogger(SpecialFunctionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void ExponentTest() {
        try {
            double result = functions.exponent.perform(2.0);
            LOGGER.info("\n************\n\the exponent the number {},", result);
            LOGGER.info("\n\n****************************\n");
        } catch (CalculatorException ex) {
            java.util.logging.Logger.getLogger(SpecialFunctionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Test
    public void Factorial() {
        try {
            long result = functions.factorial.perform(17);
            LOGGER.info("\n************\n\the factorial of the number {},", result);
            LOGGER.info("\n\n****************************\n");
        } catch (CalculatorException ex) {
            java.util.logging.Logger.getLogger(SpecialFunctionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Test
    public void ValuepowerTest(){
        try {
            double result= functions.valuepower.perform(3.0);
            LOGGER.info("\n************\n\the 10^x value of the number {},", result);
            LOGGER.info("\n\n****************************\n");
            assertEquals(1000.0, result,Double.MAX_VALUE);
        } catch (CalculatorException ex) {
            java.util.logging.Logger.getLogger(SpecialFunctionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Test
    public void PiTest(){
        try {
            double result=functions.pieclass.perform(2.0);
            LOGGER.info("\n************\n\the pie value {},", result);
            LOGGER.info("\n\n****************************\n");
            assertEquals(3.141529, result,Double.MAX_VALUE);
        } catch (CalculatorException ex) {
            java.util.logging.Logger.getLogger(SpecialFunctionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Test
    public void PlusMinus(){
        try {
            double result=functions.plusMinus.perform(-7.0);
            LOGGER.info("\n************\n\the value {},", result);
            LOGGER.info("\n\n****************************\n");
            assertEquals(7.0, result,Double.MAX_VALUE);
        } catch (CalculatorException ex) {
            java.util.logging.Logger.getLogger(SpecialFunctionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}
