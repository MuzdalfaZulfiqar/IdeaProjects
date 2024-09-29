import java.util.Scanner;

public class HJK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum =  0;
        int integer = 1;
        int counter = 1;
        System.out.println("Enter the ending limit:");
        int N = input.nextInt();
        for(integer = 1; integer<=N ; integer++){
            int num = integer*integer*integer;
            sum = sum+ num;
        }
        System.out.println("The sum is "+ sum);
    }



}
