import javax.swing.*;
import java.util.Calendar;
import java.util.Scanner;
public class df {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("Enter a number:");
//        int num = input.nextInt();
//
//        boolean n = true;
//        while(n){
//
//            if (Prime(num)){
//                System.out.println(num);
//                n= false;
//            }
//            else{
//                System.out.println("Enter again:");
//                num = input.nextInt();
//                n = true;
//            }
//        }
//    }
//
//    public static boolean Prime(int num){
//        boolean IsPrime = true;
//        int factor = 2;
//        for (factor = 2; factor<=num/2; factor++){
//            if (num%factor==0){
//                IsPrime = false;
//                break;
//            }
//            else{
//                IsPrime = true;
//            }
//        }
//        return IsPrime;

//
//        System.out.println("Enter an integer, ends wuth 0");
//        int number  = input.nextInt();
//        int pos, neg;
//        pos=neg = 0;
//        double avg= 0.0;
//        int sum = 0;
//        int cal = 0;
//        while (number!=0){
//            if (number>0){
//                pos++;
//            }
//            else if (number<0){
//                neg++;
//            }
//
//            sum = pos+neg;
//            cal = cal+number;
//
//            number = input.nextInt();
//
//        }
//        System.out.println("pos"+pos);
//        System.out.println("neg"+neg);
//        System.out.println("total is"+cal);
//        System.out.println("avg is"+ (cal/sum));
//
//
//        int k1 = 1;
//        int k2 = 199;
//        int p1 =20;
//        int p2 = 515;
//        double pounds = 0;
//        double kilos = 0;
//
//        for (int i = k1, p =p1; i<=k2 && p<=p2;i =i +2,p =p+5){
//            pounds = i * 2.20462;
//            System.out.printf("%-15d \t 4.1%f",i,pounds);
//            System.out.print(" | ");
//            kilos = (double)p/2.20462;
//
//            System.out.printf("%-15d \t 8.2%f",p,kilos);
//            System.out.println("");
//    }
//        System.out.println("");
//

//        System.out.println("Tuition: ");
//        int tutuion = input.nextInt();
//        double tax = 1.05;
//        int year = 0;
//        int sum = 0;
//        while (year < 14){
//            if (year<10){
//            tutuion = (int) (tutuion * tax);
//            year++;}
//            System.out.println( year +"-- "+ tutuion);
//
//
//            if (year >=10){
//                tutuion = (int) (tutuion * tax);
//                year++;
//                sum = sum+ tutuion;
//            }
//
//        }
//        System.out.println("Total sum after 10 is "+ sum);

//        System.out.println("Enter the name of the stu");
//        String nam = input.nextLine();
//        System.out.println("eNTER Marks");
//        int marks = input.nextInt();
//        int max = marks;
//        String maxStu = nam;
//        int students = 5;
//        int num = 1;
//        while (num<students){
//            System.out.println("name");
//            nam = input.nextLine();
//            System.out.println("Marks");
//            marks = input.nextInt();
//
//            if (marks>max){
//
//                max= marks;
//                maxStu = nam;
//            }
//            num++;
//
//
//        }
//        System.out.println("stu"+maxStu);
//        System.out.println("ma"+ marks);

//        for (int i =1; i<=1000; i++){
//            if (isPerfect(i)){
//                System.out.println(i);
//            }
//        }
//
//
//    }
//    public static boolean isPerfect(int i){
//        int sum = 0;
//        boolean perfect = false;
//        for (int j = 1; j<=i/2; j++){
//            if(i%j==0){
//                sum = sum+j;
//            }
//        }
//        if (sum == i){
//            perfect = true;
//        }
//        return perfect;


//        System.out.println("Enter number");
//        int num = input.nextInt();
//        int max = num;
//        int countmax = 0;
//        while(num!=0){
//            if (num>max){
//                max = num;
//                countmax++;
//            }
//            System.out.println("Enter number");
//            num = input.nextInt();
//        }
//        System.out.println("max "+ max);
//        System.out.println("occur"+ countmax);
//    }


//        int num = input.nextInt();
//        int max = 0;
//        max = num;
//        int ind = 0;
//
//        while(num!=0){
//            if (num>max){
//                max = num;
//                ind++;
//            }
//            num
//            = input.nextInt();
//
//        }
//        System.out.println("ind"+ (ind+1));
//
//        System.out.println("Enter str:");
//        String  str = input.nextLine();
//        String rev = "";
//        char kl = 'a';
//        int count = 0;
//        for (int i =0; i<str.length();i++){
//            kl = str.charAt(i);
//            if(Character.isUpperCase(kl))
//            {
//                count++;
//
//            }
//
//
//            }
//        System.out.println(count);

//        System.out.println("Enter k");
//        int k = input.nextInt();
//        System.out.println("Enter N");
//        int N = input.nextInt();
//        int apples = k/N;
//        int rem = k%N;
//        System.out.println(apples);
//        System.out.println(rem);

//        System.out.println("Enter the minutes :");
//        int minutes = input.nextInt();
//        int hours = minutes/60;
//        int remMin = minutes%60;
//        System.out.println(hours+":"+remMin);


//        System.out.println("Enter the milk in morning: ");
//        double milk = input.nextInt();
//        int cartons = (int)(milk/3.78);
//        double cost = milk*0.38;
//        double profit = cartons* 0.27;
//        System.out.println("cartons"+ cartons);
//        System.out.println("cost" + cost);
//        System.out.println("Profir"+ profit);


//        System.out.println("Enter the pay rate per houre");
//        double parrate = input.nextDouble();
//        System.out.println("Hours");
//        double hours = input.nextDouble();
//        double pay = parrate * hours;
//
//        double beforeTax = pay * (0.14);
//        double afterPay = pay - beforeTax;
//        double clothes = afterPay*0.1;
//        double school = afterPay * 0.01;
//        double remainMoney  = afterPay -(clothes+school);
//        double savingsbonds = remainMoney * 0.25;
//        double addbonds = savingsbonds* 0.50;


//        int degrees = 30;
//        double radians = Math.toRadians(degrees);
//        double sin = Math.sin(radians);
//        double cos = Math.cos(radians);
//        double tan = Math.tan(radians);
//        System.out.printf("%5d  %4.4f  %4.4f  %4.4f  %4.4f",degrees,radians,sin,cos,tan);
//

//        for (int j  =1; j<=9;j++){
//            System.out.print("  "+ j);
//
//        }
//        System.out.println(" ");
//        System.out.println("---------------------------");
//
//        for (int i =1; i<=9; i++){
//            System.out.print(i + " | ");
//            for (int j =1; j<=9; j++){
//                System.out.printf("%4d", i*j);
//            }
//            System.out.println("  ");
//        }
//        System.out.println("  ");

//        String name = "Harory";
//        System.out.println(name.lastIndexOf("r",3));

//        System.out.println("Charater");
//        int co  = input.nextInt();
//        char ch  = (char)co;
//        System.out.println(ch);
//
//        System.out.println("Letter");
//        char ch1 = input.next().charAt(0);
//        System.out.println((int)ch1);

//        System.out.println("Enter the number of the students in class one: ");
//        float classOne = input.nextInt();
//        System.out.println("Enter the number of the students in class two: ");
//        float classTwo = input.nextInt();
//        System.out.println("Enter the number of the students in class three: ");
//        float classThree = input.nextInt();
//        float desksOne = (classOne/2);
//        desksOne = (float) Math.ceil(desksOne);
//        System.out.println(desksOne);
//        float desksTwo = (classTwo/2);
//        desksTwo = (float) Math.ceil(desksTwo);
//        System.out.println(desksTwo);
//        float desksThree = (classThree/2);
//        desksThree = (float) Math.ceil(desksThree);
//        System.out.println(desksThree);
//        System.out.println(desksOne+desksThree+desksTwo);

//        System.out.println("Enter a string; ");
//        String str  = input.nextLine();
//        String loop9 = "";
//        for (int i = 0;i<str.length(); i++){
//            char ch  = str.charAt(i);
//            loop9 = String.valueOf(ch)+ loop9;
//        }
//        if (loop9.equals(str))
//        {
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not palindrome");
//        }


//        System.out.println("Enter num1:");
//        int num1 = input.nextInt();
//        System.out.println("Enter num2:");
//        int num2 = input.nextInt();
//        swapGrade(num1,num2);
// }
//         public static void swapGrade(int num1, int num2){
//        int temp = num1;
//         num1 = num2;
//         num2 = temp;
//             System.out.println(num1+ " " +num2);

//
//        int num = input.nextInt();
//        System.out.println(reverse(num));}
//        public static int reverse(int n){
//        String sum = " ";
//        while(n!=0){
//            int d = n%10;
//            sum = sum+String.valueOf(d);
//            n = n/10;
//
//        }
//        return Integer.parseInt(sum);

//        System.out.println("Enter a string; ");
//        String str = input.nextLine();
//
//        String  str11 = str.substring(0,str.indexOf('h')+1);
//
//        String str22 = str.substring(str.lastIndexOf('h'));
//        String line  = str11+str22;
//        line  = line.replace("h","");
//        System.out.println(line);


//        String str33 = str.substring(str.indexOf('h')+1, str.lastIndexOf('h'));
//        str33 = str33.replace('h', 'H');


//        System.out.print(str11);
//        //System.out.print(str33);
//        System.out.print(str22);


//        System.out.println("String: ");
//        String str = input.nextLine();
//        int vowels =0;
//        for (int i =0; i<str.length();i++){
//            char ch = str.charAt(i);
//            if (ch== 'a' || ch == 'e'|| ch == 'i'|| ch =='o'|| ch == 'u'){
//                vowels++;
//            }
//        }
//        System.out.println("vowels are"+ vowels);

//        System.out.println("Line");
//        String wo = input.nextLine();
//        ascii(wo);}
//        public static String capitalize(String line){
//
//        String str1 = line.replace(line.charAt(0),Character.toUpperCase(line.charAt(0)));
//    return str1;
//    }

//    public static void ascii(String wo){
//        String [] element = wo.split(" ");
//        for (String elements : element){
//            System.out.println(capitalize(elements));
//        }

//        System.out.println("Enter ISBN-13 number: ");
//        String num = input.nextLine();
//        int sum = 0;
//        if (num.length()!=12){
//            System.out.println(num+ " is invalid");
//        }
//        else{
//            for (int i = 0; i<num.length();i++){
//                char value = num.charAt(i);
//                int d = Integer.parseInt(String.valueOf(value));
//                if (i%2==0){
//                    sum = sum + (d);
//                    System.out.println(num.charAt(i));
//
//                }
//                else{
//                    sum = sum+(d*3);
//
//                }
//
//            }
//            sum = 10-(sum)%10;
//            if (sum==10){
//                sum = 0;
//            }
//            System.out.println("ISBN number is "+num+""+ sum);
//        }
//
        //investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12)
//        System.out.println("investAmount");
//        double investmentAmount = input.nextInt();
//        System.out.println("Year");
//        int year = input.nextInt();
//        System.out.println("rate: ");
//        double rate = input.nextInt();
//        double monthlyInterestRate = rate/1200;
//        for(int i=1; i<=30;i++){
//            System.out.println(i+ "      " +futureInvestmentValue(investmentAmount,monthlyInterestRate,i));
//
//        }}
//        public static double futureInvestmentValue(
//        double investmentAmount, double monthlyInterestRate, int years){
//        double future = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
//        return future;

//        double f1 = 1.0;
//        double f2 = 10.0;
//        double m1  = 20.0;
//        double m2 = 65.0;
//        for (double i=f1,p=m1;i<=10 && p<=65; i=i+1, p=p+5 ){
//            System.out.printf("%-15.1f \t %f",i, footToMeter(i));
//            System.out.print(" | ");
//            System.out.printf("%-15.1f \t %f",p, meterToFoot(p));
//            System.out.println(" ");
//        }
//        System.out.println(" ");
//
//        }
//
//    public static double footToMeter(double i){
//        double foot = i * 0.305;
//        return foot;
//
//    }
//    public static double meterToFoot(double p){
//        double meters = p* 3.279;
//        return meters;

//    char ch1  = '1';
//    char ch2 = 'Z';
//    int Numper = 10;
//    printChars(ch1,ch2,Numper);
//
//    }
//    public static void printChars(char ch1, char ch2, int
//            numberPerLine){
//        int count = 0;
//        for (char ch = ch1; ch<=ch2; ch++){
//            System.out.print(ch);
//            count++;
//            if (count%numberPerLine==0){
//                System.out.println(" ");
////            }
//
//        System.out.println("Enter password: ");
//        String password = input.nextLine();
//        int count = 0;
//        if(password.length() ==8){
//            for(int i=0; i<password.length();i++){
//                if (Character.isLetterOrDigit(password.charAt(i)))
//                {
//                    if (Character.isDigit(password.charAt(i))){
//                        count++;
//                        if (count>=2){
//                            System.out.println("Valid");
//                        }
//                    }
//                }
//
//            }
//
//        }
//        else{
//            System.out.println("Invalid");
//        }

//        System.out.println("Enter string: ");
//        String str = input.nextLine();
//        for(int i=0;i<str.length();i++){
//            char ch = Character.toUpperCase(str.charAt(i));
//
//            if (Character.isDigit(ch)){
//                System.out.print(str.charAt(i));
//            }
//            if (str.charAt(i)=='-'){
//                System.out.print(str.charAt(i));
//            }
//            if( Character.isLetter(ch)){
//                System.out.print(getNumber(ch));
//            }
//        }
//
//        }
//
//        public static int getNumber(char ch) {
//        int num = 0;
//        if (ch=='A' || ch =='B' || ch == 'C'){
//            num=2;
//        }
//         else   if (ch=='D' || ch =='E' || ch == 'F'){
//                num=3;
//            }
//         else if (ch=='G' || ch =='H' || ch == 'I'){
//            num=4;
//        }
//         else if (ch=='J' || ch =='K' || ch == 'L'){
//            num=5;
//        }
//         else if (ch=='M' || ch =='N' || ch == 'O'){
//            num=6;
//        }
//         else if (ch=='P' || ch =='Q' || ch == 'R'|| ch =='S'){
//            num=7;
//        }
//         else if (ch=='T' || ch =='U' || ch == 'V'){
//            num=8;
//        }
//         else if (ch=='W' || ch =='X' || ch == 'Y' || ch== 'Z'){
//                num=9;
//            }
//         return num;


//        System.out.println("Enter string: ");
//       String str = input.nextLine();
//       int count = 0;
//       for (int i=0; i<str.length(); i++){
//           if (str.charAt(i)== 'e'){
//               count++;
//           }
//       }
//        System.out.println("Count"+ count);


