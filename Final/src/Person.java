import java.io.*;
import java.nio.channels.ClosedSelectorException;
import java.util.ArrayList;


class checkPerson{
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("File.txt"));
            Person p = new Person(1, "a1");
            Person p1 = new Person(1, "a2");
            Person p2 = new Person(1, "a2");
            oos.writeObject(p);
            oos.writeObject(p1);
            oos.writeObject(p2);
        }
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        catch (IOException e){
            System.out.println(e);
        }


        System.out.println("Lets read");

        ArrayList<Person > p = new ArrayList<>();
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("File.txt"));

            while(true) {
                Person p1 = (Person) ois.readObject();
                p.add(p1);
            }

        } catch (EOFException e){
            System.out.println("End of dile");
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            System.out.println(e.toString());
        }

        for(Person s:p){
            s.display();
        }

    }
}

public class Person implements Serializable {
    int age;
    String name;
    Person(){
        age = 0;
        name = null;
    }
    Person(int a, String n){
        age = a;
        name = n;
    }

    void display(){
        System.out.println(name
        );
        System.out.println(age);
    }
}
