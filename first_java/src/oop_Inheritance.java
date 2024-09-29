
// A derived class can be made only from one superClass.
// However, more than one derived classes can be made from one superClasses
class base{
    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    void print(){
        System.out.println("I am a constructor");
    }
}

// we are using the keyword " extends " with the base class to inherit all the properties of base class
// and can also add some new properties in its class
class derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


// Quick Quiz
class animal{
    int weight;
    String color;
    public void setColor(String  s){
        color = s;
    }
    public String getColor(){
        return color;
    }

}

class dog extends animal{
    String sound;

    public void setSound(String s){
        sound=s;
    }
    public String getSound(){
        return sound;
    }
}
public class oop_Inheritance {
    public static void main(String[] args) {

        // we are making the base class object and then assessing its methods
//        base b = new base();
//        b.setX(4);
//        System.out.println(b.getX());
//

        // we can also make the object of derived class and access the methods of the base class
//        derived d = new derived();
//        d.setX(44);
//        System.out.println(d.getX());
//        d.setY(44);
//        System.out.println(d.getY());
//
        // Quick Quiz
        animal ani = new animal();
        ani.setColor("Brown");
        System.out.println(ani.getColor());

        dog dg =  new dog();

        dg.setSound("The one who Bark...");
        System.out.println(dg.getSound());
    }
}
