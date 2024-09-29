import jdk.jshell.execution.LoaderDelegate;

import javax.print.Doc;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class Patient implements Serializable {
    String name;
    String illness;
    public static   ArrayList<Patient> p = new ArrayList<>();
    Patient(){
        name = null;
        illness = null;
        p.add(this);
    }
    Patient (String  n, String  I){
        illness = I;
        name = n;
        p.add(this);
    }

    void display(){
        System.out.println("I = "+ illness);
        System.out.println("N = " + name);
    }

    void writeObject(Patient s){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("p.txt"));
            for(Patient e : p){
                oos.writeObject(e);
            }
            System.out.println("Written");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    void read(){
        ArrayList <Patient> pat = new ArrayList<>();
        try{

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("p.txt"));

            while(true){
                Patient o = (Patient) ois.readObject();
                pat.add(o);
            }
        } catch (EOFException e){
            System.out.println("End of file");
        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
        catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }

        for(Patient ooo: pat){
            ooo.display();
        }
    }
}


class Doctor  implements  Serializable{
    String name;
    String sp;
    public static   ArrayList<Doctor> p = new ArrayList<>();
    Doctor(){
        name = null;
        sp = null;
        p.add(this);
    }
    Doctor (String  n, String  I){
       sp = I;
        name = n;
        p.add(this);
    }

    void display(){
        System.out.println("sp = "+ sp);
        System.out.println("N = " + name);
    }

    void writeObject(Doctor s){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d.txt"));
            for(Doctor e : p){
                oos.writeObject(e);
            }
            System.out.println("Written");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    void read(){
        ArrayList <Doctor> pat = new ArrayList<>();
        try{

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d.txt"));

            while(true){
                Doctor o = (Doctor) ois.readObject();
                pat.add(o);
            }
        } catch (EOFException e){
            System.out.println("End of file");
        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
        catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }

        for(Doctor ooo: pat){
            ooo.display();
        }
    }
}

class Appo implements  Serializable{
    LocalDate date;
    Patient p;
    Doctor d;
    public static  ArrayList <Appo> appos = new ArrayList<>();

    Appo(){
        appos.add(this);
    }
    Appo(Patient p1, Doctor d1, LocalDate date1){
        appos.add(this);
        p = p1;
        d = d1;
        date = date1;
    }

    void writeObject(Appo s){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
            for(Appo e: appos){
                oos.writeObject(e);
            }
            System.out.println("Written");
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }

    ArrayList<Appo> read(){
        ArrayList <Appo> pat = new ArrayList<>();
        try{

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
            while(true){
                Appo o = (Appo) ois.readObject();
                pat.add(o);
            }
        } catch (EOFException e){
            System.out.println("End of file");
        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
        catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }

//        for(Appo ooo: pat){
//            ooo.display();
//        }

        return pat;
    }

    void update(Appo a, Appo newA){
        ArrayList <Appo> pat = new ArrayList<>();
        try{

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));

            while(true){
                Appo o = (Appo) ois.readObject();
                pat.add(o);
            }
        } catch (EOFException e){
            System.out.println("End of file");
        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
        catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }

        for(Appo ooo: pat){
            if(ooo.p.equals(a.p)){
                ooo.p = newA.p;
                System.out.println("Change made...");
            }
        }
    }
    void dlt(Appo a){
        ArrayList <Appo> pat = new ArrayList<>();
        try{

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));

            while(true){
                Appo o = (Appo) ois.readObject();
                pat.add(o);
            }
        } catch (EOFException e){
            System.out.println("End of file");
        }
        catch (FileNotFoundException e){
            System.out.println(e.toString());
        }
        catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }
        catch (IOException e){
            e.printStackTrace();
        }

        for(Appo ooo: pat){
            if(ooo.p.equals(a.p)){
                pat.remove(ooo);
                System.out.println("Change made...");
                break;
            }
        }
    }

    void display()
    {
        System.out.println("Doctor" + d.name);
    }

}

class hso{
    public static void main(String[] args) {
        Patient p = new Patient("n","o");
        p.writeObject(p);
        Patient p1 = new Patient("n1","o1");
        p1.writeObject(p1);
        p1.read();

        Doctor d = new Doctor("n","s");
        d.writeObject(d);

        Appo a = new Appo(p,d,LocalDate.now());
        a.writeObject(a);
        Appo a1 = new Appo(p1,d,LocalDate.now());
        a1.writeObject(a1);


        ArrayList<Appo> appos =  a1.read();
        for(Appo op: appos){
            if(op.date.equals(LocalDate.now())){
                op.date = LocalDate.now().plusDays(1);
            }
        }

        for(Appo op: appos){
            System.out.println(op.d.name);
            System.out.println(op.date);
        }
    }
}