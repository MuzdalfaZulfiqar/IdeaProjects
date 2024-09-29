import java.util.Random;import java.util.Scanner;

public class arrays_book {
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner input = new Scanner(System.in);
//        int num=0;
//        int count = 0;
//        int counter = 0;
//        int [] arr = new int[100];
//        while (arr[count]!=0) {
//
//            num = input.nextInt();
//            arr[count] = num;
//            count++;
//            if (num == 0) {
//                break;
//            }
//        }
//
//
//        for (int j : arr) {
//
//            counter=0;
//            for (int n : arr) {
//                if (j == n) {
//                    counter++;
//                }
//            }
//            System.out.println(j + "occur" + counter);
//        }
//
//


//        int [] myList = {1,5,2,3,5,5};
//        int temp = myList[myList.length-1];
//        for (int i = myList.length-1;i>0;i--){
//            myList[i] = myList[i-1];
//
//
//        }
//        myList[0]=temp;
//
//        for (int n:myList){
//            System.out.println(n);
//        }


//        for (int i = 0; i < myList.length; i++) {
//            int j = ran.nextInt(0,i+1);
//
//            int temp = myList[i];
//            myList[i] = myList[j];
//            myList[j] = temp;
//            System.out.println(myList[i]);
//        }
//

//        int [] myList = {1,5,2,3,5,5};
//        double max = myList[0];
//        int indexOfMax = 0;
//        for (int i = 1; i < myList.length; i++) {
//            int j = ran.nextInt(0,i+1);
//            if (myList[i] > max) {
//                max = myList[i];
//                indexOfMax = i;
//            }
//            System.out.println(indexOfMax);
//        }


//        int [] myList = {1,5,2,3,5,5};
//        double temp= myList[myList.length-1];
//        for (int i = 1; i < myList.length; i++) {
//            myList[i]  = myList[i-1];
//            System.out.println(myList[i]);
//        }
//
//        myList[0] = (int) temp;
//        System.out.println(myList[0]);


//        int list[] = {1, 2, 3, 4, 5, 6};
////
////        for (int i = 1; i < list.length; i++)
////             list[i] = list[i - 1];
////
////         for (int i = 0; i < list.length; i++)
////             System.out.print(list[i] + " ");
//
//        double [] array = new double[10];
//        for(int i = 0;i<10;i++){
//            array[i] = input.nextDouble();
//            System.out.println(array[i]);
//        }
//
//        double sum = 0.0;
//        double count=0;
//        for (int i = 0;i<10;i++){
//         sum = sum+array[i];
//         count++;
//        }
//        int above = 0;
//        double avg = sum/count;
//        System.out.println("AVG " +avg);
//
//        for (double m : array)
//        {
//            if (m>avg){
//                above++;
//            }
//            System.out.println("Above aveg "+above);
//        }

//        int[] myList;
//        myList = new int[10];
//// Sometime later you want to assign a new array to myList
//        myList = new int[20];
//        for (int n:myList)
//        System.out.println(n);


//        int [] arr = {1,2,3,4,5};
//        int [] ar = new int[arr.length];
//        for (int i = 0;i<arr.length;i++)
//        {
//            ar[i] = arr[i];
//            System.out.println(ar[i]);
//        }
//
//    int [] a  = {1,2};
//    array(a);
//    }
//    public static void array(int [] b ){
//        int temp = b[0];
//        b[0] = b[1];
//        b[1] = temp;
//        System.out.println(b[0] + " "+ b[1]);
//

//    int [] array = {1,2,3,4,5};
//    int []  ar1 = new int[array.length];
//    for (int i = 0,p=ar1.length-1; i<array.length&& p>=0;i++,p--){
//        ar1[p] = array[i];
//
//    }
//    for (int n: ar1){
//        System.out.println(n);

//
//        System.out.println();
//        int  [] arr = {1,2,3,4,5,5,5};
//        int n = 5;
//        int count = 0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] == n){
//                count++;
//            }
//        }
//        System.out.println("Count "+ count);

//
//        int l = (int)'a';
//        int m = (int) 'z';
//        System.out.println(l);
//        System.out.println(m);
//
//        int count = 0;
//        char [] ch = new char [100];
//        for (int i = 0; i<ch.length;i++){
//            int r = ran.nextInt(l,m);
//            count++;
//            char c = (char)r;
//            ch[i] = c;
//            System.out.print(c+ " ");
//
//            if (count%20==0){
//                System.out.println();
//            }
//
//
//        }
//
////        int location = 0;
////        for (int i =l; i<=m;i++){
////            char alph = (char) i;
////            System.out.println("ALPHA"+ alph);
////            for (char character: ch){
////                if (character == alph){
////                    location++;
////
////                }
////
////
////            }
////            System.out.println(alph+" occurs "+ location);
////        }
//             int[] charCount = new int[26]; // Assuming only lowercase letters (a-z)
//        for (char character : ch) {
//            int index = character - 'a';
//            charCount[index]++;
//        }
//
//        System.out.println("\nCharacter Count:");
//        for (int i = 0; i < charCount.length; i++) {
//            char character = (char) ('a' + i);
//            int occurrence = charCount[i];
//            System.out.println(character + ": " + occurrence);
//        }


