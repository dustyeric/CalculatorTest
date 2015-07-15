package com.product.calculator.util;

import com.product.calculator.operations.basic.Addition;
import com.product.calculator.operations.basic.Division;
import com.product.calculator.operations.basic.Multiplication;
import com.product.calculator.operations.basic.Subtraction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by dusty on 7/14/15.
 * functions utility, register your functions following the template for addition
 *
 */
@Component
public class Functions {

    /**
     * registering the addition component
     */
    @Autowired
    public Addition addition;
/**
     * registering the subtraction component
     */
    @Autowired
    public Subtraction subtraction;

    /**
     * registering the subtraction multiplication
     */
    @Autowired
    public Multiplication multiplication;

    /**
     * registering the division component
     */
    @Autowired
    public Division division;

}
