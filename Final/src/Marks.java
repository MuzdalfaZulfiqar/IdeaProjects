import com.sun.security.jgss.GSSUtil;

public class Marks {
    String name;
    int [] result;
    Marks(){
        name = null;
        result = new int[5];
    }
    Marks(String n, int [] r){
        result = r;
        name = n;
    }

    int average(){
        int sum = 0;
        for(int i = 0;i<5;i++){
            sum =  sum + result[i];
        }

        return (sum/result.length);
    }


//    public static void main(String[] args) {
//        int []m = {12,3,4,2,20};
//        Marks m1 = new Marks("muz",m);
//        int []m4 = {12,3,4,2,20};
//        Marks m2 = new Marks("muz",m4);
//
//        if(m1.average() > m2.average()){
//            System.out.println(m1);
//        }
//        else{
//            System.out.println(m2);
//        }
//    }

}

class ACCCC{
    int balance;
    ACCCC(){
        balance = 0;
    }
    ACCCC(int b){
        balance = b;
    }
    public void withdraw(int amount){
        balance = balance - amount;
        System.out.println(balance);
    }
    public void deposit(int amount){
        balance = balance  + amount;
        System.out.println(balance);
    }

//
//    public static void main(String[] args) {
//        ACCCC a  = new ACCCC();
//        int b = a.balance;
//        ACCCC a1 = new ACCCC(b);
//
//    }
}

class Hot{
    int id;
    int sold;Hot(){
        sold = 0;
    }
    Hot(int i){
        id = i;

    }

    public void inc(){
        sold ++;
    }


    public static void main(String[] args) {
        Hot h1 = new Hot();
        h1.inc();
        h1.inc();
        System.out.println(h1.sold);
Hot h2 = new Hot();
        h2.inc();
//        h1.inc();
        System.out.println(h2.sold);
Hot h3 = new Hot();
        h3.inc();
        h3.inc();
        h3.inc();
        System.out.println(h3.sold);

    }
}