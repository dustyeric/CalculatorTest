package com.product.calculator.util;

import com.product.calculator.operations.basic.Addition;
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


}
