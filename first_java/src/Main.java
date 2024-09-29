import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.print("Sum of the numbers is :");
//        int num1 = 5;
//        int num2 = 5;
//        int num3 = 5;
//        int sum = num1 + num2 + num3;
//        System.out.println(sum);
//        System.out.printf("The sum of %d and  %d and %d is", num1 ,num2,num3);
//        System.out.print(sum);

        Scanner sc = new Scanner(System.in);
        double runningTotal = 0.0;
        System.out.println("Start entering data:");
        System.out.print("Miles: ");
        int miles = sc.nextInt();
        System.out.print("Gallons: ");
        int gallons = sc.nextInt();
        double MPG = (double) miles / gallons;
        System.out.printf("Current MPG: %f\n", MPG);
        runningTotal += MPG;
        System.out.printf("Running total of MPGs: %f\n", runningTotal);
        int S = 1;
        System.out.print("More entries? Input 1 for yes and 0 for no: ");
        S = sc.nextInt();
        while (S != 0) {
            System.out.print("Miles: ");
            miles = sc.nextInt();
            System.out.print("Gallons: ");
            gallons = sc.nextInt();
            MPG = (double) miles / gallons;
            System.out.printf("Current MPG: %f\n", MPG);
            runningTotal += MPG;
            System.out.printf("Running total of MPGs: %f\n", runningTotal);
            System.out.print("More entries?  Input 1 for yes and 0 for no: ");
            S = sc.nextInt();

        }
    }
}