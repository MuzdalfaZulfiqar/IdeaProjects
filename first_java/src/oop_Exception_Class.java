import java.util.Scanner;

public class oop_Exception_Class {
    public static void main(String[] args) {
        int age ;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        // Handle this if age is less than 0 or greater than 125
        if(age<0 || age >125){
            try{
                // ---- throw for built-in class
                // throw new ArithmeticException("This is arithmetic exception");

                // ---- throw for custom(user-defined) class
                // throw new myException();

            // we throw exception bcz we want our program to know about the errors and exception
            // we therefore can define the custom class from exception class to define our own
            //   exceptions and therefore print respective msgs
                throw new maxAgeException();

        }catch (Exception e){
            //    System.out.println(e.getMessage());
            //    System.out.println(e.toString());
                System.out.println(e.toString());// simple e calls toString() method by default
                e.printStackTrace(); // this helps us to know at what line we faced which error/exception
                System.out.println("Finished");
            }
            System.out.println("End");
        }

    }
}
// Exception class in java.lang
class myException extends Exception{
    // toString() ----> When exception is printed

    @Override
    public String toString() {
        return " I am toString()";
    }

    @Override
    public String getMessage() {
        return " I am getMessage()";
    }
}
class maxAgeException extends Exception{
    @Override
    public String toString() {
        return "Age invalid";
    }
}