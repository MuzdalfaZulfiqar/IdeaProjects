import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//
//   // Creating two patients and one doctor. Store them in file.
//    Patient patient1 = new Patient("Aliyah",10,"Fever");
//    Patient patient2 = new Patient("Ahmed ",19,"Flu");
//
//    patient1.addPatient(patient1);
//    patient1.addPatient(patient2);
//
//    Doctor doctor1 = new Doctor(50,"Farhan Ahmed","Neurosurgeon");
//    doctor1.addDoctor(doctor1);
//
//    // Creating two appointments and store them in file.
//    String dateString1 = "2023-09-01";
//    LocalDate date1 = LocalDate.parse(dateString1);
//    Appointment appointment1 = new Appointment(date1, patient1,doctor1);
//    appointment1.addAppointment(appointment1);
//
//    String dateString2 = "2023-12-18";
//    LocalDate date2 = LocalDate.parse(dateString2);
//    Appointment appointment2 = new Appointment(date2, patient2,doctor1);
//    appointment2.addAppointment(appointment2);
//
//    // Creating an arrayList of type Appointment and read all objects from file into it.
//    ArrayList<Appointment> readApp = new ArrayList<>();
//        try {
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("appointment.txt"));
//            while (true) {
//                Appointment p = (Appointment) ois.readObject();
//                readApp.add(p);
//            }
//        }
//        catch (EOFException e){
//            System.out.println("End of file");
//        } catch (IOException e){
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        // Displaying all Appointments that are scheduled for today.
//        System.out.println("Appointments scheduled for today____");
//        LocalDate today = LocalDate.now();
//        for(Appointment a : readApp){
//            if(a.date.equals(today)){
//                a.display();
//                break;
//            }
//        }// for loop ends here
//
//        // Modify their Date and move one day ahead.
//
//        LocalDate nextDay = LocalDate.now().plusDays(1);
//        for(int i = 0; i<readApp.size();i++){
//            Appointment app = readApp.get(i);
//            if(app.date.equals(today)){
//                app.setDate(nextDay);
//                readApp.set(i,app);
//                break;
//            }
//        }// for loop ends here
//
//        // Writing updated data back into the file
//        try
//        {
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("appointment.txt"));
//            for(Appointment appointment: readApp){
//                oos.writeObject(appointment);
//            }
//        }
//        catch (EOFException e){
//            System.out.println("End of file");
//        } catch (IOException e){
//            e.printStackTrace();
//        }
//
//        System.out.println();
//        System.out.println("Displaying updated data____");
//        appointment1.readAppointmentData();
//    }// main ends here
//}// class ends here

class CustomRadioButton extends JRadioButton {
    private static final int CIRCLE_SIZE = 20;
    private static final Color SELECTED_COLOR = Color.BLUE;

    public CustomRadioButton(String text) {
        super(text);

        setPreferredSize(new Dimension(150, 30)); // Set preferred size

        // Set a custom icon for the selected state
        setSelectedIcon(new CircleIcon(CIRCLE_SIZE, SELECTED_COLOR));

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle radio button selection
            }
        });
    }

    private static class CircleIcon implements Icon {
        private int size;
        private Color color;

        public CircleIcon(int size, Color color) {
            this.size = size;
            this.color = color;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            g.setColor(color);
            g.fillOval(x, y, size, size);
        }

        @Override
        public int getIconWidth() {
            return size;
        }

        @Override
        public int getIconHeight() {
            return size;
        }
    }
}

class SimpleCustomRadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Custom RadioButton Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CustomRadioButton customRadioButton = new CustomRadioButton("Custom RadioButton");

        JPanel panel = new JPanel();
        panel.add(customRadioButton);

        frame.getContentPane().add(panel);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}