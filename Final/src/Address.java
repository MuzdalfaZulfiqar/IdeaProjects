public class Address {
    int code;
    int street;
    Address(){

    }
    Address(int c, int s){
        code = c;
        street = s;
    }

}

class P{
    Address a;
    String name;
    P(){
        name = null;
    }
    P(String n, Address aa){
        name  = n;
        a = aa;
    }
    void display(){
        System.out.println(name);
        System.out.println(a.code);
        System.out.println(a.street);
    }
}


class H{
    public static void main(String[] args) {
        Address a = new Address(1,2);
        P p = new P("d",a);
        p.display();
    }
}