import javax.sql.rowset.spi.SyncResolver;
import java.awt.*;
import java.util.Date;

public class Book {
    public String author;
    public String [] chapter;
    Book(){
        author = "NULL";
        chapter = new String[4];
    }
    Book(String a, String c[]){
        author = a;
        chapter = c;
    }
    public Book sameChapter(Book b){
        if(chapter.length > b.chapter.length){
            return this;
        }
        else{
            return b;
        }
    }

    public  boolean sameAuthor(Book b){
        if(author.equals(b.author))
            return true;
        else
            return false;
    }

}


class distance{
    int feet;
    int inches;
    distance(){
        inches = 0;
        feet = 0;
    }
    distance(int i, int f){
        inches = i;
        feet = f;
    }
    public boolean equals(distance d1)
    {
        if(inches == d1.inches && feet == d1.feet){
            return true;
        }
        else{
            return false;
        }
    }

    public distance add(distance d1){
        distance d3 = new distance();
        d3.inches = inches + d1.inches;
        d3.feet = feet + d1.feet;
        return d3;
    }
}

class Date1{
    int day;

    int year;
    int month;
    Date1(){
        day = checkDay(day);
        month = checkMonth(month);
        year = 1000;
    }
    Date1(int d, int m, int y){
        day = checkDay(d);
        month = checkMonth(m);
        year = y;
    }
    public int checkDay(int day){
        int days [] = {0,31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(month == 2 )
        {
            if( day >= 1 && day <= days[month] || day >=1 && day<= days[month]+1){
                return day;
            }
            else{
                return 1;
            }
        }
        else if(month == 1 || (month >= 3 && month <= 12)){
            if(day>=1 && day<=days[month]){
                return day;
            }
            else{
                return 1;
            }
        }
        else{
            return 1;
        }
    }
    public int checkMonth(int m){
        if(m >= 1 && m<= 12){
            return m;
        }
        else{
            return 1;
        }
    }
    public void display(){
        System.out.println("Day : "+ day);
        System.out.println("Month : "+ month);
        System.out.println("Year : "+ year);
    }
}

class Book1{
    Person author;
    String name;
    String publiseher;
    Book1(){
        author = new Person()
        ;
        name = "m";
        publiseher = "m";
    }
    Book1(Person p, String n, String p1){
        author = p;
        publiseher = p1;
        name = n;

    }

    public void display(){
        System.out.println("Pun"+publiseher);
        author.display();

    }
}

class Person1{
    String name;
    String address;
    Person1(){
        name = "";
        address = "";
    }
    Person1(String  n, String  a){
        name = n;
        address = a;
    }
    void display(){
        System.out.println("Name "+ name);
        System.out.println("Address "+address);

    }
}
class student1 extends Person1{
    String status;





    student1(){
        super();
        status = "";

    }
    student1(String  s, String n, String a){
        super(n,a);
        status = s;
    }
    public void display(){
        super.display();
        System.out.println("Status");
    }
}

class Balance{
    private  int bal;
    Balance(){
        bal = 0;
    }
    Balance(int b){
        bal = b;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }
    public int getBal(){
        return bal;
    }

    public void withdraw(int amount){
        System.out.println("Withdrawn = "+amount);
        bal = bal - amount;
        System.out.println("Balance = "+bal);
    }
    public void deposit(int amount){
        System.out.println("Deposit = "+amount);
        bal = bal + amount;
        System.out.println("Balance = "+bal);
    }

    public static void main(String[] args) {
        Balance b = new Balance();
        b.bal = 10000;
        b.withdraw(1000);
        b.deposit(10000);
    }
}

class Dis{
    int feet;
    int inch;
    Dis(){
        feet = 0;
        inch = 0;
    }
    Dis(int f, int i){
        feet = f;
        inch = i;
    }
    public void display(){
        System.out.println("Feet = "+feet);
        System.out.println("Inches = "+inch);
    }
}

class Marks{
    int m1;
    int m2;
    int m3;
    Marks(){
        m1 = 0;
        m2 = 0;
        m3 = 0;
    }
    Marks(int m1, int m2,int m3){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    public int add(){
        return (m1+m2+m3);
    }
}

class Time{
    int hr;
    int min;
    int sec;

    Time(){
        hr = 3;
        min = 30;
        sec = 45;
    }
    Time(int hr1, int min1, int sec1){
        hr = checkHour(hr1);
        min = checkMin(min1);
        sec = checkSec(sec1);
    }
    public int checkHour(int hr){
        if(hr >=1 && hr <=24){
            return hr;
        }
        else{
            return 1;
        }
    }
    public int checkMin(int min){
        if(min >=1 && min <=60){
            return min;
        }
        else{
            return 1;
        }
    }
    public int checkSec(int sec){
        if(sec >=1 && sec <= 60){
            return sec;
        }
        else{
            return 1;
        }
    }

    public void dis(){
        System.out.println(hr);
        System.out.println(min);
        System.out.println(sec);
    }
}