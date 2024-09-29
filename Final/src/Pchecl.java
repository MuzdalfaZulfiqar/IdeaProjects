public abstract  class Pchecl {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    Pchecl (){

    }

    public Pchecl(String name) {
        this.name = name;
    }

    public abstract boolean isOut();
}


class StudeNT extends Pchecl{

    public StudeNT(int cgpa) {
        this.cgpa = cgpa;
    }

    public StudeNT(String name, int cgpa) {
        super(name);
        this.cgpa = cgpa;
    }

    public int getCgpa() {
        return cgpa;
    }

    public void setCgpa(int cgpa) {
        this.cgpa = cgpa;
    }

    int cgpa;

    @Override
    public boolean isOut() {
        if(cgpa >3.5 ){
            return true;
        }
        else{
            return false;
        }
    }
}

class prof extends Pchecl{

    public prof(int cgpa) {
        this.publica = cgpa;
    }

    public prof(String name, int cgpa) {
        super(name);
        this.publica = cgpa;
    }

    public int getPublica() {
        return publica;
    }

    public void setPublica(int publica) {
        this.publica = publica;
    }

    int publica;

    @Override
    public boolean isOut() {
        if(publica > 50  ){
            return true;
        }
        else{
            return false;
        }
    }
}

class PustChe{
    public static void main(String[] args) {
        StudeNT s = new StudeNT("s",12);
        prof p = new prof("s",1000);

        Pchecl p1 [] = new Pchecl[2];
        p1[0] = s;
        p1[1] = p;

        for(int i = 0;i<2;i++){
            System.out.println( p1[i].isOut());
        }
    }
}