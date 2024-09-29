import java.io.*;
import java.util.ArrayList;

class A{
    public static void main(String[] args) {
        try{
            ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("Book.txt"));
            Book b1 = new Book("a","a",new Person());
            Book b2 = new Book("a","a",new Person());
            Book b3 = new Book("a","a",new Person());
            Book b4 = new Book("a","a",new Person());
            Book b5 = new Book("a","a",new Person());

            oss.writeObject(b1);
            oss.writeObject(b2);
            oss.writeObject(b3);
            oss.writeObject(b4);
            oss.writeObject(b5);
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("File  found.....");


        ArrayList<Book> b1 = new ArrayList<>();

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Book.txt"));

            while(true){
                Book b = (Book)ois.readObject();
                b1.add(b);
            }

        }
        catch(EOFException e){
            System.out.println("End of file");
        }
        catch(ClassNotFoundException e){
            System.out.println(e);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println(e);
        }

        for(Book s1:b1){
            s1.display();
        }
    }




}

public class Book implements Serializable  {
    String  pub;
    String name;
    Person aut;

    Book(){
        pub = null;
        name = null;

    }

    Book(String s, String pu, Person p){
        pub = pu;
        name =s;
        aut = p;
    }

    void display(){
        System.out.println(name);
        System.out.println(pub);
        aut.display();
    }
}
