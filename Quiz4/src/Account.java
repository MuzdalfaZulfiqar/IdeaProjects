import java.io.Serializable;

public class Account implements Serializable {
    int balance;
    int accountID;
    Account(){
        balance = 0;
        accountID = 1;
    }

    public Account(int balance, int accountID) {
        this.balance = balance;
        this.accountID = accountID;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void display(){
        System.out.println("Id : "+accountID);
        System.out.println("Balance : "+balance);
        System.out.println();
    }
}

