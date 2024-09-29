public interface Payable {
    public double getPayment();
}

class Invoice implements Payable{
    String pNo;
    String des;
    int qt;
    double pricePer;
    Invoice(){

    }
    Invoice(String s, String  d,int q, double p){
        des = d;
        pNo = d;
        qt = q;
        pricePer = p;
    }

    public double getPayment(){
        return (qt * pricePer);
    }
}

class Employee implements  Payable{
    String fn;
    String ln;
    String sno;
    Employee(){

    }
    Employee(String f, String l, String  s){
        fn = f;
        ln = l;
        sno = s;
    }

    public double getPayment(){
        return (10000);
    }
}

class Salaried extends Employee{
    double salary;
    Salaried(){

    }
    Salaried(double s){
        super();
        salary = s;

    }

    @Override
    public double getPayment() {
        return salary;
    }
}


class Pya{
    public static void main(String[] args) {
        Invoice i = new Invoice();
        System.out.println(i.getPayment());
        Salaried s  =  new Salaried(122);
        System.out.println(s.getPayment());
    }
        }