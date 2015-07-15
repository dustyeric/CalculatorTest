package com.product.calculator.operations.basic;

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
	
    public double setXValueRange() throws CalculatorException;
    
	public double setPoints() throws CalculatorException;

    public double setAxes(String arg1, String arg1) throws CalculatorException;

    public void draw() throws CalculatorException;
	
}
