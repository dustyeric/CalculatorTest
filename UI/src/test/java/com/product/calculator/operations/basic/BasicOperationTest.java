package com.product.calculator.operations.basic;

import com.product.calculator.Application;
import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.util.Functions;
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
 * @author .: Clement Nosariemen Ojo
 * @email ..: clement.ojo@live.com, clement.ojo@cwlgroup.com
 * @created : Jul 15, 2015 9:45 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Application.class)
public class BasicOperationTest {

    @Resource
    private Functions functions;

    /**
     * initialise a logger to your function like so
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(BasicOperationTest.class);


    @Test
    public void testBasicAddition() throws CalculatorException {

        LOGGER.info("About carrying out the basic addition test");

        double arg1=9.0;
        double arg2=5;

        Double actual = functions.addition.perform(arg1, arg2);
        Double expected = arg1+arg2;

        LOGGER.info("the actual value gotten was {},", actual);
        LOGGER.info("the expected value is {},", expected);

        assertEquals(expected, actual);

    }

    @Test
    public void testBasicSubtraction() throws CalculatorException {

        LOGGER.info("About carrying out the basic subtraction test");

        double arg1=9.0;
        double arg2=5.2;

        Double actual = functions.subtraction.perform(arg1, arg2);
        Double expected = arg1-arg2;

        LOGGER.info("the actual value gotten was {},", actual);
        LOGGER.info("the expected value is {},", expected);

        assertEquals(expected, actual);
//        assertNotNull(subtraction.perform(arg1, arg2));

    }
}
