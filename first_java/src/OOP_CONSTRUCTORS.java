public class OOP_CONSTRUCTORS {
    public static void main(String[] args) {

        MyMainEmployee muz = new MyMainEmployee(10);
        // we are getting values using the constructors now it means that it goes to that class
        // access its methods, and then it will return their values which are already set in the
        // constructor method
        System.out.println(muz.getName());
        System.out.println(muz.getId());
    }
}
class MyMainEmployee{
    // Private means only within that class and to use them in other classes we need getters and setters
    private int id;
    private String name;
    private int salary;

    // this one is the use of constructor we are making a method with same name as the class
    // The constructor method has no return type we only set the values, and then they are
    // automatically invoked

    // constructor overloading is also possible like we are doing in this case we are making two
    // overloading method with different signatures

    // when we deal with constructors and make a method same as class name then we can do 2 things
    // first one
    // we can initialize the variables in the constructor method and can print their values in the main method using get method
    // second one
    // we can pass the arguments in the object and then same in the method finally we can store them in
    // other variables and simply get them as get method

    public  MyMainEmployee(){
        id=45;
        name="Muzdalfa";
        salary = 25000;
    }
    public  MyMainEmployee(int myId){
        id=myId;
        name="Muzdalfa";
    }

    public String getName(){
        return name ;
    }
    public void setName(String n){
        name = n;
    }
    public  int getId(){
        return id;
    }
    public  void setId(int p){
        id=p;
    }


}
