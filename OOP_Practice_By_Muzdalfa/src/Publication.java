import java.awt.*;
import java.awt.Point;
import java.awt.geom.Point2D;

public class Publication {
    int real;
    int imag;
    Publication(){
        real = 0;
        imag = 0;
    }
    Publication (int x, int y){
        real = x;
        imag = y;
    }
    public boolean isReal(){
        if(imag ==0){
            return true;

        }
        else return false;
    }public boolean isImag(){
        if(real ==0){
            return true;

        }
        else return false;
    }

    public boolean equals(int r, int i){
        if(real == r && imag == i) {
            return true;
        }
        else return  false;
    }
    public boolean equals(Publication p){
        if(real ==p.real && imag == p.imag){
            return true;

        }
        else{
            return false;
        }
    }
    public double mag(){
        return Math.sqrt(real*real + imag*imag);
    }

    public Publication addInto(Publication p){
        real = real + p.real;
        imag = imag + p.imag;

        return this;
    }
     public Publication addNew(Publication p){
        Publication p1 = new Publication();
        p1.real = real + p.real;
        p1.imag = imag + p.imag;
        return p1;
    }
    public Publication conjugate(){
        imag = (-1 )* imag;
        return  this;
    }

    Publication add(Publication a){
        Publication P = new Publication();
        P.real = real + a.real;
        P.imag = imag + a.imag;
        return P;
    }Publication subtract(Publication a){
        Publication P = new Publication();
        P.real = real - a.real;
        P.imag = imag - a.imag;
        return P;
    }
    Publication product(Publication a){
        Publication P = new Publication();
        P.real = real * a.real;
        P.imag = imag * a.imag;
        return P;
    }
}

class Employee{
    String name ;
    String rank;
    Date1 birth;
    Date1 hire;
    Employee(){
        name = "";
        rank = "";
        birth = new Date1();
//        hire = new Date();
    }
    Employee(String n, String r, Date1 b, Date1 h){
        name = n;
        rank = r;
        birth = b;
        hire = h;
    }

    public void display(){
        System.out.println("Name"+ name);
//        birth.display();
//        hire.display();
    }
}

class p{
    String title;
    int price;
    p(){
        title = "";
        price = 10;
    }
    p(String s,int g){
        title = s;
        price = g;
    }
    public void display(){
        System.out.println(title);
        System.out.println(price);
    }
}

class Book3 extends p{
    int pages;
    Book3(){
        super();
        pages = 0;
    }
    Book3(String n, int p, int page){
        super(n,p);
        pages = page;

    }
    public void display(){
        super.display();
        System.out.println(pages);
    }
}

class simply{
    int num1;
    int num2;
    simply(){

    }
    simply(int nq,int np){
        num1 = nq;
        num2 = np;
    }
    public void add(){
        System.out.println(num1 + num2);
    }public void sub(){
        System.out.println(num1 - num2);
    }
    public void div(){
        System.out.println(num1/num2);
    }public void mul(){
        System.out.println(num1 * num2);
    }

}

class child extends simply{
    child(){
        super();
    }
    child(int n1, int n2){
        super(n1,n2);
    }

    @Override
    public void add() {
        if(num1 > 0 && num2 >0){
            super.add();
        }
    }
}

class point1{
    int x;
    int y;
    point1(){
        x = 2;
        y=2;
    }
    point1(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void move(int a,int b){
        x = x + a;
        y = y + b;
    }
}
class Student{
    String name;
    int result[];

