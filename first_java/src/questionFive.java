import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class questionFive {
    public static void main(String[] args) {

    ArrayList<Integer> marksList = new ArrayList<Integer>();
    ArrayList<String > nameList = new ArrayList<String>();
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
            nameList.add(name);

        }// while loop ends here

            int max = marksList.get(0);
            String maxStudent = nameList.get(0);
            for (int i = 1;i<marksList.size(); i++)
            {
            if (marksList.get(i)>=max)
            {
                max = marksList.get(i);
                maxStudent = nameList.get(i);
                System.out.println(maxStudent+" has got highest marks "+max);

            }// if ends here

            }// for loop ends here
    }// try ends here
        catch (Exception e){
        System.out.println(e.toString());
    }// catch ends here
}// main ends here
}// class ends here