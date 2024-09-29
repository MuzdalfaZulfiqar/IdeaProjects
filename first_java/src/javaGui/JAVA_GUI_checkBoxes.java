package javaGui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAVA_GUI_checkBoxes {
    public static void main(String[] args) {
       //new buttons();
        new manual();
    }
}
class Frame12 extends JFrame implements ActionListener {

    JButton B;
    JCheckBox box;

    ImageIcon tick ;
    ImageIcon cross;
    Frame12(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        tick = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\first_java\\src\\javaGui\\tick.png");
        cross = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\first_java\\src\\javaGui\\cross.png");


        B = new JButton();
        B.setText("Submit");
        B.addActionListener(this);
        B.setFocusable(false);
        B.setBackground(new Color(0xBB748F));

        box= new JCheckBox();
        box.setSize(100,100);
        box.setText("I am not a robot");
        box.setFont(new Font(Font.SERIF,Font.BOLD,20));
        box.setForeground(Color.BLACK);
        box.setFocusable(false);
        box.setBackground(new Color(0x3EAF9E));
        box.setIcon(cross);// add first image
        box.setSelectedIcon(tick); //  allows to switch b/w them

        this.add(box,BorderLayout.CENTER);
        this.add(B,BorderLayout.CENTER);
       // this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==B){
            System.out.println(box.isSelected());

        }
    }
}
class buttons extends JFrame implements ActionListener{

    JButton b;
    JCheckBox box;
    JButton b1;
    buttons(){
        // The check box is just like the reCAPTCHA we encounter on certain websites

        b = new JButton();
        b.setSize(200,200);
        b.setText("Yes");
        b.addActionListener(this);
        b.setFocusable(false);

        b1=new JButton();
        b1.setSize(200,200);
        b1.setText("No");
        b1.addActionListener(this);
        b1.setFocusable(false);

        box = new JCheckBox();
        box.setFocusable(false);
        box.setText("Have you ever read a novel?");
        box.setForeground(Color.DARK_GRAY);
        box.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        box.setBackground(Color.WHITE);

        JFrame f = new JFrame();
        f.setSize(420,420);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(box);
        f.add(b,BorderLayout.WEST);
        f.add(b1,BorderLayout.EAST);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==b){
    System.out.println("That's great");
}
else{
    System.out.println("Oops, It's okay..");
}
    }
}
class manual extends JFrame implements ActionListener{
    JTextField text;
    JCheckBox bold;
    JCheckBox Italic;

    manual() {
        text = new JTextField("My name is Muzdalfa ");
        text.setPreferredSize(new Dimension(380,40));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420, 420);
        this.setLayout(new FlowLayout());

        bold = new JCheckBox("Bold");
        bold.setFocusable(false);
        bold.setFont(new Font( "MV Boli",Font.PLAIN,20));
        bold.addActionListener(this);

        Italic = new JCheckBox("Italics");
        Italic.setFocusable(false);
        Italic.setFont(new Font( "MV Boli",Font.PLAIN,20));
        Italic.addActionListener(this);

        this.add(text);
        this.add(Italic);
        this.add(bold);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==bold){
            text.setFont(new Font("MV Boli",Font.BOLD,20));
        }
        else if (e.getSource()==Italic) {
            text.setFont(new Font("MV Boli",Font.ITALIC,20));
        }
        else if (e.getSource()==bold && e.getSource()==Italic){
            text.setFont(new Font("MV Boli",Font.ITALIC | Font.BOLD,20));
        }

    }
}