public class oop_Throw_Throws {
    public static void main(String[] args) {
        // asma used divide
//        try {
//            int c = divide(6, 0);
//            System.out.println(c);
//        }catch (Exception e){
//            System.out.println(e);
//        }
//    }
    try
    {
        double ar = area(-1);
        System.out.println(ar);
    }catch(Exception e1){
        System.out.println(e1);
    }}
    // throws method is warning which is given at start to warn the user to handle it
    // so in case of throws try catch is used by user who used the method

    // In case of throw it is surrounded by developer inside try catch
    public  static int divide(int a,int b) throws ArithmeticException{
        // Made by muzdalfa
        int result=a/b;
        return result;
    }
    public static double area(int radius) throws negativeRadius {

        if(radius<0){
            throw new  negativeRadius();
        }

        double  result = Math.PI * radius * radius;
        return result;
    }
}
class negativeRadius extends Exception{
    @Override
    public String toString() {
        return "Negative radius";
    }

    @Override
    public String getMessage() {
        return "Make sure to enter the positive radius";
    }
}
