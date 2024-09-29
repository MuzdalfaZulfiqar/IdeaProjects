import java.io.*;
import java.util.ArrayList;

public class Doctor extends Person implements Serializable {
    public static ArrayList<Doctor> doctor = new ArrayList<>();
    public  String specialization;
    Doctor(){
        specialization = null;
    }
    Doctor(int age, String name , String spe){
        super(age,name);
        specialization  = spe;
        doctor.add(this);
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public  void  addDoctor(Doctor p){
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("doctor.txt"));
            for(Doctor d: doctor){
                oos.writeObject(d);
            }
        }
        catch (EOFException e){
            System.out.println("End of file");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void readDoctorData() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("doctor.txt"));
            while (true) {
                Doctor d = (Doctor) ois.readObject();
                d.display();
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
        System.out.println("Specialization : "+ specialization);
    }
    public String toString(){
        return super.toString() + "\nSpecialization: "+specialization;
    }
}
