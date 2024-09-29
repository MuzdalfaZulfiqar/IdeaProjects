
import java.util.Scanner;

public class practice_set_1 {
    public static void main(String[] args) {


        // #1
        int num1= 3;
        int num2= 4;
        int num3= 5;
        int sum =  num1+num2+num3;
        System.out.println(sum);


        // #2
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        String name= sc.next();
        System.out.println("Hello " + name + " have  a good day");



        // #3
        System.out.println("What is your number?");
        Scanner sca = new Scanner(System.in);
        System.out.println(sca.hasNextInt());


    }
}