        // sorting an array

//        int [] ar = {1,6,7,8,2,9,1,39,0};
//        for (int i = 0;i < ar.length;i++){
//            for (int j= i+ 1;j<ar.length;j++)
//            {
//                int temp = 0;
//                if (ar[i]>ar[j]){
//                    temp = ar[i];
//                    ar[i] = ar[j];
//                    ar[j] = temp;
//                }
//
//            }
//            System.out.println(ar[i]);
//        }


        // 7.1
//        System.out.println("Enter stu");
//        int students = input.nextInt();
//        System.out.println("Enter best ");
//        int best = input.nextInt();
//        int []  array = new int[students];
//        System.out.println("Enter array elements");
//        for (int i = 0;i<array.length;i++){
//            array[i] = input.nextInt();
//
//        }
//        for(int i = 0;i<array.length;i++) {
//            if(array[i] >=best-10){
//                System.out.println("Student "+i+" score grade A");
//            }
//            else if(array[i] >=best-20){
//                System.out.println("Student "+i+" score grade B");
//            }
//            else if(array[i] >=best-30){
//                System.out.println("Student "+i+" score grade C");
//            }
//            else{
//                System.out.println("Student "+i+" score grade D");
//            }
//        }


        // 7.2

//        int []  array = new int[10];
//        System.out.println("Enter array elements");
//        for (int i = 0;i<array.length;i++){
//            array[i] = input.nextInt();
//
//    }
//        int [] ar1 = new int[array.length];
//        for (int i=0,p=ar1.length-1;i<array.length&& p>=0;i++,p--){
//            ar1[p] = array[i];
//            System.out.println("A["+p+"]"+ar1[p]);
//        }
//
//        for (int n:ar1){
//            System.out.println(n);
//        }


        //7.3

//        int []  array = new int[10];
//        System.out.println("Enter array elements between 1 and 100");
//        for (int i = 0;i<array.length;i++){
//            array[i] = input.nextInt();
//        }
//
//        int com = 0;
//        for (int i = 0;i<array.length;i++){
//            int ele = array[i];
//
//            for (int n:array){
//                if (ele==n){
//                    com++;
//                }
//
//            }
//            System.out.println(ele+" occurs "+com+" Times ");
//            com= 0;
//        }


        // 7.4
//        int []  array = new int[100];
//        int c = 0;
//
//
//        while(c<array.length){
//            System.out.println("Enter score");
//            array[c] = input.nextInt();
//
//            if (array[c] <0){
//                break;
//            }
//            c++;
//        }
//
//        int best = 100;
//        int sum = 0;
//        int avg = 0;
//        int max = 0;
//        int min = 0;
//        for (int n: array){
//            sum=sum+n;
//
//        }
//        avg = sum/c;
//        System.out.println("A"+avg);
//        for(int m: array){
//            if (m>=avg){
//                max++;
//            }
//
//        }
//        System.out.println("MAX "+ max);
//        min = (c) - max;
//        System.out.println("MIN "+ min);
//        System.out.println("c"+c);


