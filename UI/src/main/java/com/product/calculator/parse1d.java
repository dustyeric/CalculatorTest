package com.product.calculator;

import java.awt.*;
import java.applet.*;

import com.product.calculator.operations.graph.functions.*;
import com.product.calculator.ui.CalculatorGui;

import javax.swing.*;
public class parse1d extends Applet {

    G2Dint graph = new G2Dint();   // Graph class to do the plotting
    Axis xaxis;
    Axis yaxis;
    DataSet data;


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


        //plot();

    }
/*


    void plot() {
        int points;
        double maximum;
        double minimum;
        double x;
        int count = 0;
        boolean error = false;

        try {
            points = Integer.parseInt(pinput.getText());
        } catch (Exception e) {
//              this.showStatus("Error with number of points!");
            System.out.println("Number of points error " + e.getMessage());
            return;
        }

        try {
            maximum = Double.valueOf(maxinput.getText()).doubleValue();
        } catch (Exception e) {
            //            this.showStatus("Error with X maximum value!");
            System.out.println("X maximum error " + e.getMessage());
            return;
        }

        try {
            minimum = Double.valueOf(mininput.getText()).doubleValue();
        } catch (Exception e) {
            //          this.showStatus("Error with X minimum value!");
            System.out.println("X minimum error " + e.getMessage());
            return;
        }

        ParseFunction function = new ParseFunction(finput.getText());

        if (!function.parse()) {
            //        this.showStatus("Failed to parse function!");
            System.out.println("Failed to parse function!");
            return;
        }

        double d[] = new double[2 * points];

        // this.showStatus("Calculating points!");

        for (int i = 0; i < points; i++) {

            x = minimum + i * (maximum - minimum) / (points - 1);
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


        yaxis.setTitleText(finput.getText());

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
*/

    public static void main(String[] a) {

        javax.swing.JFrame f = new javax.swing.JFrame();
        Applet app = new parse1d();
        app.init();

        f.getContentPane().add(app);
        f.pack();
        f.setSize(new Dimension(500, 500));
        f.setVisible(true);
    }

}




