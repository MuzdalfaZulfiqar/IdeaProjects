public class Empl{
    String name;
    String phone;
    void display(){
        System.out.println(name);
    }
    Empl(){
        name = null;
        phone = null;
    }
    Empl(String n, String p){
        name = n;
        phone = p;
    }
}



class Regular extends  Empl{
    int basic;
    Regular(){

    }
    Regular (int b){
        super();
        basic = b;
    }
    void display(){
        System.out.println("Oay" + basic);
        System.out.println("nam"  + name);
    }
}

class AD extends  Empl{
    int working;
    int wage;
    AD(){
        super();
    }
    AD(int w, int wa, String n, String p){
        super(n,p);
        wage = wa;working  = w;

    }

    void display()
    {
        super.display();
    }
}