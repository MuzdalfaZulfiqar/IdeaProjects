import java.util.Scanner;

public class Java_oop_Finally_block {

    public static void main(String[] args) {

        tryWithoutCatch();
    }
    public static int greet(){
        try{
            int a = 500;
            int b = 0;
            int c = a/b; // Detect the exception and will go to catch block will print exception
            // and goes to finally and at end return the value 0
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("End");
        }
        return 0;  // in case of exception
    }

    public static void cwh(){
        int a=7;
        int b=9;
        while(true){
            try{
                System.out.println(a/b);
            }catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for b = "+b);
            }
            b--;
        }
    }
    public static void check(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            double area;
            try{
                int radius = sc.nextInt();
                if(radius<0){
                    break ;
                }
                else {
                    area = Math.PI * radius * radius;
                    System.out.println(area);
                }
            }catch (Exception e){
                System.out.println(e);
            }
            finally {
                System.out.println("The end of area program..");
            }

        }
        System.out.println( -1);
    }

    public static void tryWithoutCatch(){
        // try block is possible without catch only if we use finally block

        // try without catch without finally (Not acceptable)
//        try{
//            System.out.println(5/0);
//        }

        // try without catch with finally
        try{
            System.out.println(50/10);
        }
        finally {
            System.out.println("Yes this is finally without catch");
        }


        // this method will first print the finally and then throw an exception if any
        // otherwise first print the try sout and then finally
    }
}