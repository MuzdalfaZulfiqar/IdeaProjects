import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ARRRAYS {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random ran = new Random();
//
//        for(int i=0;i<1000;i++){
//            if (prime(i) && prime(i+1)){
//                System.out.println(i);
//            }
//        }
//
//
//
//    }
//    public  static boolean prime(int n){
//        boolean prime=true;
//        int f=0;
//        for(int i=2;i<=n/2;i++){
//            if(n%i==0){
//               f++;
//               break;
//            }
//        }
//        if(f==0){
//            prime = true;
//        }
//        else{
//            prime = false;
//        }
//        return prime;
//    }
//
//    public static boolean palin(int n){
//
//        int num = n;
//        int d=0;
//        String s="";
//        while(n!=0){
//            d = d%10;
//            s = s+d;
//            n=n/10;
//        }
//        int sum  = Integer.valueOf(s);
//        if(prime(sum)){
//            return true;
//        }
//        else
//            return false;


//

//        int [] a = {1,2,3,4,5,1,2};
//        int [] dis =new int [a.length];
//        int disCount = 0;
//        boolean dis1 = true;
//
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<disCount;j++){
//                if(a[i] == dis[j]){
//                    dis1 = false;
//                    break;
//                }
//
//            }
//
//            if(dis1){
//                dis[disCount] = a[i];
//                disCount++;
//            }
//        }
//
//        for(int l:dis){
//            System.out.println(l);
//        }


//        int n[] = {1,2,3,4,5,-1};
//        int index=0;
//        int min= Integer.MAX_VALUE;
//        for(int i=0;i<n.length;i++){
//            if(n[i]<min){
//                min  = n[i];
//                index = i;
////            }
////
////        }
////        System.out.println(min);
////        System.out.println(index);
//////
////
////
//        int n = 5;
//        int[] n1 = {1, 2, 3, 4, 111, 7, 89};
//
//        boolean f = true;
//        for (int i = 0; i < n1.length; i++) {
//            for (int j = i + 1; j < n1.length; j++) {
//                if (n1[i] >= n1[j]) {
//                    f = false;
//                    break;
//                }
//            }
//
//
//        }
//        if (f) {
//            System.out.println("s");
//        } else {
//            System.out.println("N");
//        }
//
//    }
//}
//        String [] n2 = new String[5];
//
//        for(int i=0;i<n1.length;i++){
//            System.out.println("marks");
//            n1[i] = input.nextInt();
//            input.nextLine();
//            System.out.println("Nmae");
//            n2[i] = input.nextLine();
//        }
//
//        for(int i=0;i<n1.length;i++){
//            for(int j=i+1;j<n1.length;j++){
//                if(n1[i]>n1[j]){
//                    int temp = n1[i];
//                    n1[i] = n1[j];
//                    n1[j]= temp;
//                }
//            }
//        }
//
//        for(int i=n1.length-1;i>=0;i--){
//            System.out.println(n2[i]);
//
//        }


//        // 7.19
//        System.out.println("How many array elements you want to add");
//        int num = input.nextInt();
//        int n[] = new int[num];
//        for (int i = 0; i < n.length; i++) {
//            n[i] = input.nextInt();
//        }
//
//        System.out.println(isSorted(n));
//    }
//    public static boolean isSorted(int [] n){
//        boolean sorted = true;
//        for(int i=0;i<n.length;i++){
//            for(int j = i+1;j<n.length;j++){
//                if(n[i]>=n[j]){
//                    sorted = false;
//                    break;
//                }
//
//
//            }
//
//        }
//
////
//    }
//
//}

//        int [] a1 = {1,2,3,4,5};
//        int [] a2={5,6,7,8,9,10};
//        int merged[] = new int [a1.length+a2.length];
//        int mer = 0;
//        for(int i=0;i<a1.length;i++)
//        {
//            merged[mer] = a1[i];
//            mer++;
//        }
//        for(int i=0;i<a2.length;i++){
//            merged[mer] = a2[i];
//            mer++;
//        }
//
//        for(int num:merged){
//            System.out.println(num);
//        }

//        boolean con=true;
//        int [] n1 = {3,4,5,5,5,5,4,5};
//
//
//        for(int i=0;i<n1.length-3;i++){
//            if(n1[i] == n1[i+1] && n1[i+1] == n1[i+2] && n1[i+2] == n1[i+3]){
//                con = false;
//                break;
//            }
//        }
//        if(con){
//            System.out.println("F");
//        }

//
//        try {
//            FileInputStream fi = new FileInputStream("PracticeOfFile.txt");
//            Scanner inp = new Scanner(fi);
//
//            ArrayList<Integer> al = new ArrayList<Integer>();
//            ArrayList<String> namen = new ArrayList<String>();
//            ArrayList<String> rolln = new ArrayList<String>();
//            int count = 0;
//            while (inp.hasNext()) {
//                String roll = inp.nextLine();
//                String name = inp.nextLine();
//                String marks = inp.nextLine();
//                int m = Integer.valueOf(marks);
//
//
//                al.add(m);
//                namen.add(name);
//                rolln.add(roll);
//
//
//            }
//
//            int max = al.get(0);
//            String  n="";
//            for(int i=1;i<al.size();i++){
//
//
//                if(al.get(i) >= max){
//                    max = al.get(i);
//                    n=namen.get(i);
//                    System.out.print(n+" ");
//                    System.out.println(max);
//
//
//                }
//
//            }
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }


