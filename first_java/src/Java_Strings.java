import java.util.Scanner;

public class Java_Strings {
    public static void main(String[] args) {
        //initializing a string using "new" keyword
        String str =new String("MUZDALFA");
        System.out.println(str);
        //initializing a string without using "new" keyword
        String name = "MUZDALFA";
        System.out.print("The name is: ");
        System.out.print(name);

        char a='A';
        String  b="Muzdalfa";
        /*  %d is for int
            %f is for float
            %c is for character
            %s is for string
         */
        System.out.printf("The value of a is %c and the name of b is %s", a,b);
        int c = 1;
        float d = 9.8986f;
        System.out.println();
        System.out.printf("The value of c is %d and the value of d is %f",c,d);
        System.out.println();

        // if we want to round off to certain places we will use .value
        System.out.printf("The value of c is %d and the value of d is %.2f",c,d);

        // if we want to format to certain places we will use value.
        System.out.println();
        System.out.printf("The value of c is %d and the value of d is %8.2f",c,d);

        int e=3;
        float f = 7.89f;
        System.out.println();
        System.out.format("The value of e is %d and the value of b is %f", e,f);
        // System.out.printf() and System.out.format() works in a similar way


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string"); // only for new line
        String st = sc.next(); // it only takes one word of the entered string
        System.out.println(st);


        Scanner sta = new Scanner(System.in);
        String nam = sta.nextLine(); // it will also take the second word also means whole entered string
        System.out.println(nam);




    }
}
