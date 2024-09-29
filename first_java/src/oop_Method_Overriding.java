//                                                   Method overriding
// It is clear that we want to inherit all the characteristics of the base class and while using the object of derived class
// since we know we can use the base class methods this time we want that in case of derivedObject.BaseClassMethod
// Now we want that it should show that this method itself belongs to the derived class for that purpose we make the same method
// with same name in the derived class  and when we use derivedObject.BaseClassMethod this baseClassMethod will be basically the
//                                                derivedObject.derivedClassMethod


// ------------------------- Static method cannot be overRided
//--------------------------Final method cannot be overRided

//             Method overriding                          |                    Method overloading
//          Method in different class with                |         Method in same class with and,
//          same name                                     |         different parameters
//          same number of arguments                      |         same name
//          same return type
//          same access modifier
class A{
    public int a;
    public int muz(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    // why we are writing this because with this if we are overriding two methods and later on we do something
    // that the method in super class is not overriding now then it will show us the error,and we will be able to
    // know that actually the error is due to not overriding the methods
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}

public class oop_Method_Overriding {
    public static void main(String[] args) {
       A a = new A();
       a.meth2();

       B b  =new B();
       b.meth2();

    }
}
