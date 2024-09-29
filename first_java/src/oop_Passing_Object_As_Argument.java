public class oop_Passing_Object_As_Argument {
    public static void main(String[] args) {
        objectPass p = new objectPass();
        /*
         p.value=5;
         System.out.println("Before "+p.value);
         If the method is not static then we can access the method using the object name
         p.increment(p);
         If the method is static we cannot access it with object but with the class
         objectPass.increment(p);
         System.out.println("After "+p.value);
        */

        complex c1 = new complex(10,9.8);
        complex c2 = new complex(10,8.8);
        complex c3 = new complex();

        // c3 since we are returning object from add method
        c3 = c1.add(c2);
        c3.show();
    }
}
class objectPass{
    public  int value;
    public static void increment(objectPass a){
        a.value++;
    }
}
class complex{
    private double real;
    private double imag;
    public  complex(){
        real = 0.0;
        imag = 0.0;
    }
    public complex(double r, double im){
        real =r;
        imag = im;
    }
    public void show(){
        System.out.println(real);
        System.out.println(imag);
    }

    // public reference_Type  method_Name(reference_Type reference_Variable)
    // {
    // return reference_Variable;
    // }
    public complex add(complex c){
        complex c_new = new complex(real+c.real,imag+c.imag);
        return  c_new;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
