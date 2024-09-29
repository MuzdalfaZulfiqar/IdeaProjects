
public class oop_Access_Modifiers {
    public static void main(String[] args) {
        c1 c= new c1();
        c.meth1();
        System.out.println(c.x); // Public can be used within same package
        System.out.println(c.y); // Protected can be used within same package
        System.out.println(c.z); // Default can be used within same package
   //   System.out.println(c.a); // Private cannot be used within same package

        c2 cp =new c2();
        System.out.println(cp.x);
        System.out.println(cp.y);
        System.out.println(cp.z);
    //  System.out.println(cp.a);
    }
}
class c1{
    public int x=5;     // Public can be used within same class
    protected int y=6;  // Protected can be used within same class
    int z = 7;          // Default can be used within same class
    private int a=9;    // Private can be used within same class
    public  void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class c2 extends c1{

        // subClass of same package
    // Public can be used
    // Protected can be used
    // Default can be used
    // Private cannot be used

        // subclass of different package
    // Public can be used
    // Protected can be used
    // Default cannot be used
    // Private cannot be used
}
class c3{

}
// world
// not in same class, not in same package, not in subclass
// public can be used
// Protected cannot be used
// Default cannot be used
// Private cannot be used
