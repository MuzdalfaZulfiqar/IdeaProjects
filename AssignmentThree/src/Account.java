public abstract class Account {
    public int accountNo;
    public int openingYear;
    public double balance;
    public abstract double interestRate(); // abstract Method
    public String toString(){
        return "Account Number : "+accountNo + "\nOpening Year : "+ openingYear
                + "\nBalance : " +balance;
    }
}// class ends here

class BusinessAccount extends Account{

    public static double interest= (15.0/100.0);
    BusinessAccount(){
        balance = 1000.0;
        openingYear = 2001;
        accountNo = 1;
    }
    BusinessAccount(int openingYear, int accountNo, double balance){
        this.openingYear = openingYear;
        this.balance = balance;
        this.accountNo = accountNo;
    }
    public  double interestRate(){
        return (interest * balance);
    }
    public String toString(){
        return super.toString();
    }
}// class ends here
class SavingAccount extends Account{
    public static double interestRate = (10.0/100.0);
    SavingAccount(){
        balance = 1000.0;
        openingYear = 2001;
        accountNo = 1;
    }
    SavingAccount(int openingYear, int accountNo, double balance){
        this.openingYear = openingYear;
        this.balance = balance;
        this.accountNo = accountNo;
    }
    public  double interestRate(){
        return (interestRate * balance);
    }
    public String toString(){
        return super.toString();
    }
}// class ends here
