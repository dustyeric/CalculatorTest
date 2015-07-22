package com.product.calculator.operations.interfaces;

import com.product.calculator.exceptions.CalculatorException;
import com.product.calculator.operations.interfaces.BasicOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author opedisu
 */

public interface PlotFunctions {
    
	 /**
     * @return result
     * @throws CalculatorException
     */

    public double setEquationY() throws CalculatorException;

    public int setNoOfPoints() throws CalculatorException;

    public double setMinXValue() throws CalculatorException;

    public double setMaxXXValue() throws CalculatorException;

    public void plot() throws CalculatorException;

}
