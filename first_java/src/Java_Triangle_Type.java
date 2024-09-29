import java.util.Scanner;

public class Java_Triangle_Type {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a");
        int a = input.nextInt();
        System.out.println("Enter b");
        int b = input.nextInt();
        System.out.println("Enter c");
        int c = input.nextInt();

        if ((a<b+c) && (b<a+c) && (c<a+b)) {
            if ((a >= 1 && a <= 200) && (b >= 1 && b <= 200) && (c >= 1 && c <= 200)) {

                if (a == b && b == c) {
                    System.out.println("EQUI");
                } else if (a == b || b == c || a == c) {
                    System.out.println("ISO");
                } else {
                    System.out.println("Scalene");
                }
            }
        }
        else{
            System.out.println("Not a triangle ");
        }

}}
