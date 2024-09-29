import java.util.Scanner;

public class Java_Oop_Nested_Try_Catch {
    public static void main(String[] args) {
        int array [] = new int[3];
        array[0]  = 10;
        array[1] = 56;
        array[2] = 6;
        boolean flag = true;
        while(flag){
        System.out.println("Enter the index you want : ");
        Scanner sc = new Scanner(System.in);
        int ind  = sc.nextInt();
        try{
            System.out.println("Welcome to try 1 ");
            try{
                System.out.println("Try 2 ");
                System.out.println(array[ind]);
                System.out.println("Valid index... ");
                flag=false;

            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("This index does not exist...");
                System.out.println("Level 2 Catch");
            }
        }
        catch (Exception e){
            System.out.println("Level 1 Catch");
            System.out.println(e);
        }
    }
        System.out.println("Thanks..");
    }
}
