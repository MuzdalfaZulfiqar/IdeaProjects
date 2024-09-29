import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionThird {
    public static void main(String[] args) {
        try {

            // creating arraylist
            ArrayList<Integer> mark= new ArrayList<Integer>();
            ArrayList<Integer> roll= new ArrayList<Integer>();
            ArrayList<String > namelist= new ArrayList<String>();

            // Read data from file

            FileInputStream file= new
                    FileInputStream("C:\\Users\\DELL\\IdeaProjects\\first_java\\students.txt");
            Scanner input = new Scanner(file);



            while (input.hasNext()) {

                String name = input.nextLine();
                namelist.add(name);
                String rollNum = input.nextLine();
                int rn = Integer.parseInt(rollNum);
                roll.add(rn);
                String marks = input.nextLine();
                int score = Integer.parseInt(marks);

                if (score == 49)
                {
                    score = 50;

                }
                mark.add(score);
                System.out.println("Roll no. "+ rollNum);
                System.out.println("Name :  "+ name);
                System.out.println("Marks :"+score);

            }// while loop ends here
// for writing updated data in file


            FileOutputStream fileWrite = new FileOutputStream("C:\\Users\\DELL\\IdeaProjects\\first_java\\students.txt");
            PrintStream write = new PrintStream(fileWrite);
            int n = mark.size();
            for (int i=0;i<n;i++){
                write.println(namelist.get(i));
                write.println(roll.get(i));
                write.println(mark.get(i));
            }

        }// try ends here
        catch (Exception e){
            System.out.println(e.toString());
        }// catch ends here
    }// main
}// class
