// Some languages support multiple inheritances but java do not
// Multiple inheritance means using multiple classes to make one class

// we can make a class by implementing an interface and extending another class
// now we can say that the derived class is also the base class which implements the interfaces we cannot say
// that the derived class is an interface
public class oop_Multiple_Inheritances {
    public static void main(String[] args) {

// we can make object of class a
// cannot use methods other than class a
        a a1 = new a();
        a1.aMethod();


//   we cannot make object of interface b-
//        b b1 = new b();

// we can make object of class c
        c c1 = new c();
        c1.cMethod();// method of child class c
        c1.bMethod();// method of child class of interface a
        c1.dMethod();// method of class d
        c1.aMethod();// method of class a

//   we cannot make object of interface d-
//        d d1 = new d();


        a1 = new a();
       // a1 = new b();---- cannot make object of interface
        a1 = new c();// allowed reverse is not Allowed
        // a1 is reference of super class and is equal to object of subclass
        a1.aMethod();// can only use methods of the one whose object is being made in this case
        // can only use methods of class a
        //a1 = new d();---- cannot make object of interface


        // b interface reference ,and we are making object of a class
       // b b2 = new a();// not allowed
       // b2 = new b();// not allowed since interface do not make objects

        // **** Reference of interface and object of derived-class is allowed

       b b2  = new c();
        b2.bMethod();

        //b2 = new d(); // not allowed since interface do not make objects


        // Summary
        // super class reference and subClass object allowed only so we can make only
        // a,b,c,d only on left side but on right we can only have c in this case because it is
        // the only subClass here
        // so, we can only access the methods to those whose reference will be given
    }
}

class a{
    public void aMethod(){
        System.out.println("HE");
    }
}
interface b{
    public void bMethod();
}
interface d{
    public void dMethod();
}


class c extends a implements b,d{
    public void cMethod(){
        System.out.println("W");
    }
    public void bMethod(){
        System.out.println("We");
    }
    public void dMethod(){
        System.out.println("WEE");
    }
}
