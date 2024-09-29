import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Account implements Serializable {
    int balance;
    int accNo;
    Account(){

    }

    public Account(int balance, int accNo) {
        this.balance = balance;
        this.accNo = accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    void display(){
        System.out.println("ACC "+ accNo);
        System.out.println("Balace "+ balance);
    }
}


class ATM {

    public static void main(String[] args) {

        try{
            ObjectOutputStream oss  = new ObjectOutputStream(new FileOutputStream("acc.txt"));
            Account a1 = new Account(10000,1);
            Account a2 = new Account(10000,2);
            Account a3 = new Account(10000,3);
            Account a4 = new Account(10000,4);
            Account a5 = new Account(10000,5);
            Account a6 = new Account(10000,6);
            Account a7 = new Account(10000,7);
            Account a8 = new Account(10000,8);
            Account a9 = new Account(10000,8);
            Account a10 = new Account(10000,10);

            oss.writeObject(a1);
            oss.writeObject(a2);
            oss.writeObject(a3);
            oss.writeObject(a4);
            oss.writeObject(a5);
            oss.writeObject(a6);
            oss.writeObject(a7);
            oss.writeObject(a8);
            oss.writeObject(a9);
            oss.writeObject(a10);
        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }


        System.out.println("1. TO withdarw  2. To deposit  3. To transfer  4. To inquire");
        Scanner input = new Scanner(System.in);
        ArrayList<Account > acc = new ArrayList<>();
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("acc.txt"));
            while(true){
                Account a = (Account) ois.readObject();
                acc.add(a);
            }
        }
        catch (EOFException e){
            System.out.println("End of file");
        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
        catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }
        int option = input.nextInt();
        if(option==1){
            withdraw(1,111,acc);
            for(Account a: acc){
                a.display();
            }
        } else if (option==2) {
            deposit(1,111,acc);
            for(Account a: acc){
                a.display();
            }
        } else if (option == 3) {
            transfer(1,111,acc);
            for(Account a: acc){
                a.display();
            }
        }
        else{

        }
    }

    public  static void transfer(int accountNo, int amount, ArrayList<Account> acc){
        for(Account a : acc){
            if(a.accNo == accountNo){
                a.balance = a.balance - amount;
                System.out.println("Amount transferred");
            }
        }
    }
    public  static void deposit(int accountNo, int amount, ArrayList<Account> acc){

        for(Account a : acc){
            if(a.accNo == accountNo){
                a.balance = a.balance +  amount;
                System.out.println("Amount deposited");
            }
        }
    }
    public  static void withdraw(int accountNo, int amount, ArrayList<Account> acc){

        for(Account a : acc){
            if(a.accNo == accountNo){
                a.balance = a.balance -  amount;
                System.out.println("Amount deposited");
            }
        }
    }
    public  static void inquiry(int accountNo, ArrayList<Account> acc){
        for(Account a : acc){
            if(a.accNo == accountNo){
                System.out.println("Amount " + a.balance);
            }
        }
    }
}