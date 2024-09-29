import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class QuestionOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks = 0;
        int rollNum = 0;
        String name = "";
        try{
            FileOutputStream fileWrite = new FileOutputStream("students.txt",true);
            PrintStream write = new PrintStream(fileWrite);
            while(true){
                System.out.print("Enter your roll number: ");
                rollNum = input.nextInt();
                input.nextLine();
                if (rollNum ==0){
                    break;
                }// if ends here
                else{

                    System.out.print("Enter your name: ");
                    name = input.nextLine();

                    System.out.print("Enter your marks: ");
                    marks = input.nextInt();

                    write.println(name);
                    write.println(rollNum);
                    write.println(marks);


                }// else ends here
            }// while ends here
            write.close();

        }catch(Exception e){
            System.out.println(e.toString());
        }// catch ends here


    }// main ends here
}// class ends here
