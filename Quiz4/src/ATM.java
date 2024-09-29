import java.io.*;
import java.util.ArrayList;

public class ATM extends  Account{



    public void balanceInquiry(int id, int accountID){
        ArrayList<Account>withDrawList  = new ArrayList<>();
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.txt"));
            withDrawList.add((Account) ois.readObject());
        }
        catch (EOFException e){
            System.out.println("End of file");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        for(int i = 0; i<withDrawList.size();i++){
            if(withDrawList.get(i).accountID== id){
                Account change = withDrawList.get(i);
                change.display();
                break;
            }
        }
    }
    public void deposit(int amount, int id){
        ArrayList<Account>depositList  = new ArrayList<>();
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.txt"));
           while(true){
               depositList.add((Account) ois.readObject());
           }

        }
        catch (EOFException e){
            System.out.println("End of file");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        for(int i = 0; i<depositList.size();i++){
            if(depositList.get(i).accountID== id){
                Account change = depositList.get(i);
                int balance = change.getBalance() + amount;
                Account newAcc = new Account(balance,id);
                depositList.set(i,newAcc);
                break;
            }
        }

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.txt"));
            for(Account e: depositList){
                oos.writeObject(e);
            }
        }
        catch (EOFException e){
            System.out.println("End of file");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void transfer(int amount, int id){

        ArrayList<Account>tran  = new ArrayList<>();
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.txt"));
            tran.add((Account) ois.readObject());
        }
        catch (EOFException e){
            System.out.println("End of file");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        for(int i = 0; i<tran.size();i++){
            if(tran.get(i).accountID== id){
                Account change = tran.get(i);
                int balance = change.getBalance() - amount;
                Account newAcc = new Account(balance,id);
                tran.set(i,newAcc);
                break;
            }
        }

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.txt"));
            for(Account e: tran){
                oos.writeObject(e);
            }
        }
        catch (EOFException e){
            System.out.println("End of file");
        } catch (IOException e){
            e.printStackTrace();
        }

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.txt"));
            Account a =  (Account) ois.readObject();
            a.display();
        }
        catch (EOFException e){
            System.out.println("End of file");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public int withdraw(int amount){
        return (balance-amount);
    }

    public void read(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("account.txt"));

            while(true){
                Account a =  (Account) ois.readObject();
                a.display();
            }

        }
        catch (EOFException e){
            System.out.println("End of file");
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
