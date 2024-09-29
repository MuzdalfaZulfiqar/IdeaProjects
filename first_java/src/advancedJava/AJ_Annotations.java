package advancedJava;

@FunctionalInterface  // will give error if we make 2 methods in this interface
// Functional interface is the one which has only one method and that method is abstract
interface myFunctionalInterface{
    void thisMethod();

}
public class AJ_Annotations {
   @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        newPhone np = new newPhone();
        np.on();
        np.add(1,2);
    }
}

class phoneClass{
    public void show(){
        System.out.println("Show");
    }
    public void on(){
        System.out.println("On of phone class");
    }
}
class newPhone extends phoneClass{
    @SuppressWarnings("deprecation")

    @Override
    public void on(){
        System.out.println("On of new phone class");
    }

    public void camera(){
        System.out.println("Taking photo");
    }

    @Deprecated
    public static int add(int a,int b) {
        int c;
        c = a+b;
        return c;
    }

}