        // 7.5

//
//        int dicCount = 0;
//        int [] distinct =  new int[10];
//        for (int i = 0;i<distinct.length;i++) {
//            int num = input.nextInt();
//
//            boolean li = true;
//            for (int j = 0; j<dicCount;j++){
//                if (num== distinct[j]){
//                    li = false;
//                    break;
//                }
//
//            }
//            if(li){
//                distinct[dicCount] = num;
//                dicCount++;
//            }
//
//
//        }
//
//        for (int n: distinct){
//            System.out.println(n);
//        }
//

//        int [] distinctArray = new int [10];
//        int [] array = new int[10];
//        int count = 0;
//        int disCount = 0;
//        while(count<=9){
//            System.out.println("Enter a number: ");
//            int num = input.nextInt();
//
//            array[count] = num;
//            count++;
//        }// while loop ends
//
//        boolean isDis = true;
//        for(int i = 0;i<array.length;i++){
//            for (int j = 0;j<disCount;j++){
//                if (array[i] == distinctArray[j]){
//                    isDis = false;
//                    break;
//                }
//            }
//            if (isDis){
//                distinctArray[disCount] = array[i];
//                disCount++;
//            }
//            }
//        for (int n: distinctArray){
//            System.out.println(n);
//        }
//        }


        // 7.7
//        int num=0;
//        int count = 0;
//        int [] number = new int[100];
//        for (int i = 0; i<100;i++){
//            num = ran.nextInt(0,9+1);
//            number[i] = num;
//            System.out.print(num+ " ");
//        }
//
//        int [] arr = {0,1,2,3,4,5,6,7,8,9};
//        for (int i = 0; i<arr.length;i++){
//            count = 0;
//            for (int n: number){
//                if (arr[i] ==n){
//                    count++;
//
//                }
//            }
//            System.out.println(arr[i] + " occurs "+ count);
//        }


