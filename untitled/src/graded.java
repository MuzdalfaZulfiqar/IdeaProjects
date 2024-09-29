import java.util.*;
public class graded {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matrix1 = new int[3][4];
        int[][] matrix2 = new int[4][3];

        // Accept the elements of the first matrix from the user
        System.out.println("Enter elements for the first matrix (3x4):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }// for loop

        // Accept the elements of the second matrix from the user
        System.out.println("Enter elements for the second matrix (4x3):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }// for loop

        // Perform matrix multiplication
        int[][] result = multiplyMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }// for loop
    }// main method

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }// for loop

        return result;
    }// method
}// class
