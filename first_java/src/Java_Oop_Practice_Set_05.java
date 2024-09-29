import java.util.Scanner;

public class Java_Oop_Practice_Set_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        the();}
        catch (Exception e){
            System.out.println(e);
        }
        // Problem 1
        // Syntax error
//        int a;
//        System.out.println(a);
        // logical error
//        int a=3;
//        int b=3;
//        System.out.println("a+b = "+ (a-b));

        // runtime error
//        System.out.println(5/0);

        // problem 2
//        try{
//            System.out.println(5/0);
//        }
//        catch (ArithmeticException e){
//            System.out.println("HaHa");
//        }
//        catch (IllegalArgumentException e ){
//            System.out.println("HeHe");
//        }

        // problem 3



    }
public static void the() throws maxTriesException{
    Scanner sc = new Scanner(System.in);
    int [] arr = {1,2,3,4,5,6};
    boolean valid = true;
    int tries = 0;
    while(valid && tries<=5){
        try {
            if(tries == 5){
                throw new maxTriesException();
            }
            System.out.println("Index: ");
            int in = sc.nextInt();
            System.out.println("Valid index = "+arr[in]);
            valid=false;


        }
        catch (Exception e){
            System.out.println("Invalid exception "+ e);
        }
        tries++;
    }
    }
}
class maxTriesException extends Exception{
    @Override
    public String toString() {
        return "Max tries reached";
    }
}