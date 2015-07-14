package com.product.calculator.ui;

import com.product.calculator.operations.basic.Addition;

/**
 * Created by dusty on 7/10/15.
 * Main application thread
 */
public class Application {

    public static void main(String[] args) {

        System.out.println("main thread");
        Addition addition = new Addition();


    }
}
