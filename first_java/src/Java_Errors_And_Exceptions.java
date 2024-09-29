import java.util.Scanner;

public class Java_Errors_And_Exceptions {
    public static void main(String[] args) {
        // Syntax Error: The error in rules set by language developers, Do not compile
        // Logical Error/Bug: Compile and run but do not produce expected result
        // Print no b/w prime no b/w 1 to 10
        System.out.println(2);
        for (int i=1;i<5;i++){
            System.out.println(2*i+1);
        }

        /*   Output
        2
        3
        5
        7
        9 is not prime so logical error bca this is not the formula for prime number  */


        // Runtime Error/ Exception: Errors during runtime that crash the program
        int k;
        Scanner sc = new Scanner(System.in);
        k= sc.nextInt();
        System.out.println("The integer part of 1000 divided by k is "+1000/k);

    }
}