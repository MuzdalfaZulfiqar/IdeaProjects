import java.time.LocalDate;

public class patientDemo {
    public static void main(String[] args) {
        Patient p1 = new Patient("flu","Abc1",10);
        Patient p2 = new Patient("flu","Abc2",20);
        Patient p3 = new Patient("flu","Abc3",30);
        p1.addPatient(p1);
        p2.addPatient(p2);
        p3.addPatient(p3);
//        p1.readPatient();

        LocalDate date = LocalDate.now();
        Appointment ap = new Appointment(date,p1);
        ap.addAppointment(ap);
        Appointment ap1 = new Appointment(date,p2);
        ap1.addAppointment(ap1);
        Appointment ap2 = new Appointment(date,p3);
//        ap2.addAppointment(ap2);

        ap.readAppointment();
        System.out.println("//------------------------------------------------");
//        ap.deleteAppointment(ap1);
//        ap.readAppointment();
        ap.updateAppointment(ap2,ap);
        ap.readAppointment();
    }
}
