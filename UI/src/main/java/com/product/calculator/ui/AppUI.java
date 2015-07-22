package com.product.calculator.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;
import java.net.PasswordAuthentication;

/**
 * Created by dusty on 7/15/15.
 * @author dusty
 * UI main component
 */
@Component
public class AppUI {

    /**
     * starts the ui
     */

    @Autowired
    CalculatorGui calculatorGui;

    public void startUI() {
        calculatorGui.initComponents();
        calculatorGui.pack();
        calculatorGui.setVisible(true);
    }
    
    public void setDisplay(){
    	
    }

}
