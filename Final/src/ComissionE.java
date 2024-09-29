public class ComissionE {
    String fname;
    String lname;
    int SSN;
    int sales;
    int rate;

    public ComissionE(){

    }
    public ComissionE(String fname, String lname, int SSN, int sales, int rate) {
        this.fname = fname;
        this.lname = lname;
        this.SSN = SSN;
        this.sales = sales;
        this.rate = rate;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void Earning(){
        System.out.println(sales * rate);
    }
}

class BasePlusComE extends ComissionE{
    int salary;
    BasePlusComE(){
        super();
        salary = 0;
    }
    BasePlusComE(int s, String f, String l,int ss, int sa, int rate){
        super(f,l,ss,sa,rate);
        salary =s ;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void Earning(){
        System.out.println(salary* rate);
    }
}