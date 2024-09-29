public class oop_Final_And_Static_Variable {
    public static void main(String[] args) {
        // the variable whose value do not wary and remain same is not instance variable
        // static is one which is commonly shared among all the objects of a class
        // but associated with class ,and we make static keyword
        // If we use static variable, it means it is
        // 1)-- class variable
        // 2)-- we do not need object to access it
        // 3)-- but we can access it through object and class name


        // static and final variables will be printed bcs they are somehow related to class
        student1 s1 = new student1("Muzdalfa",19,36);
        // using class name
        // className.nameOfStaticVariable

       // s1.university="1";---> Error BCZ we cannot change the value of final
        s1.print();

        // If we want to make our variable constant we declare it final
    }
}

class student1 {
   private String name;
   private int age;
   final int rollNo; // blank final variable: Value not initialized
    // so we will initialize them in default constructor
    // we assign them values when the object is created means when constructor is made

   final String university = "Com";

   // final static variable must be declared and initialized at the same point
    static String program = "Software";
   public student1(){

        this.rollNo=0;

   }
   public student1(int rollNo){
       this.rollNo=rollNo;
   }

    public student1(String name,int age,int rollNo) {
        this.name = name;
        this.age=age;
        this.rollNo=rollNo;
    }
    public void print(){
        System.out.println("Name: "+name+" Age: "+age+" Roll no: "
                +rollNo+" Program: "+program+" University: "+university);
    }

    public  void p(){
        System.out.println("M");
    }
}