        // 7.9
//        int [] array = new int[10];
//
//        double [] array1 = new double[10];
//
//        for (int i = 0;i<array1.length;i++){
//            array1[i] = input.nextDouble();
//        }
//
//        System.out.println(average(array1));
//        System.out.println(average(array));
//    }
//    public static int average(int[] array){
//        int sum = 0;
//        int count = 0;
//        for (int i = 0; i<array.length;i++){
//            sum = sum+ array[i];
//            count++;
//        }
//        int avg = sum/count;
//        return avg;
//    }
//
//
//
//    public static double average(double[] arr){
//        double sum = 0;
//        int count = 0;
//        for (int i = 0; i<arr.length;i++){
//            sum = sum+ arr[i];
//            count++;
//        }
//
//        double avg = sum/count;
//        return avg;

//
//        int [] originalArray = new int [10];
//        int [] distinctArray = new int[10];
//        int count = 0;
//        int num = 0;
//        while(count<=9){
//            System.out.print("Enter the number: ");
//            num = input.nextInt();
//            originalArray[count] = num;
//            count++;
//        }// while ends and array elements stored
//
//        int disCount = 0;
//
//        for (int i = 0; i<originalArray.length;i++){
//            boolean isDistinct = true;
//            for (int j = 0; j<disCount;j++){
//                if (originalArray[i] == distinctArray[j]){
//                    isDistinct=false;
//                    break;
//                }
//            }// for loop ends here
//
//            if (isDistinct){
//                distinctArray[disCount] = originalArray[i];
//                disCount++;}
//        }// outer for loop ends here
//
//        for (int n: distinctArray){
//            System.out.println(n);
//        }

//        int []  array = {1,2,3,4,5,6,0,23,45};
//        int min = Integer.MAX_VALUE;
//        int minIdex = 0;
//        for (int i = 0; i<array.length;i++){
//            if (array[i] <min){
//                min = array[i];
//                minIdex = i;
//            }
//
//
//        }
//        System.out.println(min+ " exists at "+minIdex);


//        int number = 28;
//        for (int i =1;i<number;i++){
//             if (number%i==0){
//                 System.out.println(i);
//             }
//        }

//        int n1 =10;
//        int n2 =20;
//        int gcd = 1;
//        int k = 2;
//        while(k<=n1 && k<=n2){
//            if (n1%k==0 && n2%k==0)
//                gcd = k;
//            k++;


//
//        }
//        System.out.println(gcd);


//        // gcd # 2
//        int a = 10; int b = 20;
//        while(b!=0){
//            int temp = b;
//            b = a%b;
//            a = temp;
//        }
//        System.out.println(a);

//        int num1= 10;
//        int num2=20;
//        System.out.println(random(num1,num2));
//    }
//    public static int random(int num1,int num2){
//        boolean diff = false;
//        int unique=0;
//        Random rn = new Random();
//        int n = rn.nextInt(1,55);
//        if (n!=num1 && n!=num2){
//            diff = true;
//        }
//
//        if (diff){
//            unique = n;
//
//        }
//        else{
//            diff = false;
//        }
//    return unique;

//    }

//
//        int limit = 5;
//        int [] number = new int[5];
//        for (int i = 0;i<number.length;i++){
//            System.out.print("Enter number ");
//            int n = input.nextInt();
//            number[i] = n;
//        }// for loop to take inputs
//
//        int result = gcd(number);
//        System.out.println("The gcd is "+ result);
//    }
//
//    public static int gcd(int... number){
//        int result = number[0];
//        for (int i = 1;i<number.length;i++){
//             result = computeGcd(result,number[i]);
//        }
//        return result;
//    }
//    public static int computeGcd(int a, int b){
//        while(b!=0){
//            int temp = b;
//            b = a%b;
//            a = temp;
//        }
//        return a;
//    }// method ends here

//        int numOfStu = 5;
//        String [] stuName = new String[numOfStu];
//        int [] stuMarks = new int[numOfStu];
//
//        for (int i=0;i<numOfStu;i++){
//            System.out.print("Enter the name:");
//            String name  = input.nextLine();
//            stuName[i] = name;
//            System.out.print("Enter the marks: ");
//            int marks = input.nextInt();
//            input.nextLine();
//            stuMarks[i] = marks;
//
//        }// inputs
//
//        for (int i = 0;i<stuMarks.length;i++){
//            for (int j = i+1; j<stuMarks.length;j++){
//                if (stuMarks[i]>stuMarks[j]){
//                    int tempMarks = stuMarks[i];
//                    stuMarks[i] = stuMarks[j];
//                    stuMarks[j] = tempMarks;
//
//                    String tempName = stuName[i];
//                    stuName[i]  = stuName[j];
//                    stuName[j] = tempName;
//
//                }
//            }
//        }// sorted the array
//
//
//        for (int i =numOfStu-1;i>=0;i--){
//            int m = stuMarks[i];
//            String n = stuName[i];
//            System.out.println(n+ " has got " +m);
//        }


//        int [] m = {1,2,3,4,5};
//        int [] n =new int[5];
//        for(int i = 0;i<m.length;i++){
//            n[(n.length-1)-i] = m[i];
//        }
//
//        for(int num: n){
//            System.out.println(num);
//        }

        // COMPUTE THE GCD  .......(7.14).......
//        int[] n = new int[5];
//        System.out.println("Enter element");
//
//        for (int i = 0; i < n.length; i++) {
//            int num = input.nextInt();
//            n[i] = num;
//        }// for loop ends here
//        System.out.println(gcd(n));
//
//    }
//
//    public static int gcd(int... n) {
//        int result = n[0];
//        for (int i = 1; i < n.length; i++) {
//            result = gcd(result, n[i]);
//        }
//        return result;
//
//    }
//
//    public static int gcd(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//
//        }
//        return a;
//    }


