class Phone{
    public void showTime(){
        System.out.println("time is 8 pm");
    }
    public void name(){
        System.out.println("Turning on phone...");
    }

}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("playing music");
    }
    @Override
    public void name(){
        System.out.println("Turning on Smartphone...");
    }
}
public class oop_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
//        Phone obj = new Phone();
//        SmartPhone smo = new SmartPhone();
//        obj.name();


        // If we have reference from super Class and our object is of subclass it is possible
        // and can access the methods of super class means the methods of reference but
        // in case of overRiding the method of the object means subClass to which actually
        // we were pointing will be accessed
        // Super class reference(phone)  = Sub class object(p= new SmartPhone)


        // object is created at run time this method is called dynamic method dispatch or runTime Polymorphism//
        // dynamic method dispatch or runTime Polymorphism
        // means it is decided on runtime that which method will be executed
        Phone p = new SmartPhone();   // Allowed
        // We have parent variable for child object
        // means we can refer a smartphone as phone

        // means the methods that will be common in them in real world sense
        // like time is shown in both, music is only in smartphone not in phone
        // and name means smartPhone will be turned on saying that please turn on the phone
        p.showTime(); // method of reference
        p.name(); // method of object


        // If we have reference from sub Class and our object is of super class it is not possible
//        SmartPhone sm = new Phone(); this will give an error


        // we can also do this as polymorphism
        Phone ph = new Phone();

        ph = new SmartPhone();
    }
}

// Summary
// the only thing to remember is that dynamic method dispatch is related to the concept that
// the method will be chosen of class whose object is made instead of the reference class in case of
// overRiding

