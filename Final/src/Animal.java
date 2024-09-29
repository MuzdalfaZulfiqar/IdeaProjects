public abstract class Animal {
    String name;
    int age;
    Animal(){

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void sleep(){
        System.out.println("Sleepinh");
    }
    public abstract  void eat();
}

class Mamammal extends  Animal{
    String furColor;
     Mamammal(){

     }

    public Mamammal(String furColor) {
        this.furColor = furColor;
    }

    public Mamammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public Mamammal(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void eat(){
        System.out.println(name+ " east");
    }
}

class Bird extends  Animal{
    int span;
     Bird(){

     }

    public Bird(String name, int age, int s) {
        super(name, age);
        span = s;
    }


    public int getSpan() {
        return span;
    }

    public void setFurColor(int s) {
       span = s;
    }

    public void eat(){
        System.out.println(name+ " east");
    }
}

class jk{
    public static void main(String[] args) {
        Mamammal m = new Mamammal("s",12,"sd");
        Bird v = new Bird("s",12,1);
        m.eat();
        v.eat();
    }
}