    Student(){
        name = "Muzdalfa";
        result = new int[6];
    }
    Student(String name, int [] r){
        this.name = name;
        result = r;
    }
    public void average(){
        int avg;
        int sum = 0;
        for(int i = 0; i<result.length;i++){
            sum = sum + result[i];
        }

        avg = sum / result.length;
        System.out.println(avg);
    }
    public void maxMarks(){
        int high1 = -1111;
        int high2 = -1111;
        for(int i=0; i<result.length;i++) {
            if (result[i] > high1) {
                high2 = high1;
                high1 = result[i];
            }
            else{
                high2 = result[i];
            }
        }
        System.out.println("High 1 = "+ high1);
        System.out.println("High 2 = "+ high2);
    }
}

class HotDog{
    private  int id;
    private int sold;
    HotDog(){
        id = 11;
        sold = 0;
    }
    HotDog(int id,int s){
        this.id = id;
        sold = s;
    }
    public void justSold(){
        sold++;
    }
    public int getSold(){
        return sold;
    }

//    public static void main(String[] args) {
//        HotDog d1 = new HotDog();
//        d1.justSold();
//        System.out.println(d1.getSold());
//        HotDog d2 = new HotDog();
//        d2.justSold();
//        System.out.println(d2.getSold());
//        HotDog d3 = new HotDog();
//        d3.justSold();
//        d3.justSold();
//        d3.justSold();
//        System.out.println(d3.getSold());

}

class Educators{
    String name;
    int regNo;
    int marks;
    Educators(){
        name = "Muzdalfa";
        regNo = 10;
        marks = 90;
    }
    Educators(String s, int r, int m){
        name = s;
        regNo = r;
        marks = m;
    }

}
class marksCalculator{
    Educators e[];
    marksCalculator(){
        e = new Educators[5];
    }
    marksCalculator(Educators e[]){
        this.e = e;
    }
    public void sortThem(){
        for(int i = 0; i<e.length-1;i++){
            for(int j = i+1 ; j<e.length;j++){
                if(e[i].marks > e[j].marks){
                    Educators temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
        for(int i = 0; i<e.length;i++){
            System.out.println(e[i].name);
            System.out.println(e[i].regNo);
            System.out.println(e[i].marks);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Educators e []  ;

    }
}

class Time1{
    int hr;
    int min;
    int sec;

    public Time1(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }
    Time1(){
        hr = 0;
        min  = 0;
        sec = 0;

    }
    public int getHr() {
        return hr;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }


    public Time1 nextSec(){
        sec = sec + 1;
        if(sec >=59){
            sec = 0;

            if(min >=60){
                min = 0;
                if(hr >=23){
                    hr = 0;
                }
                else{
                    hr = hr + 1;
                }

            }
            else{
                min = min + 1;
            }
        }

        else{
            sec = sec + 1;
        }
        return this;
    }

    public String toString(){
        return hr + " "+ min +" "+ sec;
    }
    public static void main(String[] args) {
        Time1 t = new Time1(2,23,56);
      t.nextSec();
    }
}

class point2D{
    float x;
    float y;

    public point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public point2D(){
        x = 0.0f;
        y = 0.0f;
    }
    public void setX(float c){
        x = c;
    }
    public void setY(float b){
        y = b;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        float [] array = new float[2];
        array[0] = getX();
        array[1] = getY();
        return array;
    }
}

class Point3D extends point2D{
    float xSpeed;
    float ySpeed;
    float z;
    Point3D (){
        super();
        z = 0;
        xSpeed = 0.0f;
        ySpeed  = 0.0f;
    }
    Point3D (float x, float y, float z){
        super(x,y);
        this.z = z;
    }
    public void setXYZ(float x, float y,float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ(){
        float [] array = new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2] = z;
        return array;
    }

}

class Animal{
    String name;
    Animal(){
        name ="";
    }
    Animal(String n){
        name = n;
    }
    public String toString(){
        return "Name = "+ name;
    }

}
class mammal extends  Animal{
    mammal(String name){
        super(name);
    }
    public String toString(){
        return "Name = "+ name;
    }
}

class Cat extends mammal{
    Cat(String name){
        super(name);
    }

    public  void greet(){
        System.out.println("Meow");
    }

    public String toString(){
        return "Name = "+ name + "\nSound = meow";
    }
}
class Dog extends mammal{
    Dog(String name){
        super(name);
    }

    public  void greet(){
        System.out.println("Woof");
    }
    public  void greet(Dog d){
        System.out.println("Woooof");
    }


}
final class mark{
    private final int oop = 100;
    private final int dsa = 100;
    private final int   getOOP(){
        return oop;
    }private final int   getDSA(){
        return dsa;
    }private final int   gettotal(){
        return  getDSA() + getOOP();
    }


}

class stu{
    String name;
    final String  roll;
    mark m;
    stu(){
roll = "";
    }
    stu(String n){
       roll = "";
    }
    public void setMark(mark m){

        this.m = m;
    }
    public mark getMark(){
        return  m;
    }
}

class myclass{
    public static void main(String[] args) {

        stu s =  new stu();
        mark m;
        System.out.println(s.getMark());
        m = new mark();
        s.setMark(m);
        System.out.println(s.getMark());
    }
}