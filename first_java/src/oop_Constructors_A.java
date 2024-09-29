// Default constructors
// Parameterized constructors
// Array of objects

public class oop_Constructors_A {
    public static void main(String[] args) {

//        DOG1 d= new DOG1();
//        DOG1 d1 = new DOG1("Husky",12,10,"White");

        // we will make an array ,every element(index) of which is object of same class
        // making array every object if related to dog class like int [] ab
        // where array belongs to int class

        // Declaring an array
        DOG1 [] dogList = new DOG1[4];
// (1) -------------- Manually create objects at every index
        // Initializing index 0 with object
        dogList[0]= new DOG1();
//    --------------Method 1--------(Default constructor and then assigning values)
        // Assigning values to variables of object at index 0
        // Means at every index we are creating an object of dog1 class
        dogList[0].age=12;
        dogList[0].size=10;
        dogList[0].setBreed("Husky");
        dogList[0].setColor("White");
        dogList[0].PrintInfo();


//     -----------Method 2--------(Parameterized constructor)
        dogList[1]= new DOG1("Husky",10,12,"White");
        dogList[1].PrintInfo();

// (2)---------------Create a loop and iterate over it to make object at every index
        for(int i=0;i<dogList.length;i++){
            dogList[i] = new DOG1();// do not use parameterized constructor inside because then
            // every element will have same value
        }
        // then do this
        dogList[0].age=12;
        dogList[0].size=10;
        dogList[0].setBreed("Husky");
        dogList[0].setColor("White");
        dogList[0].PrintInfo();

        dogList[1].age=12;
        dogList[1].size=10;
        dogList[1].setBreed("Husky");
        dogList[1].setColor("White");
        dogList[1].PrintInfo();

    }
}
class DOG1 {
    // class variable
    static String family = "Mammal";

    // instance variable
    private String breed;
    private String color;
    int age;
    int size;

    // default constructor: No arguments
    // do not have return type
    DOG1(){
        System.out.println("Default Constructor... ");
    }

    // parameterized constructor
    DOG1(String breed,String  color){
        System.out.println("parameterized Constructor... ");
        this.breed = breed;
        this.color = color;
    }
    DOG1(String breed,String  color,int age){
        System.out.println("parameterized Constructor... ");
        this.breed = breed;
        this.color = color;
        this.age  = age;
    }

    DOG1(String breed,int age,int size,String color){
        System.out.println("parameterized Constructor... ");
        this.breed = breed;
        this.age=age;
        this.color=color;
        this.size=size;
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed=breed;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void eat(){
        String food = "Meat";
        System.out.println("It eats "+food);
    }
    public void run(){
        String food =" Frozen dog meal";
        System.out.println("It eats "+food);
    }

    public void PrintInfo(){
        System.out.println(breed);
        System.out.println(age);
        System.out.println(color);
        System.out.println(size);
    }
}