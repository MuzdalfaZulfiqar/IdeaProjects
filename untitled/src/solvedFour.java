import java.util.Scanner;
public class solvedFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] matrix = new int[4][4];
        for (int i = 0; i<4;i++){
            System.out.println("Enter array elements fo row "+ (i+1));
            for (int j = 0; j<4;j++){
                matrix[i][j] = input.nextInt();
            }
        }// for

        for (int i = 0; i<4;i++){
            for (int j = 0; j<4;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }// for

        int sum = 0;
        for (int i = 0; i<4;i++){
            for (int j = 0; j<4;j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                    break;
                }
            }
        }// for
        System.out.println("Sum of diagonals is "+ sum);

    }// main
}// class
