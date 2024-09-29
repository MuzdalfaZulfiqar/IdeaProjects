public class oop_Practice_Set_03 {
    public static void main(String[] args) {
        // problem 1,2
//        fountainPen up = new fountainPen();
//        up.reFill();
//        up.write();
//        up.changeNib();

        // problem 3,5
        // child class reference = child class object
        human h = new human();
        h.eat();
        h.bite();
        h.sleep();
        h.jump();
        h.speak();

//        child class reference = parent class object --> error
//        human h1 = new monkey();

//        child class reference =  interface object --> error
//        human h2 = new BasicAnimal();

        // parent class reference = parent class object
        monkey m = new monkey();
        m.bite();
        m.jump();


        // human object is created with reference of monkey so only reference methods can be used
        // parent class reference = child class object
        monkey m1 = new human();
        m1.jump();
        m1.bite();


//        super class reference =  interface object --> error
//        monkey m2 = new BasicAnimal();

//        interface class reference =  interface object --> error
//        BasicAnimal b = new BasicAnimal() ;

//        interface class reference =  child object
        BasicAnimal b1 = new human();
        b1.eat();
        b1.sleep();

//        they are not related to each other so --> error
//        BasicAnimal b2 = new monkey();


        // problem 4
        // child class reference = child class object
//        SmartTelephone smt = new SmartTelephone();
//        smt.disconnect();
//        smt.ring();
//        smt.lift();
//        smt.m();// in overRiding the one whose object is being made otherwise the one of reference
//        smt.n();


        // child class reference = parent class object --> error
        //SmartTelephone smp = new telephone(); --> error

        // parent class reference = child class object
//        telephone tp = new SmartTelephone();
//        tp.m();
//        tp.disconnect();
//        tp.lift();
//        tp.ring();
        //tp.n();--> error because we can only use the methods of those whose reference has been created

    }
}

// Problem 1
abstract  class pen{
    abstract void write();
    abstract void reFill();
}
class fountainPen extends pen{
    public void write(){
        System.out.println("I am writing");
    }
    void reFill(){
        System.out.println("I am re filling the pen");
    }
    void changeNib(){
        System.out.println("I am changing nib");
    }
}
//------------------------------------------------------------------------------------------------
// problem 2
class monkey{
    public void jump(){
        System.out.println("Jumping..");
    }
    public void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}
class human extends monkey implements BasicAnimal{
    public void eat(){
        System.out.println("Eating...");
    }
    public void sleep(){
        System.out.println("Sleeping.");
    }
    public void speak(){
        System.out.println("Speaking..");
    }
}
//------------------------------------------------------------------------------------------------
// problem 3
abstract class telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
    public void m(){
        System.out.println("m");
    }
}
class SmartTelephone extends telephone{
    void ring(){
        System.out.println("Ringing");
    }
    void lift(){
        System.out.println("Lifting");
    }
    void disconnect(){
        System.out.println("Disconnecting");
    }
    public void m(){
        System.out.println("m of child");
    }
    public void n(){
        System.out.println("n");
    }
}
//------------------------------------------------------------------------------------------------

// problem 6
interface TVremote{
    void pressButton();

}
interface smartTvRemote extends TVremote{
    void clickButton();
}
//------------------------------------------------------------------------------------------------
// problem 7
class Tv implements smartTvRemote{
    public void pressButton(){
        System.out.println("Pressing button..");
    }
    public void clickButton(){
        System.out.println("Clicking button..");
    }
}