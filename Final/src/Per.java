public class Per {
    String name;
    String email;
    void display(){
        System.out.println(name);
    }
    Per(){
        name = "mub";
        email = "as";
    }
    Per(String n, String e){
         name = n;
         email = e;
    }
}

class Stu extends Per{
    String status;
    Stu(){
    }
    Stu(String  s, String n, String e){
        super(n,e);
        status = s;
    }

    @Override
    void display() {
        System.out.println(status);
        super.display();
    }
}
class Emp extends Per {
    int salary;
    Emp(){
    }
    Emp(int s, String n, String e){
        super(n,e);
        salary = s;
    }

    @Override
    void display() {
        System.out.println(salary);
        super.display();
    }
}

class Fac extends Emp{

    int office;
    Fac(){
        super();
        office = 0;
    }
    Fac(int off, String n, String e, int s){
        super(s, n, e);
        office = off;
    }

    void display(){
        System.out.println(office);
        super.display();
    }
}
class staff {
    public static void main(String[] args) {
        Stu s = new Stu("M", "M", "S");
        s.display();
        Emp se = new Emp(90,"M", "S");
        se.display();
        Fac f = new Fac(1,"M", "S",233);
        f.display();
    }
}
