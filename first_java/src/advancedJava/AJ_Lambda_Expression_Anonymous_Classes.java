package advancedJava;
public class AJ_Lambda_Expression_Anonymous_Classes {

    public static void main(String[] args) {
//       blow ad = new AnonymousDemo();
//        ad.blow1();
//        ad.blow2();
        // Anonymous class
//            blow obj = new blow() {
//            @Override
//            public void blow1() {
//                System.out.println("Blow1");
//            }
//
//
//        };
//        obj.blow1();
        // This is not a class the way we make an object for interface to make a class which overRides
        // the methods of interface and that class is basically the class with no name, and we call it
        // anonymous class
        // we can use this class only for one time


        // Lambda Expression
//        blow obj = new thisop();
//        obj.blow1();

//        blow obj = (a)->{ System.out.println("I am meth 1 from this lambda"+a);
//        };
//        obj.blow1(6);


//        myClass mc = new myClass();
//        mc.m1();
//        mc.m2();
//
//        myInterface mi = new myClass();
//        mi.m1();
//        mi.m2();
//
//        myInterface ic = new myInterface() {
//            @Override
//            public void m1() {
//                System.out.println("This is meth1");
//            }
//
//            @Override
//            public void m2() {
//                System.out.println("This is meth2");
//            }
//        };
//        ic.m2();
//        ic.m1();
//
//        myup mp = new myup();
//        mp.m1();
//
//        myInterface mo = new myup();
//        mo.m1();
        myInterface mi = (a)->{
            System.out.println("This is meth 1 with a = "+ a);
        };
        mi.m1(9);


    }
}
//@FunctionalInterface
//interface blow{
//    void blow1(int a);
//    //void blow2();
//}

//class thisop implements blow{
//    public void blow1(){
//        System.out.println("Blow1");
//    }
//}
//class AnonymousDemo implements blow{
//    public void display(){
//        System.out.println("Hello");
//    }
//    @Override
//    public void blow1() {
//        System.out.println("Blow1");
//    }
//    @Override
//    public void blow2() {
//        System.out.println("Blow2");
//    }
//}
@FunctionalInterface
interface myInterface{
    void m1(int a);

}
//class myup implements myInterface{
//    public void m1(){
//        System.out.println("This is meth1 ");
//    }
//}
////class myClass implements myInterface{
//
//    @Override
//    public void m1() {
//        System.out.println("This is meth1");
//    }
//    @Override
//    public void m2() {
//        System.out.println("This is meth2");
//    }
//
//}