public interface I1
{
    public void methI1();
}
interface  I2 extends I1{
    public void meth12();
}

class A1{
    public String methodA1(){
        return "Muz";
    }

    public String toString(){
        return "MUZ";
    }
}
abstract  class a1 implements I1{
    public void metha1(){

    }
}

class B2 extends  a1{
    public void methI1(){
        System.out.println("Method implemented");
    }
}


class B1 extends  A1 implements I2{
    public void methI1(){
        System.out.println("Mth1");
    }
    public void meth12()
    {
        System.out.println("Mth2");
    }
}


class C1{
    public static void main(String[] args) {
        I1 i1 = new B1();
        i1.methI1(); // only those methods that are common in i1 and B1
        ((I2) i1).meth12();  // parent interface i1 has been typecasted to child type

        I2 i2 = new B1();
        i2.methI1();
        i2.meth12();

        String var1 = i1.toString(); // parent interfacse can use child's method

        String var2 = ((A1) i1).methodA1();  // parent interface has been typecasted to child type
        // class so can now use its child class method but only those that

        String var3 = ((B1) i1).methodA1();
        String var4 = ((B1) i2) .methodA1();

        Object o1 = new B1();
        ((I1) o1).methI1();
    }
}

