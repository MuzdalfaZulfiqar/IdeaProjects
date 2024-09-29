package javaGui;
import javax.swing.*;
import java.awt.*;

public class JAVA_GUI_Frames {
    public static void main(String[] args) {

        // either create an instance or make a custom class in custom class refer them using this keyword
        myFrame m = new myFrame();
//        JFrame f = new JFrame();
//        f.setTitle("Log");
//        f.setSize(420,420);
//        f.setResizable(false);
//        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // To change the background of gui window
//        // default color
//        f.getContentPane().setBackground(Color.green);
//        // Custom color(rgb values)
//        f.getContentPane().setBackground(new Color(111,211,111));
//        // Hexadecimal values
//        f.getContentPane().setBackground(new Color(0x345145));

//        JFrame frame = new JFrame(); // Creates a frame
//        frame.setTitle("Login"); // sets the title of frame
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// exit the program
//        frame.setResizable(false); // prevent frame from being resized
//        frame.setSize(420,420) ; //  set x dimensions and y dimension
//        frame.setVisible(true);
    }
}
class myFrame extends JFrame {
    myFrame() {
        this.setTitle("Log");
        this.setSize(420, 420);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon  i = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\first_java\\src\\javaGui\\im1.jpg");
        this.setIconImage(i.getImage());
        // To change the background of gui window
        // default color
        this.getContentPane().setBackground(Color.green);
        // Custom color(rgb values)
        this.getContentPane().setBackground(new Color(111, 211, 111));
        // Hexadecimal values
        this.getContentPane().setBackground(new Color(0x345145));
        this.getContentPane().setBackground(Color.lightGray);
        this.getContentPane().setBackground(new Color(111,122,11));
    }
}