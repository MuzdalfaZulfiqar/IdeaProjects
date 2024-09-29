import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {

                VerifiedSimple verifiedSimple = new VerifiedSimple(5, 2);
                verifiedSimple.add();
                verifiedSimple.sub();
                verifiedSimple.mul();
                verifiedSimple.div();

                VerifiedSimple invalidNumbers = new VerifiedSimple(0, 3);
                invalidNumbers.add();

    }// main time ends here
}// class ends here