//        try{
//            FileOutputStream fs = new FileOutputStream("randomNumbers.txt");
//            PrintStream ps = new PrintStream(fs);
//            ArrayList<Integer> num = new ArrayList<Integer>();
//            int count=0;
//            while(count<25){
//                int n = ran.nextInt(0,10);
//                ps.println(n);
//                count++;
//            }// while ends here
//
//            FileInputStream fileIn = new FileInputStream("randomNumbers.txt");
//            Scanner sc = new Scanner(fileIn);
//            while(sc.hasNext()){
//                String number = sc.nextLine();
//                int n1 = Integer.parseInt(number);
//
//                num.add(n1);
//            }
//
//            for(int i=0;i<num.size();i++){
//                for(int j=i+1;j<num.size();j++){
//                    if(num.get(i) > num.get(j)){
//                        int temp = num.get(i);
//                        num.set(i,num.get(j)) ;
//                        num.set(j,temp);
//                    }
//                }
//            }
//
//            for(int n2:num){
//                System.out.println(n2);
//            }
//
//        }
//        catch (Exception e){
//            System.out.println(e.toString());
//        }
//
//        int [][] a = new int[3][];
//        a[0] = new int[3];
//        a[1] = new int [4];
//        a[2] = new int[5];
//
//        for(int i=0;i<a.length;i++){
//            System.out.println("Enter elements of row "+ (1+i));
//            for(int j=0;j<a[i].length;j++){
//
//                a[i][j] = input.nextInt();
//
//            }
//        }
//
//        for(int i=0;i<a.length;i++){
//            for(int j=0;j<a[i].length;j++){
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

