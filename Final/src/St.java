public class St implements Regitser {
        String name ;
        int age;
        St(){

        }
        St(String name,int age){
            this.age = age;
            this.name = name;
        }

        public void register(){
            System.out.println("Name" + name);
        }
}

class Emplyee implements  Regitser{
    String age;
    Emplyee(){

    }
    public void register(){
        System.out.println( age );
    }
}
interface  Regitser{
    public  void register();
}

class B{
    public static void main(String[] args) {
        St su = new St("am",12);
        su.register();
        Emplyee e = new Emplyee();
        e.register();
    }

}