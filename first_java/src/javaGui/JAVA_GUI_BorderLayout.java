package javaGui;

import javax.swing.*;
import java.awt.*;

public class JAVA_GUI_BorderLayout {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);

        // Here setLayout means consider the frame as container
        f.setLayout(new BorderLayout(10,10));

        //-----------------------------------------SUPER PANEL-----------------------------------
        // Creating panels
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        // Setting their backgrounds
        p1.setBackground(Color.BLACK);
        p2.setBackground(Color.CYAN);
        p3.setBackground(Color.YELLOW);
        p4.setBackground(Color.MAGENTA);
        p5.setBackground(Color.RED);

        // Setting their sizes
        p1.setPreferredSize(new Dimension(100,100));
        p2.setPreferredSize(new Dimension(100,100));
        p3.setPreferredSize(new Dimension(100,100));
        p4.setPreferredSize(new Dimension(100,100));
        p5.setPreferredSize(new Dimension(100,100));

        // Adding panels to frames
        f.add(p1,BorderLayout.NORTH);
        f.add(p2,BorderLayout.SOUTH);
        f.add(p3,BorderLayout.WEST);
        f.add(p4,BorderLayout.EAST);
        f.add(p5,BorderLayout.CENTER); // p5 is CENTER panel, so we can use this as a new Layout manager

        //------------------------------------- SUB PANELS ---------------------------------------
        // Creating panels
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel();
        JPanel p9 = new JPanel();
        JPanel p10 = new JPanel();

        // Setting their backgrounds
        p6.setBackground(Color.RED);
        p7.setBackground(Color.BLACK);
        p8.setBackground(Color.GREEN);
        p9.setBackground(Color.GRAY);
        p10.setBackground(Color.DARK_GRAY);

        // This is acting this as the container for sub panels
        p5.setLayout(new BorderLayout());

        // Setting their sizes
        p6.setPreferredSize(new Dimension(50,50));
        p7.setPreferredSize(new Dimension(50,50));
        p8.setPreferredSize(new Dimension(50,50));
        p9.setPreferredSize(new Dimension(50,50));
        p10.setPreferredSize(new Dimension(50,50));

        p5.add(p6,BorderLayout.NORTH);
        p5.add(p7,BorderLayout.SOUTH);
        p5.add(p8,BorderLayout.WEST);
        p5.add(p9,BorderLayout.EAST);
        p5.add(p10,BorderLayout.CENTER);
    }
}
