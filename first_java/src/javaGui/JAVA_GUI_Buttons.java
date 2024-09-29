package javaGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAVA_GUI_Buttons {
    public static void main(String[] args) {
        //MYFrame1 F = new MYFrame1();
       // frame f1  = new frame();
        new button();
    }
}
class MYFrame1 extends JFrame implements ActionListener {
    JButton b;
    MYFrame1(){


        ImageIcon i = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\first_java\\src\\javaGui\\hand.png");

        // Creating button....

        // Button will work on implementing ActionListener interface and implementing its method
        // action performed where we will display what we want it will be outside of constructor
        b = new JButton();
        b.setBounds(100,100,500,250);
        b.setFocusable(false); // this is to remove the unnecessary boundary around text
        // 1)-- use this as described earlier
        b.addActionListener(this);// compulsory for button action
        // 2)-- Or use lambda expression
        // b.addActionListener(e-> System.out.println("Yeye"));
        b.setText("Click me");
        b.setForeground(Color.WHITE);
        b.setIcon(i);
        b.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        b.setHorizontalTextPosition(JButton.RIGHT);
        b.setVerticalTextPosition(JButton.BOTTOM);
        b.setFont(new Font("MV Boli",Font.BOLD,30));
        b.setBackground(new Color(213, 136, 150));

        // Creating frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        // button goes into frame
        this.add(b);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b){
            System.out.println("Yay");
        }
    }
}

// BUTTON MADE BY MUZDALFA
class frame extends JFrame implements ActionListener{

    JButton b ;
    frame(){

        ImageIcon i = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\first_java\\src\\javaGui\\hand1.png");

        b = new JButton();
        b.setBounds(100,100,300,150);
        b.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
        b.setBackground(new Color(0x006F66));
        b.setText("CLICK ME!");
        b.setFocusable(false);
        b.setForeground(Color.BLACK);
        b.setFont(new Font("Arial",Font.BOLD,20));
        b.addActionListener(this);
        b.setIcon(i);
        b.setHorizontalTextPosition(JButton.RIGHT);
        b.setVerticalTextPosition(JButton.CENTER);

        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        this.add(b);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            System.out.println("YES! YOU CLICKED ME....");
        }
    }
}

class button extends JFrame implements ActionListener{
    JButton b;
  button(){

      b = new JButton();
      b.setBounds(200,200,250,100);
      b.setText("Are you a button? ");
      b.setFont(new  Font(Font.SANS_SERIF,Font.BOLD,20));
      b.setForeground(Color.BLACK);
      b.setFocusable(false);
      b.setBackground(new Color(16, 124, 108));
      b.addActionListener(this);
      b.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

      this.setSize(500,500);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout(null);
      this.setVisible(true);
      this.add(b);

  }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            System.out.println("Yes..");
        }
    }
}