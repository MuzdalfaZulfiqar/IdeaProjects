package javaGui;

import javax.swing.*;
import java.awt.*;

public class JAVA_GUI_Progress_Bar {
    public static void main(String[] args) {
        ProgressDemo demo = new ProgressDemo();
    }
}
class ProgressDemo{
    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0,500);

    ProgressDemo(){

        // --------------------Setting bar attributes
        bar.setValue(0); // Initial value to start progress
        bar.setBounds(0,50,420,200);
        bar.setStringPainted(true); // It adds a percentage to our progress bar
        bar.setBackground(new Color(0x690C3B));
        bar.setFont(new Font("MV Boli",Font.BOLD,30));

        //-----------------------Creating frame
        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,400);
        frame.setLayout(null);
        frame.setVisible(true);

        //----------Calling the method
        fill();
    }

    public void fill(){

        int count=100;// Setting count
        while(count>=1){
        bar.setValue(count); // We are creating this method fill and calling it
        // this value means fill the percentage by that value in the progress bar
            try {
                Thread.sleep(500); // this means take a break of at least 500ms
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            // This count means that increase the count by 10 %
            count = count-10; // To move the progress bar backwards set the count to decrement
    }
        // This method means that display this msg after the percentage ends
        bar.setString("Done :-)");
    }

}
