import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Appointment implements  Serializable{
    public  static ArrayList<Appointment> appointmentArrayList = new ArrayList<>();
    LocalDate date;
    Patient p;
    Appointment(){

    }

    public Appointment(LocalDate date, Patient p) {
        this.date = date;
        this.p = p;
        appointmentArrayList.add(this);
    }
    void display(){
        System.out.println("n = "+ p.name);
        System.out.println("illness = "+ p.illness);
        System.out.println("Date = "+date);
        System.out.println();
    }
    public void addAppointment(Appointment a1){
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("appointment.txt"));
            for(Appointment ap:appointmentArrayList){
                oos.writeObject(ap);
            }
        }catch (EOFException e){
            System.out.println("End of file..");
        }
        catch (IOException e){
            e.printStackTrace();
        }


    }
    public void readAppointment(){
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("appointment.txt"));

            while(true){
                Appointment c = (Appointment)  ois.readObject();
                c.display();
            }
        }catch (EOFException e){
            System.out.println("End of file..");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }
}

    public void deleteAppointment(Appointment p){
        ArrayList<Appointment> dltApp = new ArrayList<>();
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("appointment.txt"));

            while(true){
                Appointment c = (Appointment)  ois.readObject();
                dltApp.add(c);
            }
        }catch (EOFException e){
            System.out.println("End of file..");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }

        for(int i = 0;i<dltApp.size();i++){
            if(dltApp.get(i).p.name.equals(p.p.name)){
                dltApp.remove(i);
                appointmentArrayList.remove(i);
                break;
            }
        }

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("appointment.txt"));
            for(Appointment addingApp : dltApp){
            oos.writeObject(addingApp);
            }
        }catch (EOFException e){
            System.out.println("End of file..");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }

    public void updateAppointment(Appointment newAP, Appointment p){
        ArrayList<Appointment> dltApp = new ArrayList<>();
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("appointment.txt"));

            while(true){
                Appointment c = (Appointment)  ois.readObject();
                dltApp.add(c);
            }
        }catch (EOFException e){
            System.out.println("End of file..");
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            System.out.println(e.toString());
        }

        for(int i = 0;i<dltApp.size();i++){
            if(dltApp.get(i).p.name.equals(p.p.name)){
                dltApp.set(i,newAP);
                appointmentArrayList.set(i,newAP);
                break;
            }
        }

        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("appointment.txt"));
            for(Appointment addingApp : dltApp){
            oos.writeObject(addingApp);
            }
        }catch (EOFException e){
            System.out.println("End of file..");
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
