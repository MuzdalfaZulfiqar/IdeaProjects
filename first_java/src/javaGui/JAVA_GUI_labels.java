package javaGui;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class JAVA_GUI_labels {
    public static void main(String[] args) {
        //  FROM BRO CODE TUTORIAL
//
//        // This is a component ,and we can put it in the label with setIcon
//        ImageIcon i=  new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\first_java\\src\\javaGui\\im.jpg");
//
//        // This is a component and we can put it JLabel with setBorder
//        Border b = BorderFactory.createLineBorder(new Color(0,128,128),3);
//
//        // This is a component ,and we can put it in the frame with
//        JLabel j = new JLabel();
//        j.setIcon(i);
//        j.setText("Tangled");
//        j.setHorizontalTextPosition(JLabel.CENTER);   // set image left,right or center
//        j.setVerticalTextPosition(JLabel.CENTER); // set image top,bottom,center
//        j.setForeground( new Color(0,128,112)); // set text color
//        j.setFont(new Font("MV Boli",Font.BOLD,70));// set font of text
//        j.setIconTextGap(-10); // Set gap between text and image
//        j.setBorder(b); // set border of label
//        j.setVerticalAlignment(JLabel.CENTER); // set vertical position of image and text within label
//        j.setHorizontalAlignment(JLabel.CENTER);// set horizontal position of image and text within label
//        //j.setBounds(0,0,564,564);// set x and y positions within frame
//
//
//
//        JFrame f = new JFrame();
//        f.setTitle("Labels");
//        //f.setSize(564,564);
//        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        //f.setLayout(null);
//        f.setVisible(true);
//        f.add(j); // this one will ask to add the component
//
//        // this must be done at end
//        f.pack(); // this will set the image accordingly ,so we do not need to mention the size
//
//
//

        // MY PRACTICE

     /*   ImageIcon ii = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\first_java\\src\\javaGui\\im1.jpg");

        Border bp = BorderFactory.createLineBorder(new Color(177, 79, 26),5);

        JLabel jb = new JLabel();
        jb.setIcon(ii);
        jb.setText("KITAB GHAR");
        jb.setVerticalTextPosition(JLabel.CENTER);
        jb.setHorizontalTextPosition(JLabel.CENTER);
        jb.setForeground(new Color(177, 79, 26));
        jb.setFont(new Font("MV Boli",Font.BOLD,50));
        jb.setBorder(bp);




        // we created a frame where we will be adding our label
        JFrame jf = new JFrame();
        jf.setSize(1000,1000);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.add(jb);

        jf.pack();
*/
        new labelPractice();
    }
}
class labelPractice extends JFrame{
    labelPractice(){

        ImageIcon i = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\first_java\\src\\javaGui\\im1.jpg");

        JLabel l = new JLabel();
        l.setIcon(i);
        l.setBorder(BorderFactory.createLineBorder(new Color(133,122,89),5));
        l.setText("MY PAINTING");
        l.setForeground(new Color(110, 44, 23));
        l.setFont(new Font("MV Boli",Font.BOLD,50));
        l.setHorizontalTextPosition(JLabel.CENTER);
        l.setVerticalTextPosition(JLabel.TOP);
        l.setBackground(new Color(111,121,12));
        l.setOpaque(true);
        l.setVerticalAlignment(JLabel.CENTER);
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setBounds(0,0,500,500);

        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(l);
        this.setLayout(null); // It will not display anything until we set the bounds in label using
        // setBounds(x,y,width,height)
        l.setBackground(new Color(0, 111, 94, 255));
        //this.pack();

    }
}