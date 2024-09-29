import java.rmi.MarshalException;
import java.util.Random;

public class Matrix {
    int row;
    int col;
    int array[][];
    Matrix (){
        row = 1;
        col = 1;
    }
    Matrix(int x, int y){
        row = x;
        col = y;
    }
    void initializeElement(){
        array  = new int[row][col];
        Random m = new Random();

        for(int i = 0 ; i< array.length;i++){
            for(int j = 0; j<array[i].length; j++){
                int element  = m.nextInt(1,20);
                array[i][j] = element;
            }
        }
    }
    void print(){
        for(int i = 0 ; i< array.length;i++){
            for(int j = 0; j<array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }
    }

    public  int getRow(){
        return row;
    }
    public int getCol(){
        return col;
    }
    public void setElement(int i, int j, int value){
        array[i][j] = value;
    }
    public void add(Matrix m){
        if(row == m.row && col == m.col){
            for(int i = 0 ; i< array.length;i++){
                for(int j = 0; j<array[i].length; j++){
                    System.out.print(array[i][j] + m.array[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Matrices are not addable ");
        }
    }

    public void multiply(Matrix m){
        int pro[][] = new int[row][col];
        if(row == m.col){
            for(int i=0;i<row;i++){
                for(int j = 0; j<m.col; j++){
                    for(int k = 0; k < col; k++){
                        pro[i][j] += array[i][k] + m.array[k][j];
                    }
                }
            }
        }
        else{
            System.out.println("Not multiple");
        }
    }
}
