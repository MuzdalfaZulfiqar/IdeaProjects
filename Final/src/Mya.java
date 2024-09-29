public abstract class Mya {
    abstract void call();
    void callme(){
        System.out.println("Call me too meth of abstartc");
    }
}

class Bclass extends  Mya{
    void call(){
        System.out.println("Ovverridedn from abstaa  2 class");
    }
}

class cHSKS{
    public static void main(String[] args) {
        Bclass b = new Bclass();
        b.callme();
    }
}