
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] array = new int [3][4];
        for (int i = 0; i<3;i++){
            System.out.println("Enter array elements fo row "+ (i+1));
            for (int j = 0; j<4;j++){
                array[i][j] = input.nextInt();
            }
        }// for
        System.out.println("Given array is ");
        for (int i = 0; i<3;i++){
            for (int j = 0; j<4;j++){
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }// for
        int sum = 0;
        for (int i = 0; i<3;i++){
            sum = 0;
            for (int j = 0; j<4;j++){
                sum = sum + array[i][j];
            }
            System.out.println("Sum of row "+ (i+1)+ " is "+ sum);
        }// for
    }// main

}// class