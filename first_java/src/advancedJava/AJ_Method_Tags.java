package advancedJava;

/**
 * This class is best class
 */
public class AJ_Method_Tags {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("This is main method");
    }

    /**
     * Hello this is a method and most beautiful method
     * @param a This is the first number to add
     * @param b This is the second number to add
     * @return Sum of two numbers as an integer
     * @throws Exception if a = 0
     * @deprecated This method is deprecated please use plus operator
     */
    public static int add(int a,int b) throws Exception {
        if (a==0){
            throw new Exception();
        }
        int c;
        c = a+b;
        return c;
    }
}
