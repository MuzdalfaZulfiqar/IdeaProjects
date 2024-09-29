import java.util.*;
public class hj {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random ra = new Random();
//       int a = 0;
//       int b = 0;
//       int c = 0;
//        System.out.println("a     a^2      a^3");
//
//        for (int i =1; i<=4;i++){
//            a = i;
//            b = i*i;
//            c = i*i*i;
//            System.out.println(a+"      "+b+"         "+c);
//        }

//
        double popOneSec = ((1.0 / 7) + (1.0 / 45)) - (1.0 / 13);
        System.out.println(popOneSec);
        int popYear = (int) (popOneSec * (31536000));
        System.out.println(popYear);
        int pop = 312032486;
        System.out.println(popYear * 5 + pop);
//        System.out.println("year 1 "+pop+popYear );
//        System.out.println("year 2 "+pop+popYear+popYear);
//        System.out.println("year 3 "+pop+popYear+popYear+popYear);
//        System.out.println("year 4 "+pop+popYear+popYear+popYear+popYear);
//        System.out.println("year 5 "+pop+popYear+popYear+popYear+popYear+popYear);

//        System.out.println("25 / 4 is " + 25 / 4);
//        System.out.println("25 / 4.0 is " + 25 / 4.0);
//        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
//        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
//
//        double r = 1.0;
//        double t = 2.3;
//        System.out.println(5.5+Math.pow(r+2.5, 2.5+t));
//
//        double amount = 5;
//        System.out.println(amount / 2);
//        System.out.println(5 / 2);
//
//        float f = 12.5F;
//        int i = (int)f;
//        System.out.println("f is " + f);
//        System.out.println("i is " + i);


//        System.out.println("Enter number: ");
//        int num = input.nextInt();
//        int sum = 0;
//        while(num!=0){
//            int digit = num%10;
//            num = num/10;
//            sum = sum+digit;
//
//        }
//        System.out.println(sum);
//
//
//        System.out.println((1000000000%525600)/1440);


//        System.out.println("Enter amount:");
//        double amout = input.nextInt();
//        double interest = 0.00417;
//        double po = amout *(1.0+interest);
//        double po1 = po * (2.0+interest);
//        double po2 = po1 * (3.0+interest);
//        double po3 = po2 * (4.0+interest);
//        double po4 = po3 * (5.0+interest);
//        double po5 = po4 * (6.0+interest);
//
//        System.out.println(po);
//        System.out.println(po1);
//        System.out.println(po2);
//        System.out.println(po3);
//        System.out.println(po4);
//        System.out.println(po5);

//        double s = 5.5;
//        double area = ((3 * Math.sqrt(3)) *s*s)/2;
//
//        System.out.println(area);

//        double ta = 5.3;
//        int v = 6;
//        double twc = 35.74 + 0.6215* ta - 35.75*Math.pow(v,0.16)+ 0.4275*ta* Math.pow(v,0.16);
//        System.out.println(twc);

//        System.out.println("a      b      pow(a,b)");
//        int a = 5;
//        int b ;
//        for(int j = 1; j<=a;j++){
//            b = j+1;
//            System.out.println(j+ "  "+ b+"  "+ (int)Math.pow(j,b));
//        }

//        System.out.println("Enter annual interst");
//        double interest = input.nextDouble();
//        System.out.println("Balamace");
//        double balance= input.nextDouble();
//        System.out.println("YEARS");
//        int year = input.nextInt();
//
//        double hyj = balance *Math.pow((1+ interest/1200), year*12);
//        System.out.println(hyj);


//        int income = 15000;
//        double tax  = 0;
//        if (income <= 10000)
//            tax = income * 0.1;
//        else if (income >10000 && income <= 20000)
//            tax = 1000 +
//                    (income - 10000) * 0.15;
//
//        System.out.println(tax);
//
//        System.out.println( 10 + (int)(Math.random() * 41));

//        System.out.println("Enter todays number:");
//        int number  = input.nextInt();
//        System.out.println("Enter the number of days elapsed:");
//        int elas=  input.nextInt();
//        int pef = (number + elas)%7;
//        String day  ="";
//        String day1 = "";
//        if (number ==1 ){
//            day = "Monday";
//        }
//        else if  (number ==2 ){
//            day = "Tuesday";
//        }
//        else if  (number ==3){
//            day = "wednesday";
//        }
//        else if  (number ==4 ){
//            day = "thursday";
//        }
//        else if  (number ==5 ){
//            day = "friday";
//        }
//        else if  (number ==6 ){
//            day = "saturday";
//        }
//        else if  (number ==0 ){
//            day = "sunday";
//        }
//
//        if (elas ==1){
//            day1 = "Monday";
//        }
//        else if  ( pef ==2){
//            day1 = "Tuesday";
//        }
//        else if  ( pef ==3){
//            day1 = "wednesday";
//        }
//        else if  (pef==4){
//            day1 = "thursday";
//        }
//        else if  ( pef ==5){
//            day1 = "friday";
//        }
//        else if  (pef ==6){
//            day1 = "saturday";
//        }
//        else if  ( pef ==0){
//            day1 = "sunday";
//        }
//
//        System.out.println("Today is "+ day+ " after that "+ day1);

//
//        System.out.println("Enter the ISBN-10 number:");
//        int number = input.nextInt();
//        int num = number;
//        int d1,d2,d3,d4,d5,d6,d7,d8,d9;
//        d9 = number%10;
//        number = number/10;
//        d8 = number%10;
//        number = number/10;
//        d7 = number%10;
//        number = number/10;
//        d6 = number%10;
//        number = number/10;
//        d5 = number%10;
//        number = number/10;
//        d4 = number%10;
//        number = number/10;
//        d3 = number%10;
//        number = number/10;
//        d2 = number%10;
//        number = number/10;
//        d1 = number%10;
//        number = number/10;
//        int type = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
//        if(type ==10){
//            System.out.println("Your ISBN-10 number is 0"+ num+"X");
//        }
//        else{System.out.println("Your ISBN-10 number is 0"+ num+""+type);


//        System.out.println("Enter no.");
//        int deci = input.nextInt();
//        boolean rem = true;
//        int hex;
//        String digit = "";
//        String h = "";
//        while(rem){
//            hex = deci%16;
//            digit = String.valueOf(hex);
//            deci = deci/16;
//
//            if (hex ==10){
//                digit = "A";
//}
//            else if (hex ==11){
//                digit = "B";
//            }
//            else if (hex ==12){
//                digit = "C";
//            }
//            else if (hex ==13){
//                digit = "D";
//            }
//            else if (hex ==14){
//               digit = "E";
//            }
//            else if (hex ==15){
//               digit = "F";
//            }
//
//            if (deci==0){rem = false;}
//
//            h =  digit ;
//            System.out.print(h);
//
//
//
//        }


//        int num =28;
//        for (int i = 1; i<=num/2; i++){
//            if (num%i==0){
//                System.out.println(i);
//            }
//        }


//        System.out.println("Enter number: ");
//        int decimal = input.nextInt();
//        int octal = 0;
//        String oc = "";
//        while (decimal!=0){
//            octal = decimal%8;
//            decimal = decimal/8;
//            oc =  String.valueOf(octal)+ oc;
//
//        }
//        System.out.println(oc);

//        int year = input.nextInt();
//        for(int i =2000; i<=2020; i++){
//            System.out.println(days(i));
//
//        }
//
//    }
//    public static int days(int year){
//        int days = 356;
//        int days1 = 366;
//        if (year%4==0){
//            days = 366;
//        }
//        else{
//            days = 365;
//        }
//        return days;

//        System.out.println("Enter a  string");
//        String str  = input.nextLine();
//        for(int i = 0; i<str.length(); i++){
//            if(i%2==1){
//                System.out.println(str.charAt(i));
//            }
//        }


//        int count = 0;
//        int i = 1;
//        while(i<=100)
//         {
//            System.out.printf("%7d", pennumber(i));
//            count++;
//            if (count%10==0){
//                System.out.println(" ");
//            }
//            i++;
//
//
//
//
//            }
//
//
//        }
//
//    public static int pennumber(int n){
//        int pent  = n*(3*n-1)/2;
//        return pent;}


//        String tempCity;
//        System.out.print("Enter the name of city 1: ");
//        String cityOne = input.next();
//
//        System.out.print("Enter the name of city 2: ");
//        String cityTwo = input.next();
//
//        System.out.print("Enter the name of city 3: ");
//        String cityThree = input.next();
//
//        if (cityOne.compareTo(cityTwo) < 0) {
//            {tempCity = cityTwo;
//            cityTwo = cityOne;
//            cityOne = tempCity;}
//
//            if (cityTwo.compareTo(cityThree)<0) {
//                {tempCity = cityThree;
//                cityThree = cityTwo;
//                cityTwo = tempCity;}
//            }
//
//
//
//        }
//
//        System.out.println("The cities in alphabetical order are: "
//                + cityThree + " " + cityTwo + " " + cityOne + ".");
//        System.out.println("Define limit");
//
//        int max = 0;
//        System.out.println("Enter num: ");
//        int num = input.nextInt();
//        max = num;
//        String maximum = "";
//        while(num!=0){
//            if (num>max){
//                max = num;
//                maximum = maximum + String.valueOf(max);
//
//            }
//
//            num = input.nextInt();
//
//        }
//
//        System.out.println(maximum);

//        String s1 = "TAT";
//        String s2 = "BAT";
//        String s3 = "RAT";
//        String s4 = "CAT";
//        s2 = s4;
//        s4 = s3;
//        s1 = s3=s4;
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);

