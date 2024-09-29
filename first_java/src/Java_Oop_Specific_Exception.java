import java.util.Scanner;

public class Java_Oop_Specific_Exception {
    public static void main(String[] args) {
        int array [] = new int[3];
        array[0]  = 10;
        array[1] = 56;
        array[2] = 6;
        System.out.println("Enter the index you want : ");
        Scanner sc = new Scanner(System.in);
        int ind  = sc.nextInt();
        System.out.println("Enter the number you want to divide with: ");
        int num = sc.nextInt();
        try{

            System.out.println("The value at entered array index is "+ array[ind]);
            System.out.println("The array value/number is "+ array[ind]/num);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurred..");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred.. ");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some Exception Occurred : "+e);
        }
    }
}
