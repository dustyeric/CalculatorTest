package com.product.calculator.util;

import com.product.calculator.operations.basic.Addition;
import com.product.calculator.operations.basic.Division;
import com.product.calculator.operations.basic.Multiplication;
import com.product.calculator.operations.basic.Subtraction;
import com.product.calculator.operations.specialfunctions.Cube;
import com.product.calculator.operations.specialfunctions.CubeRoot;
import com.product.calculator.operations.specialfunctions.Exponent;
import com.product.calculator.operations.specialfunctions.Factorial;
import com.product.calculator.operations.specialfunctions.LogToBaseTen;
import com.product.calculator.operations.specialfunctions.LogToBaseX;
import com.product.calculator.operations.specialfunctions.Modulos;
import com.product.calculator.operations.specialfunctions.NRoots;
import com.product.calculator.operations.specialfunctions.NaturalLog;
import com.product.calculator.operations.specialfunctions.Percentage;
import com.product.calculator.operations.specialfunctions.PieClass;
import com.product.calculator.operations.specialfunctions.Reciprocal;

import com.product.calculator.operations.specialfunctions.Square;
import com.product.calculator.operations.specialfunctions.SquareRoot;
import com.product.calculator.operations.specialfunctions.TrigArcCos;
import com.product.calculator.operations.specialfunctions.TrigArcSin;
import com.product.calculator.operations.specialfunctions.TrigArcTan;
import com.product.calculator.operations.specialfunctions.TrigCos;

import com.product.calculator.operations.specialfunctions.TrigSin;
import com.product.calculator.operations.specialfunctions.TrigTan;
import com.product.calculator.operations.specialfunctions.ValuePower;
import com.product.calculator.operations.specialfunctions.nSquare;

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
    
    /**
     * registering the trigSin component
     */
    @Autowired
    public TrigSin trigSin;

   @Autowired
    public TrigCos trigCos;
   /**
    * registering the reciprocal component
    */
   
   @Autowired public Reciprocal reciprocal;
   /**
    * registering the modulos component
    */
   
   @Autowired public Modulos modulos;
   /**
    * registering the square component
    */
   
   @Autowired public Square square;
  /**
   * registering the cube component
   */ 
   
   @Autowired  public Cube cube;
   
   /**
    * registering the nsquare component
    */
   
  @Autowired  public nSquare nsquare;
   /**
    * registering the percentage component
    */
   
  @Autowired  public Percentage percentage;
   /**
    * registering the exponent component
    */
   
    @Autowired public  Exponent exponent;
   
   /**
    * registering the factorial component
    */
   
   @Autowired public Factorial factorial;
   /**
    * registering the 10^x component
    */
   @Autowired public ValuePower valuepower;
   /**
    * registering the pi component
    */
   @Autowired public PieClass pieclass;
   /**
    * registering the LogTobase10 component
    */
    @Autowired public LogToBaseTen logToBaseTen;
    /**
    * registering the n roots component
    */
   @Autowired public NRoots nRoots;
   /**
    * registering the NaturalLog component
    */
   @Autowired public NaturalLog naturalLog;
   /**
    * registering the cubeRoot component
    */
   @Autowired public CubeRoot cubeRoot;
   /**
    * registering the SquareRoot component
    */
    @Autowired public SquareRoot squareRoot;
    /**
    * registering the Log to base x component
    */
     @Autowired public LogToBaseX logToBaseX;
     /**
    * registering the arccos component
    */
     @Autowired public TrigArcCos trigArcCos;
     /**
    * registering the arcsin component
    */
     @Autowired public TrigArcSin trigArcSin;
     /**
    * registering the arctan component
    */
     @Autowired public TrigArcTan trigArcTan;
     /**
    * registering the trig tan component
    */
     @Autowired public TrigTan trigTan;
}
