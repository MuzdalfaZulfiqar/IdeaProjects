public class factorial {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int number = 4;
        int factorial = 1;
        for (number =4 ; number >0  ;number--)
        {
            factorial= factorial* number;

        }
        System.out.println(factorial);
    }
}
