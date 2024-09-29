import java.io.*;
import java.util.ArrayList;

public class Patient extends Person implements Serializable {
    public static ArrayList<Patient> patientArrayList = new ArrayList<>();
    String illness;
    public void display(){
        super.display();
        System.out.println("Illness : "+illness);
    }
    Patient(){
        super();
    }
    Patient(String illness, String name,int age){
        super(name,age);
        this.illness = illness;
        patientArrayList.add(this);
    }

    public void addPatient(Patient p)
    {
     try{
         ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("patient.txt"));
         for(Patient p1:patientArrayList){
             oos.writeObject(p1);
         }
     }
     catch (Exception e){
         e.printStackTrace();
     }
    }

    public void readPatient(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("patient.txt"));

            while(true){
                Patient p = (Patient) ois.readObject();
                p.display();
            }

        }
        catch (EOFException e){
            System.out.println("End of file");
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
