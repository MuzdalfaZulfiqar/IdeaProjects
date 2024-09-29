import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*int num1;
        int num2;
        System.out.println("Enter number 1: ");
        num1 = input.nextInt();
        System.out.println("Enter number 2: ");
        num2 = input.nextInt();
        if (num1==num2){
            System.out.printf("%d == %d \n", num1, num2);
        }
        if (num1!=num2){
            System.out.printf("%d != %d \n", num1, num2);
        }
        if (num1>=num2){
            System.out.printf("%d >= %d \n", num1, num2);
        }
        if (num1<=num2){
            System.out.printf("%d <= %d \n", num1, num2);
        }
        if (num1>num2){
            System.out.printf("%d > %d \n ", num1, num2);
        }
        if (num1<num2){
            System.out.printf("%d < %d \n", num1, num2);
        }*/

        // 2.31
/*        int even = 0;
        int odd = 0;
        int zero = 0;
        int num=0;
        while (num<5){
            System.out.println("Enter the number:");
            int number = input.nextInt();
            num = num + 1;

            if (number >0){
                even = even +1;
            }
            if (number <0){
                odd = odd+1;
            }
            if (number==0){
                zero = zero+1;
            }
        }
        System.out.println("The positive inputs are: "+ even);
        System.out.println("The negative inputs are: "+ odd);
        System.out.println("The zeros inputs are: "+ zero);*/


        // 2.30
/*        System.out.println("Number   Square    Cube");
        int number  = 0;
        while (number <= 10){
            System.out.printf("%d         %d           %d", number , (number*number),(number*number*number));
            System.out.println();
            number = number+1;

        }*/


        // 2.29
/*        System.out.println("Enter the number:");
        int number  = input.nextInt();
        int digitOne = number%10;
        int remainOne = number/10;
        int digitTwo = remainOne%10;
        int remainTwo = remainOne/10;
        int digitThree = remainTwo%10;
        int remainThree = remainTwo/10;
        int digitFour = remainThree%10;
        int remainFour = remainThree/10;
        int digitFive = remainFour%10;
        System.out.println(digitFive +  " " + digitFour +" "+digitThree+" "+ digitTwo+ " "+ digitOne);*/


        // 2.28
       /* System.out.printf("The character %c has the value %d\n", 'a',((int) 'a' ) );
        System.out.printf("The character %c has the value %d\n", 'A',((int) 'A' ) );
        System.out.printf("The character %c has the value %d \n", 'B', ((int) 'B'));
        System.out.printf("The character %c has the value %d \n", 'b', ((int) 'b'));
        System.out.printf("The character %c has the value %d \n", 'C', ((int) 'C'));
        System.out.printf("The character %c has the value %d \n", 'c', ((int) 'c'));
        System.out.printf("The character %c has the value %d \n", '0', ((int) '0'));
        System.out.printf("The character %c has the value %d \n", '1', ((int) '1'));
        System.out.printf("The character %c has the value %d \n", '2', ((int) '2'));
        System.out.printf("The character %c has the value %d \n", '$', ((int) '$'));
        System.out.printf("The character %c has the value %d \n", '*', ((int) '*'));
        System.out.printf("The character %c has the value %d \n", '+', ((int) '+'));
        System.out.printf("The character %c has the value %d \n", '/', ((int) '/'));
        System.out.printf("The character %c has the value %d \n", ' ', ((int) ' '));

*/

        // 2.27
       /* int r = 12;
        float PI = 3.1415F;
        float diameter = 2*r;
        float circumference = 2 *PI*r;
        float area = PI * r * 2;
        System.out.println(area+ "  "+ circumference + "  " + diameter);

*/

       /* int a = 10;
        int b = 10 + a++;
        System.out.println(a);
        System.out.println(b);*/

  /*      Scanner sc = new Scanner(System.in);
        System.out.println("Enter current world population:");
        int P = sc.nextInt();
        System.out.println("Enter annual world population growth rate %:");
        int R = sc.nextInt();
        for (int i = 1; i < 6; i++) {
            P = P * (1 + R / 100)* i;
            System.out.printf("Population after %d year(s) will be %d \n", i, P);
        }
        System.out.println("Enter total miles: ");
        int totalMiles = sc.nextInt();
        System.out.println("Enter total cost per gallon: ");
        int costPerGallon = sc.nextInt();
        System.out.println("Enter average miles per gallon: ");
        int milesPerGallon = sc.nextInt();
        System.out.println("Enter average fee per day: ");
        int parkingFees = sc.nextInt();
        System.out.println("Enter tolls per day: ");
        int tollsPerDay = sc.nextInt();
        int cost;
        cost = (totalMiles / milesPerGallon) * costPerGallon;
        cost = cost + parkingFees + totalMiles;
        System.out.println(cost);*/

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes passed since midnight: ");
        int N = sc.nextInt();
        int hours = N/60;
        int minutes = N%60;
        System.out.println(hours +":"+ minutes);
