import java.util.Scanner;
public class gradedThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] rowPrime = new int[3];
        int [] colPrime = new int[4];
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
        }// FOR

        int count = 0;
        for (int i = 0; i<3;i++){
            count = 0;
            for (int j = 0; j<4;j++){
                if (isPrime(array[i][j])) {
                    count++;
                    rowPrime[i] = count;
                }
            }
        }// for


        // Prime numbers in rows
        int max = rowPrime[0];
        int index = 0;
        for (int i = 1;i<rowPrime.length;i++){
            if (rowPrime[i]>max){
                max = rowPrime[i];
                index = i;
            }
        }// for loop
        System.out.println("Row "+ (index+1) + " has highest number of primes");

        // for cols
        int countCols = 0;
        for (int i = 0; i<4;i++){
            countCols = 0;
            for (int j = 0; j<3;j++){
                if (isPrime(array[j][i])) {
                    countCols++;
                    colPrime[i] = countCols;
                }
            }
        }// for

        // Prime numbers in rows
        int maxCols = colPrime[0];
        int indexOfCol = 0;
        for (int i = 1;i<colPrime.length;i++){
            if (colPrime[i]>maxCols){
                maxCols = colPrime[i];
                indexOfCol = i;
            }
        }// for loop
        System.out.println("Column "+ (indexOfCol+1) + " has highest number of primes");





    }// main
    public static boolean isPrime(int n){
        boolean prime  = true;
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                prime =false;
                break;
            }
        }// for loop
        return prime;
    }// method ends
}// class ends here