        //7.15
//     int n [] = {1,2,3,4,5,6,1,2,6};
//     int disarray[] = new int[n.length];
//     int disCount = 0;
//     boolean dis = true;
//     for(int i = 0;i<n.length;i++){
//         for(int j=0;j<disCount;j++){
//             if( n[i] == disarray[j] ){
//                 dis = false;
//                 break;
//             }
//         }
//
//         if(dis){
//             disarray[disCount] = n[i];
//             disCount++;
//     }
//
//     }
//
//     for(int lop: disarray){
//         System.out.println(lop);
//     }

        // 7.18
//        int num [] = {1,3,2,4,6,8,2,9,10,6};
//        int num1 [] = num;
//        for(int i = 0;i<num.length;i++){
//            for(int j =i+1;j<num.length;j++){
//                if(num[i] > num[j]){
//                    int temp = num[i];
//                    num[i] = num[j];
//                    num[j] = temp;
//                }
//            }
//        }
//
//            for(int n:num){
//                System.out.println(n);
//
//            }

        // 7.19
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
//                if(n[i]<n[j]){
//                    sorted = true;
//                }
//                else{
//                    sorted = false;
//                }
//
//            }
//
//        }
//        return sorted;
//

        // 7.20
//        int array [] = {1,4,7,2,4};
//        int [] m = great(array);
//
//        for(int e: m){
//            System.out.println(e);
//        }
//
//    }
//    public static int[] great(int [] array) {
//        int max = array[0];
//
//        for(int i = array.length-1;i>0;i--){
//            int index = 0;
//            for (int j =1 ;j<=i;j++) {
//                if (array[j] > array[index] ) {
//                    index = j;
//                }
//
//                int temp = array[index];
//                array[index] = array[i];
//                array[i] = temp;
//            }
//
//        }
//
//        return array;

        // 7.27
//        System.out.println("How many elements you want in list 1: ");
//        int num = input.nextInt();
//        int[] n = new int[num];
//        for (int i = 0; i < n.length; i++) {
//            int nu = input.nextInt();
//            n[i] = nu;
//        }
//
//        System.out.println("How many elements you want");
//        int num2 = input.nextInt();
//        int[] n2 = new int[num];
//        for (int i = 0; i < n2.length; i++) {
//            int nu2 = input.nextInt();
//            n2[i] = nu2;
//        }
//
//        System.out.println("Is list 1 and list 2 identical ? ....." + sameT(n, n2));
//    }

//    public static boolean sameT(int[] n, int[] n2) {
//        boolean same = true;
//        for (int i = 0; i < n.length; i++) {
//            if (n[i] == n2[i]) {
//                same = true;
//            }
//            else{
//                same = false;
//            }
//
//        }
//        return same;
//
//    }

        //7.27
        // first sort the arrays and then compare the contents its easy

//    public static void sort(int [] n,int []arr){
//        for(int i=0;i<n.length;i++){
//            for(int j=i+1;j<n.length;j++){
//                if(n[i]>n[j]){
//                    int temp = n[i];
//                    n[i] = n[j];
//                    n[j] = temp;
//                }
//            }
//        }// for ends here
//
//        for(int i=0;i<arr.length;i++){
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }// for ends here
//    }
//    public  static boolean sameT(int [] n,int[] arr) {
//        sort(n, arr);
//
//        boolean same = true;
//
//        for (int i = 0; i < n.length; i++) {
//            if (n[i] == arr[i]) {
//                same = true;
//            } else {
//                same = false;
//            }
//        }
//
//        return same;
//    }


