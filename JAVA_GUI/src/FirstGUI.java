
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//
//public class FirstGUI  extends  JFrame implements ActionListener {
//
//    public void actionPerformed(ActionEvent event){
//        // When button will be clicked this code will be executed
//        JOptionPane.showMessageDialog(this,"Program is executing...");
//        // null will display in middle
//        System.exit(0);
//    }
//    public FirstGUI(){
//        setSize(500,500);
//        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JButton button1 = new JButton("EXIT");
//        button1.setBackground(Color.pink);
//        super.add(button1);
//        button1.addActionListener(this);
//    }
//    public static void main(String[] args) {
//
//        FirstGUI gui = new FirstGUI();
//        gui.setVisible(true);
//    }
//}// class ends here

class AddressFrame extends JFrame {
    AddressFrame() {
        // Load the image using ImageIcon
        ImageIcon backgroundImageIcon = new ImageIcon("download (1).jfif");

        // Create a JLabel with the image
        JLabel backgroundLabel = new JLabel(backgroundImageIcon);

        // Set layout to null to manually position components
        backgroundLabel.setLayout(null);

        // Defining JLabels and JTextFields
        JLabel house, street, code, city;
        JTextField cityField, streetField, codeField, houseField;

        // Making a label for house
        house = new JLabel();
        house.setBounds(95, 40, 90, 20);
        house.setText("House No:");
        house.setFont(new Font("TimesRoman", Font.BOLD, 14));
        // Adding a textField
        houseField = new JTextField();
        houseField.setPreferredSize(new Dimension(350, 60));
        houseField.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        houseField.setForeground(new Color(0x111113));
        houseField.setBounds(200, 40, 190, 28);
        houseField.setBackground(Color.white);
        // Adding label and textField to backgroundLabel
        backgroundLabel.add(house);
        backgroundLabel.add(houseField);

        // Making a label for street
        street = new JLabel();
        street.setBounds(95, 80, 70, 20);
        street.setText("Street No:");
        street.setFont(new Font("TimesRoman", Font.BOLD, 14));
        // Adding a textField
        streetField = new JTextField();
        streetField.setPreferredSize(new Dimension(350, 60));
        streetField.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        streetField.setForeground(new Color(0x111113));
        streetField.setBounds(200, 80, 190, 28);
        streetField.setBackground(Color.white);
        // Adding label and textField to backgroundLabel
        backgroundLabel.add(street);
        backgroundLabel.add(streetField);

        // Making a label for zip code
        code = new JLabel();
        code.setText("Zip Code:");
        code.setBounds(95, 120, 70, 20);
        code.setFont(new Font("TimesRoman", Font.BOLD, 14));
        // Adding a textField
        codeField = new JTextField();
        codeField.setPreferredSize(new Dimension(350, 60));
        codeField.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        codeField.setForeground(new Color(0x111113));
        codeField.setBounds(200, 120, 190, 28);
        codeField.setBackground(Color.white);
        // Adding label and textField to backgroundLabel
        backgroundLabel.add(code);
        backgroundLabel.add(codeField);

        // Making a label for city
        city = new JLabel();
        city.setText("City:");
        city.setBounds(95, 160, 70, 20);
        city.setFont(new Font("TimesRoman", Font.BOLD, 14));
        // Adding a textField
        cityField = new JTextField();
        cityField.setPreferredSize(new Dimension(350, 60));
        cityField.setFont(new Font("TimesRoman", Font.PLAIN, 14));
        cityField.setForeground(new Color(0x111113));
        cityField.setBounds(200, 160, 190, 28);
        cityField.setBackground(Color.WHITE);
        // Adding label and textField to backgroundLabel
        backgroundLabel.add(city);
        backgroundLabel.add(cityField);

        // Frame
        this.setTitle("Address");
        this.setSize(1000,1000);
        this.setResizable(false);
        this.setVisible(true);
        this.add(backgroundLabel);
        this.setIconImage(backgroundImageIcon.getImage());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        AddressFrame f = new AddressFrame();
    }
}
