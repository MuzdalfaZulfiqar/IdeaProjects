import java.util.Scanner;

public class practice_set_4 {
    public static void main(String[] args) {
        // question # 1

        int a = 10;
        if (a == 11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }


        // question #2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics:");
        int phy = sc.nextInt();
        System.out.println("Enter your marks in chemistry:");
        int chem = sc.nextInt();
        System.out.println("Enter your marks in biology:");
        int bio = sc.nextInt();
        float total = (phy + chem + bio)/3.0f;
        System.out.println("Your percentage is: " +total);

        if (total >= 40 && phy>33 && chem>33 && bio>33){
            System.out.println("You have passed!");
        }
        else{
            System.out.println("Chutti kr bhai!");
        }

        // question # 3
        float tax = 0;
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter your income: ");
        float income = Sc.nextFloat();
        if (income <2.5){
            tax = tax + 0;
        }
        if (income>=2.5 && income<=5.0){
            tax = (float) (tax + (income-2.5)* 0.05);
        }
        else if (income>5.0 && income<=10.0){
            tax = (float) (tax + (5.0-2.5) *0.05); // phly 2.5L pe 5% tax
            tax = (float) (tax +(income-5)*0.2); // next 5L pe 20% tax
        }
        else if (income>10){
            tax = (float) (tax + (5.0-2.5) *0.05); // phly 2.5L pe 5% tax
            tax = (float) (tax +(10-5)*0.2);    // next 5L pe 20% tax
            tax = (float) (tax +(income-10) *0.3); // akhri 10L se upr pe 30% tax
        }
        System.out.println("The total tax paid by employee is " + tax);

        // question #4
        Scanner stc = new Scanner(System.in);
        System.out.print("Enter the day:");
        int day = stc.nextInt();
        switch (day) {
            case 1 -> System.out.println("The day is monday!");
            case 2 -> System.out.println("The day is tuesday!");
            case 3 -> System.out.println("The day is wednesday!");
            case 4 -> System.out.println("The day is thursday!");
            case 5 -> System.out.println("The day is friday!");
            case 6 -> System.out.println("The day is saturday!");
            case 7 -> System.out.println("The day is sunday!");
        }

        // question # 5
        Scanner stcc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = stcc.nextInt();
        if (year%4==0){
            System.out.println("It is a leap year!");
        }
        else{
            System.out.println("It is not a leap year!");
        }

        // question # 6
        Scanner stec = new Scanner(System.in);
        System.out.println("Enter URL:");
        String uRl = stec.next();
        if (uRl.endsWith(".com") ){
            System.out.println("It is a commercial website!");
        }
        else if (uRl.endsWith(".org")){
            System.out.println("It is an organization website!");
        }
        else if (uRl.endsWith(".pk")){
            System.out.println("It is a Pakistani website!");
        }






    }
}
