import java.util.Scanner;

public class Java_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int var =sc.nextInt();
        // var can be integer , character, string

        switch (var) {
            case 18:
                System.out.println("You are an adult now");
                break;
            case 21:
                System.out.println("You are in twenties now");
                break;
            case 60:
                System.out.println("You are an old now");
                break;
            default:
                System.out.println("Enjoy Your Life");
                break;
        }
        System.out.println("Thanks!");

// this is the advanced method of using the switch case there is no need if break
        Scanner sct = new Scanner(System.in);
        System.out.println("Enter age:");
        int var1 =sct.nextInt();
        // var can be integer , character, string

        switch (var1) {
            case 18 -> System.out.println("You are an adult now");
            case 21 -> System.out.println("You are in twenties now");
            case 60 -> System.out.println("You are an old now");
            default -> System.out.println("Enjoy Your Life");
        }
        System.out.println("Thanks!");





        Scanner st = new Scanner(System.in);
        System.out.println("Enter age:");
        int age =st.nextInt();
        if (age>56){
            System.out.println("You are experienced");
        }
        else if(age>46){
            System.out.println("You are semi-experienced");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced");
        }
        else{
            System.out.println("You are not experienced");
        }

        if (age>2){
            System.out.println("Obviously not!");
        }

    }

}
