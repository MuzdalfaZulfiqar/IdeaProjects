import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.regex.Pattern;

interface Signup {
    boolean signUp();
    void addToFile();
}
class Customer implements Signup, Serializable {

    public static ArrayList<Customer>check = new ArrayList<>();
    private String loginId;
    private String email;
    private String password;
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;
    private String phoneNo;

    private static ArrayList<Customer> customers = new ArrayList<>();
    public Customer(String loginId, String email, String password, LocalDate dateOfBirth, String firstName, String lastName, String phoneNo) {
        this.loginId = loginId;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        check.add(this);

    }
    public String getLoginId() {
        return loginId;
    }
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    //verification methods
    public boolean verifyEmail() {
        String pattern = "^[\\w.-]+@[\\w.-]+\\.[\\w]+$";
        return Pattern.matches(pattern, email);

    }
    public boolean verifyPassword() {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return Pattern.matches(pattern, password);

    }
    public boolean verifyPhone() {
        String pattern = "^\\d{4}-\\d{7}$";
        return Pattern.matches(pattern, phoneNo);
    }

    public boolean verifyDateOfBirth() {
        return dateOfBirth.isBefore(LocalDate.now());
    }

    //file handling
    @Override
    public void addToFile() {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("customers.txt"));
            for(Customer c:check){
                oos.writeObject(c);
            }

        } catch (EOFException e) {
            System.out.println("End of file");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void readCustomer() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("customers.txt"));
            while (true) {
                Customer c=(Customer) ois.readObject();
                customers.add(c);
            }
        } catch (EOFException e) {
            System.out.println("End of file");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        for(Customer c: customers){
            System.out.println(c.toString());
        }
    }


    @Override
    public boolean signUp() {
        if (verifyEmail() && verifyPassword() && verifyPhone() && verifyDateOfBirth()) {
            addToFile();
            return true;
        } else {
            return false;
        }
    }


    public static boolean login(String enteredLoginId, String enteredPassword) {
        //find index of entered login
        for (Customer c : customers) {
            if (c.getLoginId().equalsIgnoreCase(enteredLoginId) && c.getPassword().equals(enteredPassword)) {
                return true;
            }
        }
        return false;
    }

    public void logout() {
        System.out.println("Logging out");
    }
    @Override
    public String toString() {
        return "Customer{" +
                "loginId='" + loginId + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }

