import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args) {
        int count = 0;
        ArrayList <Integer> marksList = new ArrayList<Integer>();
        try{
            File file = new File("students.txt");
            Scanner input = new Scanner(file);
            while(input.hasNext()){


                String name = input.nextLine();
                String rollNum = input.nextLine();
                String marks = input.nextLine();


                System.out.println("Roll no. "+ rollNum);
                System.out.println("Name :  "+ name);
                System.out.println("Marks :"+marks);

                int score = Integer.parseInt(marks);
                marksList.add(score); // storing in arraylist


                }// while loop ends here
            for (int i = 0;i<marksList.size(); i++)
            {
                if (marksList.get(i) >50)
                {
                    count++;

                }
            }// for loop ends here

            }// try ends here
        catch (Exception e){
            System.out.println(e.toString());
        }// catch ends here

        System.out.println("Number of students who scored above 50 is "+ count);
        }// main ends here
    }// class ends here

