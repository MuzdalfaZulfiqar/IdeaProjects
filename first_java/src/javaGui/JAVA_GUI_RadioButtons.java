package javaGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAVA_GUI_RadioButtons {
    public static void main(String[] args) {
        // These buttons only allow to select only one of them
        //new fraym();
        new prac();
    }
}
class fraym extends JFrame implements ActionListener{

    JRadioButton b1;
    JRadioButton b2;
    JRadioButton b3;
    fraym(){

        // Radio buttons helps use to make choose anything we want just like we want to choose one option
        // in the computer based MCQ paper
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        b1 = new JRadioButton();
        b1.setText("PIZZA");
        b1.setFocusable(false);
        b1.setFont(new Font(Font.SERIF,Font.BOLD,20));
        b1.addActionListener(this);

        b2 = new JRadioButton();
        b2.setText("BURGER");
        b2.setFocusable(false);
        b2.setFont(new Font(Font.SERIF,Font.BOLD,20));
        b2.addActionListener(this);

        b3 = new JRadioButton();
        b3.setText("LOADED FRIES");
        b3.setFocusable(false);
        b3.setFont(new Font(Font.SERIF,Font.BOLD,20));
        b3.addActionListener(this);

        // We are making this group because we want to select only one button at a time if we remove
        // this group then we will be able to select all the buttons
        ButtonGroup group = new ButtonGroup();
        group.add(b1);
        group.add(b2);
        group.add(b3);

        this.add(b1,BorderLayout.EAST);
        this.add(b2,BorderLayout.CENTER);
        this.add(b3,BorderLayout.WEST);
        this.pack();
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            System.out.println("Your order for pizza is delivered");
        }
        else if(e.getSource()==b2){
            System.out.println("Your order for burger is delivered");
        }
        else{
            System.out.println("Your order for fries is delivered");
        }

    }
}
class prac extends JFrame implements ActionListener{
    JRadioButton bold;
    JRadioButton plain;
    JRadioButton italics;
    JRadioButton boldItalic;
    JTextField text;
    prac(){

        text = new JTextField("This is my font");
        text.setPreferredSize(new Dimension(380,40));

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(420,420);
    this.setLayout(new FlowLayout());

    bold = new JRadioButton("Bold");
    bold.setFont(new Font("MV Boli",Font.PLAIN,20));
    bold.addActionListener(this);
    bold.setFocusable(false);

    plain = new JRadioButton("Plain");
    plain.setFont(new Font("MV Boli",Font.PLAIN,20));
    plain.addActionListener(this);
    plain.setFocusable(false);

    italics = new JRadioButton("Italics");
    italics.setFont(new Font("MV Boli",Font.PLAIN,20));
    italics.addActionListener(this);
    italics.setFocusable(false);

    boldItalic = new JRadioButton("Bold/Italic");
    boldItalic.setFont(new Font("MV Boli",Font.PLAIN,20));
    boldItalic.addActionListener(this);
    boldItalic.setFocusable(false);

    this.add(text,BorderLayout.NORTH);
    this.add(bold);
    this.add(plain);
    this.add(italics);
    this.add(boldItalic);
    this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==bold){
            text.setFont(new Font("MV Boli",Font.BOLD,20));
        }
        else if (e.getSource()==italics){
            text.setFont(new Font("MV Boli",Font.ITALIC,20));
        }
        else if(e.getSource()==plain){
            text.setFont(new Font("MV Boli",Font.PLAIN,20));
        }
        else {
            text.setFont(new Font("MV Boli",Font.BOLD | Font.ITALIC,20));
        }
    }
}
