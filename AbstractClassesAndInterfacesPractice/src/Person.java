import java.io.*;

public class Person implements Serializable {
    String name = null;int age = 0;
    Person(int a, String n){
    name = n;
    age = a;}
    Person(){

    }
    void setAge(int  a){
        age  = a;
    }
    String getName(){
        return name;
    }
}

class OutputStreamExample{
    public void writeToFile(){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("filename.txt"));
            Person p = new Person();
            p.name = "Muzdalfa";
            p.age = 19;
            oos.writeObject(p);
        }
        catch
        (FileNotFoundException e1){
            e1.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    void readFromFile(){
        try{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("filename.txt"));
        while(true){
            Person per = (Person) ois.readObject();
            System.out.println(per.name);
            System.out.println(per.age);
        }

    }
        catch (EOFException e){
            System.out.println("End of file.");
        }
        catch (FileNotFoundException e2){
            e2.printStackTrace();
        }
        catch (IOException e3){
            e3.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