//    public static void main(String[] args) {
//        LocalDate d = LocalDate.now();
//        Customer c = new Customer("muz12","muz@gmail.com","123",d,"muz","zul","012345");
////        Customer c1 = new Customer("muz1233","muz@gmail.com","123",d,"muz","zul","012345");
//        c.addToFile();
////        c1.addToFile();
//        c.readCustomer();
//    }

}

 class CustomerGUI implements ActionListener {

    JFrame loginFrame;
    JFrame signUpFrame;
    JPanel loginPanel,leftPanel,rightPanel;
    JTextField userTextField,nameTextField,emailTextField,dobTextField,passwordText,contactTextField,loginTextField;
    JPasswordField passwordTextField;
    JButton loginButton,toSignUpButton,signUpButton,toLoginButton;
    JLabel userLabel,passwordLabel,loginImageLabel,signUpBGLabel,nameLabel,emailLabel,dobLabel,detaiLabel,contactLabel;
    Font myFont = new Font("Cambria",Font.PLAIN,15);
    public CustomerGUI() {
        openLoginFrame();

    }
    private void openLoginFrame(){
        loginFrame = new JFrame("login");
        loginFrame.setSize(400,700);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setLayout(null);

        //user text field and label
        userLabel = new JLabel("Login ID");
        userLabel.setBounds(50,270,80,25);
        userLabel.setFont(myFont);
        userTextField = new JTextField(15);
        userTextField.setBounds(140,270,165,25);
        userTextField.setFont(myFont);
        userTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                validateTextField(userTextField);
            }
        });

        //password text field and label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50,300,80,25);
        passwordLabel.setFont(myFont);
        passwordText = new JTextField(15);
        passwordText.setBounds(140,300,165,25);
        passwordLabel.setFont(myFont);
        //buttons
        loginButton=new JButton("Login");
        loginButton.setBounds(145,350,100,25);
        loginButton.setForeground(Color.white);
        loginButton.setBackground(new Color(10, 168, 106));
        loginButton.setFont(myFont);
        loginButton.addActionListener(this);

        toSignUpButton=new JButton("Don't have an account?");
        toSignUpButton.setBounds(80,390,250,25);
        toSignUpButton.setForeground(Color.white);
        toSignUpButton.setBackground(new Color(150, 146, 146));
        toSignUpButton.setFont(myFont);
        toSignUpButton.addActionListener((ActionListener) this);

        //image label
        ImageIcon icon = new ImageIcon("green.png");
        loginImageLabel = new JLabel(icon);
        loginImageLabel.setBounds(95, 20, 220, 220);
        //panels
        loginPanel = new JPanel();
        loginPanel.setBounds(0,0,450,500);
        loginPanel.add(userLabel);
        loginPanel.add(userTextField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordText);
        loginPanel.add(loginButton);
        loginPanel.add(toSignUpButton);
        loginPanel.setBackground(Color.white);
        loginPanel.setLayout(null);

        //frames
        loginFrame.add(loginImageLabel);
        loginFrame.add(loginPanel);
        loginFrame.setSize(450,500);
        loginFrame.setVisible(true);
    }

    public void validateTextField(JTextField userTextField){
//        if(Customer.login()){
//
//        }
//        else{
//
//        }
    }


    private void openSignupFrame(){
        signUpFrame = new JFrame("Sign Up");
        signUpFrame.setSize(700,550);


        //labels
        ImageIcon image = new ImageIcon("bg.png");
        signUpBGLabel = new JLabel(image);
        leftPanel= new JPanel();
        leftPanel.setBounds(0,12,275,476);
        leftPanel.add(signUpBGLabel);
        leftPanel.setBackground(new Color(209, 215, 229));

        rightPanel= new JPanel();
        rightPanel.setBounds(300,0,400,476);
        rightPanel.setBackground(new Color(209, 215, 229));

        detaiLabel = new JLabel("Please enter the following details ");
        detaiLabel.setBounds(300,25,260,25);
        detaiLabel.setFont(myFont);

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(300,70,80,25);
        nameLabel.setFont(myFont);
        nameTextField = new JTextField(15);
        nameTextField.setBounds(400,70,170,25);
        nameTextField.setFont(myFont);

        emailLabel = new JLabel("Email");
        emailLabel.setBounds(300,110,80,25);
        emailLabel.setFont(myFont);
        emailTextField = new JTextField(15);
        emailTextField.setBounds(400,110,170,25);
        emailTextField.setFont(myFont);

        userLabel = new JLabel("Username");
        userLabel.setBounds(300,150,80,25);
        userLabel.setFont(myFont);
        userTextField = new JTextField(15);
        userTextField.setBounds(400,150,170,25);
        userTextField.setFont(myFont);

        //password
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(300,190,80,25);
        passwordLabel.setFont(myFont);
        passwordText = new JTextField(15);
        passwordText.setBounds(400,190,170,25);
        passwordLabel.setFont(myFont);

        dobLabel = new JLabel("DOB");
        dobLabel.setBounds(300,230,80,25);
        dobLabel.setFont(myFont);
        dobTextField = new JTextField(15);
        dobTextField.setBounds(400,230,170,25);
        dobLabel.setFont(myFont);

        contactLabel = new JLabel("Contact No.");
        contactLabel.setBounds(300,270,80,25);
        contactLabel.setFont(myFont);
        contactTextField = new JTextField(15);
        contactTextField.setBounds(400,270,170,25);
        contactLabel.setFont(myFont);

        signUpButton=new JButton("Signup");
        signUpButton.setBounds(400,360,100,25);
        signUpButton.setForeground(Color.white);
        signUpButton.setBackground(new Color(10, 168, 106));
        signUpButton.setFont(myFont);
        signUpButton.addActionListener(this);

        toLoginButton=new JButton("Already have an account?");
        toLoginButton.setBounds(330,410,250,25);
        toLoginButton.setForeground(Color.white);
        toLoginButton.setBackground(new Color(133, 132, 130));
        toLoginButton.setFont(myFont);
        toLoginButton.addActionListener(this);

        rightPanel.add(detaiLabel);
        rightPanel.add(nameLabel);
        rightPanel.add(nameTextField);
        rightPanel.add(emailLabel);
        rightPanel.add(emailTextField);
        rightPanel.add(userLabel);
        rightPanel.add(userTextField);
        rightPanel.add(passwordLabel);
        rightPanel.add(passwordText);
        rightPanel.add(dobLabel);
        rightPanel.add(dobTextField);
        rightPanel.add(contactLabel);
        rightPanel.add(contactTextField);
        rightPanel.add(signUpButton);
        rightPanel.add(toLoginButton);
        rightPanel.setLayout(null);


        signUpFrame.add(leftPanel);
        signUpFrame.add(rightPanel);
        signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signUpFrame.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == signUpButton){
            String loginId = userTextField.getText();
            String email = emailTextField.getText();
            String password = passwordText.getText();
            LocalDate dob = null;

//            try {
//                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//                dob = LocalDate.parse(dobTextField.getText(), formatter);
//            } catch (DateTimeParseException ex) {
//                JOptionPane.showMessageDialog(signUpFrame, "Invalid date format. Please enter date in yyyy-MM-dd format.");
//                return; // Exit the method if the date is not valid
//            }

            String name = nameTextField.getText();
            String contact = contactTextField.getText();
            Customer c = new Customer(loginId,email,password,dob,name,"",contact);
            boolean isValidEmail = c.verifyEmail();
            boolean isValidPassword = c.verifyPassword();
            boolean isValidPhone = c.verifyPhone();
            boolean isValidDateOfBirth = c.verifyDateOfBirth();
            if (isValidEmail && isValidPassword && isValidPhone && isValidDateOfBirth) {
                // Set the text field to green
                emailTextField.setBackground(Color.GREEN);
                passwordText.setBackground(Color.GREEN);
                contactTextField.setBackground(Color.GREEN);
                dobTextField.setBackground(Color.GREEN);
                c.signUp();
                JOptionPane.showMessageDialog(signUpFrame, "You are signed in");
            }
            else{
                JOptionPane.showMessageDialog(signUpFrame, "Please enter valid information");
            }
        }

        if(e.getSource()==toSignUpButton){
            openSignupFrame();
            loginFrame.dispose();
        }
        if(e.getSource()==toLoginButton){
            openLoginFrame();
            signUpFrame.dispose();
        }
        if(e.getSource()==loginButton){
            String enteredLoginId = userTextField.getText();
            String enteredPassword = passwordText.getText();

            if (Customer.login(enteredLoginId, enteredPassword)) {
                JOptionPane.showMessageDialog(loginFrame, "Login successful!");
            }
            else {
                JOptionPane.showMessageDialog(loginFrame, "Invalid login credentials. Please check and try again.");
            }

        }
//        if(e.getSource()==loginButton || e.getSource()==signUpButton){
//            //add hadia class method
//        }


    }
    public static void main(String[] args) {
        new CustomerGUI();
    }
}