//        System.out.println("Enter numbers");
//        int n [] =new int [10];
//        for(int i=0;i<n.length;i++){
//            int num = input.nextInt();
//            n[i] = num;
//        }
//
//        int count=0;
//        for(int i =0;i<n.length;i++){
//            for(int j=0;j<n.length;j++){
//                if(i!=j){
//                    System.out.println(n[i]+" "+n[j]);
//                    count++;
//                }
//            }
//        }
//        System.out.println("Total counts are "+count);
//
//        int n1  =1;
//        int n2 = 7;
//        for(int i=1;i<7;i++){
//            for(int j=i+1;j<=7;j++){
//                System.out.println(i+" "+j);
//            }
//        }
//
//        int [] deck;
//        do{
//            deck = new int[52];
//            pickFour(deck);
//        }while(sum(deck)!=24);
//            print(deck);
//    }
//
//    public static void  pickFour(int[] deck){
//        Random ran = new Random();
//
//        for(int i=0;i<4;i++){
//            deck[ran.nextInt(1,52)]++;
//        }
//
//    }
//    public static int sum(int [] deck){
//
//        int sum=0;
//        for(int i=0;i<deck.length;i++){
//            sum = sum + ((i+1)%13 ) * deck[i];
//
//
//
//        }
//return sum;
//    }
//    public static void print(int [] deck){
//
//        String [] ranks = {"Ace","1","2","3","4","5","6","7","8","9","Jack","Queen","King"};
//        for(int i=0;i<deck.length;i++){
//            if(deck[i]>0){
//                System.out.println(ranks[i%13]+" " +
//                        "");
//            }
//
//        }
//        System.out.println();
//
//    }


//        int [] n = {1,2,3,4,4,4,4,5};
//
//        if(conseq(n)){
//            System.out.println("The list has consecutive fours");
//        }
//        else{
//            System.out.println("The list has  not consecutive fours");
//        }
//
//    }
//
//    public static boolean conseq(int [] n){
//        boolean conn  =false;
//            for(int i=0;i<n.length-3;i++){
//                if (n[i] == n[i + 1] && n[i + 1] == n[i + 2] && n[i + 2] == n[i+3]) {
//                    conn = true;
//                    break;
//                }
//                else {
//                    conn= false;
//                }
//            }
//        return conn;

//        int [] n = {1,2,3,4,5};
//        int [] m = {6,9,7,8,10};
//        int[] o = new int [n.length+m.length];
//        ArrayList<Integer>l = new ArrayList<Integer>();
//
//        int pos=0;
//        for(int num:n){
//            o[pos]=num;
//            pos++;
//        }
//        for(int mum:m){
//            o[pos]=mum;
//            pos++;
//        }
//
//        for(int m1:o){
//            System.out.println(m1);
//        }

        // 7.34

//        int [] n = {5,2,3,9,3,2,6,7,8,3,2};
//        ArrayList<Integer> small = new ArrayList<Integer>();
//        ArrayList<Integer> large = new ArrayList<Integer>();
//        int n1  = n[0];
//        for(int i=0;i<n.length;i++){
//            if(n[i]>=n1){
//                large.add(n[i]);
//            }
//            else{
//                small.add(n[i]);
//            }
//        }
//
//        int merged [] = new int[n.length];
//        int pso=0;
//        for(int num:small){
//            merged[pso] = num;
//            pso++;
//
//        }
//        System.out.println(small);
//        for(int num2:large){
//            merged[pso]=num2;
//            pso++;
//        }
//        System.out.println(large);
//
//
//        for(int r : merged){
//            System.out.print(r+" ");
//        }

        
//        System.out.println("Enter a string ");
//        String s = input.nextLine();
//        char[] a2 = new char[s.length()];
//        for(int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            a2[i] = ch;
//        }
//
//        for(int i=0;i<a2.length;i++){
//            for(int j=i+1;j<a2.length;j++){
//                if(a2[i]>a2[j]){
//                    char temp = a2[i];
//                    a2[i] = a2[j];
//                    a2[j] = temp;
//                }
//            }
//        }
//        for(char c: a2){
//            System.out.println(c);
//        }

