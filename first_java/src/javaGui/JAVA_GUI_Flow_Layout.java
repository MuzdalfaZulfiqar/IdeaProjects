package javaGui;

import javax.swing.*;
import java.awt.*;

public class JAVA_GUI_Flow_Layout {
    public static void main(String[] args) {

        // Creating the frame
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setLayout(new FlowLayout(FlowLayout.TRAILING,10,10));  // it is allowing all the
        // buttons to display and move them


        // Creating the panel
        JPanel P = new JPanel();
        P.setPreferredSize(new Dimension(250,150));
        P.setBackground(new Color(66, 154, 187, 255));
        P.setLayout(new FlowLayout());



        // Adding buttons to panel
        JButton b1 = new JButton("1");
        P.add(b1);
        P.add(new JButton("2"));
        P.add(new JButton("3"));
        P.add(new JButton("4"));
        P.add(new JButton("5"));
        P.add(new JButton("6"));
        P.add(new JButton("7"));
        P.add(new JButton("8"));
        P.add(new JButton("9"));

        // Adding the panel to frame

        f.add(P);


        // Setting it to visible
        f.setVisible(true);



    }
}
