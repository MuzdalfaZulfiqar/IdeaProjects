package apnaCollege;
public class Apna_College_Oops_One_Shot {
    public static void main(String[] args) {
//        char [] data = {'a','b'};
//        String s = new String(data);
//        System.out.println(s);
//        for(char c:data){
//            System.out.print(c);
//        }
//
//        Pen p = new Pen();
//        p.color = "Blue";
//        p.type="gel";
//
//
//        Pen p2 = new Pen();
//        p2.type="ballpoint";
//        p2.color="Blue";
//        p.PrintColor();
//        p2.PrintColor();

        Student s = new Student();
        // static related to whole class so only accessed  by class name not by object
        // since common for all objects
        Student.school = "Allied";
        s.name="ALi";
        s.printInfo(Student.school);
//        s.name="Muz";
//        s.age=19;
//        s.printInfo(19);
//        s.printInfo("Muzdalfa");
//        s.printInfo("Muzdalfa",19);

//        triangle t = new triangle();
horse h= new horse();
h.walk();
    }
}
class Pen{
    public String color;
    String type;// ballpoint ,gel
    public void write(){
        System.out.println("Writing...");
    }

    public void PrintColor(){
        // This means here that the color will be associated to the pen according to object
        // it will tell printColor function that which object called it
        // printColor jb call hoga uss main mojud this ye btay ga ke jis object ne issy call kiya ha
        // us ka color assign kr do
        System.out.println(this.color);
    }

}
class Student{
    String name;
    int age;
    static String  school;
    public static void chanSc(){
        school= "new";
    }
    // Constructor
    // same name as class
    // No return type
    // Only called once
//
//    Student(){
//
//    }
//    Student(String name,int age){
//        this.age=age;
//        this.name=name;
//    }
    // Copy constructor takes object as argument and copy all its contents
//    Student(Student s2){
//        this.name=s2.name;
//        this.age=s2.age;
//    }

    // Polymorphism
    // Compile time polymorphism method overloading
    public void printInfo(String name){

        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }
}
class Shape{
    public void area(){
        System.out.println("Area ");
    }

}
// 1)-----H Single level inheritance(base-->Derived)
class triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2 * l*h);
    }
}
//  2)-----HMultilevel-inheritance (base-->Derived-->Derived)
//class EquiLateral extends triangle{
//    public void area(int l,int h){
//        System.out.println(1/2 * l*h);
//    }
//}
// 3)-----Hierarchical Inheritance(Base class)
//                        /           \
//                       /             \
//                      /               \
//                 Derived              Derived
class circle extends Shape{

    private int password;

    public int getPassword(){
        return password;
    }

    public void setPassword(int password){
        this.password=password;
    }

    // if we make the set function private we can access it by calling in public get function
    //  private void setPassword(int password){
    //        this.password=password;
    //    }
    //public int getPassword(){
    //        setPassword(ranPass)
    //        return password;
    //    }
    public void area(int r) {
        System.out.println(3.14* r*r);
    }
}
// 4)-----Hybrid_Inheritance
// all inheritances mixed

// Public everywhere
// Default everything in one package can access it
// Protected  everything in one package can access it + subclass extended by the class of same package
// in any other package
// Private can be used only in the same class(we make getters and setters for them)

//Abstraction means hiding unimportant data from user and showing only important
abstract class animal{
    abstract public void walk();
}
class horse extends animal{
    public void walk(){
        System.out.println("Walking on 4 legs");
    }
}
class chicken extends animal{
    public void walk(){
        System.out.println("Walking on 2 legs");
    }
}

interface Ani{
    // Interface does not allow constructors
    //all abstract methods no implementation
    // class implements interface do not extend it
    //interface extends interface do not implement it

    // public,static,final by default

    // static same for all
    // Means same for whole class
    // final always fixed
    int eyes = 2;
    // method always abstract,public
    void walk();
}
interface herbi{

}
class Horse implements Ani , herbi{
    public void walk(){
        System.out.println("Walks on 4 legs" +
                "");
    }
}