package advancedJava;

/**
 *  This class is the class which holds main method
 * @author Muzdalfa Zulfiqar
 * @see <a href="https://docs.oracle.com/en/java/javase/15/docs/api/index.html" target = "_blank">  Java SE 15 API Docs</a> Java docs
 * @since 7/26/2023
 * @version 1.0
 */
public class AJ_Practice_Set_02 {
    /**
     * This is the main method of the class
     * @param args
     */
    @SuppressWarnings("deprecated")
    public static void main(String[] args) {
        // Problem 2
        System.out.println("This is main method");
        subDiv sd = new subDiv();
        sd.div(20,5);
    }

}

/**
 * This class is the class which holds subtract and divide methods for integers
 * @author Muzdalfa Zulfiqar
 * @version 1.0
 * @since 7/26/2023
 */
class subDiv{
    /**
     * This method takes the two parameters a and b and subtract them
     * @param a
     * @param b
     * @return The return value type is int
     */
    public static int sub(int a,int b){
        return (a-b);
    }

    /**
     * This method takes two parameters a and b and divide them
     * @param a
     * @param b
     * @return The return value type is int
     */
    @Deprecated
    public static int div(int a,int b){
        return a/b;
    }
}