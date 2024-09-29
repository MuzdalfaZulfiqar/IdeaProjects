package javaGui;

import javax.swing.*;
import java.awt.*;

public class JAVA_GUI_Grid_Layout {
    public static void main(String[] args) {

        // Creating frame
//        JFrame f = new JFrame();
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setSize(400,250);
//        // setting layout to gridLayout
//        f.setLayout(new GridLayout(3,3,3,3));
//        // Adding buttons to frame
//       /* f.add(new JButton("1"));
//        f.add(new JButton("2"));
//        f.add(new JButton("3"));
//        f.add(new JButton("4"));
//        f.add(new JButton("5"));
//        f.add(new JButton("6"));
//        f.add(new JButton("7"));
//        f.add(new JButton("8"));
//        f.add(new JButton("9"));
//*/
//
//
////        Creating panel
//          JPanel p1 = new JPanel();
//        p1.setLayout(new GridLayout(4,3));
//
//        // Adding buttons to panel
//        p1.add(new JButton("1"));
//        p1.add(new JButton("2"));
//        p1.add(new JButton("3"));
//        p1.add(new JButton("4"));
//        p1.add(new JButton("5"));
//        p1.add(new JButton("6"));
//        p1.add(new JButton("7"));
//        p1.add(new JButton("8"));
//        p1.add(new JButton("9"));
//        p1.add(new JButton("0"));
//        p1.add(new JButton("Start"));
//        p1.add(new JButton("Stop"));
//
//        JPanel p2 = new JPanel(new BorderLayout());
//        p2.add(new JTextField("Text here"),BorderLayout.NORTH);
//        p2.add(p1,BorderLayout.CENTER);
//
//        // Adding panel to frame
//        //f.add(p2,BorderLayout.EAST);
//
//        JPanel p3 = new JPanel();
//        p3.add(new JButton("Food here"),BorderLayout.CENTER);
//        p3.add(p2,BorderLayout.EAST);
//        f.add(p3);
//        // Setting frame to visible
//        f.setVisible(true);
//        f.pack();
       // new calculator();
        new b1();
    }
}

class calculator extends JFrame{
    calculator(){

        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400,250);
        // setting layout to gridLayout
        f.setLayout(new GridLayout(4,4,3,3));

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(4,4));
        p1.add(new JButton("7"));
        p1.add(new JButton("8"));
        p1.add(new JButton("9"));
        p1.add(new JButton("/"));
        p1.add(new JButton("4"));
        p1.add(new JButton("5"));
        p1.add(new JButton("6"));
        p1.add(new JButton("*"));
        p1.add(new JButton("3"));
        p1.add(new JButton("2"));
        p1.add(new JButton("1"));
        p1.add(new JButton("-"));
        p1.add(new JButton("0"));
        p1.add(new JButton("."));
        p1.add(new JButton("="));
        p1.add(new JButton("+"));

        JPanel p2 = new JPanel(new BorderLayout());
        p2.add(new JTextField(),BorderLayout.NORTH);
        p2.add(p1,BorderLayout.CENTER);

        f.add(p2,BorderLayout.NORTH);
        f.setVisible(true);
        f.setTitle("Calculator");
        f.pack();


    }
}
class b1 extends JFrame{
    b1(){
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(300,250);

    JPanel BluePanel = new JPanel(new BorderLayout());
    BluePanel.setBackground(Color.BLUE);
    BluePanel.setBounds(0,0,100,200);

        JPanel WPanel = new JPanel(new BorderLayout());
        WPanel.setBackground(Color.WHITE);
        WPanel.setBounds(100,0,100,200);

        JPanel GPanel = new JPanel(new BorderLayout());
        GPanel.setBackground(Color.DARK_GRAY);
        GPanel.setBounds(200,0,100,200);


        JButton b1 = new JButton();
        b1.setBackground(Color.BLUE);
        b1.setSize(100,20);
        b1.setFont(new Font(Font.DIALOG,Font.BOLD,5));
        b1.setText("Blue");

        JButton b2 = new JButton();
        b2.setBackground(Color.WHITE);
        b2.setSize(100,20);
        b2.setFont(new Font(Font.DIALOG,Font.BOLD,5));
        b2.setText("White");

        JButton b3 = new JButton();
        b3.setBackground(Color.DARK_GRAY);
        b3.setSize(100,20);
        b3.setFont(new Font(Font.DIALOG,Font.BOLD,5));
        b3.setText("Gray");

        JPanel LPanel = new JPanel(new BorderLayout());
        LPanel.setBackground(Color.LIGHT_GRAY);
        LPanel.setBounds(0,0,300,50);
        LPanel.add(b1,BorderLayout.WEST);
        LPanel.add(b2,BorderLayout.CENTER);
        LPanel.add(b3,BorderLayout.EAST);

        f.add(BluePanel);
        f.add(WPanel);
        f.add(GPanel);
        f.add(LPanel,BorderLayout.SOUTH );

        f.setVisible(true);

}
}