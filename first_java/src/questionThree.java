import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class questionThree {
    public static void main(String[] args) {

        try {

            File file = new File("students.txt");
            Scanner input = new Scanner(file);

            FileOutputStream fileWrite = new FileOutputStream("students.txt",true);
            PrintStream write = new PrintStream(fileWrite);

            while (input.hasNext()) {
                String name = input.nextLine();
                String rollNum = input.nextLine();
                String marks = input.nextLine();




                int score = Integer.parseInt(marks);

                    if (score == 49)
                    {
                        score = 50;

                    }
                System.out.println("Roll no. "+ rollNum);
                System.out.println("Name :  "+ name);
                System.out.println("Marks :"+score);





            }// while loop ends here



        }// try ends here
        catch (Exception e){
            System.out.println(e.toString());
        }// catch ends here
    }
}
