package javaGui;

import javax.swing.*;
import java.util.Scanner;

public class JAVA_GUI_OptionPane {
    public static void main(String[] args) {


//        JOptionPane.showMessageDialog(null,"The site","Window",JOptionPane.ERROR_MESSAGE);
//            String s = JOptionPane.showInputDialog(null,"What is your name");
//        System.out.println(s);
//        JOptionPane .showConfirmDialog(null,"Are you good","Info",JOptionPane.YES_NO_CANCEL_OPTION);

        String [] res = {"Pizza","Burger","Kilo"};
        JOptionPane.showOptionDialog(null,"What you want to order","Pizza Book",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,res,null);

        // Options are different on base of sign
//        JOptionPane.showMessageDialog(null,"This is harmful site","Warning",JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is harmful site","Warning",JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is harmful site","Warning",JOptionPane.QUESTION_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is harmful site","Warning",JOptionPane.WARNING_MESSAGE);
//        JOptionPane.showMessageDialog(null,"This is harmful site","Warning",JOptionPane.ERROR_MESSAGE);
//        int a =  JOptionPane.showConfirmDialog(null,"Dude,do you even code","Dude Code",JOptionPane.YES_NO_OPTION);
//         String name = JOptionPane .showInputDialog("What is your name? ");
//         System.out.println("I know you! "+name);

       /* Scanner input  = new Scanner(System.in);
        String answer;
        String [] res = {"No, you are awesome","Thank u","Blush"};
        ImageIcon i = new ImageIcon("C:\\Users\\DELL\\IdeaProjects\\first_java\\src\\javaGui\\hand1m.jpg");
        JOptionPane .showOptionDialog(null,
                "You are good",
                "Message",
                JOptionPane.YES_NO_CANCEL_OPTION
                ,JOptionPane.INFORMATION_MESSAGE,
                i,// This is for image
                res, // This is for the array of options we want to set on our own
        0); // This one is the option we want to get selected*/

    }
}
