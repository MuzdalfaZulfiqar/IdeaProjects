public class Address {
    private int home;
    private int street;
    private int code;
    private String city;
    public int getHome(){
        return  home;
    }
    public int getStreet(){
        return street;
    }
    public int getCode(){
        return code;
    }
    public void setHome(int h){
        home = h;
    }
    public void setCode(int c){
        code = c;
    }
    public void setCity(String s){
        city = s;
    }
    public void setStreet(int s){
        street = s;
    }
    Address(){
        home = 1;
        street = 1;
        code = 1;
        city = "ISB";
    }
    Address(int h, int s, int co, String ci){
        home = h;
        street = s;
        code = co;
        city = ci;
    }

    void  display(){

        System.out.println("Home"+ home);
        System.out.println("city"+ city);
        System.out.println("code"+ code);
        System.out.println("street"+ street);
    }

}

class Person extends Address{
    private String name;
    Address a;
    Person() {
        name = "NULL";
        a = new Address();
    }
    Person(String name , Address a){
        this.name = name;
        this.a = a;
    }
    public String getName() {
        return name;
    }
    public Address getA(){
        return a;

    }
    public void  setName(String s){
        name = s;
    }
    public void setAddress(Address a){
        this.a = a;
    }

//    public void display(){
//        System.out.println("Name"+name);
//        a.display();
//    }
}


class Fraction{
    int numerator;
    int denominator;
    Fraction(){
        numerator = 2;
        denominator = 4;
    }
    Fraction(int d, int n){
        denominator = d;
        numerator = n;
    }

    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int d){
        denominator = d;
    }
    public int getNumerator(){
        return numerator;
    }
    public void setNumerator(int n){
        numerator = n;
    }
    public boolean equals(int f){
        if(numerator/denominator == f){
            return true;
        }
        else{
            return false;
        }
    }

}