import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        try {
//
//            // creating arraylist
//            ArrayList<Integer> mark= new ArrayList<Integer>();
//            ArrayList<Integer> roll= new ArrayList<Integer>();
//            ArrayList<String > namelist= new ArrayList<String>();
//
//            // Read data from file
//            File file = new File("students.txt");
//            Scanner input = new Scanner(file);
//
//            // for writing updated data in file
//            FileOutputStream fileWrite = new FileOutputStream("students.txt",true);
//            PrintStream write = new PrintStream(fileWrite);
//
//            while (input.hasNext()) {
//
//                String name = input.nextLine();
//                namelist.add(name);
//                String rollNum = input.nextLine();
//                int rn = Integer.parseInt(rollNum);
//                roll.add(rn);
//                String marks = input.nextLine();
//                int score = Integer.parseInt(marks);
//
//                if (score == 49)
//                {
//                    score = 50;
//
//                }
//                mark.add(score);
//                System.out.println("Roll no. "+ rollNum);
//                System.out.println("Name :  "+ name);
//                System.out.println("Marks :"+score);
//
//            }// while loop ends here
//
//            int n = mark.size();
//            for (int i=0;i<n;i++){
//                write.println(namelist.get(i));
//                write.println(roll.get(i));
//                write.println(mark.get(i));
//            }
//
//        }// try ends here
//        catch (Exception e){
//            System.out.println(e.toString());
//        }// catch ends here


        int [] ar = {1,6,2,4,1,8,2,9,1,39,0};
        for (int i = 0;i < ar.length;i++){
            for (int j= i+ 1;j<ar.length;j++)
            {
                int temp = 0;
                if (ar[i]>ar[j]){
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }

            }
            System.out.println(ar[i]);
        }

    }
}