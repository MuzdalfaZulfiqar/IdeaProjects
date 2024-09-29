package advancedJava;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class AJ_Generics {
    public static void main(String[] args) {

        // Generics means we supply which type of object we want to place in the Class
        // <Integer>
        // We use built-in Java Generics but do not write by ourselves
        ArrayList<Integer> al = new ArrayList();

        // ArrayList<int> al = new ArrayList();  --- error
        //al.add("Str1");
        al.add(54);
        al.add(678);
        //al.add(new Scanner(System.in));

        // Giving an error because unable to detect the type of arrayList,
//        ArrayList al = new ArrayList();
//        int a =  al.get(2);
//        System.out.println(a );
//        int a = (int) al.get(2);
//        we can solve this by typeCasting that particular index value


        // This is an error ,and it causes bug in our program so we use generics to
//        int a = (int) al.get(0);
//        System.out.println(a);

        MyGeneric <String> G1 = new MyGeneric(23,"MYSTRING");
        String  str = G1.getT1();
        System.out.println(str);

        theGeneric <Integer>t3 = new theGeneric(10,12,14);
        int a = t3.getVal();
        int b = t3.getCON();
        int c = t3.getT2();
        System.out.println(a+" "+ b+ " "+ c);
    }
}
class MyGeneric<T1>{
    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    int val ;
    private T1 t1;

    public MyGeneric(int val, T1 t1) {
        this.val = val;
        this.t1 = t1;
    }
}
class theGeneric <T2>{
    int val;
    int CON;
    private T2 t2;

    theGeneric(int val,int CON,T2 t2){
        this.val=val;
        this.CON=CON;
        this.t2 = t2;
    }

    public void setVal(int val){
        this.val=val;
    }
    public int getVal(){
        return val;
    }
    public void setCON(int CON){
        this.CON=CON;
    }
    public int getCON(){
        return CON;
    }
    public void setT2(T2 t2){
        this.t2=t2;
    }
    public T2 getT2(){
        return t2;
    }
}