        System.out.println("Num");
//        long num = input.nextLong();
//        System.out.println(sqrt(num));
//
//
//    }
//    public static double sqrt(long num){
//        long last, next;
//        last = 1;
//        next = (last + (num / last)) / 2;
//        while((next-last)>0.0001){
//            last = next;
//            next = (last + (num / last)) / 2;
//        }
//        last = next;
//        next = (last + (num / last)) / 2;
//
//
//        return next;
//        long number = input.nextLong();
//
//        // Display the square root
//        System.out.println(
//                "The approximated square root of " + number + " is: " + sqrt(number));
//    }
//
//    /** Method squrt approximates the square root of n */
//    public static double sqrt(long n) {
//        double lastGuess = 1;	// Initial guess to positive value
//        double nextGuess = (lastGuess + n / lastGuess) / 2;
//
//        // If the difference between nextGuess and lastGuess is less than 0.0001,
//        // return nextGuess as the approximated square root of n.
//        while (nextGuess - lastGuess > 0.0001) {
//            lastGuess = nextGuess;
//            nextGuess = (lastGuess + n / lastGuess) / 2;
//        }
//        lastGuess = nextGuess;
//        return nextGuess = (lastGuess + n / lastGuess) / 2;

//
//
//        int num = 3;
//        int p  =2;
//        while(p<=31){
//
//
//        if (prime(p) ){
//            System.out.println(p+"\t\t"+(Math.pow(2,p)-1));
//
//
//        }
//          p++;
//
//        }
//    }

//
//    public static int palindrome(int num){
//        int palindrome = 0;
//        int n = num;
//        int d = 0;
//        String palin = "";
//        while(num!=0){
//            d = num%10;
//            num = num/10;
//            palin = palin+String.valueOf(d);
//        }
//        return Integer.valueOf(palin);
//
//
//
//
//        }


//    public static boolean prime(int num){
//        boolean prime = false;
//        int f = 0;
//        for (int i =2; i<=num/2; i++){
//            if (num%i==0){
//                f++;
//            }
//        }
//        if (f==0){
//            prime = true;
//        }
//        return prime;
//    }
//
//    }

//        System.out.println("Enter number");
//        int num = input.nextInt();
//        int n = num;
//        int d = 0;
//        int sum = 0;
//        while(num!=0){
//            d = num%10;
//            num = num/10;
//            sum = sum+ (d*d*d);
//        }
//        if (sum == n){
//            System.out.println("YESS");
//    }

//        int n1 =0;
//        int n2 = 1;
//        int n3 = 0;
//        int term = 100;
//        for (int i =1; i<=term;i++){
//            System.out.println(n1);
//
//            n1 = n2;
//            n3 = n1+n2;
//            n2 =n3;
//
//
//
//        }

//        System.out.println("ASCII");
//        char co = input.next().charAt(0);
//        if (Character.isLetter(co ) )
//        if (co == 'A'  ||co == 'E'|| co.e ||co.equals("O") || co.equals("U") || co.equals("a")  ||co.equals("e") || co.equals("i") ||co.equals("o") || co.equals("u")   )
//        {
//            System.out.println("Vowel");
//        }

//
//        System.out.print("Enter the first city: "); String c1 = input.nextLine(); System.out.print("Enter the second city: "); String c2 = input.nextLine(); System.out.print("Enter the third city: "); String c3 = input.nextLine();
//
//        if (c1.compareTo(c2) > 0) {
//            String temp = c2;
//            c2 = c1;
//            c1 = temp;
//
//            if (c2.compareTo(c3) > 0) {
//                temp = c3;
//                c3 = c2;
//                c2 = temp;
//            }
//        }
//
//
//
//
//        System.out.println(c1);
//        System.out.println(c2);
//        System.out.println(c3);

