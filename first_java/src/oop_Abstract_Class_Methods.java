// Abstract method is th one which is declared without declaration
// Abstract class is the class which includes at least one abstract method , obviously it can have other methods

// We do this using " Abstract " keyword

public class oop_Abstract_Class_Methods {
    public static void main(String[] args) {

        // we cannot make the object of abstract class because it is just a source or pathway to access other classes
        // it helps us to make concrete class means help the child class

        // Parent2 p2 = new Parent2() ;  // Not Allowed

        // we must implement all the abstract methods of the abstract class in the child class

        child2 c2 = new child2();        // Allowed
        c2.greet();
        c2.sayHello();// this is parent class method
        //  child3 c3 = new child3();    // Not Allowed
    }
}

abstract class Parent2 {
    public Parent2(){
        System.out.println("I am base 2 constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();// Abstract method cannot have a body
    // we can allow the derived class to make changes in the abstract method greet()
    // by the use of method overriding
}

//--------------------Point to note
//
// If we have abstract class ,and we want to make a child class from an abstract class we have two options
//  1-----------  to make the child class as abstract and do not implement the abstract method
//  2-----------  do not make the class abstract class and implement the overridden abstract method from abstract class
// in the child class(This condition is must and if we do not make class abstract and do not implement the abstract method
// this will be an error)
//
class child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning...");
    }
}

abstract class child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}