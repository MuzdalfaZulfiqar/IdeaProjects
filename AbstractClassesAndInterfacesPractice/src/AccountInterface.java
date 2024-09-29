public interface AccountInterface {

    public void deposit(int amount);
    public void withdraw(int amount);
    public void calculateInterest(int interest);
    public void viewBalance();
}

class SavingAccountBank implements AccountInterface{

    int balance;
    SavingAccountBank(){
        balance = 100;
    }
    SavingAccountBank(int Balance){
        this.balance = Balance;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }

    @Override
    public void calculateInterest(int interest) {
        double rate  = balance * interest/100.0;
        System.out.println(rate);
    }

    @Override
    public void viewBalance() {
        System.out.println("Balance : "+ balance);
    }
}

class CurrentAccount implements AccountInterface{
    int balance;
    CurrentAccount(){

    }
    CurrentAccount(int b){
        balance = b;
    }
    public void deposit(int amount){
        balance = balance + amount;
    }
    public void withdraw(int amount){
        balance = balance - amount;
    }

    @Override
    public void calculateInterest(int interest) {
        double rate  = balance * interest/100.0;
        System.out.println(rate);
    }

    @Override
    public void viewBalance() {
        System.out.println("Balance : "+ balance);
    }

}


class Bank{
    SavingAccountBank[] s;
    int totalSavingAccounts;
    CurrentAccount[] c;
    int totalCurrentAccounts;
    Bank(){
        s = new SavingAccountBank[10];
        c = new CurrentAccount[10];
        totalSavingAccounts = 0;
        totalCurrentAccounts = 0;
    }
    Bank(SavingAccountBank s[], CurrentAccount c[]){
        this.s = s;
        this.c = c;
        totalSavingAccounts = 10;
        totalCurrentAccounts = 10;
        System.out.println("Account added successfully...");
    }
    public void addSavingAccount(SavingAccountBank b){
        if(totalSavingAccounts<10){
            s[totalSavingAccounts] = b;
            totalSavingAccounts++;
        }
        else{
            System.out.println("More accounts cannot be added..");
        }
    }
    public void addCurrentAccount(CurrentAccount c1){
        if(totalCurrentAccounts<10){
            c[totalCurrentAccounts] = c1;
            totalCurrentAccounts++;
            System.out.println("Account added successfully...");
        }
        else{
            System.out.println("More accounts cannot be added..");
        }
    }
    public void printTotalAccounts(){
        for(int i = 0 ; i<totalSavingAccounts;i++){
            s[i].viewBalance();
        }
    }
}

class BankingSystem{
    public static void main(String[] args) {
        Bank b = new Bank();
        SavingAccountBank s1 = new SavingAccountBank(1000);
        SavingAccountBank s2 = new SavingAccountBank(10000);
        s2.calculateInterest(2);
        b.addSavingAccount(s1);
        b.addSavingAccount(s2);
        b.printTotalAccounts();
    }
}