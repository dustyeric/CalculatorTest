/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.product.calculator.ui;

/**
 *
 * @author OLUWATOMILOA
 */
public class CalculatorGui extends javax.swing.JFrame {
private double total,total2=0.0;
private char math_operator;
    /**
     * Creates new form calculator
     */
    public CalculatorGui() {
        initComponents();
    }
        private void getOperator(String btnText)
    {
        math_operator=btnText.charAt(0);
        total=total+Double.parseDouble(txtscreen.getText());
        txtscreen.setText(" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        butSeven = new javax.swing.JButton();
        butEight = new javax.swing.JButton();
        butNine = new javax.swing.JButton();
        butClear = new javax.swing.JButton();
        butFive = new javax.swing.JButton();
        butFour = new javax.swing.JButton();
        butSix = new javax.swing.JButton();
        butMultiply = new javax.swing.JButton();
        butOne = new javax.swing.JButton();
        butTwo = new javax.swing.JButton();
        butThree = new javax.swing.JButton();
        butPlus = new javax.swing.JButton();
        butDot = new javax.swing.JButton();
        butEquals = new javax.swing.JButton();
        butMinus = new javax.swing.JButton();
        butMemory = new javax.swing.JButton();
        butMod = new javax.swing.JButton();
        butDivide = new javax.swing.JButton();
        butPlusminus = new javax.swing.JButton();
        butZero = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        butSine = new javax.swing.JButton();
        butCosine = new javax.swing.JButton();
        butTangent = new javax.swing.JButton();
        butReciprocal = new javax.swing.JButton();
        butLogarithm = new javax.swing.JButton();
        butFactorial = new javax.swing.JButton();
        butExponential = new javax.swing.JButton();
        butSinearc = new javax.swing.JButton();
        butln = new javax.swing.JButton();
        butPi = new javax.swing.JButton();
        butTenpowerofx = new javax.swing.JButton();
        butCosinearc = new javax.swing.JButton();
        butXpowery = new javax.swing.JButton();
        butSquare = new javax.swing.JButton();
        butCube = new javax.swing.JButton();
        butTangentarc = new javax.swing.JButton();
        butOpenbracket = new javax.swing.JButton();
        butClosebracket = new javax.swing.JButton();
        butSquareroot = new javax.swing.JButton();
        ButRootofx = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFunctionofx = new javax.swing.JTextField();
        txtPoints = new javax.swing.JTextField();
        txtMinimum = new javax.swing.JTextField();
        txtMaximum = new javax.swing.JTextField();
        butPlot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtscreen = new javax.swing.JTextArea();
        graphPanel = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butSeven.setBackground(new java.awt.Color(102, 102, 102));
        butSeven.setText("7");
        butSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSevenActionPerformed(evt);
            }
        });

        butEight.setBackground(new java.awt.Color(102, 102, 102));
        butEight.setText("8");
        butEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEightActionPerformed(evt);
            }
        });

        butNine.setBackground(new java.awt.Color(102, 102, 102));
        butNine.setText("9");
        butNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butNineActionPerformed(evt);
            }
        });

        butClear.setBackground(new java.awt.Color(102, 102, 102));
        butClear.setText("CE");

        butFive.setBackground(new java.awt.Color(102, 102, 102));
        butFive.setText("5");
        butFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFiveActionPerformed(evt);
            }
        });

        butFour.setBackground(new java.awt.Color(102, 102, 102));
        butFour.setText("4");
        butFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFourActionPerformed(evt);
            }
        });

        butSix.setBackground(new java.awt.Color(102, 102, 102));
        butSix.setText("6");

        butMultiply.setBackground(new java.awt.Color(102, 102, 102));
        butMultiply.setText("*");

        butOne.setBackground(new java.awt.Color(102, 102, 102));
        butOne.setText("1");
        butOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butOneActionPerformed(evt);
            }
        });

        butTwo.setBackground(new java.awt.Color(102, 102, 102));
        butTwo.setText("2");
        butTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butTwoActionPerformed(evt);
            }
        });

        butThree.setBackground(new java.awt.Color(102, 102, 102));
        butThree.setText("3");
        butThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butThreeActionPerformed(evt);
            }
        });

        butPlus.setBackground(new java.awt.Color(102, 102, 102));
        butPlus.setText("+");

        butDot.setBackground(new java.awt.Color(102, 102, 102));
        butDot.setText(".");
        butDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDotActionPerformed(evt);
            }
        });

        butEquals.setBackground(new java.awt.Color(102, 102, 102));
        butEquals.setText("=");

        butMinus.setBackground(new java.awt.Color(102, 102, 102));
        butMinus.setText("-");

        butMemory.setBackground(new java.awt.Color(102, 102, 102));
        butMemory.setText("M");

        butMod.setBackground(new java.awt.Color(102, 102, 102));
        butMod.setText("%");

        butDivide.setBackground(new java.awt.Color(102, 102, 102));
        butDivide.setText("/");

        butPlusminus.setBackground(new java.awt.Color(102, 102, 102));
        butPlusminus.setText("±");

        butZero.setBackground(new java.awt.Color(102, 102, 102));
        butZero.setText("0");
        butZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butZeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(butSeven)
                        .addGap(18, 18, 18)
                        .addComponent(butEight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(butNine)
                        .addGap(18, 18, 18)
                        .addComponent(butClear))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(butPlusminus)
                                    .addGap(16, 16, 16)
                                    .addComponent(butMod)
                                    .addGap(18, 18, 18)
                                    .addComponent(butMemory))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(butZero)
                                            .addGap(18, 18, 18)
                                            .addComponent(butDot, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGap(57, 57, 57)
                                            .addComponent(butTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(butThree)
                                        .addComponent(butEquals))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(butMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(butDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(butOne, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(butFour)
                            .addGap(18, 18, 18)
                            .addComponent(butFive)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(butSix)
                            .addGap(18, 18, 18)
                            .addComponent(butMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butClear)
                    .addComponent(butNine)
                    .addComponent(butEight)
                    .addComponent(butSeven))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butFour)
                    .addComponent(butFive)
                    .addComponent(butSix)
                    .addComponent(butMultiply))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butOne)
                    .addComponent(butPlus)
                    .addComponent(butThree)
                    .addComponent(butTwo))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butDot)
                    .addComponent(butEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butMinus)
                    .addComponent(butZero))
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butMod)
                    .addComponent(butMemory)
                    .addComponent(butDivide)
                    .addComponent(butPlusminus))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        butSine.setText("sin");

        butCosine.setText("cos");

        butTangent.setText("tan");

        butReciprocal.setText("  1/x");

        butLogarithm.setText("log");

        butFactorial.setText("n!");

        butExponential.setText("exp");

        butSinearc.setText("sin-1");

        butln.setText("ln");

        butPi.setText(" π ");

        butTenpowerofx.setText("10^x");

        butCosinearc.setText("cos-1");

        butXpowery.setText("x^y");

        butSquare.setText("x^2");

        butCube.setText("x^3");

        butTangentarc.setText("tan-1");

        butOpenbracket.setText("(");

        butClosebracket.setText(")");

        butSquareroot.setText("2√");

        ButRootofx.setText("x√");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(butOpenbracket, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butXpowery, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(butln, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(butLogarithm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butSine, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(butCosine, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butFactorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butPi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butSquare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(butClosebracket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(butTangent, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(butExponential, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butCube, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(butSquareroot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(butTenpowerofx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butReciprocal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(butSinearc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ButRootofx, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(butTangentarc)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(butCosinearc)
                                .addGap(8, 8, 8))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butSine)
                    .addComponent(butCosine)
                    .addComponent(butTangent)
                    .addComponent(butReciprocal))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butLogarithm)
                    .addComponent(butFactorial)
                    .addComponent(butExponential)
                    .addComponent(butSinearc))
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butln)
                    .addComponent(butPi)
                    .addComponent(butTenpowerofx)
                    .addComponent(butCosinearc))
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butXpowery)
                    .addComponent(butSquare)
                    .addComponent(butCube)
                    .addComponent(butTangentarc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butOpenbracket)
                    .addComponent(butClosebracket)
                    .addComponent(butSquareroot)
                    .addComponent(ButRootofx))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("f(x)");

        jLabel3.setText("no of points");

        jLabel4.setText("min X Value");

        jLabel5.setText("max X Value");

        butPlot.setText("Plot Graph");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMinimum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaximum, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPoints, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butPlot, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFunctionofx, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFunctionofx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPoints, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMinimum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaximum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(butPlot)
                .addContainerGap())
        );

        txtscreen.setColumns(20);
        txtscreen.setRows(4);
        jScrollPane1.setViewportView(txtscreen);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Basic Calculator", jPanel2);

        javax.swing.GroupLayout graphPanelLayout = new javax.swing.GroupLayout(graphPanel);
        graphPanel.setLayout(graphPanelLayout);
        graphPanelLayout.setHorizontalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        graphPanelLayout.setVerticalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Graph", graphPanel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFiveActionPerformed
        String fiveText=txtscreen.getText()+butFive.getText();
         txtscreen.setText(fiveText);
    }//GEN-LAST:event_butFiveActionPerformed

    private void butDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDotActionPerformed
         String dotText=txtscreen.getText()+butDot.getText();
        txtscreen.setText(dotText);
    }//GEN-LAST:event_butDotActionPerformed

    private void butOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butOneActionPerformed
         String oneText=txtscreen.getText()+butOne.getText();
         txtscreen.setText(oneText);
    }//GEN-LAST:event_butOneActionPerformed

    private void butTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butTwoActionPerformed
       String twoText=txtscreen.getText()+butTwo.getText();
       txtscreen.setText(twoText);
    }//GEN-LAST:event_butTwoActionPerformed

    private void butThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butThreeActionPerformed
         String threeText=txtscreen.getText()+butThree.getText();
         txtscreen.setText(threeText);
    }//GEN-LAST:event_butThreeActionPerformed

    private void butFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFourActionPerformed
        String fourText=txtscreen.getText()+butFour.getText();
         txtscreen.setText(fourText);
    }//GEN-LAST:event_butFourActionPerformed

    private void butSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSevenActionPerformed
        String sevenText=txtscreen.getText()+butSeven.getText();
         txtscreen.setText(sevenText);
    }//GEN-LAST:event_butSevenActionPerformed

    private void butEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEightActionPerformed
         String eightText=txtscreen.getText()+butEight.getText();
         txtscreen.setText(eightText);
    }//GEN-LAST:event_butEightActionPerformed

    private void butNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butNineActionPerformed
        String nineText=txtscreen.getText()+butNine.getText();
        txtscreen.setText(nineText);
    }//GEN-LAST:event_butNineActionPerformed

    private void butZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butZeroActionPerformed
        String zeroText=txtscreen.getText()+butZero.getText();
        txtscreen.setText(zeroText);
    }//GEN-LAST:event_butZeroActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButRootofx;
    private javax.swing.JButton butClear;
    private javax.swing.JButton butClosebracket;
    private javax.swing.JButton butCosine;
    private javax.swing.JButton butCosinearc;
    private javax.swing.JButton butCube;
    private javax.swing.JButton butDivide;
    private javax.swing.JButton butDot;
    private javax.swing.JButton butEight;
    private javax.swing.JButton butEquals;
    private javax.swing.JButton butExponential;
    private javax.swing.JButton butFactorial;
    private javax.swing.JButton butFive;
    private javax.swing.JButton butFour;
    private javax.swing.JButton butLogarithm;
    private javax.swing.JButton butMemory;
    private javax.swing.JButton butMinus;
    private javax.swing.JButton butMod;
    private javax.swing.JButton butMultiply;
    private javax.swing.JButton butNine;
    private javax.swing.JButton butOne;
    private javax.swing.JButton butOpenbracket;
    private javax.swing.JButton butPi;
    private javax.swing.JButton butPlot;
    private javax.swing.JButton butPlus;
    private javax.swing.JButton butPlusminus;
    private javax.swing.JButton butReciprocal;
    private javax.swing.JButton butSeven;
    private javax.swing.JButton butSine;
    private javax.swing.JButton butSinearc;
    private javax.swing.JButton butSix;
    private javax.swing.JButton butSquare;
    private javax.swing.JButton butSquareroot;
    private javax.swing.JButton butTangent;
    private javax.swing.JButton butTangentarc;
    private javax.swing.JButton butTenpowerofx;
    private javax.swing.JButton butThree;
    private javax.swing.JButton butTwo;
    private javax.swing.JButton butXpowery;
    private javax.swing.JButton butZero;
    private javax.swing.JButton butln;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtFunctionofx;
    private javax.swing.JTextField txtMaximum;
    private javax.swing.JTextField txtMinimum;
    private javax.swing.JTextField txtPoints;
    private javax.swing.JTextArea txtscreen;
    // End of variables declaration//GEN-END:variables
}
