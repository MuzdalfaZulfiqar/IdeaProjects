import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class cdf {
    public static void main(String[] args) {
        try {
            FileOutputStream fOut = new FileOutputStream("Int.txt");
            PrintStream ps = new PrintStream(fOut);

            Scanner input = new Scanner(System.in);
            int num = 0;

            while(true){

                System.out.print("Enter number: ");
                num = input.nextInt();
                if (num == -1){
                    break;
                }

                ps.println(num);

            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