//
        System.out.println("Enter the number of rows: ");
        int numRows = input.nextInt();
        input.nextLine(); // Consume the remaining newline character

        // Create the ragged array
        String[][] raggedArray = new String[numRows][];

        // Input first name and registration number separated by "-" for each row
        for (int i = 0; i < numRows; i++) {
            System.out.println("Enter first name and registration number separated by '-': ");
            String data = input.nextLine();

            // Split the input data by "-"
            String[] rowData = data.split("-");

            // Store the split data into the ragged array
            raggedArray[i] = rowData;
        }

        // Pass the ragged array to a method that writes it to a text file
        writeRaggedArrayToFile(raggedArray);

        System.out.println("Data written to file successfully!");
    }

    public static void writeRaggedArrayToFile(String[][] raggedArray) {
        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Write each row of the ragged array to the file
            for (String[] rowData : raggedArray) {
                String line = String.join("-", rowData);
                printWriter.println(line);
            }

            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

//        System.out.println("Enter rows");
//        int rows = input.nextInt();
//        input.nextLine();
//        String  [][] ragged = new String[rows][];
//
//        for(int i=0;i<ragged.length;i++){
//            System.out.println("Name - reg number");
//            String data = input.nextLine();
//
//            String[] newData = data.split("-");
//            ragged[i] = newData;
//        }
//
//        toarray(ragged);
//
//
//    }
//
//    public static void toarray(String  [][] ragged){
//
//        try {
//            FileOutputStream fs  = new FileOutputStream("NWE.txt");
//            PrintStream ps = new PrintStream(fs);
//            for(String [] data: ragged){
//                ps.println(String.join("-",data));
//            }
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


//        int[] n = {10,1,2,3,23,90};
//        int num = n[0];
//        ArrayList<Integer>small = new ArrayList<Integer>();
//        ArrayList<Integer>large = new ArrayList<Integer>();
//
//        for(int i=0;i<n.length;i++){
//            if(n[i]>=num){
//                large.add(n[i]);
//            }
//            else{
//                small.add(n[i]);
//            }
//        }
//
//        int [ ] merged = new int [n.length];
//        int pos=0;
//        for(int i=0;i<small.size();i++){
//            merged[pos]=small.get(i);
//            pos++;
//        }
//        for(int i=0;i<large.size();i++){
//            merged[pos]=large.get(i);
//            pos++;
//        }
//
//        for(int q:merged){
//            System.out.println(q);
//        }

//        int total = 0;
//        int n [][] = {{1,2,3},
//                      {4,5,6}};
//        for(int i=0;i<n.length;i++){
//
//        }
//        int l1 = ran.nextInt(n.length);
//        int l2 = ran.nextInt(n[0].length);
//
//        int temp=

//        for(int i=0;i<n.length;i++){
//            for(int j=0;j<n[0].length;j++){
//                total = total+ n[i][j];
//            }
//        }


//        int n [][] = {{2,4,3,4,5,8,8},
//                      {7,3,4,3,3,4,4},
//                      {3,3,4,3,3,2,2},
//                      {9,3,4,7,3,4,1},
//                      {3,5,4,3,6,3,8},
//                      {3,4,4,6,3,4,4},
//                      {3,7,4,8,3,8,4},
//                      {6,3,5,9,2,7,9}};
//
//        int sum=0;
//        int [] emp = new int [n.length];
//        int[] empnum = new int[n.length];
//        for(int i=0;i<n.length;i++){
//            sum=0;
//            for(int j=0;j<n[0].length;j++){
//                sum = sum+n[i][j];
//            }
//            emp[i] = sum;
//            empnum[i] = i;
//
//        }
//
//
//        int max = emp[0];
//        for(int i=0;i<emp.length;i++){
//            for(int j=i+1;j<emp.length;j++){
//                if(emp[i]>emp[j]){
//                    int temp = emp[i];
//                    emp[i] = emp[j];
//                    emp[j] = temp;
//
//
//                    int temp1 = empnum[i];
//                    empnum[i] = empnum[j];
//                    empnum[j] = temp1;
//                }
//            }
//        }
//
//        for(int j=emp.length-1;j>=0;j--){
//            System.out.println(empnum[j] +  " has worked hours = "+ emp[j]);
//        }

        // Prompt the user to enter a number between 0 and 511
//        System.out.print("Enter a number between 0 and 511: ");
//        int number = input.nextInt();
//
//        // Validate the input range
//        if (number < 0 || number > 511) {
//            System.out.println("Invalid input. The number must be between 0 and 511.");
//            System.exit(1);
//        }
//
//        // Convert the decimal number to a 9-bit binary string
//        String binary = String.format("%9s", Integer.toBinaryString(number)).replace(' ', '0');
//
//        // Display the corresponding matrix
//        for (int i = 0; i < binary.length(); i++) {
//            char coin = (binary.charAt(i) == '0') ? 'H' : 'T';
//            System.out.print(coin + " ");
//
//            if ((i + 1) % 3 == 0) {
//                System.out.println(); // Start a new row
//            }
////        }
//
//        int [] [] n=new int[4][4];
//        for(int i=0;i<n.length;i++){
//            for(int j=0;j<n[0].length;j++){
//                n[i][j] = ran.nextInt(0,2);
//                System.out.println(n[i][j]+ " ");
//            }
//            System.out.println();
//        }
//
//        int countOne=0;
//        int [] c = new int [4];
//        for(int i=0;i<n.length;i++){
//            for(int j=0;j<n[0].length;j++){
//                if(n[i][j] == 1){
//                    countOne++;
//                    c[i] = countOne;
//                }
//            }
//        }
//
//        int countColOne=0;
//        int [] c1 = new int [4];
//        for(int i=0;i<n.length;i++){
//            for(int j=0;j<n[0].length;j++){
//                if(n[j][i] == 1){
//                    countColOne++;
//                    c1[i] = countColOne;
//                }
//            }
//        }
//
//        int max = Integer.MIN_VALUE;
//        int max1 = Integer.MIN_VALUE;
//        int index=0;
//        int index1=0;
//        for(int i=0;i<c.length;i++) {
//            if (c[i] > max) {
//                max = c[i];
//                index = i;
//
//            }
//
//
//        }
//        System.out.println("R " + (index+1));
//        for(int i=0;i<c1.length;i++){
//            if(c1[i]>max1){
//                max1 = c1[i];
//                index1 = i;
//
//            }
//
//        }
//        System.out.println("C " + (index1+1));


//        int [][] n ={{10,20,20},{40,50,60},{70,80,90}};
//
//        for(int [] f:n){
//            for(int value:f){
//                System.out.println(value);
//                break;
//            }
//        }

//        int [][] square = new int[2][2];
//        int size  = square.length;
//        int r=0;
//        int c= size/2;
//        square[r][c] = 1;
//        for(int k=2;k<=size*size;k++){
//            if(k%size==1){
//                r++;
//            }
//            else{
//                r--;
//                c++;
//            }
//            if(r<0) r=size-1;
//            if(c==size) c=0;
//            square[r][c] = k;
//        }
//
//
//for(int i=0;i<square.length;i++){
//    for(int j=0;j<square[0].length;j++){
//        System.out.println(square[i][j]+ " ");
//    }
//    System.out.print(" ");
//}
//        System.out.println("Row1");
//        int [] n1 = new int[5];
//        for(int i=0;i<n1.length;i++){
//            n1[i] = input.nextInt();
//        }
//        System.out.println("row2");
//        int []n2 = new int[5];
//        for(int i=0;i<n2.length;i++){
//            n2[i] = input.nextInt();
//        }
//
//        int [][] po = two(n1,n2);
//        for(int i=0;i<po.length;i++){
//            for(int j=0;j<po[0].length;j++){
//                System.out.print(po[i][j]+ " ");
//            }
//            System.out.print(" ");
//        }
//    }
//    public static int [][] two(int [] n1,int []n2){
//        int [][] p = new int [2][5];
//
//            p[0] = n1;
//            p[1]  = n2;
//
//
//            return p;

//        int[][] arr = {{3,2,1},{1,2,3}};
//        for(int row=1;row<arr.length;row++){
//            for(int col =1;col< arr[0].length;col++){
//                if(arr[row][col] %2==1){
//                    arr[row][col] = arr[row][col] +1;
//                    System.out.println();
//                }
//
//                if(arr[row][col] %2==0){
//                    arr[row][col] = arr[row][col] *2;
//                }
//            }
//        }
//
//        for(int row=0;row<arr.length;row++){
//            for(int col =0;col< arr[0].length;col++) {
//                System.out.print(arr[row][col]+ " ");
//            }
//            System.out.print("");
//            }

//        System.out.println("Enter rows");
//        int rows = input.nextInt();
//        input.nextLine();
//        String  [][] ragged = new String[rows][];
//
//        for(int i=0;i<ragged.length;i++){
//            System.out.println("Name - reg number");
//            String data = input.nextLine();
//
//            String[] newData = data.split("-");
//            ragged[i] = newData;
//        }
//
//        toarray(ragged);
//
//
//    }
//
//    public static void toarray(String  [][] ragged){
//
//        try {
//            FileOutputStream fs  = new FileOutputStream("NWE.txt");
//            PrintStream ps = new PrintStream(fs);
//            for(String [] data: ragged){
//                ps.println(String.join("-",data));
//            }
//
//
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        String s = input.nextLine();
//        String [] sArray = s.split("");
//        rev(sArray,s.length());
//    }
//    public static void rev (String[] s, int n){
//        if(n>0){
//            System.out.println(s[n-1]+" ");
//            rev(s,n-1);
//        }

//
//        int [][] n1={{1,2,7},{2,2,2},{1,1,7}};
//        int [] disArray = new int [n1.length];
//        int disCount=0;
//        boolean dis=true;
//        for(int i=0;i<n1.length;i++){
//            for(int j=0;j<n1[i].length;j++){
//                for(int k=0;k<disCount;k++){
//                    dis = true;
//                    if(n1[i][j] == disArray[k]){
//                        dis = false;
//                        break;
//                    }
//                }
//                if(dis){
//                disArray[disCount] = n1[i][j];
//
//                disCount++;
//            }
//
//            }
//
//        }



//        int [] n = {1,2,3,4,4,5,6,1};
//        int [] disArray = new int [n.length];
//        int disCount=0;
//        boolean dis=true;
//
//        for(int i=0;i<n.length;i++){
//            dis = true;
//            for(int j=0;j<disCount;j++){
//                if(n[i] == disArray[j]){
//                    dis = false;
//                    break;
//                }
//            }
//            if(dis){
//                disArray[disCount] = n[i];
//
//                disCount++;
//            }
//        }
//
//        for(int n1:disArray){
//            System.out.println(n1);
//        }



        for(int i=0,k=7;i<7;i++,k--){
            int p=k;
            for(int j=i;j<7;j++){
                System.out.print(p--+ " ");
            }
            System.out.println();
        }
    }

}