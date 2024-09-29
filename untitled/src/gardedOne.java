import java.util.Scanner;

public class gardedOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] array = new int [3][4];
        int [] maxRow = new int[3];
        int [] maxCol = new int[4];
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
            maxRow[i] = sum;
            System.out.println("Sum of row "+ (i+1)+ " = "+ sum);
        }// for

        int max = maxRow[0];
        int index = 0;
        for (int i = 0;i<maxRow.length;i++){
            if (maxRow[i]>=max){
                max = maxRow[i];
                index = i;


            }

        }// for
        System.out.println("Row "+ (index+1)+ " has highest sum");

        int sumCols = 0;
        for (int i = 0; i<4;i++){
            sumCols = 0;
            for (int j = 0; j<3;j++){
                sumCols = sumCols + array[j][i];
            }
            maxCol[i] = sumCols;
            System.out.println("Sum of column "+ (i+1)+ " = "+ sumCols);
        }// for

        int maximumCol = maxCol[0];
        int indexOfMaxCol = 0;
        for (int i = 0;i<maxCol.length;i++){
            if (maxCol[i]>=maximumCol){
                maximumCol = maxCol[i];
                indexOfMaxCol = i;
            }

        }// for
        System.out.println("Column "+ (indexOfMaxCol+1)+ " has highest sum");

    }//main
}// class
