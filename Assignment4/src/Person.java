import java.io.Serializable;

public class Person implements Serializable {
    public  int age;
    public String name;
    public int ID;

    public Person(){
        age = 0;
        name = null;
        ID = increaseCount();
    }
    public int increaseCount(){
        return ID++;
    }
    public Person(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
    public String toString(){
        return  "Name : "+name+"\nAge : "+age;
    }
}
