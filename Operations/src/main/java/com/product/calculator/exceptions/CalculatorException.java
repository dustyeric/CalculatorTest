package com.product.calculator.exceptions;

/**
 * Created by dusty on 7/1/15.
 * Calculator exception class, you can use this to throw your own specific
 * exceptions, in you implementations
 */
public class CalculatorException extends Exception {

    public CalculatorException() {

    }
    public CalculatorException(String message) {
        super (message);
    }

    public CalculatorException(Throwable cause) {
        super (cause);
    }

    public CalculatorException(String message, Throwable cause) {
        super (message, cause);
    }

}
