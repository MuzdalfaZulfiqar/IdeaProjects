import java.util.Random;
import java.util.Scanner;
public class assinTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ran = new Random();
        System.out.print("Enter the length of square matrix: ");
        int len = input.nextInt();
        int [][] square = new int[len][len];
        for(int i=0;i<len;i++){
            for(int j =0;j<len;j++){
                square[i][j] = ran.nextInt(0,2);
            }
        }// for ends here
        for(int i=0;i<len;i++){
            for(int j =0;j<len;j++){
                System.out.print(square[i][j] +"\t");
            }
            System.out.println();
        }// for ends here
        int [] zero = new int[len];int [] one = new int[len];
        int countZero = 0;int countOne = 0;
        for(int i=0;i<len;i++){
            countZero = 0;countOne= 0;
            for(int j =0;j<len;j++){
               if(square[i][j]==0){
                   countZero++;
                   zero[i] = countZero;
               }
               else{
                   countOne++;
                   one[i] = countOne;
               }
            }
        }// for ends here
        int [] zeroCols = new int[len];int [] oneCols = new int[len];
        int countZeroCols = 0;int countOneCols = 0;
        for(int i=0;i<len;i++){
            countOneCols = 0;countZeroCols=0;
            for(int j =0;j<len;j++){
                if(square[j][i]==0){
                    countZeroCols++;
                    zeroCols[i] = countZeroCols;
                }
                else{
                    countOneCols++;
                    oneCols[i] = countOneCols;
                }
            }
        }// for ends here
        System.out.println("Rows.......");
        for(int i=0;i<zero.length;i++){
            if(zero[i]==len){
                System.out.println("All 0s in row # "+ i);
            }
            else if(one[i]==len){
                System.out.println("All 1s in row # "+ i);
            }
            else{
                System.out.println("No same numbers in row # "+ i);
            }
        }// for ends here
        System.out.println("Columns.......");
        for(int i = 0;i<zeroCols.length;i++){

            if(zeroCols[i]==len){
                System.out.println("All 0s in column # "+ i);}
            else if(oneCols[i]==len){
                System.out.println("All 1s in column # "+ i);
            }
            else{
                System.out.println("No same numbers in column # "+i);
            }

        }//for

        System.out.println("Main Diagonal.....");
        int countZeroDia = 0;int countOneDia = 0;
        for(int i=0;i<len;i++){
            if(square[i][i]==0){
                countZeroDia++;
            }
            else{
                countOneDia++;
            }
        }// for ends here

        if(countZeroDia ==len){
            System.out.println("The main diagonal has all 0s");
        }
        else if(countOneDia==len){
            System.out.println("The main diagonal has all 1s");
        }
        else{
            System.out.println("No same numbers in main Diagonal");
        }
        int countZeroDia2 = 0;int countOneDia2 = 0;

        System.out.println("Secondary Diagonal.....");
        for(int i=0;i<len;i++){
            if(square[i][square.length-1-i]==0){
                countZeroDia2++;
            }
            else{
                countOneDia2++;
            }
        }// for ends here
        if(countZeroDia2==len){
            System.out.println("The secondary diagonal has all 0s");
        }
        else if(countOneDia2==len){
            System.out.println("The secondary diagonal has all 1s");
        }
        else{
            System.out.println("No same numbers in secondary diagonal ");
        }
    }//main
}//class
