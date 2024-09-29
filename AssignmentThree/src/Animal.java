public abstract class Animal {
    protected String name;
    protected int age;
    public abstract void eat();
    public void sleep(){
        System.out.println("The animal is sleeping...");
    }
    public String toString(){
        return "Name : "+ name+ "\nAge : "+ age;
    }
}// class ends here
class Mammal extends Animal{
    protected String furColor;
    Mammal(){
        furColor = null;
        name = null;
        age = 2;
    }
    Mammal(String furColor, String name, int age){
        this.furColor = furColor;
        this.age = age;
        this.name = name;
    }

    public void run(){
        System.out.println(name + " is running...");
    }
    public void eat(){
        System.out.println("The "+ name + " is eating..");
    }
    public String toString(){
        return super.toString() + "\nFur Color : "+ furColor;
    }
}// class ends here
class Bird extends Animal{
    protected int wingSpan;
    Bird(){
        wingSpan = 90;
        name = null;
        age = 2;
    }
    Bird(int wingSpan, String name, int age){
        this.wingSpan = wingSpan;
        this.age = age;
        this.name = name;
    }
    public void fly(){
        System.out.println(name + " is flying..");
    }
    public void eat(){
        System.out.println("The "+ name + " is eating..");
    }
    public String toString(){
        return super.toString() + "\nWing Span : "+ wingSpan;
    }
}// class ends here
