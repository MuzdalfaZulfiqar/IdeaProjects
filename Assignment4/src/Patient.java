import java.io.*;
import java.util.ArrayList;

public class Patient extends Person implements Serializable {
    public String illness;
    public static ArrayList<Patient> patientsAdd = new ArrayList<>();
    Patient(){
        illness = null;
    }
    Patient(String name, int age,String ill){
        super(age,name);
        illness = ill;
        patientsAdd.add(this);
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
    public  void  addPatient(Patient p){
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("patient.txt"));
            for(Patient patient: patientsAdd){

                oos.writeObject(patient);
            }

        }
        catch (EOFException e){
            System.out.println("End of file");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void readPatientData() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("patient.txt"));
            while (true) {
                Patient p = (Patient) ois.readObject();
                p.display();
            }
        }
        catch (EOFException e){
        System.out.println("End of file");
        } catch (IOException e){
            e.printStackTrace();
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
    }


    public void display(){
        super.display();
        System.out.println("Illness : "+ illness);
    }
    public String toString(){
        return super.toString()+"\nIllness : "+illness;
    }
}
