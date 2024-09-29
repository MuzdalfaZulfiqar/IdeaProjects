import java.util.Scanner;

public class labTaskTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0;
        int index = 0;
        String highStu = "";
        String students[] = new String[5];
        int max = Integer.MIN_VALUE;
        while(count<=4){
            System.out.print("Enter name  : ");
            String name  = input.next();
            System.out.print("Enter marks : ");
            int marks = input.nextInt();
            if(marks>=max){
                if(marks>max){
                    index = 0;
                    max = marks;
                    students[index] = name;
                    index++;
                }
                else if(marks == max){
                    students[index] = name;
                    index++;
                }


            }
            count++;

        }
        System.out.println("Students who got highest marks");

        for(int i=0;i<index;i++){
            System.out.println(students[i]);
        }

    }

}