        String name = "Muzdalfa";
//        int len = (name.length())/2;
//        String s1 = name.substring(0,len);
//        String s2 = name.substring(len);
//        System.out.println(s1);
//        System.out.println(s2);
//        int vowels = 0;
//        int chs  =0 ;
//        for (int i=0;i<name.length();i++)
//
//        {
//            if (name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)== 'i' || name.charAt(i)== 'o' ||name.charAt(i)== 'u'){
//                vowels++;
//            }
//
//            if (name.charAt(i) != ' '){
//                chs++;
//
//            }
//        }
//        System.out.println("The vowles are"+ vowels);
//        System.out.println("Th chs are"+ chs);


//        int num =12;
//        while(num>=0){
//            if (num%5==0){
//                num++;
//                continue;
//            }
//            System.out.println(num+ " ");
//            num= num-2;
//        }
//        int n = 5;
//        int f = 1;
//        for (int i = 1; i<=n; i++){
//            f = f*i;
//        }
//        System.out.println("Factorail is"+ f);



//        String enc ="";
//        String s = "SIMPLY";
//        char c;
//        for (int i = 0; i<s.length();i++){
//            c = s.charAt(i);
//            if (c =='Y' ||c == 'X' ||  c== 'x'|| c == 'y'){
//                c -= 26;
//            }
//            c+=2;
//            enc = enc+c;
//        }
//
//        System.out.println(enc);

//        System.out.println("Limit");
//        System.out.println("Enter number: ");
//        int num = input.nextInt();
//        int max = num;
//        while(num!=0){
//            int m1 = max;
//            if (num>max){
//                max = num;
//                System.out.println(num);
//            }
//            num = input.nextInt();
//
//        }


//        double pay = 15.50;
//        int hours = 840;
//        double payr = pay*hours;
//        double tax = pay*14.40;
//        double newPay = pay-tax;
//
//        double clothes = newPay * 0.1;
//        double school = newPay*0.01;
//
//        double r = school+clothes;
//        double bonds = (newPay-r)*0.25;
//
//        double savings = bonds +0.50;


//        int m=1;
//        int n=2;
//        int max=0;
//        if(n>m){
//            max = n;
//        }
//        else{
//            max = m;
//        }
//        System.out.println("Max "+ max);


        int w1=10;
        int l1=10;
        int w2=12;
        int l2=12;
        int a1= l1*w1;
        int a2=l2*w2;
        if(a1>a2){
            System.out.println("1st is greater ");
        }
        else{
            System.out.println("2nd is greater");
        }


    }
}







