import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount implements Serializable {
    int balance;
    int accountNumber;

    public BankAccount(int balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int BalanceInquiry(int accountNo){
        return balance;
    }
    public int  withdraw(int amount,int accountNo){
        balance = balance - amount;
        return balance;
    }
    public int deposit(int amount,int accountNo){
        balance = balance+ amount;
        return balance;
    }
    public int  transfer(int amount,int accountNo){
        balance = balance - amount;
        return balance;
    }


}

class OutputStreamBank{
    public void writeToFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BankData.txt"));
            BankAccount b1 = new BankAccount(100000,123);
            BankAccount b2 = new BankAccount(200000,234);
            BankAccount b3 = new BankAccount(10000,345);
            BankAccount b4 = new BankAccount(1000000,456);
            BankAccount b5 = new BankAccount(120000,567);
            BankAccount b6 = new BankAccount(570000,678);
            BankAccount b7 = new BankAccount(10000,789);
            BankAccount b8 = new BankAccount(130000,890);
            BankAccount b9 = new BankAccount(110000,120);
            BankAccount b10 = new BankAccount(10000,654);
            oos.writeObject(b1);
            oos.writeObject(b2);
            oos.writeObject(b3);
            oos.writeObject(b4);
            oos.writeObject(b5);
            oos.writeObject(b6);
            oos.writeObject(b7);
            oos.writeObject(b8);
            oos.writeObject(b9);
            oos.writeObject(b10);
            System.out.println("File has been created..");
        } catch
        (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void makeChangesInAccount(int account,int option,int amount){
        ArrayList<BankAccount> bank = new ArrayList<>();
        try{

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BankData.txt"));
            while (true) {
                BankAccount a = (BankAccount) ois.readObject();
                bank.add(a);
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

        for(int i = 0; i<bank.size();i++){
            int a = bank.get(i).accountNumber;
            if(bank.get(i).accountNumber == account && option == 1){
                int balance = bank.get(i).deposit(amount,account);
                int accountNo = bank.get(i).getAccountNumber();

                BankAccount b = new BankAccount(balance,accountNo);
                bank.set(i,b);

            }
            else if(a == account && option == 2){
                int balance = bank.get(i).withdraw(amount,account);
                int accountNo = bank.get(i).getAccountNumber();

                BankAccount b = new BankAccount(balance,accountNo);
                bank.set(i,b);
            }
            else if(a== account && option == 3){
                int balance = bank.get(i).BalanceInquiry(account);
                int accountNo = bank.get(i).getAccountNumber();

                BankAccount b = new BankAccount(balance,accountNo);
                bank.set(i,b);
            }
            else if(a == account && option == 4){
                int balance = bank.get(i).transfer(amount,account);
                int accountNo = bank.get(i).getAccountNumber();

                BankAccount b = new BankAccount(balance,accountNo);
                bank.set(i,b);
            }
        }

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("BankData.txt"));
            for(BankAccount b:bank){
                oos.writeObject(b);
            }
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
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BankData.txt"));
            while (true){
                BankAccount b = (BankAccount) ois.readObject();
                System.out.println(b.accountNumber);
                System.out.println(b.balance);
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
}

class BackFile{
    public static void main(String[] args) {
        OutputStreamBank b = new OutputStreamBank();
        b.writeToFile();
        System.out.println("Before making changes...");
        b.readFromFile();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1. To deposit \n2. To withdraw \n3.To Balance Inquiry \n4.To Transfer");
        int option = input.nextInt();
        if(option == 1){
            System.out.println("Enter account number: ");
            int accountNo = input.nextInt();
            System.out.println("Enter amount to deposit:");
            int amount = input.nextInt();
            b.makeChangesInAccount( accountNo, 1,amount);

        }
        else if(option ==2){
            System.out.println("Enter account number: ");
            int accountNo = input.nextInt();
            System.out.println("Enter amount to withdraw");
            int amount = input.nextInt();
            b.makeChangesInAccount( accountNo, 2,amount);
        }
        else if(option ==3){
            System.out.println("Enter account number: ");
            int accountNo = input.nextInt();
            b.makeChangesInAccount( accountNo, 3,100000);
        }
        else{
            System.out.println("Enter account number: ");
            int accountNo = input.nextInt();
            System.out.println("Enter amount to transfer:");
            int amount = input.nextInt();
            b.makeChangesInAccount( accountNo, 4,amount);

        }

        System.out.println("After making changes...");
        b.readFromFile();
    }
}