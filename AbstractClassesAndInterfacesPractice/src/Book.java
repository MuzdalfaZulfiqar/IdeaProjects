import java.io.*;
import java.util.Scanner;

public class Book implements Serializable {
    String name;

    public Book(String name, String publisher, Person author) {
        this.name = name;
        this.publisher = publisher;
        this.author = author;
    }

    String publisher;
    Person author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }
}

class OutputStreamBook {
    public void writeToFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("filename.txt"));
            Person p = new Person();
            p.name = "Muzdalfa";
            p.age = 19;
            Book b1 = new Book("Ego is the enemy", "ilm-o-irfan",p);
            Book b2 = new Book("Book1","Haq publisher0",new Person(20,"Ali"));
            Book b3 = new Book("Book2","Haq publisher1",new Person(70,"Aliyan"));
            Book b4 = new Book("Book3","Haq publisher2",new Person(80,"Ali Hasan"));
            Book b5 = new Book("Book4","Haq publisher3",new Person(70,"Ali Ahmed"));
            oos.writeObject(b1);
            oos.writeObject(b2);
            oos.writeObject(b3);
            oos.writeObject(b4);
            oos.writeObject(b5);
            System.out.println("File has been created..");
        } catch
        (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void readFromFile(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("filename.txt"));
            while (true){
                Book b = (Book) ois.readObject();
                System.out.println(b.name);
                System.out.println(b.author.name);
                System.out.println(b.publisher);
                System.out.println();
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

    Book searchBook(String book){
        Book found  = null;
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("filename.txt"));
            while (true){
                Book b = (Book) ois.readObject();
                if(b.name.equals(book)){
                    found = b;
                    return found;
                }
                else{
                    found = null;
                }
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

        return found;

    }

}

class CheckFileHandling{
    public static void main(String[] args) {
       OutputStreamBook o = new OutputStreamBook();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter book name:");
        String name = input.nextLine();
        Book b = o.searchBook(name);
        if(b!=null){
            System.out.println("Book has been found..");
            System.out.println(b.name);
            System.out.println(b.author.name);
            System.out.println(b.publisher);
        }
        else{
            System.out.println("Book not found..");
        }
    }
}