//        int num1 = 1;
//        int num2 = 2;
//        int num3 = ++num1 + num1 + num2;
//        System.out.println(num3);
//        System.out.println(++num2);
//        System.out.println(++num2);
//        System.out.println(num3++);
//
//        int count;
//        for (count =1; count<=10; count++){
//            if (count==5){
//                System.out.printf("%d",count);
//            }
//        }
//        System.out.printf("\nBroke out of loop at count = %d\n",count);


//        int n = num;
//        int d ;
//        int sum = 0;
//        for (int i  =1; i<num; i++ ){
//
//            if ( num%i==0) {
//                System.out.println(i);
//            }}



        System.out.println("NUM");
        int num  = input.nextInt();
        boolean isPrime = true;
        while(isPrime)
        {
            if(prime(num)==true){

                System.out.println(num+ "  is prime");
                isPrime = false;
            }
            else{
                System.out.println("Not prime, enter again: ");
                num = input.nextInt();
                isPrime = true;
            }
        }


    }
    public static boolean prime(int num){
        int f = 0;
        boolean primeNum = false;
        for (int i = 2; i<=num/2;i++){
            if (num%i==0){
                f++;
                break;
            }
        }
        if (f==0){
            primeNum = true;
        }
        else{
            primeNum = false;
        }
        return primeNum;
    }
    }


