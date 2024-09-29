public class oop_Inheritances_In_Interfaces {
    public static void main(String[] args) {
       mySampleClass mi = new mySampleClass();
       mi.meth1();
       mi.meth2();
       mi.meth3();
       mi.meth4();

    }
}
// one interface can be inherited to another interface(using extend keyword), but we cannot
// extend it to make one class

// interface can extend another interface.
// interface cannot be extended to make class.
// interface cannot implement another interface.
// only class can implement interface
interface sample{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sample{
    // inheriting the sample interface
    void meth3();
    void meth4();
}

// the below one will throw an error as we cannot make a class inheriting from an interface
//class  childSampleInterface extends sample{
//    // inheriting the sample interface
//    void meth3();
//    void meth4();
//}
class mySampleClass implements childSampleInterface{
    int a  =2;
    public void meth1() {
        System.out.println("Meth 1");
    }
    public void meth2() {
        System.out.println("Meth 2");
    }// we are implementing meth1 and meth2 because they are included in childSampleInterface due to inheritance
    public void meth3(){

        System.out.println("Meth 3");
    }
    public void meth4(){
        System.out.println("Meth 4");
    }
}
