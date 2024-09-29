// Weak Association-Aggregation

// We can pass and return an object to a method for example in this case we can make
//      a constructor and in the constructor we have passed an argument as an object
//      in that case we pass the object as ClassName objectVar
public class oop_Aggregation {
    public static void main(String[] args) {
        Address adObj = new Address(10,"Lahore","Pakistan");
        // If we remove the emp object the adObj will remain there,and it shows aggregation
        Employee emp = new Employee(265,"ALI",adObj);
        // (1)------ Call the display method
        emp.display();

        // (2)------ Do not call display method and make a method toString()
        // which will return elements of object as String
        // It is built in function,but we define it according to our need
        // and simply print the object whose elements you want to print
        System.out.println(emp);// we do not need to write it explicitly as
        // objectName.toString()
        System.out.println(adObj);


    }
}
class Employee{
    int id;
    String  name;
    // ClassName objectVar
    Address ad;
    Employee(int i,String n,Address a){
        id =i;
        name = n;
        ad=a;
    }

    public String toString(){
        return ("Id: "+id+" "+"\nName: "+name+"\nAddress: "+ad);
    }
    public void display(){

        System.out.println("Name:"+name);
        System.out.println("Id: "+id);

        // Now, we have the reference of the address class ,and thus we cannot make their use directly
        // ,so we will use them as we access the elements of the classes using objects
        System.out.println("Address: "+ad);
    }
}
// code reuse
class Address{
    private String city;
    private String country;
    private int Hno;
    public void setHno(int Hno){
        this.Hno=Hno;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public int getHno(){
        return Hno;
    }
    public String getCity(){
        return city;
    }
    public String getCountry(){
        return country;
    }
    Address(int h,String c,String ct){
        this.Hno=h;
        city=c;
        country=ct;
    }

     public String toString(){
        return (Hno+" "+city+" "+country);
     }
}