//        System.out.println("Enter numbers");
//        int n [] =new int [10];
//        for(int i=0;i<n.length;i++){
//            int num = input.nextInt();
//            n[i] = num;
//        }
//        int count=0;
//        for(int i =0;i<n.length;i++){
//            for(int j=0;j<n.length;j++){
//                if(i!=j){
//                    System.out.println(n[i]+" "+n[j]);
//                    count++;
//                }
//            }
//        }
//        System.out.println("Total counts are "+count);

//        try {
//            FileOutputStream fs = new FileOutputStream("PracticeOfFile.txt");
//            PrintStream ps = new PrintStream(fs);
//
//            while(true){
//                System.out.println("Enter roll num: ");
//                int rno = input.nextInt();
//                input.nextLine();
//                if(rno==0){
//                    break;
//                }
//
//                else{
//                    System.out.println("Enter name: ");
//                    String name = input.nextLine();
//                    System.out.println("Enter marks");
//                    int marks = input.nextInt();
//
//
//
//                    ps.println(rno);
//                    ps.println(name);
//                    ps.println(marks);
//                }
//            }
//
//        }
//        catch (Exception e){
//            System.out.println(e.toString());
//        }

//        int [][] a2 = {{1,2,3},{4,2,1},{7,8,9}};
//        for(int i=0;i<a2.length;i++){
//            for(int j=i+1;j<a2.length;j++){
//                if(a2[i]>a2[j]){
//                    char temp = a2[i];
//                    a2[i] = a2[j];
//                    a2[j] = temp;
//                }
//            }
//        }
//        for(char c: a2){
//            System.out.println(c);
//        }

//        String  s = "ONE | TWO | THREE .";
//        int count=0;
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i) == ' '){
//                continue;
//            }
//            else{
//                count++;
//            }
//        }
//        System.out.println(count);

//        int num=375;
//        int d1= num%10;
//        System.out.println(factorial(d1));
//        num=num/10;
//        int d2 = num%10;
//        System.out.println(factorial(d2));
//        num=num/10;
//        int d3 = num%10;
//        System.out.println(factorial(d3));
//
//    }
//    public static int factorial(int n){
//
//        if(n==0)
//            return 1;
//        else if(n==1)
//            return 1;
//        else
//            return n* factorial(n-1);

//        int Senital=5;
//        try{
//            FileOutputStream fs = new FileOutputStream("St.txt");
//            PrintStream ps = new PrintStream(fs);
//
//            int count=1;
//            while(count<=Senital){
//                System.out.println("Enter score");
//                int score = input.nextInt();
//                count++;
//                ps.println(score);
//            }
//
//
//            ArrayList<Integer> mar = new ArrayList<Integer>();
//            FileInputStream fi = new FileInputStream("St.txt");
//            Scanner sc = new Scanner(fi);
//            while(sc.hasNext()){
//                String mark = sc.nextLine();
//                int m  = Integer.parseInt(mark);
//                mar.add(m);
//
//            }
//
//            int sum=0;
//            for(int n: mar){
//                sum=sum+n;
//            }
//            int avg = sum/count;
//
//            int m2=0;
//            for(int n:mar){
//                if(n>avg){
//                    m2++;
//
//                }
//            }
//            System.out.println(m2);
//
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }

        String password = input.nextLine();
        int digit = 0;
        if(password.length()>=8){
            for(int i=0;i<password.length();i++){
                if(Character.isLetterOrDigit(password.charAt(i))){
                    if(len(password)){
                        System.out.println("Valid");
                    }
                    else{
                        System.out.println("Invalid");
                    }
                }
                else{
                    System.out.println("Invalid");
                }
            }

        }
        else{
            System.out.println("invalid limit" +
                    "");
        }
    }

    public static boolean len(String  pas){
        int pos=0;
        for(int i=0;i<pas.length();i++){
            if(Character.isDigit(pas.charAt(i))){
                pos++;
            }
        }
        if(pos>=2)
            return true;
        else
            return false;
    }

    public static class oop_Thread_Priorities {
        public static void main(String[] args) {

        }
    }
}




