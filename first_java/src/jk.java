import java.util.Scanner;
public class jk {
    public static void main(String[] args) {



        TestClass c1 = new TestClass(12,2016);
        TestClass c2 = new TestClass(12,2001);
        Base1 b = new Base1();
        b.changeReference(c1,c2);
        System.out.println(c1.getYear());
        System.out.println(c2.getYear());


    }// main ends here

//    public static int factorial(int n){
//        int f = 1;
//        for (int i = 1;i<=n;i++){
//            f=f*i;
//        }// for ends here
//        return f;
//    }// method ends here

}
