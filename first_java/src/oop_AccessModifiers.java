public class oop_AccessModifiers {
    public static void main(String[] args) {
        MyEmployee muzdalfa = new MyEmployee();

        // throws an error due to private access modifier
        //muzdalfa.id=12;
        //muzdalfa.name= "Muzdalfa";

       // using getters and setters
//        muzdalfa.setName("Muzdalfa");
//        System.out.println(muzdalfa.getName());

        circle c = new circle();
        c.setRadius(9.0f);
        System.out.println("The radius is "+c.getRadius());

        c.setArea(254.46879f);
        System.out.println(c.getArea());


    }
}

class MyEmployee{

    // Private means only within that class and to use them in other classes we need getters and setters

    // getter will return value
    // setter will not return value
    private int id;
    private String name;

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

class circle{
    private double r;
    private double PI = 3.14159;
    private double area1;


    public void setRadius(double rad){
        r=rad;
    }

    public void setArea(double a ){
        area1 = PI * r*r;
        if(a==area1){
            area1=a;
        }
        else{
            System.out.println("WRONG");
        }

    }
    public double  getRadius(){
        return r;
    }
    public double getArea(){
        return area1;
    }
}