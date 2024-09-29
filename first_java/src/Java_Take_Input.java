
import java.util.Scanner;

public class Java_Take_Input {
    public static void main(String[] args)
    {
        //System.out.println("Taking input");
        //Scanner sc = new Scanner(System.in);
       // System.out.println("Enter number 1:");
       // float a= sc.nextFloat();
       // boolean b1= sc.hasNextInt();
        //System.out.println(b1);
       // int a= sc.nextInt();
       // System.out.println("Enter number 2:");
       // float b= sc.nextFloat();
       // int b= sc.nextInt();
       // int sum = a +b;
        //float sum = a +b;
       // System.out.println("The sum of numbers is  ");
       // System.out.println(sum);
        //String str = sc.nextLine();
       // System.out.println(str);
        Scanner sc = new Scanner(System.in);

        System.out.println("------Result of the student-----");
        System.out.println("Enter maths marks:");
        int maths = sc.nextInt();
        System.out.println("Enter phy marks:");
        int phy = sc.nextInt();
        System.out.println("Enter chem marks:");
        int chem = sc.nextInt();
        System.out.println("Enter urdu marks:");
        int urdu = sc.nextInt();
        System.out.println("Enter eng marks:");
        int eng = sc.nextInt();
        float sum = (maths + eng + chem + urdu + phy);
        float marks = (sum/500.0f)*100;
        System.out.println(marks);


    }
}
