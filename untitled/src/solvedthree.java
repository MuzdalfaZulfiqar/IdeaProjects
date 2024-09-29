public class solvedthree {
    public static void main(String[] args) {
        int [][] matrix1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int [][] matrix2  = new int[4][3];
        System.out.println("Given array is ");
        for (int i = 0; i<3;i++){
            for (int j = 0; j<4;j++){
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.println();
        }// for

        matrix2 = transpose(matrix1);
        System.out.println("Transpose of matrix is ");
        for (int i = 0; i<4;i++){
            for (int j = 0; j<3;j++){
                System.out.print(matrix2[i][j]+"\t");
            }
            System.out.println();
        }// for

    }// main

    public static int [][] transpose(int [][] matrix){
        int [] []trans  = new int[4][3];
        for (int i = 0; i<4;i++){
            for (int j = 0; j<3;j++)
                trans[i][j] = matrix[j][i];

        }
        return trans;
    }// method
}// class
