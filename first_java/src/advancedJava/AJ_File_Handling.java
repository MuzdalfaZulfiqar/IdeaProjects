package advancedJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class AJ_File_Handling {
    public static void main(String[] args) {
        try {
            FileOutputStream f1 = new FileOutputStream("THEFILE.txt");
            PrintStream ps = new PrintStream(f1);
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number multiplication table of which you want to print:  ");
            int num =  input.nextInt();
            int i=1;
            while(i<=num){
               int prod = i*num;
               ps.println(prod);
               i++;

            }


            FileInputStream fs = new FileInputStream("THEFILE.txt");
            Scanner read = new Scanner(fs);
            while(read.hasNext()){
                String s = read.nextLine();
                System.out.println(s);
            }

        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}

