package javaGui;

// imports
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JAVA_GUI_Panels {
    public static void main(String[] args) {

        // image goes into label
        ImageIcon i = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\first_java\\src\\javaGui\\im1.jpg");

        // border goes into label
        Border b  = BorderFactory.createLineBorder(new Color(177, 79,5),5);
        Border b1  = BorderFactory.createLineBorder(new Color(17, 79,26),5);
        Border b2  = BorderFactory.createLineBorder(new Color(190, 245, 23),5);

        // .............................. Creating labels..........................................
        // label it will be within some panel

        JLabel l = new JLabel();
        l.setIcon(i);
        l.setSize(250,250);

        JLabel l1 = new JLabel();
        //l1.setIcon(i);
        l1.setText("MUZDALFA");
        l1.setVerticalTextPosition(JLabel.CENTER);
        l1.setHorizontalTextPosition(JLabel.CENTER);
        l1.setForeground(Color.black);
        l1.setFont(new Font("MV Boli",Font.BOLD,20));
        l1.setBorder(b); // This will be only surrounding the text since it's the only label in this case

        JLabel l2 = new JLabel();
        //l.setIcon(i);
        l2.setText("ZULFIQAR");
        l2.setVerticalTextPosition(JLabel.CENTER);
        l2.setHorizontalTextPosition(JLabel.CENTER);
        l2.setForeground(Color.black);
        l2.setFont(new Font("MV Boli",Font.BOLD,20));
        l2.setBorder(b1);

        JLabel l3= new JLabel();
        //l.setIcon(i);
        l3.setText("MUZDALFA ZULFIQAR");
        l3.setVerticalTextPosition(JLabel.CENTER);
        l3.setHorizontalTextPosition(JLabel.CENTER);
        l3.setForeground(Color.black);
        l3.setFont(new Font("MV Boli",Font.BOLD,20));
        l3.setBorder(b2);

        // ................................Creating panels..............................................

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(177, 79, 26));
        p1.setBounds(0,0,250,250);
        p1.setLayout(new BorderLayout());


        JPanel p2 = new JPanel();
        p2.setBackground(new Color(17, 79, 26));
        p2.setBounds(250,0,250,250);


        JPanel p3 = new JPanel();
        p3.setBackground(new Color(111, 179, 26));
        p3.setBounds(500,0,250,250);

        JPanel p4 = new JPanel();
        p4.setBackground(new Color(234, 179, 26));
        p4.setBounds(750,0,250,250);

        JPanel p5 = new JPanel();
        p5.setBackground(new Color(5, 245, 223));
        p5.setBounds(0,250,1000,250);

        JPanel p6 = new JPanel();
        p6.setBackground(new Color(177, 79, 26));
        p6.setBounds(0,500,250,250);


        JPanel p7 = new JPanel();
        p7.setBackground(new Color(17, 79, 26));
        p7.setBounds(250,500,250,250);


        JPanel p8 = new JPanel();
        p8.setBackground(new Color(111, 179, 26));
        p8.setBounds(500,500,250,250);

        JPanel p9 = new JPanel();
        p9.setBackground(new Color(234, 179, 26));
        p9.setBounds(750,500,250,250);


        JFrame f = new JFrame();
        f.setSize(1000,1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);// this is compulsory sort of thing
        f.setVisible(true);


        // adding labels to panels
        p1.add(l);
        p2.add(l1);
        p3.add(l2);
        p5.add(l3);


        // adding panels to frame
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.add(p4);

        f.add(p5);
        f.add(p6);
        f.add(p7);
        f.add(p8);
        f.add(p9);


        // ImageIcon and Border goes into the label as setIcon and setBorder
        // Label goes into the panel as add
        // panel goes into the frame as add

    }
}
