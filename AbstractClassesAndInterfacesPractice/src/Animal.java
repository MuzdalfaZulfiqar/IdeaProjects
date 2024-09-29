public abstract class Animal {
    String name;
    int age ;
    Animal(){
        name = null;
        age = 2;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void eat();
    public void sleep(){
        System.out.println("The animal is sleeping.");
    }
}

class Mammals extends Animal{
    String furColor;

    public Mammals(String furColor) {
        this.furColor = furColor;
    }

    public Mammals(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }


    public void run(){
        System.out.println("The animal is running..");
    }

    @Override
    public void eat() {
        System.out.println("The "+ name+ " is eating..");
    }

    public void display(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("Fur Color : "+ furColor);
    }
}
class Bird extends Animal{
    int wingSpan;

    public Bird(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    public Bird(String name, int age, int wingSpan) {
        super(name, age);
        this.wingSpan  =wingSpan;
    }

    public void fly(){
        System.out.println("The bird is flying..");
    }
    public void display(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+ age);
        System.out.println("WingSpan : "+ wingSpan);
    }
    @Override
    public void eat() {
        System.out.println("The "+ name+ " is eating..");
    }
}
class AnimalDemo{
    public static void main(String[] args) {
        Mammals m  = new Mammals("Cheetah",10,"Brown");
        m.display();
        m.run();
        m.sleep();
        m.eat();

    }
}