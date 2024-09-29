import java.util.Scanner;
public class labTask_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        String firstStudent = "h";
        String student [] = new String [5];
        int count = 0;
        int mycounter = 0;
        while(count<=4){
            System.out.print("Enter the name of the student: ");
            String name  = input.next();
            System.out.print("Enter the marks of the student: ");
            int marks = input.nextInt();

            if(marks>=max) {
                if (marks > max) {
                    mycounter = 0; // Reset mycounter if we found a new maximum
                }
                max = marks;
                student[mycounter] = name; // Store the name in the array
                mycounter++;
            }

            count++;
        }// while loop ends here

        System.out.println("The students who got the highest marks are");
            for(int  i = 0;i< mycounter;i++){
                System.out.println(student[i]);
            }
    }// main method ends here
}// Class ends here