import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int marks =0;
        int max = 0;
        int max1 = 0;
        String stu ="";
        String stu2="";
        do {
            System.out.println("Enter name: ");
            String name = input.nextLine();
            System.out.println("Marks;");
            marks = input.nextInt ();
            input.nextLine();
            if (marks>=max){
                max = marks;
                stu = name;
                System.out.println(stu + " got "+max);

            }


        }  while(marks!=0);

    }
}
