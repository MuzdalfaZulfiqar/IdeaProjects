public class Java_logical_operators {
    public static void main(String[] args) {
        System.out.println("For Logical AND---&&---");
        // T && T = T
        // T && F = F
        // F && T = F
        // F && F = F

        boolean a = true;
        boolean b = true;
        boolean c = false;
        if (a  &&   b && c ){ // this is because we are using and operator&&
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        System.out.println("For Logical OR----||---");

        // T || T = T
        // T || F = T
        // F || T = T
        // F || F = F
        boolean A = true;
        boolean B = true;

        if (A || B ){ // this is because we are using and operator&&
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }

        System.out.println("For Logical NOT---!----");
        System.out.print("Not(a) is ");
        System.out.println(!a);
        System.out.print("Not(b) is ");
        System.out.println(!b);
        System.out.println("NOT(a) is " + !a);
        System.out.println("NOT(b) is " + !b);




    }
}
