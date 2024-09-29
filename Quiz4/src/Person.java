import java.io.*;

public class Person implements Serializable {
    public String  name;
    public int age ;
    Person(){
        name = "Muz";
        age = 0;
    }
    Person(String n, int a){
        name = n;
        age = a;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

class CheckPerson {

        public  void writeToFile(){
            try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("fileName.txt"));
                Person p = new Person();
                oos.writeObject(p);
            } catch (EOFException e){
                System.out.println("End of file");
            } catch (IOException e){
                System.out.println(e.toString());
            }
        }

        public void readFromFile(){
            try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("fileName.txt"));
                while(true){
                    Person p = (Person) ois.readObject();
                    p.display();
                }
            }
            catch (EOFException e){
                System.out.println("End of file");
            }
            catch (FileNotFoundException e){
                System.out.println(e.toString());
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
}