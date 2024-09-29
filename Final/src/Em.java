public abstract class Em {
    String fname;
    String ss;
    Em() {
    }

    public Em(String fname, String ss) {
        this.fname = fname;
        this.ss = ss;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSs() {
        return ss;
    }
    public void setSs(String ss) {
        this.ss = ss;
    }
    public String toString(){
        return "na"+fname;
    }
    public abstract void earn();
}

class Sal extends Em{
    Sal(){

    }
    int sal;
    Sal(String n, String s1, int s){
        super(n,s1);sal = s;
    }

    public void earn(){
        System.out.println(sal);
    }
}

class Base extends  Sal{
    int doublesal;
    Base(String n, String ssn, int bs, int ds){
        super(n,ssn,bs);
        doublesal =ds;
    }
    Base(){

    }
    public void earn(){
        System.out.println(doublesal);
    }
}


class payrom{
    public static void main(String[] args) {
        Sal s = new Sal("a","a",12);
        Base b = new Base("a","a",12,12);
        Em  [] e = new Em[2];
        e[0] = s;
        e[1] = b;

//        for(int i = 0;i<e.length;i++){
//            e[i].earn();
//        }

        for(int i = 0;i<e.length;i++){
            if(e[i] instanceof  Base){
                Base Bas = (Base) e[i];
                Bas.doublesal = 1000;
                e[i] = Bas;
            }
        }
    }
}