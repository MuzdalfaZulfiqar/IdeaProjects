import java.util.ArrayList;
import java.util.Scanner;

public class assinFour {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] array = new int[10];
        System.out.println("Enter array elements: ");
        for(int i =0;i<array.length;i++){
            array[i] = input.nextInt();
        }// for loop ends here

        while(true){

        System.out.println();
        System.out.println("Enter:\n1: To find the  occurence of x in array......................" +
                                 "\n2: To make partitions in array..............................." +
                                 "\n3: To find the frequencies of each element in array.........." +
                                 "\n4: To move array elements circularly........................." +
                                 "\n5: To shift array elements circularly left by two positions.." +
                                 "\n0: To end execution..........................................");
            System.out.println();
        int option = input.nextInt();
        if (option==0){
            break;
        }
        else if(option==1){
            System.out.print("Enter element whose occurrence you want to find: ");
            int num = input.nextInt();
            count(num,array); // method call
        }
        else if(option==2){
            partition(array); // method call
        }
        else if(option==3){
            duplicates(array); // method call
        }

        else if(option==4){
            circular(array);  // method call
        }
        else{
            cirularlyLeft(array); // method call
        }
    }// while loop ends here
    }// main ends here

    public static void count(int x,int [] array){
        System.out.println("...........COUNT.........");
        int countNum = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]==x){
                countNum++;}
        }// for loop ends here
        System.out.println("The number "+x+" occurs "+countNum+" times");
    }// method ends here
    public static void partition(int [] array){
        System.out.println("...........PARTITION.........");
        int n = array[0];
        ArrayList<Integer>small = new ArrayList<Integer>();
        ArrayList<Integer>large = new ArrayList<Integer>();

        int [] margedArray = new int [array.length];
        for(int i = 0;i<array.length;i++){
            if(array[i]>=n){
                large.add(array[i]);
            }
            else{
                small.add(array[i]);
            }
        }// for loop ends here
        int count=0;
        for(int smallNum :small){
            margedArray[count] = smallNum;
            count++;
        }// for loop ends here

        for (int largeNum: large){
            margedArray[count] = largeNum;
            count++;
        }// for loop ends here
        System.out.println("Array elements before partition: ");
        for(int elements:array){
            System.out.print(elements+" ");}
        System.out.println();
        System.out.println("Array elements after partition: ");
        for (int number : margedArray){
            System.out.print(number+" ");
        }
    }// method ends here
    public static void duplicates(int [] array){
        System.out.println("...........DUPLICATES.........");
        System.out.println();
        int count = 0;
        for(int number: array){
            count=0;
            int i=0;
            for(i=0;i<array.length;i++){
                if(number==array[i]){
                    count++;
                }
            }// for loop ends here
            System.out.println(number +" occurs "+count+" times");
        }// for loop ends here
    }// method ends here
    public static void circular(int [] array){
        System.out.println("...........CIRCULAR.........");
        System.out.println();
        System.out.println("Original array elements are.. ");
        for(int elements:array){
            System.out.print(elements+" ");
        }// for loop ends here


        int n = array[0];
        int m= array[1];
        for(int i=0;i<array.length;i++){
            if(i==array.length-2){
                array[i] =array[array.length-1]+n;
                break;
            }// to cover second last element
            array[i] = array[i+1]+array[i+2];
        }// for loop ends here

        array[array.length-1] = m+n;// to cover last element

        System.out.println();
        System.out.println("Updated array elements are..");
        for(int elements: array){
            System.out.print(elements+ " ");

        }// for loop
        System.out.println();
    }// method ends here

    public static void cirularlyLeft(int [] array){
        System.out.println("...........CIRCULAR LEFT.........");
        System.out.println();
        System.out.println("Original array elements are.. ");
        for(int elements:array){
            System.out.print(elements+" ");
        }// for loop ends here

        int tempOne = array[0];
        int tempTwo = array[1];

        for(int i=2;i<array.length;i++){
            array[i-2] = array[i];
        }// for loop ends here
        array[array.length-2] = tempOne;
        array[array.length-1] = tempTwo;
        System.out.println();
        System.out.println("Updated array elements are...");
        for(int n:array){
            System.out.print(n+" ");
        }// for loop ends here
        System.out.println();
    }// method ends here
}// class ends here
