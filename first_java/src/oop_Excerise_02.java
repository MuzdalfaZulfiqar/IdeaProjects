import java.util.Scanner;

public class oop_Excerise_02 {
    public static void main(String[] args) {
        // Library class
        // Methods; addBook(),issueBook(), returnBook(), showAvailableBooks()
        // properties: array for books , array to store issued books

        Scanner input = new Scanner(System.in);
        Library lib = new Library();
        lib.showAvailableBooks();
        System.out.println("Do you want to add a book..(Enter 1 for yes and 2 for no)");
        int n1 = input.nextInt();
        input.nextLine();
        if (n1==1){
            System.out.println("Which book?");
            String s5 = input.nextLine();
            lib.addBook(s5);
        }
        else{
            System.out.println("Okay, As you wish");
        }
        System.out.print("Which book you want to issue: ");
        String s1 = input.nextLine();
        lib.issueBook(s1);
        System.out.println("Do you want to return the book (Enter 1 for yes and 2 for no)");
        int n = input.nextInt();
        input.nextLine();
        if(n==1){
            lib.returnBook(s1);
            System.out.println("Thanks for using our library..");
        }
        else{
            System.out.println("Thanks for using our library..");
        }
    }
}

class Library{
    public  String [] available;
    public int l;
    public void showAvailableBooks(){
        available = new String[15];
        available[0] = "Halim";
        available[1] = "Namal";
        available[2] = "Peer-e-Kamil";
        available[3] = "Mala";
        available[4] = "Raja-gi-dh";
        available[5] = "Abe-e-Hayat";

        l = 6;
        System.out.println("The available books are: ");
        for(String s3:available){
            System.out.println(s3);
        }
    }

    public void addBook(String s4){
        available[l] = s4;
        System.out.println("The book "+ s4+ " has been added.");
        System.out.println("New list is");
        for(String s6:available){
            System.out.println(s6);
        }
    }

    String [] issued = new String[10];

    public void returnBook(String s){
        System.out.println("The book "+s+" has been returned..");
    }
    public void issueBook(String s1){
        System.out.println("The book "+ s1+ " has been issued..");
        int index = 0;
        issued[index] = s1;
        System.out.println("Total issued books are: ");
        for(String s2:issued){
            System.out.println(s2);
        }
    }

}