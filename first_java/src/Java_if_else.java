public class Java_if_else {
    public static void main(String[] args) {
        int age = 19;
        boolean cond = (age == 18);

        if (cond){
            System.out.println("Yes, you can drive!");
        }

        // else is optional here if condition false then no print
        else{
            System.out.println("No, you cannot drive!");
        }
    }
}
