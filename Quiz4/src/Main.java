import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Main
{
    public static void main(String[] args) {
//        ArrayList<String> s = new ArrayList<>();
//        s.add("A");
//        s.add("A");
//        s.add("A");
//        s.add("A");
//        s.add("A");
//        s.set(2,"v");  // will replace the element at index 2
//        System.out.println(s);
//        s.add(2,"p");  // will shift from 2 to end all elements
//        // towards left and then add this p at index 2
//        System.out.println(s);
//        s.remove("v");  // It will search for this v in the list and remove it
//        System.out.println(s);
//        s.remove(2);  // It will search this index and on finding it
//        // will remove the value at that index
//        System.out.println(s);

//        ArrayList<Contact> c = new ArrayList<>();
//        Contact c1 = new Contact("s2","s","s",12);
//        Contact c2 = new Contact("s1","s","s",12);
//
//        c.add(c1);
//        c.add(c2);
//
//        for(Contact cp: c){
//            cp.display();
//        }
//
//        String name = "s1";
//        for(Contact cp:c){
//            if(cp.firstName.equals(name)){
//                cp.display();
//                break;
//            }
//        }

//        for(Contact cp : c){
//            if(cp.firstName.equals(name)){
//                c.remove(cp);
//                break;
//            }
//        }

        // We have to search the whole arrayList and each and every variable of that
        // object should be matched in order to match the string
//        for(int i = 0;i<c.size();i++){
//           if(containsTargetString(c.get(i), name)){
//               c.remove(c.get(i));
//               break;
//           }
//        }

//        ArrayList<Student> s  = new ArrayList<>();
//        System.out.println("Enter 1.to add");
//        System.out.println("Enter 2.to find");
//        System.out.println("Enter 3.to delete");
//        System.out.println("Enter 4.to update");
//        System.out.println("Enter 5.to Clear");
//        System.out.println("Enter 6.to exit");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
//        if(option == 1){
//            while(true){
//                System.out.println("Enter roll");
//                int rollNo= input.nextInt();
//                if(rollNo<0){
//                    break;
//                }
//                System.out.println("Enter marks");
//                int marks = input.nextInt();
//                System.out.println("Enter name ");
//                String name = input.next();
//                Student s1 = new Student(rollNo,marks,name);
//                addData(s,s1);
//            }
//
//        }
//        else if(option == 2){
//            Student sp = new Student(12,90,"muz");
//            findData(s,sp);
//        }
//        else if(option ==3){
//            Student sp = new Student(12,90,"muz");
//            deleteData(s,sp);
//        }
//        else if (option == 4){
//            Student sp = new Student(12,90,"muz");
//            Student sp1 = new Student(12,100,"muz");
//            updateData(s,sp,sp1);
//        }
//        else if(option == 5){
//            s.clear();
//        }
//        else{
//            System.exit(1);
//        }

//        for(Student sp:s){
//            sp.display();
//        }

//        for(int i = 0; i<s.size();i++){
//            for(int j = i+1; j<s.size();j++){
//                if(s.get(i).marks < s.get(j).marks){
//                    Student temp = s.get(i);
//                    s.set(i,s.get(j));
//                    s.set(j,temp);
//                }
//            }
//        }
//
//        for(Student sp:s){
//            sp.display();
//        }
//        CheckPerson c  = new CheckPerson();
//        c.writeToFile();
//        c.readFromFile();
//    }
//        Account a1 = new Account(1000,1);
//        Account a2 = new Account(2000,2);
//        Account a3 = new Account(3000,3);
//        Account a4 = new Account(4000,4);
//        Account a5 = new Account(5000,5);
//        Account a6 = new Account(6000,6);
//        Account a7 = new Account(7000,7);
//        Account a8 = new Account(8000,8);
//        Account a9 = new Account(9000,9);
//        Account a10 = new Account(10000,10);

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.txt"));

            Account a1 = new Account(1000,1);
            Account a2 = new Account(2000,2);
            Account a3 = new Account(3000,3);
            Account a4 = new Account(4000,4);
            Account a5 = new Account(5000,5);
            Account a6 = new Account(6000,6);
            Account a7 = new Account(7000,7);
            Account a8 = new Account(8000,8);
            Account a9 = new Account(9000,9);
            Account a10 = new Account(10000,10);

            oos.writeObject(a1);
            oos.writeObject(a2);
            oos.writeObject(a3);
            oos.writeObject(a4);
            oos.writeObject(a5);
            oos.writeObject(a6);
            oos.writeObject(a7);
            oos.writeObject(a8);
            oos.writeObject(a9);
            oos.writeObject(a10);
            System.out.println("Created");
        }
        catch(EOFException e){
            System.out.println("End of file");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e.toString());
        }
        ATM atm = new ATM();
        System.out.println("Enter 1.to inquiry");
        System.out.println("Enter 2.to withdraw");
        System.out.println("Enter 3.to deposit");
        System.out.println("Enter 4.to transfer");
        int op   =  input.nextInt();
        if(op == 1){
            ArrayList<Account> withDrawList  = new ArrayList<>();
            System.out.print("Amount : ");
            int amount = input.nextInt();
            atm.withdraw(amount);
            System.out.println("Enter id");
            int id = input.nextInt();
            atm.balanceInquiry(amount,id);
            atm.read();

        }
        else if(op == 2){
            System.out.print("Amount : ");
            int amount = input.nextInt();
            atm.withdraw(amount);
            System.out.println("Enter id");
            int id = input.nextInt();
            atm.read();
        }
        else if(op == 3){
            System.out.print("Amount : ");
            int amount = input.nextInt();
            System.out.println("Enter id");
            int id = input.nextInt();
            atm.deposit(amount,id);
            atm.read();
        }
        else{
            System.out.print("Amount : ");
            int amount = input.nextInt();
            System.out.println("Enter id");
            int id = input.nextInt();
            atm.transfer(amount,id);
            atm.read();
        }
//        System.out.println("Enter 5.to Clear");
//        System.out.println("Enter 6.to exit");



    }
    public static boolean containsTargetString(Contact c, String s){
        if(c.getFirstName().equals(s) || c.getLastName().equals(s))
        {
            return true;
        }
        else{
            return false;
        }
    }

    public static  void addData(ArrayList <Student> list, Student s){
        list.add(s);
    }

    public static void updateData(ArrayList <Student> list, Student s, Student newData)
    {
        for(int i = 0; i<list.size();i++){
            if(list.get(i).name.equals(s.name)){
                list.set(i,newData);
                break;
            }
        }

    }
    public static void deleteData(ArrayList <Student> list, Student s)
    {
        for(int i = 0; i<list.size();i++){
            if(list.get(i).name.equals(s.name)){
                list.remove(i);
                break;
            }
        }
    }

    public static void findData(ArrayList <Student> list, Student s)
    {
        for(int i = 0; i<list.size();i++){
            if(list.get(i).name.equals(s.name)){
                list.get(i).display();
                break;
            }
        }
    }


}