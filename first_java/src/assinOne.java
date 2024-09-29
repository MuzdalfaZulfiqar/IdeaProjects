import java.util.Scanner;

public class assinOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter # of rows for matrix 1:");
        int rows1 = input.nextInt();
        System.out.println("Enter # of columns for matrix 1:");
        int cols1 = input.nextInt();
        int matrix1 [][] = new int[rows1][cols1];

        System.out.println("Enter # of rows for matrix 2:");
        int rows2 = input.nextInt();
        System.out.println("Enter # of columns for matrix 2:");
        int cols2 = input.nextInt();
        int matrix2 [][] = new int[rows2][cols2];

        System.out.println("Enter array elements of matrix 1: ");
        for(int i = 0;i<rows1;i++){
            for(int j = 0;j<cols1;j++){
                matrix1[i][j] = input.nextInt();
            }
        }// for loop ends here

        System.out.println("Enter array elements of matrix 2: ");
        for(int i = 0;i<rows2;i++){
            for(int j = 0;j<cols2;j++){
                matrix2[i][j] = input.nextInt();
            }
        }// for loop ends here

        if(rows2==cols1){
            System.out.println("Matrix multiplication is possible......");
            int [][]result =new int [rows1][cols2];
            for(int i = 0;i<rows1;i++){
                for(int j=0;j<cols2;j++){
                    result[i][j] = 0;
                    for(int k=0;k<cols1;k++){
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }// for loop ends here

            System.out.println("The result of matrix multiplication is");
            for(int i = 0;i<result.length;i++){
                for(int j = 0;j<result[0].length;j++){
                    System.out.print(result[i][j]+"\t");
                }
                System.out.println();
            }

        }
        else{
            System.out.println("Matrix multiplication is not possible......");
        }
    }
}
