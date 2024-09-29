public class oop_Interfaces_Vs_Abstract {
    public static void main(String[] args) {
        avonOne a1 = new avonOne();
        a1.brake(1);
        // You can create properties in interfaces
        System.out.println(a1.a);
        // You cannot modify properties in interfaces as they are final
        //a1.a = 2; //---  error

        a1.blowHornMhn();
        a1.blowHornK3g();
    }
}
interface bicycle1{

    // Interface variables(properties) are final we cannot modify
    int a=1;

    // This interface is forcing its child class to implement all these methods means define their bodies
    void brake(int decrement);
    void speed(int increment);
}

interface hornBicycle {

    // we only make them public while implementing do not need in making interface
    void blowHornK3g();
    void blowHornMhn();

}
class avonOne  implements bicycle1,hornBicycle{
    // it can implement more than one interfaces like we had two interfaces bicycle1 and hornBicycle
    // , and we are making one class out of two interfaces, making all of them public

    // It is implementing all the methods of interface and also has access to all properties of interface
    // after making an object.
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }

    public void brake(int decrement){
        System.out.println("Applying break:");
    }
    public void speed(int increment){
        System.out.println("Applying speedUp");
    }
    public void blowHornK3g(){
        System.out.println(" Blow horn 3kh");
    }
    public void blowHornMhn(){
        System.out.println("Blow horn mhn");
    }

}