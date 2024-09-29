import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class loopsPractice {
    public static void main(String[] args) {

        Random ran = new Random();
        Scanner input = new Scanner(System.in);
//
////    public static void main(String[] args) {
////
////        System.out.println("Enter the number: ");
////        int num = input.nextInt();
////        int sum = 0;
////        int pos = 0;
////        int neg = 0 ;
////        double avg = 0;
////        if (num ==0){
////            System.out.println("No numbers are entered except 0");
////        }
////        while(num!=0){
////            sum  = sum +num;
////
////            if (num>0){
////                pos = pos +1;
////            }
////
////            if (num<0){
////                neg = neg +1;
////            }
////            System.out.println("Enter the number: ");
////            num = input.nextInt();
////
////
////
////        }
////        avg = (double)sum/(pos + neg);
////        System.out.println(avg);
//
//
////        int fee = 10000;
////        int year = 0;
////        int sum = 0;
////        while (year < 14) {
////            if (year < 10) {
////                fee = (int) (fee * 1.05);
////                year++;
////            }
////            System.out.println("Fee--- " + fee + " in year " + year);
////
////            if (year >= 10) {
////                fee = (int) (fee * 1.05);
////                year++;
////                sum = sum + fee;
////
////            }
////        }
////        System.out.println("Sum after 10 years will be " + sum);
//
////        System.out.println("Enter the number of students: ");
////        int number = 1;
////        int numberOfStudents = input.nextInt();
////        System.out.println("Enter the name of the student: ");
////        String namee = input.next();
////        System.out.println("Enter the score of the student:");
////        int marks = input.nextInt();
////        int maxMarks = 0;
////        String maxStu = " ";
////        while(number < numberOfStudents){
////
////            if (marks>maxMarks){
////                maxMarks = marks;
////                maxStu = namee; }
////            System.out.println("Enter the name of the student: ");
////            namee = input.next();
////            System.out.println("Enter the score of the student:");
////            marks = input.nextInt();
////            number++;
////
////        }
////        System.out.println(maxStu + " "+ maxMarks);
//
////        int number = 1;
////        System.out.print("Enter the number of students: ");
////        int numberOfStudents = input.nextInt();
////
////        int maxMarks1 = 0;
////        int maxMarks2 = 0;
////        String maxStu1 = " ";
////        String maxStu2 = " ";
////
////        while(number < numberOfStudents){
////            System.out.print("Enter the name of the student: ");
////            String naim = input.next();
////            System.out.print("Enter the score of the student:");
////            int marks = input.nextInt();
////            if (marks > maxMarks1  ){
////                maxMarks2 = maxMarks1;
////                maxMarks1  = marks;
////                maxStu2 = maxStu1;
////                maxStu1 = naim;
////
////            }
////            number++;
////
////        }
////        System.out.println("First heighest by "+ maxStu1 + " " + maxMarks1);
////        System.out.println("Second heighest by "+ maxStu2 + " " + maxMarks2);
//
//
//        // System.out.println("div by 5 and 6");
////        int num = 100;
////        int count = 0;
////        int div = 0;
////        while(num<1000){
////            if(num% 5 == 0 && num% 6==0) {
////                div = num;
////                System.out.print(div + " ");
////                count++;
////
////                if (count == 10) {
////                    System.out.println(" ");
////                    count = 0;
////
////                }
////            }
////            num++;
////
////        }
//
//        // System.out.println("Factors of a number");
////        System.out.println("Enter a number: ");
////        int num = input.nextInt();
////        for (int i =2; i<num/2; ){
////            if (num% i == 0){
////                System.out.println(i+ " ");
////                num = num/i;
////            }
////            else{
////                i++;
////            }
////        }
////        System.out.println(num);
//
//
//        //System.out.println("Prime numbers");
////        int count=0;
////        for (int i = 2; i <= 1000; i++) {
////
////            if (isPrime(i)){
////                System.out.print(i+ " ");
////                count = count + 1;
////                if (count == 8 ){
////                    System.out.println();
////                    count=0;
////                }
////
////
////
////            }
////
////
////        }
////    }
////
////    public static boolean isPrime(int n) {
////        boolean notprime = false;
////        int d = 0;
////
////        for(d=2; d<=n/2;d++){
////            if (n%d==0){
////                notprime = true;
////                break;}
////        }
////        boolean b = !notprime;
////        return b;
//
//
////        System.out.println("Leap year");
////        int count = 0;
////        for(int i =101; i<=2100; i++){
////            if (leapYear(i)){
////                System.out.print(i+ " ");
////                count++;
////                if(count == 10){
////                    System.out.println();
////                    count = 0;
////                }
////            }
////        }
////    }
////    public static boolean leapYear(int n)
////    {
////        boolean isLeap = false;
////        if (n%4==0){
////            isLeap = true;
////        }
////        else{
////            isLeap = false;
////        }
////        return isLeap;
//
//
////        System.out.println("First day of month1");
////        System.out.println("Enter the year: ");
////        int year = input.nextInt();
////        System.out.println("Enter the first day of year: ");
////        int day = input.nextInt();
////        int totalDays = 0;
////
////        String monName = "";
////        String month1 = "";
////        for (int month1 = 0; month1<12; month1++ ){
////            switch (month1){
////                case 0 : monName = "January"; totalDays= 31;  break;
////                case 1 :
////                    monName = "February";
////                    if (year%4==0){
////                        totalDays= 29;
////                    }
////                    else {totalDays= 28;}
////                    break;
////                case 2 : monName = "March"; totalDays= 31; break;
////                case 3 : monName = "April"; totalDays= 30; break;
////                case 4 : monName = "MAY"; totalDays= 31; break;
////                case 5 : monName = "JUNE";totalDays= 30;  break;
////                case 6 : monName = "JULY";totalDays= 31;  break;
////                case 7 : monName = "AUGUST"; totalDays= 31;  break;
////                case 8 : monName = "SEPTEMBER"; totalDays= 30; break;
////                case 9 : monName = "OCTOBER"; totalDays= 31; break;
////                case 10 : monName = "NOVEMBER"; totalDays= 30; break;
////                default : monName = "DECEMBER"; totalDays= 31; break;
////
////
////
////            }
////
//
//        //day = (day + totalDays)%7;
////            System.out.println(monName + " 1 "+ year +" is "+ getDayOfMonth(day) );
////
////
////    public static String getDayOfMonth(int day){
////        String dayOfMonth = " ";
////        if (day == 1){
////            dayOfMonth  = "Monday";
////        }
////        else if (day ==2){
////            dayOfMonth = "Tuesday";
////        }
////        else if (day == 3)
////        {
////            dayOfMonth = "Wednesday";
////        }
////        else if (day == 4){
////            dayOfMonth = "Thursday";
////
////        }
////        else if (day == 5){
////            dayOfMonth = "Friday";
////        }
////        else if (day == 6){
////            dayOfMonth = "Saturday";
////        }
////        else{
////            dayOfMonth = "Sunday";
////        }
////        return dayOfMonth;
//
////
////
////
////
////
////0
////        for(int i =1; i<=10000; i++){
////            if (perfectNumber(i)){
////                System.out.println(i);
////            }
////        }
////        }
////    public static boolean perfectNumber(int n){
////
////        boolean perfect = false;
////        int sum = 0;
////        for (int j =1; j<=n/2; j++ ){
////            if (n % j ==0)
////            {
////
////                sum = sum+j;
////
////
////            }
////
////        }
////        if (sum == n){
////            perfect = true;
////        }
////        return perfect;
////
////    }}
//
////        System.out.println("Enter the number: ");
////        int num = input.nextInt();
////        int n = num;
////        int sum = 0;
////        for (int i = 1; i<num; i++){
////            if (num%i ==0){
////                System.out.println("i "+ i);
////                sum = sum+ i;
////                System.out.println(sum);
////            }
////
////        }
////        if (sum == n){
////            System.out.println("Perfect");}
//
//        //       System.out.println("ARMSTRONG");
////        System.out.println("Enter the number: ");
////        int num = input.nextInt();
////        int number = num;
////        int sum = 0;
////        while(num>0){
////            int n = num%10; // separating the digits
////            num = num/10;
////
////            sum = sum + (n*n*n);}
////                   if(number == sum){
////    System.out.println("It is armstrong number");}// adding the cubes of the numbers
//
//
////        System.out.println("Pairs");
////        int num1 = 0;
////        int num2  =0 ;
//        // int count ==0
////        for (num1 = 1; num1<7; num1++){
////            for (num2 = num1+1; num2<=7; num2++){
////                System.out.println(num1  + " "+ num2);
////                 count++;
////            }
////        }
//
////        System.out.println("5.49");
////        System.out.println("Enter the string: ");
////        String line  = input.nextLine();
////        int i = 0;
////        int vowels = 0;
////        int cosn = 0;
////        for(i =0; i<line.length();i++) {
////            char c = line.charAt(i);
////            String ch = String.valueOf(c);
////            if ((ch.equals("o") ) || (ch.equals("a") ) || (ch.equals("i") ) || (ch.equals("e") ) || (ch.equals("u") )){
////                vowels++;
////            }
////            else{
////                cosn++;
////            }
////
////        }
////        System.out.println("Vowels are "+ vowels);
////        System.out.println("Cons are "+ cosn);
//
//
////        System.out.println("5.50");
////        System.out.println("Enter the string: ");
////        String line  = input.nextLine();
////        int i = 0;
////        int count = 0;
////
////        for(i =0; i<line.length();i++) {
////
////            if (Character.isUpperCase(line.charAt(i))){
////                count++;
////            }
////    }
////        System.out.println(count);
//
//
////        System.out.println("5.51");
////        System.out.println("Enter string one: ");
////        String s1 = input.nextLine();
////        System.out.println("Enter string two:");
////        String s2 = input.nextLine();
////
////        int index = 0;
////        String prefix = " ";
////        while (s1.charAt(index) == s2.charAt(index)){
////            prefix = prefix + s1.charAt(index);
////            index++;
////        }
////
////        if (prefix.length()>0){
////            System.out.println(prefix);
////        }
////        else{
////            System.out.println("Nothing common");
////        }
//
//
////        System.out.println("CHAPTER 6");
////        char c1 = '1';
////        char c2 = 'Z';
////        int perline =10;
////        printChars( c1,  c2 , perline);
////    }
////    public static void printChars( char c1,  char c2 , int perline){
////
////        for(char i = c1,  count = 0; i<=c2; i++, count++){
////            if (count%perline ==0){
////                System.out.println(i);
////            }
////            else{
////                System.out.print(" "+ i);
////            }
////
//////        }
////
////        System.out.println("Password");
////        System.out.println("Enter the password: ");
////        String pass = input.nextLine();
////        char element;
////        int count = 0;
////        if (pass.length()==8)
////        {
////            for (int i = 0;i<pass.length(); i++)
////            {
////                element = pass.charAt(i);
////                if (Character.isAlphabetic(element) || Character.isDigit(element))
////                {
////                    if (Character.isDigit(element))
////                    {
////                        count++;
////
////                        if (count <2){
////                            System.out.println("digits are less than 2");
////
////                        }
////                        else{
////
////
////
////                        }
////                    }
////                }
////                else
////                {
////                    System.out.println("It contains characters other than digits and letters");
////                }
////            }
////            System.out.println("Valid password");
////        }
////        else
////        {
////            System.out.println("Not 8 characters");
////        }
//
////
////        System.out.println("Password");
////        System.out.println("Enter the password: ");
////        String pass = input.nextLine();
////
////        char element;
////        int count = 0;
////        System.out.println("Is a valid password "+ isValidPass(pass));
////    }
////
////    public static boolean isValidPass(String pass){
////        boolean word;
////        if (islength(pass) && isalphanumeric(pass) && isdigit(pass)){
////            word = true;
////        }
////        else {
////            word = false;
////        }
////        return word;
////    }
////
////    public static boolean islength(String pass){
////        boolean length;
////        if (pass.length() == 8){
////            length = true;
////        }
////        else{
////            length = false;
////        }
////        return length;
////    }
////
////    public static boolean isalphanumeric(String pass){
////        boolean lettdigit = false;
////        for (int i = 0; i<pass.length();i++){
////            if (Character.isLetterOrDigit(pass.charAt(i))){
////                lettdigit = true;
////            }
////            else{
////                lettdigit  = false;
////            }
////
////        }
////        return lettdigit;
////
////    }
////
////    public static boolean isdigit(String pass){
////        int count = 0;
////        boolean digits;
////        for (int j =0; j<pass.length(); j++){
////            if (Character.isDigit(pass.charAt(j))){
////                count++;
////            }
////
////        }
////        if (count>=2){
////            digits = true;
////        }
////        else{
////            digits = false;
////        }
////        return digits;
//
////        System.out.println("Enter num: ");
////        int n = input.nextInt();
////        for (int i =2; i<=2000; i++)
////        {if (ispalindromePrime(i)){
////            System.out.println(i);
////        }
////        }
////
////    }
////    public static boolean ispalindromePrime(int num){
////        boolean yes;
////        if (isprime(num) && isprime(isreve(num)) ){
////            yes = true;
////
////        }
////        else{
////            yes = false;
////        }
////        return yes;
////    }
////
////    public static boolean isprime(int num){
////        boolean prime  = false;
////        int f = 0;
////        for (int i  = 2; i<=num/2;i++)
////        {
////            if (num % i == 0)
////            {
////                f++;
////                break;
////            }
////        }
////        if (f==0){
////                prime = true;
////            }
////            else{
////                prime = false;
////            }
////
////        return prime;
////    }
////
////    public static int isreve(int num){
////
////
////        int digit = 0;
////        String str = "";
////        while(num!=0) {
////            digit = num % 10;
////            num = num / 10;
////            str = str + String.valueOf(digit);
////
////    }
////        return Integer.parseInt(str);
////    }
////
////    public static boolean palindrome(int num){
////        int ni = num;
////        boolean palindromeww = false;
////        if (ni == isreve(num)){
////            palindromeww  =true;
////        }
////        else{
////            palindromeww = false;
////        }
////        return palindromeww;}}
//////
////
////    }
//
//
////        int n1=3;
////        int n2 = 5;
////        twinPrime();
////        System.out.println("3 5");
////
////
//////}
//////
//////    public static boolean isprime(int num){
//////        boolean prime  = false;
//////        int f = 0;
//////        for (int i  = 2; i<=num/2;i++)
//////        {
//////            if (num % i == 0)
//////            {
//////                f++;
//////                break;
//////            }
//////        }
//////        if (f==0){
//////                prime = true;
//////            }
//////            else{
//////                prime = false;
//////            }
//////
//////        return prime;
//////    }// prime ends here
//////
//////    public static void twinPrime(){
//////
//////        for (int num =3; num<=2000; num++){
//////        if(isprime(num) && isprime(num =num+2)){
//////            System.out.println((num)+ " "+ (num+2));
//////        }
////
//////        System.out.println("k");
//////        String sk = input.nextLine();
//////        System.out.print(sk);
////        import java.util.*;
////public class Project {
////    private static String name;
////    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////        System.out.println("Are you a counsellor or counselee(enter 1 for counsellor and 0 for counselee): ");
////        int option = input.nextInt();
////        if (option == 0)
////        {
////
////            account();
////        }
////        else
////        {
////            account();
////
////        }// else ends here
////
////
////    }
////    public static void  account()
////    {
////        System.out.println("_____|Create account|______");
////        Scanner input = new Scanner(System.in);
////        String firstName = " ";
////        String lastName = " ";
////        String email = " ";
////        String password = " ";
////        System.out.print("Enter username: ");
////        name = input.nextLine();
////        System.out.print("Enter your first name: ");
////        firstName = input.nextLine();
////        System.out.print("Enter your last name: ");
////        lastName = input.nextLine();
////        System.out.print("Enter your email address: ");
////        email = input.nextLine();
////        System.out.print("Enter your password(At least 8 characters): ");
////        password = input.nextLine();
////        boolean passCheck = true;
////        while(passCheck)
////        {
////            if (password.length()>=8)
////            {
////                passCheck = false;
////            }// if ends here
////            else
////            {
////                System.out.print("Your password must have at least 8 characters, Enter again:");
////                password = input.nextLine();
////
////            }// else ends here
////
////        }// while ends here
////
////        System.out.println("Your account have been created");
////
////
////
////        System.out.println("_____|Login|_____");
////        String username = " ";
////        String pass = " ";
////        String emailConfirm = "";
////        System.out.print("Login with username or email(0 for email and 1 for username): ");
////        int choice = input.nextInt();
////        if (choice == 1)
////        {
////            System.out.print("Enter username: ");
////            username = input.nextLine();
////            boolean user = true;
////            while(user)
////            {
////                if(username.equals(name)){
////                    System.out.println("Your username is correct!");
////                    user = false;
////                }
////                else{
////                    System.out.print("Your username is wrong, Enter again: ");
////                    username = input.nextLine();
////
////                }
////            }// while ends here
////
////        }// if ends here
////        else
////        {
////            System.out.print("Enter email: ");
////            emailConfirm = input.nextLine();
////            boolean emailCheck = true;
////            while(emailCheck){
////                if (emailConfirm.equals(email))
////                {
////                    emailCheck = false;
////                }// if ends here
////                else
////                {
////                    System.out.print("This email is wrong, Enter again:");
////                    emailConfirm = input.nextLine();
////
////
////                }// else ends here
////            }// while ends here
////
////        }// else ends here
////
////        System.out.print("Enter password(At least 8 characters): ");
////        pass = input.nextLine();
////        input.nextLine();
////        boolean word = true;
////        while(word)
////        {
////            if (pass.equals(password) && pass.length()>=8)
////            {
////                System.out.print("You are successfully logged in..");
////                word = false;
////            } // if ends here
////            else
////            {
////                System.out.print("Your password is wrong, Enter again:");
////                pass = input.nextLine();
////
////
////            }// else ends here
////
////        }// while ends here
////        displayProfile();
////    }// method account() ends here
////
////    public static void displayProfile(){
////        System.out.println(                 "Welcome " + name        );
////        String qualification1 = "a";
////        String qualification2 = "b";
////        String qualification3 = "c";
////        String gender1= "male";
////        String gender2= "female";
////        String cnic;
////        String M="married";
////        String U= "unmarried";
////        String phoneNumber;
////        Scanner input = new Scanner(System.in);
////
////        System.out.println("Enter your qualification");
////        System.out.println(" a) Intermediate");
////        System.out.println(" b) Undergraduate");
////        System.out.println(" c) Graduate");
////        String answer = input.next().toLowerCase();
////        if (answer.equals(qualification1)){
////            System.out.println("You are an intermediate level");
////        }
////        else if(answer.equals(qualification2)){
////            System.out.println("You are graduate level");
////        }
////        else if(answer.equals(qualification3)){
////            System.out.println("You are graduate level");
////        }
////        else{
////            System.out.println("You are not eligible  for counselling ");
////        }
////
////
////        System.out.print("Enter age: ");
////        int age = input.nextInt();
////        System.out.println("Age :" + age);
////
////        System.out.print("Enter gender: ");
////        String gender=input.next().toLowerCase();
////        boolean checkGender= true;
////        while (true){
////            if (gender.equals(gender1)) {
////                System.out.println("Gender: " + gender);
////                checkGender = false;
////            } else if (gender.equals(gender2)) {
////                System.out.println("Gender: " + gender);
////                checkGender = false;
////            } else {
////                System.out.println("Enter gender again");
////                gender = input.next();
////                checkGender = true;
////            }
////        }
////
////        System.out.println("Enter CNIC");
////        cnic = input.next();
////        boolean checkCnic=true;
////        while (true) {
////            boolean isValid = cnic.length() == 15 && Character.isDigit(cnic.charAt(0)) &&
////                    Character.isDigit(cnic.charAt(1)) && Character.isDigit(cnic.charAt(2)) &&
////                    Character.isDigit(cnic.charAt(3)) && Character.isDigit(cnic.charAt(4)) &&
////                    (cnic.charAt(5)) == '-' && Character.isDigit(cnic.charAt(6)) &&
////                    Character.isDigit(cnic.charAt(7)) && Character.isDigit(cnic.charAt(8)) &&
////                    Character.isDigit(cnic.charAt(9)) && Character.isDigit(cnic.charAt(10)) &&
////                    Character.isDigit(cnic.charAt(11)) && Character.isDigit(cnic.charAt(12)) &&
////                    (cnic.charAt(13)) == '-' && Character.isDigit(cnic.charAt(14));
////            if (isValid) {
////                System.out.println("Valid cnic");
////                checkCnic = false;
////            }
////            else {
////                System.out.println("Invalid cnic");
////                System.out.println("Enter your cnic again");
////                cnic = input.next();
////                System.out.println("Cnic : " + cnic);
////            }
////        }
////
////        System.out.println("Enter your hobbies");
////        String hobbies=input.next();
////        System.out.println("Hobbies are: " + hobbies);
////
////        System.out.println("Enter your marital status");
////        System.out.println("a) Married");
////        System.out.println("b) Unmarried");
////        String maritalStatus= input.next();
////        if(maritalStatus.equals(M)){
////            System.out.println("Married");
////        }
////        else{
////            System.out.println("Unmarried");
////        }
////        System.out.println("Enter your phone number :");
////        phoneNumber=input.next();
////        boolean checkNumber = true;
////        while (checkNumber) {
////            if (phoneNumber.length() >= 11) {
////                System.out.println("Valid phone number");
////                checkNumber = false;
////            } else {
////                System.out.println("Invalid phone number");
////                System.out.println("Enter phone number again");
////                phoneNumber = input.next();
////            }
////        }
////        System.out.println("Phone number: " + phoneNumber);
//
////import java.util.*;
////public class loopsPractice {
////    private static String name,firstName,lastName,userName="";
////    private static String email = "";
////    private static String emailConfirm="";
////    private static String password="";
////    private static String pass = "";
////    private static String address = "";
////    private static String phone = "";
////    private static String skills,languages,education,workHistory = "";
////    private static String gender;
////    private static String cnic;
////    private static String maritalStatus;
////    private static String phoneNumber;
////    private static int age;
////    private static String hobbies;
////    private static String answer;
////    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////        System.out.println("__|Welcome to counselling Master|____");
////        System.out.print("Are you a counsellor or counselee?" +
////                "\n\t\t\tEnter 1 for counsellor, Enter 0 for counselee: ");
////        int option = input.nextInt();
////        if (option == 0)
////        {
////            account();
////            System.out.println("Enter 0 to make your profile\nEnter 1 to view counselor's profile");
////            int action = input.nextInt();
////            if (action == 0){
////
////            }
////            else{
////
////            }
////
////
////        }
////        else
////        {
////            account();
////            System.out.println("Enter 0 to make your profile.\nEnter 1 to view counselee's profile");
////            int action = input.nextInt();
////            if (action == 0){
////                counsellorProfile();
////            }
////
////            else{
////                counseleeProfile();
////
////            }
////
////
////        }// else ends here
////
////
////    }// main ends here
////    public static void  account()
////    {
////        System.out.println("          __|Create account|___");
////        Scanner input = new Scanner(System.in);
////        name = "";
////        email = "";
////
////        System.out.print("Enter your first name: ");
////        firstName = input.nextLine();
////        System.out.print("Enter your last name: ");
////        lastName = input.nextLine();
////        System.out.print("Enter username: ");
////        name = input.nextLine();
////        System.out.print("Enter your email address: ");
////        email = input.nextLine();
////        boolean emailCorrect = true;
////        while(emailCorrect)
////        {
////            if(email.endsWith("@gmail.com")){
////                emailCorrect = false;
////            }// if ends here
////            else
////            {
////                System.out.print("Invalid email. Enter again:");
////                email = input.nextLine();
////
////
////            }// else ends here
////        }// while loop ends here
////
////        System.out.print("Enter your password(At least 8 characters): ");
////        password = input.nextLine();
////        boolean passCheck = true;
////        while(passCheck)
////        {
////            if (password.length()>=8)
////            {
////                passCheck = false;
////            }// if ends here
////            else
////            {
////                System.out.print("Your password must have at least 8 characters, Enter again:");
////                password = input.nextLine();
////
////            }// else ends here
////
////        }// while ends here
////
////        System.out.println("Your account have been created");
////
////
////
////        System.out.println("          __|Login to your Account|___");
////
////
////        System.out.print("Login with username or email:" +
////                "\n\t\tEnter 0 to login with email or Enter 1 to login with username: ");
////        int choice = input.nextInt();
////        input.nextLine();
////        if (choice == 1)
////        {
////            System.out.print("Enter username: ");
////            userName = input.nextLine();
////            boolean user = true;
////            while(user)
////            {
////
////                if(userName.equals(name)){
////
////                    user = false;
////                }
////                else{
////                    System.out.print("Your username is wrong, Enter again: ");
////                    userName = input.nextLine();
////
////                }
////            }// while ends here
////
////        }// if ends here
////        else
////        {
////            System.out.print("Enter your email address: ");
////            emailConfirm = input.nextLine();
////            boolean emailCheck = true;
////            while(emailCheck){
////                if (emailConfirm.equals(email)) {
////                    emailCheck = false;
////                }// if ends here
////                else
////                {
////                    System.out.print("This email is wrong, Enter again:");
////                    emailConfirm = input.nextLine();
////
////
////                }// else ends here
////            }// while ends here
////
////        }// else ends here
////
////        System.out.print("Enter password: ");
////        pass = input.nextLine();
////        input.nextLine();
////        boolean word = true;
////        while(word)
////        {
////            if (pass.equals(password))
////            {
////                System.out.println("You are successfully logged in..");
////                word = false;
////            } // if ends here
////            else
////            {
////                System.out.print("Your password is wrong.\nEnter again:");
////                pass = input.nextLine();
////
////
////            }// else ends here
////
////        }// while ends here
////    }// method account() ends here
////
////
////    public static void counsellorProfile()
////    {
////        Scanner input = new Scanner(System.in);
////        System.out.println("             _|Make your Profile|__");
////        System.out.println("     |PERSONAL INFORMATION|    ");
////        System.out.print("Address:");
////        address = input.nextLine();
////        System.out.print("Phone:");
////        phone = input.nextLine();
////        boolean phoneCheck = true;
////        while(phoneCheck)
////        {
////            if (phone.length()==11)
////            {
////                phoneCheck=false;
////            }// if ends here
////            else
////            {
////                System.out.println("Invalid phone number.\nEnter again: ");
////                phone = input.nextLine();
////            }//else ends here
////
////
////        }// while ends here
////        System.out.println();
////        System.out.println("__|SKILLS|        ");
////        System.out.println("Enter skills separated by space");
////        skills = input.nextLine();
////
////        System.out.println();
////        System.out.println("_|LANGUAGES|          ");
////        System.out.println("Enter languages separated by space");
////        languages = input.nextLine();
////
////        System.out.println();
////        System.out.println(" __|EDUCATION|         ");
////        System.out.println("Make sure to give double spaces:");
////        education = input.nextLine();
////
////        System.out.println();
////        System.out.println("_|COUNSELLING HISTORY|        ");
////        System.out.println("Make sure to give double spaces ");
////        workHistory = input.nextLine();
////
////        System.out.println("Press enter to view your profile:");
////        viewMyProfile();
////
////    }// method ends here
////    public static void viewMyProfile()
////
////    {
////
////        System.out.println("");
////        System.out.println("              "+firstName.toUpperCase()+" "+lastName.toUpperCase()+"\n\n"+
////                "     |PERSONAL INFORMATION| \n"+
////                "Address:"+address+"\n"+
////                "Phone:  "+phone+"\n"+
////                "        |SKILLS|      \n"+
////                skills.replace(" ","   \n")+"\n"+
////                "         |LANGUAGES|        \n"+
////                languages.replace(" ","   \n")+"\n"+
////                "        |EDUCATION|       \n"+
////                education.replace("  ","   \n")+"\n"+
////                "        |COUNSELLING HISTORY|       \n"+
////                workHistory.replace("  ","   \n")+"\n");
////
////    }// method ends here
////    public static void counseleeProfile(){
////        System.out.println(                 "Welcome " + name        );
////        String qualification1 = "a";
////        String qualification2 = "b";
////        String qualification3 = "c";
////        String gender1= "male";
////        String gender2= "female";
////        String cnic;
////        String M="married";
////        String U= "unmarried";
////        Scanner input = new Scanner(System.in);
////
////        System.out.println("Enter your qualification");
////        System.out.println(" a) Intermediate");
////        System.out.println(" b) Undergraduate");
////        System.out.println(" c) Graduate");
////        String answer = input.next().toLowerCase();
////        boolean checkQualification=true;
////
////        if (answer.equals(qualification1)){
////            System.out.println("You are an intermediate level");
////        }
////        else if(answer.equals(qualification2)){
////            System.out.println("You are graduate level");
////        }
////        else if(answer.equals(qualification3)){
////            System.out.println("You are graduate level");
////        }
////        else{
////            System.out.println("You are not eligible  for counselling ");
////        }
////
////        System.out.print("Enter age: ");
////        int age = input.nextInt();
////        System.out.println("Age :" + age);
////
////        System.out.print("Enter gender: ");
////        String gender=input.next().toLowerCase();
////        boolean checkGender= true;
////        while (checkGender){
////            if (gender.equals(gender1)) {
////                System.out.println("Gender: " + gender);
////                checkGender = false;
////            } // if ends here
////
////            else if (gender.equals(gender2)) {
////                System.out.println("Gender: " + gender);
////                checkGender = false;
////
////            } //else if ends here
////            else {
////                System.out.println("Enter gender again");
////                gender = input.next();
////                checkGender = true;
////
////            } // else ends here
////
////        }// while ends here
////
////        System.out.println("Enter your cnic");
////        cnic = input.next();
////        boolean checkCnic=true;
////        while (checkCnic) {
////            boolean isValid = cnic.length() == 15 && Character.isDigit(cnic.charAt(0)) &&
////                    Character.isDigit(cnic.charAt(1)) && Character.isDigit(cnic.charAt(2)) &&
////                    Character.isDigit(cnic.charAt(3)) && Character.isDigit(cnic.charAt(4)) &&
////                    (cnic.charAt(5)) == '-' && Character.isDigit(cnic.charAt(6)) &&
////                    Character.isDigit(cnic.charAt(7)) && Character.isDigit(cnic.charAt(8)) &&
////                    Character.isDigit(cnic.charAt(9)) && Character.isDigit(cnic.charAt(10)) &&
////                    Character.isDigit(cnic.charAt(11)) && Character.isDigit(cnic.charAt(12)) &&
////                    (cnic.charAt(13)) == '-' && Character.isDigit(cnic.charAt(14));
////            if (isValid) {
////                System.out.println("Valid cnic");
////                checkCnic = false;
////
////            } // if ends here
////
////            else {
////                System.out.println("Invalid cnic");
////                System.out.println("Enter your cnic again");
////                cnic = input.next();
////                System.out.println("Cnic : " + cnic);
////
////            }  // else ends here
////
////        } // while ends here
////
////        System.out.println("Enter your hobbies");
////
////        String hobbies=input.nextLine();
////        System.out.println("Hobbies are: " + hobbies);
////
////        System.out.println("Enter your marital status");
////        System.out.println("a) Married");
////        System.out.println("b) Unmarried");
////        String maritalStatus= input.next();
////        boolean checkStatus=true;
////        while(checkStatus){
////            if(maritalStatus.equals(M)){
////                System.out.println("Married");
////                checkStatus=false;
////
////            } //if ends here
////
////            else{
////                System.out.println("Unmarried");
////                System.out.println("Enter your marital status again");
////                maritalStatus=input.next();
////            }//else ends here
////
////        } //while ends here
////
////        System.out.println("Enter your phone number :");
////        String phoneNumber=input.nextLine();
////        boolean checkNumber = true;
////        while (checkNumber) {
////            if (phoneNumber.length() >= 11) {
////                System.out.println("Valid phone number");
////                checkNumber = false;
//////            } // if ends here
//////
//////            else{
//////                System.out.println("Invalid phone number");
//////                System.out.println("Enter phone number again");
//////                phoneNumber = input.next();
//////            } //else ends here
//////
//////        } // while ends here
//////
//////        System.out.println("Phone number: " + phoneNumber);
//////        System.out.println("Press enter to view your profile:");
//////        viewMyprofile();
//////
//////    } // method ends here
//////
//////    public static void viewMyprofile(){
//////        System.out.println("");
//////        System.out.println("              " + name.toUpperCase() + " " + "\n\n" +
//////                "     |PERSONAL INFORMATION| \n" +
//////                "Age: " + age + "\n" +
//////                "Phone: " + phone + "\n" +
//////                "CNIC: " + cnic + "\n" +
//////                "Phone Number: " + phoneNumber + "\n" +
//////                "        |Marital Status|      \n" +
//////                "Marital Status: " + maritalStatus + "\n" +
//////                "         |Hobbies|        \n" +
//////                hobbies.replace(" ", "   \n") + "\n" +
//////                "        |EDUCATION|       \n" +
//////                "Education: " + answer + "\n" +
//////                "        |Gender|       \n" +
//////                "Gender: " + gender + "\n");
//////    }
//////}
////import java.util.Scanner;
////public class loopsPractice {
////    private static String skills,languages,education, counsellingHistory = "";
////    private static String gender;
////    private static String CNIC;
////    private static String personalityType;
////    private static String phoneNumber;
////    private static int age;
////    private static String hobbies;
////    private static String qualification1;
////    private  static String interest;
////
////    public static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////        System.out.print("Enter your areas of interest eg: biology,physics etc: ");
////        interest=input.nextLine();
////        boolean interestCheck = true;
////        while(interestCheck){
////            for (int i =0;i<interest.length();i++){
////                char c = interest.charAt(i);
////                if((c>='a' && c<='z') || (c>='A'&& c<='Z') || c == ' ')
////                {
////                    interestCheck = false;
////                }// if ends here
////                else
////                {
////                    System.out.println("Invalid input.Enter again:");
////                    interest = input.nextLine();
////                }// else ends here
////            }// for loop ends here
////        }// while loop ends here
//
////        System.out.print("Enter your hobbies(Separated by space): ");
////        hobbies=input.nextLine();
////        boolean hobbiesCheck=true;
////        while(hobbiesCheck){
////            for (int i =0;i<hobbies.length();i++){
////                char c = hobbies.charAt(i);
////                if((c>='a' && c<='z') || (c>='A'&& c<='Z') || c == ' ')
////                {
////                    hobbiesCheck = false;
////                }// if ends here
////                else
////                {
////                    System.out.println("Invalid input.Enter again:");
////                    hobbies = input.nextLine();
////                }// else ends here
////            }// for loop ends here
////        }//while loop ends here
////
////
////        System.out.println(hobbies.replace(" ","\n")
////        + "\n"+interest.replace(" ","\n"));
////    }
////}
//
////        int limit = 5;
////        int count = 0;
////        int l = 0;
////
////        int max = Integer.MIN_VALUE;
////        while (count < limit) {
////            int num = input.nextInt();
////
////            if (num > max) {
////                max = num;
////                l++;
////            }
////            count++;
////        }
////        System.out.println("The max is  " + l);
//
////        String s  = "muzdalfa";
////        System.out.println(s.lastIndexOf("a",5));
//
////        String city2 = "Boston";
////        String city1 = "New york";
////        if(city1.compareTo(city2)==0){
////
////            System.out.println("E");
////        }
////        else if(city1.compareTo(city2)>0){
////            System.out.println("no"+city2+ " " +city1);
////        }
////        else{
////            System.out.println("Yes"+city1+ " " +city2);
////        }
////
////        double la1 = Math.toRadians( 39.55);
////        double la2= Math.toRadians(-116.5);
////        double l01 = Math.toRadians( 41.5);
////        double l02 = Math.toRadians(87.37);
////        double r = 6371.01;
////        double d = r * Math.acos(Math.sin(la1) * Math.sin(l01) + Math.cos(la1)* Math.cos(l01) * Math.cos(la2-l02));
////        System.out.println(d);
//
////
////        int a = 67;
////        char ch = (char)a;
////
////        System.out.println(ch);
////
////        char c = input.next().charAt(0);
////        int ab = (int) c;
////        System.out.println(ab);
//
////        int d = 11;
////        String hex = "";
////        while (d!=0){
////            int hexValue = d%16;
////            char hexDigit = (hexValue<=9 && hexValue>=0)? (char)(hexValue+'0'): (char)(hexValue-10+'A');
////            hex = hexDigit+hex;
////            d= d/16;
////        }
////        System.out.println(hex);
//
////        int min =65;
////        int max = 90;
////        double m = min +  ( Math.random()*(max-min));
////        char ch = (char) Math.round(m);
////        System.out.println(ch);
//
////        String nes ="";
////        String s = "MOM";
////        for(int i=0;i<s.length();i++){
////            char ch = s.charAt(i);
////            nes = ch+nes;
////        }
////        System.out.println(nes);
////        if(nes.equals(s)){
////            System.out.println("Y");
////        }
////        else{
////            System.out.println("N");
////        }
//
////        String s= "In the hole in the ground there lived a hobbit";
////        String s1 = s.substring(0,s.indexOf("h")+1);
////        String s3 = s.substring(s.indexOf("h")+1, s.lastIndexOf("h"));
////        s3 = s3.replace("h","H");
////        String s2= s.substring(s.lastIndexOf("h"));
////        System.out.println(s1+s3+s2);
//
////        String news = "";
////        String s ="Hello";
////        for(int i=0;i<s.length();i++){
////            if(i%2==0){
////                news = s.charAt(i)+news;
////            }
////
////        }
////        System.out.println(news);
////
////        String s = "COMSATS UNIVERSITY ISLAMABAD-PAKISTAN";
////        int vowel=0;
////        int count=0;
////        if(s.length()!=0){
////            for(int i=0;i<s.length();i++){
////                if(s.charAt(i)== 'A' || s.charAt(i)== 'E' ||s.charAt(i)== 'I' ||s.charAt(i)== 'O' ||s.charAt(i)== 'U'  ){
////                    vowel++;
////                }
////            }
////            System.out.println("V ARE " + vowel);
////
////            if(s.contains("MUZDALFA")){
////                System.out.println("YES CONTAIN");
////            }
////            else{
////                System.out.println("NO CONTAIN");
////            }
////
////            for(int i=0;i<s.length();i++){
////                char ch = s.charAt(i);
////                count++;
////            }
////            System.out.println("Charas "+ count);
////
////            int len = s.length()/2;
////            String s1 = s.substring(0,len);
////            String s2 = s.substring(len);
////            System.out.println(s1);
////            System.out.println(s2);
////        }
////        else{
////            System.out.println("Invalid");
////        }
//
////        int index = 7;
////        System.out.println( fibon(index));
////
////    }
////
////    public static long fibon(int n){
////        if (n==0){
////            return 0;
////        }
////        else if(n==1){
////            return 1;
////        }
////        else
////            return fibon(n-1) + fibon((n-2));
////    }
////}
//
////
////        int num  = 129;
////        System.out.println(yes(num));
////    }
////
////    public static int sum(int n){
////        String s = String.valueOf(n);
////        String s1="";
////        for(int i=0;i<s.length();i++){
////            char ch = s.charAt(i);
////            s1 = ch+s1;
////        }
////        return Integer.parseInt(s1);
////    }
////
////    public static boolean yes(int n ){
////        boolean f = true;
////        if(n== sum( n)){
////            f = true;
////        }
////        else {
////            f = false;
////        }
////        return f;
////
////        int day1=365;
////        int day2= 366;
////        int d=0;
////        for(int i=2000;i<2020;i++){
////            if(i%4==0){
////
////                d=day2;
////            }
////            else{
////                d=day1;
////            }
////            System.out.println("Year "+ i + " has "+ d);
////        }
//
//
////        String s= "Muz";
////        for(int i=0;i<s.length();i++){
////            char ch = s.charAt(i);
////            if(Character.isLetter(ch)){
////
////            }
////        }
//
////        String s1 = "muzdalfa is good girl";
////        String [] s2 = s1.split(" ");
////        for(String s3: s2){
////            System.out.print (capital(s3)+ " ");
////
////        }
////
////    }
////    public static  String capital(String s){
////
////        s = s.replace(s.charAt(0), Character.toUpperCase(s.charAt(0)));
////        return s;
////    }
//
//
////        int n=3;
////        int [][] n1 = new int[n][n];
////
////        for(int i=0;i<n1.length;i++){
////            for(int j=0;j<n1[0].length;j++){
////                int q = ran.nextInt(0,2);
////                n1[i][j] = q;
////                System.out.print(n1[i][j]+ " ");
////            }
////            System.out.println(
////
////            );
////        }
//
//
////        int a  = 5;
////        int n=3;
////        System.out.println(power(a,n));
////    }
////    public static int power(int a , int n){
////        if(n==0)
////            return 1;
////        else if(n==1){
////            return a;
////        }
////        else
////            return a * power(a,n-1);
//
//
////
//
////        int number = 1;
////        System.out.print("Enter the number of students: ");
////        int numberOfStudents = input.nextInt();
////
////        int maxMarks1 = 0;
////        int maxMarks2 = 0;
////        String maxStu1 = " ";
////        String maxStu2 = " ";
////
////        while(number < numberOfStudents){
////            System.out.print("Enter the name of the student: ");
////            String naim = input.next();
////            System.out.print("Enter the score of the student:");
////            int marks = input.nextInt();
////            if (marks > maxMarks1  ){
////                maxMarks2 = maxMarks1;
////                maxMarks1  = marks;
////                maxStu2 = maxStu1;
////                maxStu1 = naim;
////
////            }
////            else if(marks>maxMarks2){
////                maxMarks2 = marks;
////                maxStu2 = naim;
////            }
////            number++;
////
////        }
////        System.out.println("First heighest by "+ maxStu1 + " " + maxMarks1);
////        System.out.println("Second heighest by "+ maxStu2 + " " + maxMarks2);
//
////        int max=0;
////
////        int lar3=Integer.MIN_VALUE;
////        int n [] = {3, 5 ,1, 8, 9, 5, 6, 50, 43, 0};
////        int lar1 = Integer.MIN_VALUE;
////        int lar2 = Integer.MIN_VALUE;
////
////        for(int i=0;i<n.length;i++){
////            if (n[i]>=lar1){
////                lar3  = lar2;
////                lar2  =  lar1;
////                lar1  = n[i];
////            }
////            else if (n[i] > lar2) {
////                lar3 = lar2;
////                lar2 = n[i]; // Update lar2 if n[i] is larger than the current lar2 but smaller than lar1
////            }
////            else if (n[i]>lar3){
////                lar3 = n[i];
////            }
////
////        }
////        System.out.println(lar1);
////        System.out.println(lar2);
////        System.out.println(lar3);
////
//////        int count=0;
//////        int lar3=Integer.MIN_VALUE;
//////        int lar1 = Integer.MIN_VALUE;
//////        int lar2 = Integer.MIN_VALUE;
////
////        System.out.println("Enter numbers : ");
////
////        int num=0;
////        do{
////        num = input.nextInt();
////
////        if(num>=lar1){
////            lar3 = lar2;
////            lar2 = lar1;
////            lar1= num;
////        }
////        else if (num>lar2){
////            lar3=lar2;
////            lar2=num;
////        }
////        else if (num>lar3){
////            lar3  = num;
////        }
////        }while(num!=0);
////        System.out.println(lar1+">"+lar2+">"+lar3);
//
//
////
////        int n[] = new int [10];
////        for(int i=0;i<n.length;i++){
////            n[i] = input.nextInt();
////        }
////
////        int disArray[] = new int[n.length];
////        int disCount=0;
////
////        boolean dis  = true;
////        for(int i=0;i<n.length;i++) {
////            dis = true;
////            for (int j = 0; j < disCount; j++) {
////                if (n[i] == disArray[j]) {
////                    dis = false;
////                    break;
////                }
////            }
////            if(dis){
////                disArray[disCount] = n[i];
////                disCount++;
////            }
////        }
////
////        for(int l:disArray){
////            System.out.println(l);
////        }
////        sum(n,disArray);
////   }
////    public static void sum(int [] n,int [] dis){
////        int count=0;
////       for(int n1:dis){
////           count=0;
////           for(int i = 0;i<n.length;i++){
////               if(n1==n[i]){
////                   count++;
////               }
////           }
////           System.out.println(n1+" occyrs "+ count);
////       }
//
//
////        int n[] = new int [10];
////        for(int i=0;i<n.length;i++){
////            n[i] = input.nextInt();
////        }
////
////        int x = 10;
////        int flag=0;
////        int index=0;
////        for(int i=0;i<n.length;i++){
////            if (n[i]==x){
////
////                flag++;
////                index=i;
////                break;
////            }
////
////        }
////        if(flag==0){
////            System.out.println("Not found");
////        }
////        else{
////            System.out.println("YES found at "+index);
////        }
//
////        int n[] = {11,2,3,40,5,5,9,0,9,5,4};
////        int k=n[9];
////        for(int i=0;i<n.length;i++){
////            if(n[i]<k){
////                k=n[i];
////
////            }
////        }
////        System.out.println(k);
////
////        int n[] = {11,2,3,40,5,5,9,0,9,5,4};
////        int n1[] = new int[n.length];
////        for(int i=n.length-1, j=0;i>=0 && j<n1.length;i--,j++){
////            n1[j]=n[i];
////        }
////
////        int count=0;
////        for(int i=n.length-1;i>=0;i--){
////            n1[count] = n[i];
////            count++;
////        }
////        for(int j:n1){
////            System.out.println(j);
////        }
//
//
////        int [] n = {1,2,3,4,5,6,7,8,9,10};
////        int [] m = modify(n);
////
////        for(int p:m){
////            System.out.println(p
////            );
////        }
////    }
////    public static int [] modify(int [] n){
////        for(int i=0;i<n.length;i++){
////            n[i] = n[i] * 3;
////        }
////        return n;
////
////        int n []  = new int [40];
////        int total=10;
////        for(int i=0 ; i<=total; i++){
////            System.out.println("Enter 1 to 10 ratings ");
////            n[i] = input.nextInt();
////        }
////        int sum=0;
////        for(int n1:n){
////            sum = sum+n1;
////        }
////        int avg = sum/total;
////        System.out.println(avg);
//
////        int [][] n1 = new int[3][4];
////        for(int i=0;i<n1.length;i++){
////            System.out.println("Enter row elements of  row # "+(i+1));
////            for(int j=0;j<n1[0].length;j++){
////                n1[i][j] = input.nextInt();
////            }
////        }
////
////        int sum=0;
////        for(int i=0;i<3;i++) {
////            for (int j = 0; j < 4; j++) {
////                sum = sum + n1[i][j];
////            }
////            System.out.println("The sum 1 " + sum);
////        }
////
////        int sumCols = 0;
////        for(int i=0;i<4;i++){
////            sumCols=0;
////            for(int j=0;j<3;j++){
////                sumCols = sumCols + n1[j][i];
////            }
////            System.out.println("The sum of clo "+ sumCols);
////        }
//
////        int [][] n ={{11,12,13},{14,15,16},{17,18,19}};
////        int count=0;
////        for(int i=0;i<n.length;i++){
////
////            for(int j=0;j<n[0].length;j++){
////                if(prime(n[i][j])==true)
////                {
////                    count++;
////                    System.out.println(count);
////                }
////            }
////        }
////    }
////    public static boolean prime(int num){
////        boolean pri = true;
////        int f=0;
////        for(int i=2;i<=num/2;i++){
////            if(num%i==0) {
////                f++;
////                break;
////            }
////        }
////        if( f==0){
////            pri=true;
////        }
////        else{
////            pri = false;
////        }
////        return pri;
//
////        int[][] n1 = {{1, 2, 3, 4},
////                {5, 6, 7, 8},
////                {9, 10, 11, 12}};
////        int primeRow = 0;
////        int maxRow = 0;
////        int max = Integer.MIN_VALUE;
////        for (int i = 0; i < n1.length; i++) {
////
////            primeRow=0;
////            for (int j = 0; j < 4; j++) {
////                if (prime(n1[i][j])) {
////                    primeRow++;
////
////                }
////            }
////            if (primeRow > max) {
////                max = primeRow;
////                maxRow = i;
////            }
////
////        }
////        System.out.println("Row " + maxRow);
//
////
////
////
////        int primeCol = 0;
////        int maxCol = 0;
////        int max1 = Integer.MIN_VALUE;
////        for(int i = 0;i<4;i++)
////
////        {
////            primeCol = 0;
////            for (int j = 0; j < 3; j++) {
////                if(prime( n1[j][i])){
////                    primeCol++;
////                }
////            }
////
////            if (primeCol > max1) {
////                max1 = primeCol;
////                maxCol = i;
////            }
////        }
////        System.out.println(maxCol+" has high");
////    }
////
////
////
////
////
////
////
////    public static boolean prime(int num){
////        boolean pri = true;
////        int f=0;
////        for(int i=2;i<=num/2;i++){
////            if(num%i==0) {
////                f++;
////                break;
////            }
////        }
////        if( f==0){
////            pri=true;
////        }
////        else{
////            pri = false;
////        }
//////        return pri;
////
////        int n1 [][] = {{1,2,3},{4,5,6}};
////        int n2 [][] = {{7,8},{9,10},{11,12}};
////
////        int result=0;
////        int n3[][] = new int [2][2];
////        for(int i=0;i<2;i++){
////
////            for(int j=0;j<2;j++){
////                for(int k=0;k<3;k++){
////                    n3[i][j] += n1[i][k] * n2[k][j];
////                }
////            }
////        }
////        for(int i=0;i<2;i++){
////            for(int j=0;j<2;j++){
////                System.out.print(n3[i][j]+ " ");}
////        }
////
//        //      try{
////            FileOutputStream file = new FileOutputStream("carArray.txt");
////            PrintStream ps= new PrintStream(file);
////            int [] n = new int [10];
////            for(int i=0;i<n.length;i++){
////                n[i] = input.nextInt();
////                ps.println(n[i]);
////            }
////
////
////            file.close();
//
////            ArrayList<Integer>a1=new ArrayList<Integer>();
////            FileInputStream f = new FileInputStream("carArray.txt");
////            Scanner i = new Scanner(f);
////            while(i.hasNext()){
////                String  s = i.nextLine();
////                int num = Integer.parseInt(s);
////                a1.add(num);
////            }
////
////            FileOutputStream file = new FileOutputStream("carArray.txt");
////            PrintStream ps= new PrintStream(file);
////
////            for(int m:a1){
////                if(!prime(m)){
////                    ps.println(m);
////                }
////            }
////        }
////        catch (Exception e){
////            System.out.println(e.toString()
////            );
////        }
////}
////
////    public static boolean prime(int num){
////        boolean pri = true;
////        int f=0;
////        for(int i=2;i<=num/2;i++){
////            if(num%i==0) {
////                f++;
////                break;
////            }
////        }
////        if( f==0){
////            pri=true;
////        }
////        else{
////            pri = false;
////        }
////        return pri;
//
////        int [] n = {4,1,2,3,7,8,2,10};
////        int m= n[0];
////        ArrayList<Integer>a1=new ArrayList<Integer>();
////        ArrayList<Integer>a2=new ArrayList<Integer>();
////
////        for(int i=0;i<n.length;i++){
////            if(n[i]>=m){
////                a1.add(n[i]);
////            }
////            else{
////                a2.add(n[i]);
////            }
////        }
////
////        int [] merg = new int [n.length];
////        int count=0;
////        for(int n1:a2){
////            merg[count] = n1;
////            count++;
////        }
////        for(int n3:a1){
////            merg[count] = n3;
////            count++;
////        }
////        for(int k : merg){
////            System.out.println(k);
////        }
//
////        int n [] = {1,2,3,4,5};
////        int op = n[0];
////        int op9=n[1];
////        for(int i=0;i<n.length;i++){
////            if(i==n.length-2){
////
////                n[i] =  n[n.length-1]+ op;
////                        break;
////            }
////            n[i]=n[i+1] + n[i+2];
////
////
////        }
////        n[n.length-1] = op9+ op ;
////        for(int p: n){
////            System.out.println(p);
////        }
//
//
////        double birth = (double) 1/7 + ( double) 1/45 - (double )1/13;
////        double pop = birth * 31536000;
////        int popo = (int )pop;
////        int  current   = popo + 312032486 ;
////        int current1 = current+  popo;
////        int current2 =  current1 + popo;
////        int current3 = current2+popo;
////        System.out.println(current);
////        System.out.println(current1);
////        System.out.println(current2);
////        System.out.println(current3);
////
////
////        double birthRateInSeconds = 7.0;
////        double deathRateInSeconds = 13.0;
////        double newImmigrantInSeconds = 45.0;
////
////
////
////        double currentPopulation = 312032486;
////
////        double secondsInYears = 60 * 60 * 24 * 365;
////
////        double numBirths = secondsInYears / birthRateInSeconds;
////        double numDeaths = secondsInYears / deathRateInSeconds;
////        double numImmigrants = secondsInYears / newImmigrantInSeconds;
////
////        for (int i = 1; i <= 5; i++) {
////            currentPopulation += numBirths + numImmigrants - numDeaths;
////            System.out.println("Year " + i + " = " + (int)currentPopulation);
////
////        }
//
////        int i=1;
////        int k = ++i + i;
////        System.out.println(k);
//
////        int d = 1000000000;
////        int min = d/525600;
////        int mi = d%525600;
////        System.out.println(min);
////        System.out.println(mi);
//
////        int saving = 100;
////        double current = saving + (1.00417);
////
////        for(int i=0;i<5;i++){
////
////            (current = saving+current+(1* 0.00417);
////            System.out.println(current);
////
////        }
//
////        int i=1;
////        int j=2;
////        int k=3;
////        int x,y,z;
////        if (i > 0)
////            if
////            (j > 0)
////            x = 0;
////        else
////            if (k > 0) y = 0;
////        else z = 0;
//
//
////        System.out.println(ran.nextInt(-1,2) == 1 ? -1 : 1);
//
////
////        int today = input.nextInt();
////        int elaspsed=  input.nextInt();
////
////        int current = (today+elaspsed)%7;
////
////        System.out.println("Today is");
////        switch (today){
////            case 0: System.out.println("Sunday"); break;
////            case 1: System.out.println("Monday"); break;
////            case 2: System.out.println("Tuesday"); break;
////            case 3: System.out.println("Wednesday"); break;
////            case 4: System.out.println("Thurday"); break;
////            case 5: System.out.println("Friday"); break;
////            case 6: System.out.println("Saturday"); break;
////
////        }
////        System.out.println("after is");
////        switch (current){
////            case 0: System.out.println("Sunday"); break;
////            case 1: System.out.println("Monday"); break;
////            case 2: System.out.println("Tuesday"); break;
////            case 3: System.out.println("Wednesday"); break;
////            case 4: System.out.println("Thurday"); break;
////            case 5: System.out.println("Friday"); break;
////            case 6: System.out.println("Saturday"); break;
////
////        }
//
////        System.out.println("Enter number: ");
////        int number = input.nextInt();
////        int n=number;
////        int count=9;
////        int sum=0;
////        while(number!=0){
////            int d = number%10;
////            sum = sum+(d*count);
////            System.out.println("count" +count);
////            System.out.println(d);
////            number = number/10;
////            count--;
////        }
////
////        if (sum%11==10){
////            System.out.println(n+"X" +
////                    "");
////        }
////        else{
////            System.out.println(n+"1");
////        }
//
////
//
////        int num = 90;
////        char ch  = (char )num;
////        System.out.println(ch);
////
////        char c= 'A';
////    int n = (int ) c;
////        System.out.println(n);
//
//
////        int count = 0;
////        String g = input.nextLine();
////        for(int i=0;i<g.length();i++){
////            char c = g.charAt(i);
////            if(g.charAt(i) == ' '){
////                continue;
////            }
////            count++;
////        }
////        System.out.println(count);
////    char c = input.next().charAt(0);
////    c = Character.toLowerCase(c);
////    if(Character.isLetter(c)){
////        if(c=='a' || c=='u' || c=='o' || c=='e' || c=='i' ){
////            System.out.println("Vowel");
////        }
////        else{
////            System.out.println("Consonats");
////        }
////
////    }
////    else{
////        System.out.println("Invcalid");
////    }
//
//
////
////        System.out.println("Enter number: ");
////        String num = input.nextLine();
////
////        int number = Integer.valueOf(num);
////        int n=number;
////        int count=9;
////        int sum=0;
////        while(number!=0){
////            int d = number%10;
////            sum = sum+(d*count);
////            System.out.println("count" +count);
////            System.out.println(d);
////            number = number/10;
////            count--;
////        }
////
////        if (sum%11==10){
////            System.out.println(n+"X" +
////                    "");
////        }
////        else{
////            System.out.println(n+"1");
////        }
//
////        String s1 = "ABCD";
////        String  s2 = "AB2";
////        if(s1.contains(s2)){
////            System.out.println("True");
////        }
////        else{
////            System.out.println("False");
////        }
//
////        String s1 = input.nextLine();
////        String s2 = input.nextLine();
////        String s3 = input.nextLine();
////        if(s1.compareTo(s2)<0 && s2.compareTo(s3)<0 && s1.compareTo(s3)<0 ){
////            System.out.println(s1+" "+s2+" "+s3);
////        }
////        else if(s1.compareTo(s3)<0 && s3.compareTo(s2)<0  && s1.compareTo(s2)<0 ){
////            System.out.println(s1+" "+s3+" "+s2);
////        }
////        else if(s2.compareTo(s3)<0 && s3.compareTo(s1)<0  && s2.compareTo(s1)<0){
////            System.out.println(s2+" "+s3+" "+s1);
////        }
////        else if(s2.compareTo(s1)<0 && s1.compareTo(s3)<0  && s2.compareTo(s3)<0){
////            System.out.println(s2+" "+s1+" "+s2);
////        }
////
////        else if(s3.compareTo(s1)<0 && s1.compareTo(s2)<0 && s3.compareTo(s2)<0){
////            System.out.println(s3+" "+s1+" "+s2);
////        }
////        else if (s3.compareTo(s2)<0 && s2.compareTo(s1)<0 && s3.compareTo(s1)<0){
////            System.out.println(s3+" "+s2+" "+s1);
////        }
//
//
////        int min = 'A';
////
////        int max = 'Z';
////        char c = (char)ran.nextInt(min,max);
////        char c1 = (char)ran.nextInt(min,max);
////        char c2 = (char)ran.nextInt(min,max);
////        int p1 = ran.nextInt(1,10);
////        int p2 = ran.nextInt(1,10);
////        int p3 = ran.nextInt(1,10);
////        int p4 = ran.nextInt(1,10);
////
////        System.out.println(c+""+c1+""+c2+""+p1+""+p2+""+p3+""+p4);
//
////        int[][] n = {{1,2,3},
////                {     1,2,3},
////                {     1,2,3}
////        }           ;
//////        int sum = 0;
////        for(int i=0;i<n.length;i++){
////            for(int j=0;j<n[0].length;j++){
////                if(i==j){
////                    sum=sum+n[i][j];
////                }
////            }
////        }
////        System.out.println(sum);
//
////        int s1=0;
////        for(int i=0;i<n.length;i++){
////            s1 = s1+ n[i][n.length-1-i];
////        }
////        System.out.println(s1);
//
////
////        double tuition=10000;
////        double sum=0.0;
////        double tax= 1.05;
////        int year=0;
////        while(year<14){
////            if(year<10)
////            {            tuition = tuition * tax;
////            System.out.println((year+1) + "--"+ tuition);}
////            year++;
////            if(year>=10 && year<14){
////                tuition=tuition*tax;
////                sum=sum+tuition;
////                System.out.println(sum + " year "+ year+1);
////            }
////
////
////        }
//
////
////        int total=5;
////        int count=0;
////        int maxStu1= Integer.MIN_VALUE;
////        int maxStu2= Integer.MIN_VALUE;
////
////        String maxN1="";
////        String maxN2="";
////
////        while(count<total){
////            System.out.print("name");
////            String name = input.nextLine();
////            System.out.print("marks");
////            int marks = input.nextInt();
////            input.nextLine();
////
////            if(marks>maxStu1){
////                maxStu2=maxStu1;
////                maxStu1=marks;
////
////                maxN2 = maxN1;
////                maxN1=name;
////
////            }
////            else if ( marks>maxStu2){
////                maxStu2=marks;
////
////                maxN2 = name;
////            }
////
////            count++;
////        }
////
////        System.out.println(maxN1+ " "+ maxStu1);
////        System.out.println(maxN2+ " "+ maxStu2);
//
////
////        int n1=1;
////        while(true){
////            if(Math.pow(n1,2)>12000){
////                System.out.println(n1);
////                break;
////            }
////
////            n1++;
////        }
//
//
////
//
//        int num = 120;
////        for (int i = 2; i <= num; i++) {
////            if (num % i == 0) {
////                System.out.println(i);
////
////
////            }
////
////        }
////
//
//
//        for(int i=2;i<=num/2;i++){
//            if(num%i==0){
//                System.out.println(i);
//            }
//            num=num/i;
//        }
////    }
//        System.out.println("First day of month1");
//        System.out.println("Enter the year: ");
//        int year = input.nextInt();
//        System.out.println("Enter the first day of year: ");
//        int day = input.nextInt();
//        int totalDays = 0;
//        String monName = "";
//        for (int month = 0; month < 12; month++) {
//            switch (month) {
//                case 0:
//                    monName = "January";
//                    totalDays = 31;
//                    break;
//                case 1:
//                    monName = "February";
//                    if (year % 4 == 0) {
//                        totalDays = 29;
//                    } else {
//                        totalDays = 28;
//                    }
//                    break;
//                case 2:
//                    monName = "March";
//                    totalDays = 31;
//                    break;
//                case 3:
//                    monName = "April";totalDays = 30;
//                    break;
//                case 4:
//                    monName = "MAY";
//                    totalDays = 31;
//                    break;
//                case 5:
//                    monName = "JUNE";
//                    totalDays = 30;
//                    break;
//                case 6:
//                    monName = "JULY";
//                    totalDays = 31;
//                    break;
//                case 7:
//                    monName = "AUGUST";
//                    totalDays = 31;
//                    break;
//                case 8:
//                    monName = "SEPTEMBER";
//                    totalDays = 30;
//                    break;
//                case 9:
//                    monName = "OCTOBER";
//                    totalDays = 31;
//                    break;
//                case 10:
//                    monName = "NOVEMBER";
//                    totalDays = 30;
//                    break;
//                default:
//                    monName = "DECEMBER";
//                    totalDays = 31;
//                    break;
//
//
//            }
//
//
//            day = (day + totalDays) % 7;
//            System.out.println(monName + " 1 " + year + " is " + getDayOfMonth(day));
//        }}
//
//            public static String getDayOfMonth ( int day){
//                String dayOfMonth = "";
//                if (day == 1) {
//                    dayOfMonth = "Monday";
//                } else if (day == 2) {
//                    dayOfMonth = "Tuesday";
//                } else if (day == 3) {
//                    dayOfMonth = "Wednesday";
//                } else if (day == 4) {
//                    dayOfMonth = "Thursday";
//
//                } else if (day == 5) {
//                    dayOfMonth = "Friday";
//                } else if (day == 6) {
//                    dayOfMonth = "Saturday";
//                } else {
//                    dayOfMonth = "Sunday";
//                }
//                return dayOfMonth;


//
//
//        int bin=0;
//        int deci=123;
//        String s ="";
//        while(deci!=0){
//            bin = deci%8;
//            s = bin+s;
//
//
//            deci=deci/8;
//        }
//
//        System.out.println(s);

        System.out.println("E");
        long num = input.nextLong();
        long d=0;
        long sum=0;
        long count=0;
        while(num!=0){
            d=num%10;
            if(count%2==0){
                d=d*3;
            }
            else {
                d = d*1;
            }

            sum = sum+d;

            count++;
            num = num/10;
        }

        sum = 10-(sum)%10;
        System.out.println(sum);
            }
        }
