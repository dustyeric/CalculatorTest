package com.product.calculator;

import java.awt.*;
import java.applet.*;

import com.product.calculator.operations.graph.functions.*;
import com.product.calculator.ui.CalculatorGui;

import javax.swing.*;
public class parse1d extends Applet {

    CalculatorGui calculatorGui = new CalculatorGui();
    G2Dint graph = new G2Dint();   // Graph class to do the plotting
    Axis xaxis;
    Axis yaxis;
    DataSet data;


    String fox;
    int points;
    double maximum;
    double minimum;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public double getMaximum() {
        return maximum;
    }

    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    public double getMinimum() {
        return minimum;
    }

    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    public String getFox() {
        return fox;
    }

    public void setFox(String fox) {
        this.fox = fox;
    }

    public void init() {
        Label title = new Label("Function Parsing", Label.CENTER);
        JPanel panel = new JPanel();
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        Font font = new Font("TimesRoman", Font.PLAIN, 15);

        title.setFont(new Font("TimesRoman", Font.PLAIN, 25));


        setLayout(new BorderLayout());
        add("North", title);
        add("Center", panel);


        panel.setLayout(gridbag);

        c.weightx = 1.0;
        c.weighty = 1.0;
        c.gridwidth = 3;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.fill = GridBagConstraints.BOTH;

        gridbag.setConstraints(graph, c);

        panel.add(graph);

        xaxis = graph.createXAxis();
        xaxis.setTitleText("X");

        yaxis = graph.createYAxis();


        data = new DataSet();

        xaxis.attachDataSet(data);
        yaxis.attachDataSet(data);
        graph.attachDataSet(data);


        graph.setDataBackground(new Color(255, 200, 175));
        graph.setBackground(new Color(200, 150, 100));

        plot();

    }

    void plot() {

        double x;
        int count = 0;
        boolean error = false;

        ParseFunction function = new ParseFunction(this.fox);

        if (!function.parse()) {
            //        this.showStatus("Failed to parse function!");
            System.out.println("Failed to parse function!");
            return;
        }

        double d[] = new double[2 * this.points];

        // this.showStatus("Calculating points!");

        for (int i = 0; i < this.points; i++) {

            x = this.minimum + i * (this.maximum - this.minimum) / (this.points - 1);
            d[count] = x;
            try {
                d[count + 1] = function.getResult(x);
                count += 2;
            } catch (Exception e) {
                error = true;
            }

        }


        if (count <= 2) {
//             this.showStatus("Error NO POINTS to PLOT!"); 
            System.out.println("Error NO POINTS to PLOT!");
            return;
        } else if (error) {
            //           this.showStatus("Error while Calculating points!");
            System.out.println("Error while calculating points!");
        }


        yaxis.setTitleText(this.fox);

        data.deleteData();

        try {
            data.append(d, count / 2);
        } catch (Exception e) {
            //         this.showStatus("Error while appending data!");
            System.out.println("Error while appending data!");
            return;
        }


        graph.repaint();
    }


    public void create() {

        javax.swing.JFrame f = new javax.swing.JFrame();
        Applet app = new parse1d();
        app.init();
        f.getContentPane().add(app);
        f.pack();
        f.setSize(new Dimension(500, 500));
        f.setVisible(true);
    }

}




