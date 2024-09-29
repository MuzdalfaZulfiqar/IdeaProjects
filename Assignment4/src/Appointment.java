import javax.print.Doc;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Appointment implements  Serializable{
    LocalDate date ;
    Patient patient;
    Doctor doctor;
    public static ArrayList<Appointment> appointmentAdd = new ArrayList<>();
    Appointment(){
        date = LocalDate.now();
        patient = new Patient();
        doctor = new Doctor();
    }
    Appointment(LocalDate local, Patient patient, Doctor doctor){
        date = local;
        this.patient = patient;
        this.doctor = doctor;
        appointmentAdd.add(this);
    }

    public  void  addAppointment(Appointment p){
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("appointment.txt"));
            for(Appointment appointment: appointmentAdd){
                oos.writeObject(appointment);
            }

        }
        catch (EOFException e){
            System.out.println("End of file");
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void readAppointmentData() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("appointment.txt"));
            while (true) {
                Appointment p = (Appointment) ois.readObject();
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
    public void deleteAppointmentData(Appointment a) {
        ArrayList<Appointment> deleteAppointment = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("appointment.txt"));
            while (true) {
                // Store all data into the arraylist
                Appointment p = (Appointment) ois.readObject();
                deleteAppointment.add(p);
            }
        }
        catch (EOFException e){
            System.out.println("End of file");
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // If that particular object is found from the arraylist just remove it from both arraylists
        // from appointment list too because that is the onw which keep track of the object that are being added
        for(int i = 0; i<deleteAppointment.size();i++){
            if(a.equals(deleteAppointment.get(i))){
                deleteAppointment.remove(i);
                appointmentAdd.remove(i);
                break;
            }
        }
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("appointment.txt"));
            for(Appointment adding: deleteAppointment){
                oos.writeObject(adding);
            }
        }
        catch (EOFException e){
            System.out.println("End of file");
        } catch (IOException e){
            e.printStackTrace();
        }
    }// Method ends here
    public void updateAppointmentData(Appointment a, Appointment toBeAdded) {
        ArrayList<Appointment> updateAppointment = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("appointment.txt"));
            while (true) {
                // Store all data into the arraylist
                Appointment p = (Appointment) ois.readObject();
                updateAppointment.add(p);
            }
        }
        catch (EOFException e){
            System.out.println("End of file");
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // If that particular object is found from the arraylist just replace
        // it with new object in both arrayList
        // from appointment list too because that is the onw which keep track of the object that are being added
        for(int i = 0; i<updateAppointment.size();i++){
            if(a.equals(updateAppointment.get(i))){
                updateAppointment.set(i,toBeAdded);
                appointmentAdd.set(i,toBeAdded);
                break;
            }
        }
        try
        {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("appointment.txt"));
            for(Appointment adding: updateAppointment){
                oos.writeObject(adding);
            }
        }
        catch (EOFException e){
            System.out.println("End of file");
        } catch (IOException e){
            e.printStackTrace();
        }
    }// Method ends here


    public boolean equals(Object o){
        Appointment a = (Appointment) o;
        if(this.doctor.name.equals(a.doctor.name) && this.patient.name.equals(a.patient.name)){
            return true;
        }
        else{
            return false;
        }
    }
    public void display(){
        System.out.println();
        System.out.println("Appointment Date : "+date);
        System.out.println("Patient Name : "+patient.name);
        System.out.println("Age : "+patient.age);
        System.out.println("Illness : "+patient.illness);
        System.out.println("Doctor Name : "+doctor.name);
        System.out.println("Doctor Specialization : "+doctor.specialization);
    }

    public String toString(){
        return "\nAppointment Date"+date+"Patient Name : "+patient.name+"\nAge : "+patient.age+"\nIllness : "+patient.illness
                +"\nDoctor Name : "+doctor.name+"\nDoctor Specialization : "+doctor.specialization;
    }

}
