public class Complex {
    double real;
    double imag;
    Complex(){
        real = 0.0;
        imag = 0.0;
    }
    Complex(double r, double i){
        real = r;
        imag = i;
    }

    Complex add(Complex a){
        Complex c_new = new Complex();
        c_new.real = real + a.real;
        c_new.imag = imag + a.imag;
        return c_new;
    }

    public void show(){
        System.out.println(imag);
        System.out.println(real);
    }

    public static void main(String[] args) {
        Complex c1 = new Complex(1.1,2);
        Complex c2 = new Complex(1.1,2);
        Complex c3 = c1.add(c2);
        c3.show();
    }
}