*/
        Scanner sc = new Scanner(System.in);
        /*System.out.println(" Enter the total amount of milk produced in the morning:");
        int milk = sc.nextInt();
        float oneCarton = 3.78f ;
        float totalCarton = milk/oneCarton;
        totalCarton = Math.round(totalCarton);
        System.out.println(totalCarton);
        float profitPerCarton = 0.27f;
        float totalProfit = totalCarton * profitPerCarton;
        System.out.println(totalProfit);
        float totalLiters = oneCarton * totalCarton ;
        float totalCostPerLiter = 0.38f * totalLiters;
        System.out.println(totalCostPerLiter);*/

      /*  System.out.println("Enter the number of students: ");
        int students = sc.nextInt();
        System.out.println("Enter the number of apples: ");
        int apples=  sc.nextInt();
        int evenApples= apples /students;
        int remainApples= apples %students;
        System.out.println("The number of apples equally divisible will be :" + evenApples);
        System.out.println("The number of apples in the basket  will be :" + remainApples);*/

//        System.out.println("Enter the number of the students in class one: ");
//        float classOne = sc.nextInt();
//        System.out.println("Enter the number of the students in class two: ");
//        float classTwo = sc.nextInt();
//        System.out.println("Enter the number of the students in class three: ");
//        float classThree = sc.nextInt();
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


        System.out.println("This is first entry");
        System.out.println("Enter the total number of miles driven: ");
        int miles = input.nextInt();
        System.out.println("Enter the total gallons used: ");
        int gallons = input.nextInt();
        double milesPerGallon = (double) (miles/gallons);
        System.out.println(milesPerGallon);
        double milesTotal = 0.0;
        milesTotal = milesTotal + milesPerGallon;
        System.out.println(milesTotal);
        System.out.println("Want to add another entry? Enter 1 for yes and 0 for no: ");
        int s = input.nextInt();
        while(s==1){
            int i = 1;
            System.out.println("This is "+(i+1)+ " entry");
            System.out.println("Enter the total number of miles driven: ");
            int milesNext = input.nextInt();
            System.out.println("Enter the total gallons used: ");
            int gallonsNext = input.nextInt();
            float milesPerGallonNext = (float) (milesNext/gallonsNext);
            System.out.println(milesPerGallonNext);
            milesTotal = milesTotal + milesPerGallonNext;
            System.out.println(milesTotal);
            System.out.println("Want to add another entry? Enter 1 for yes and 0 for no: ");
            s = input.nextInt();
            if (s==0)
                break;

        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your marks in maths, physics and urdu: ");
//        int maths = input.nextInt();
//        int physics = input.nextInt();
//        int urdu = input.nextInt();
//        int avg = (maths + urdu + physics)/3;
//        System.out.println(avg);
//        if ((avg > 40) && (urdu > 33)&&(physics>33) &&(maths>33)){
//            System.out.println("PASS");
//        }
//        else{
//            System.out.println("FAIL");
//        }


        System.out.println("Enter your income: ");
        int income = input.nextInt();
        float tax = 0;
        if (income<2.5f)
            tax = tax + 0;
        else if (income>=2.5f && income <=5.0f)
            tax = (float) (tax + (income-2.5f)* 0.05f);
        else if (income>5.0f && income <=10.0f)
            tax = (float) (tax + (2.5f * 0.05) + (income-5.0) *0.2);
        else if (income > 10)
            tax = (float) (tax + (2.5f * 0.05) + (5.0 *0.2) + (income-10.0)*0.3);

        System.out.println("Tax is : " + tax);
    }
}
