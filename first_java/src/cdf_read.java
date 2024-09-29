import java.io.File;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class cdf_read {
    public static void main(String[] args) {
        try{

            ArrayList<Integer> numlist = new ArrayList<Integer>();
            FileInputStream fileOut  = new FileInputStream("Int.txt");
            Scanner read  =  new Scanner(fileOut);

            while(read.hasNext()){
                String number = read.nextLine();
                int n  = Integer.parseInt(number);
                if (!isPrime(n))
                    numlist.add(n);

            }


            FileOutputStream file = new FileOutputStream("Int.txt");
            PrintStream ps = new PrintStream(file);
            for (int i =0 ;i<numlist.size();i++){
                ps.println(numlist.get(i));
            }
        }


        catch (Exception e){
            System.out.println(e.toString());
        }
    }


    public static boolean isPrime(int number){
        int f = 0;
        boolean Prime = false;
        for (int i = 2;i<=number/2;i++){
            if (number%i==0){
                f++;
                break;
            }
        }

        if(f==0){
            Prime = true;
        }
        else{
            Prime = false;
        }

        return Prime;
    }
}
