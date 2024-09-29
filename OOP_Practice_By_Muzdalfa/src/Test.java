public class Test {
//    public final  int code ;


    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Test.counter = counter;
    }

    public static int counter;
    int id;
    Test(){
        counter++;
    }

    public static void meth(){

        System.out.println("I m meth");
    }


    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = new Test();
        System.out.println(counter);
//        System.out.println(t.id);  // instance var can be accessed with object name
//        System.out.println(Test.counter); // static var so able to access using
//        System.out.println(Test.getCounter());  // static method so can be accessed
//        Test.meth();  // static method so can be accessed with class name
//        t.meth();  // it have yes or no option
//        System.out.println(t.getCounter());
//        System.out.println(t.counter);
//        t.counter = 1;
//
//        // class name
//        Test t1 = new Test();
////      System.out.println(Test.id); // error instance cannot be accessed
////      with class name
////        System.out.println(Test.getCounter());

    }
}
