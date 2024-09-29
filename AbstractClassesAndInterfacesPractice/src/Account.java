public  abstract class Account {
     int accountNo;
     int openingYear;
     double balance;
     Account(){
         accountNo = 0;
         openingYear = 2001;
         balance = 100;
     }

     Account(int a, int o, double b){
         accountNo = a;
         openingYear = o;
         balance = b;
     }
     public abstract void calculateInterest();
}
class BusinessAccount extends Account{
    double interestRate = (15/100.0);

        BusinessAccount(){
            super();
        }
        BusinessAccount(int a,int o,double b){
            super(a,o,b);
        }
    public void calculateInterest(){
        double interest = 0.0;
        interest = balance * interestRate;
        System.out.println(interest);
    }

    public void display(){
        System.out.println("Balance : "+ balance);
        System.out.println("Opening Year : "+ openingYear);
    }
}

class SavingAccount extends Account{
    double interestRate = (10/100.0);
    SavingAccount(){
        super();
    }
    SavingAccount(int a,int o,double b){
        super(a, o, b);
    }
    public void calculateInterest(){
        double interest = 0.0;
        interest = balance * interestRate;
        System.out.println(interest);
    }
    public void display(){
        System.out.println("Balance : "+ balance);
        System.out.println("Opening Year : "+ openingYear);
    }
}

class Demo{
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount(1234,2001,10000);
        s.calculateInterest();
        s.display();
    }
}