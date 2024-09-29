public class commisonEmployee {
    protected String firstName;
    protected String lastName;
    protected String SSN;
    protected double grossSale;
    protected double commonRate;
    public commisonEmployee() {
        firstName = "Muzdalfa";
        lastName = "Zulfiqar";
        SSN = "S003";
        grossSale = 1234.1;
        commonRate = 12.5;
    }

    public commisonEmployee(String firstName, String lastName, String SSN, double grossSale, double commonRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.grossSale = grossSale;
        this.commonRate = commonRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommonRate() {
        return commonRate;
    }

    public void setCommonRate(double commonRate) {
        this.commonRate = commonRate;
    }
    public double earnings(){
        return grossSale * commonRate;
    }
    public void display(){
        System.out.println("First Name : "+ firstName+"\nLast Name : "+lastName+"\nSSN : "+SSN
        +"\nGross Sale : "+grossSale+ "\nCommon Rate : "+ commonRate);
    }
}

class BasePlusEmployee extends commisonEmployee{
    private double salary;
    BasePlusEmployee(){
        salary = 100000;
    }

    public BasePlusEmployee(String firstName, String lastName, String SSN, double grossSale, double commonRate, double salary) {
        super(firstName, lastName, SSN, grossSale, commonRate);
        this.salary = salary;
    }

    // Overridden method
    public double earnings(){
        return super.earnings();
    }
    public void display(){
        super.display();
        System.out.println("Salary : "+ salary);
    }
}