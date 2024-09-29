public class oop_Constructors_In_Inheritance {
    public static void main(String[] args) {
//        Base1 b1 = new Base1();//IT will print the msg "I am a constructor" one time
//        Derived1 d1  = new Derived1();// same for this since it inherits all the properties of the base class
//        Derived1 d1  = new Derived1(1,2);
//        ChildOfDerived ch = new ChildOfDerived();
          ChildOfDerived ch = new ChildOfDerived(1,2,3);
    }
}
// if base class has a constructor and the derived class do not have any then no problem , derived class will
// call base class constructor

// if both base class and the derived class has the constructors then first tha base class constructor will run
// and then the derived class instructor
class Base1{
    // On executing the program , we find out that in every case the constructor will be executed.
    // Since in the main method java will check that it is an object and will also recognize that
    // there exists some method(constructor with the same name) and will execute it7
    Base1(){
        System.out.println("I am a constructor");
    }
    Base1(int x ){
        System.out.println("I am an overloaded constructor with value of x as :"+x);
    }

    public void changeReference(TestClass c, TestClass to){
        c = to;
    }
}
class Derived1 extends Base1{

    protected Derived1(){

        // Use of super
        // method - 1
        // using derived class object if we want to print the constructor of base class with no arguments we will not pass
        // any argument and will run simply no argument in main method's derived object hence no parameter in
        // derived constructor, it will go to base class and check the constructor without the parameter and print it

        // method - 2
        // Now we want to print the constructor of base class having some argument we will go to the derived class
        // constructor and use the "super" keyword and pass our argument their, okay then it will go to main , check
        // derived object , go to derived constructor and will recognize using the super keyword that i need to go to
        // base class argument one constructor

        // We can also pass argument directly to the derived object but the super keyword is to detect which constructor
        // of base class will be executed

        //super(0);
        System.out.println("I am a derived class constructor");
    }

    // here x will be taken from the base class;
    Derived1(int x,int y){
        super(x);// also means go to super class constructor with parameter
        System.out.println("I am an overloaded constructor of derived with value of y as :"+y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println(" I am a child of derived constructor");
    }// first go to derived then to base while checking
    // hence order will be
    // Base class
    // Derived class
    // Child of Derived class
    // ** considering the arguments
    ChildOfDerived(int x, int y, int z){
        super(x,y);// its base is derived1 so taking an argument in super keyword
        System.out.println("I am an overloaded constructor of child of derived with value of z as :"+z);
    }


}
