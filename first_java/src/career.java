import java.util.Scanner;
public class career {
    private static String name,firstName,lastName,userName="";
    private static String email = "";
    private static String emailConfirm="";
    private static String password="";
    private static String pass = "";
    private static String address = "";
    private static String phone = "";
    private static String skills,languages,education, counsellingHistory = "";
    private static String gender;
    private static String cnic;
    private static String maritalStatus;
    private static String phoneNumber;
    private static int age;
    private static String hobbies;
    private static String answer;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_________________|Welcome to counselling Master|_______________________");
        System.out.print("Are you a counsellor or counselee?" +
                "\n\t\t\tEnter 1 for counsellor, Enter 0 for counselee: ");
        int option = input.nextInt();
        if (option == 0)
        {
            account();
            System.out.println("Enter 0 to make your profile\nEnter 1 to view counselor's profile");
            int action = input.nextInt();
            if (action == 0){
                counseleeProfile();

            }
            else{

            }


        }
        else
        {
            account();
            System.out.println("Enter 0 to make your profile.\nEnter 1 to view counselee's profile");
            int action = input.nextInt();
            if (action == 0){
                counsellorProfile();
            }

            else{


            }


        }// else ends here


    }// main ends here
    public static void  account()
    {
        System.out.println("          ___________________|Create account|__________________");
        Scanner input = new Scanner(System.in);
        name = "";
        email = "";

        System.out.print("Enter your first name: ");
        firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        lastName = input.nextLine();
        System.out.print("Enter username: ");
        name = input.nextLine();
        System.out.print("Enter your email address: ");
        email = input.nextLine();
        boolean emailCorrect = true;
        while(emailCorrect)
        {
            if(email.endsWith("@gmail.com")){
                emailCorrect = false;
            }// if ends here
            else
            {
                System.out.print("Invalid email. Enter again:");
                email = input.nextLine();


            }// else ends here
        }// while loop ends here

        System.out.print("Enter your password(At least 8 characters): ");
        password = input.nextLine();
        boolean passCheck = true;
        while(passCheck)
        {
            if (password.length()>=8)
            {
                passCheck = false;
            }// if ends here
            else
            {
                System.out.print("Your password must have at least 8 characters, Enter again:");
                password = input.nextLine();

            }// else ends here

        }// while ends here

        System.out.println("Your account have been created");



        System.out.println("          _______________|Login to your Account|________________");


        System.out.print("Login with username or email:" +
                "\n\t\tEnter 0 to login with email or Enter 1 to login with username: ");
        int choice = input.nextInt();
        input.nextLine();
        if (choice == 1)
        {
            System.out.print("Enter username: ");
            userName = input.nextLine();
            boolean user = true;
            while(user)
            {

                if(userName.equals(name)){

                    user = false;
                }
                else{
                    System.out.print("Your username is wrong, Enter again: ");
                    userName = input.nextLine();

                }
            }// while ends here

        }// if ends here
        else
        {
            System.out.print("Enter your email address: ");
            emailConfirm = input.nextLine();
            boolean emailCheck = true;
            while(emailCheck){
                if (emailConfirm.equals(email)) {
                    emailCheck = false;
                }// if ends here
                else
                {
                    System.out.print("This email is wrong, Enter again:");
                    emailConfirm = input.nextLine();


                }// else ends here
            }// while ends here

        }// else ends here

        System.out.print("Enter password: ");
        pass = input.nextLine();
        input.nextLine();
        boolean word = true;
        while(word)
        {
            if (pass.equals(password))
            {
                System.out.println("You are successfully logged in..");
                word = false;
            } // if ends here
            else
            {
                System.out.print("Your password is wrong.\nEnter again:");
                pass = input.nextLine();


            }// else ends here

        }// while ends here
    }// method account() ends here


    public static void counsellorProfile()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("             _____________|Make your Profile|____________");
        System.out.println("     ___|PERSONAL INFORMATION|___    ");
        System.out.print("Address:");
        address = input.nextLine();
        System.out.print("Phone:");
        phone = input.nextLine();
        boolean phoneCheck = true;
        while(phoneCheck)
        {
            if (phone.length()==11)
            {
                phoneCheck=false;
            }// if ends here
            else
            {
                System.out.println("Invalid phone number.\nEnter again: ");
                phone = input.nextLine();
            }//else ends here


        }// while ends here
        System.out.println();
        System.out.println("____|SKILLS|        ");
        System.out.println("Enter skills separated by space");
        skills = input.nextLine();
        boolean skillsCheck =  true;
        while(skillsCheck){
            for (int i =0;i<skills.length();i++){
                char ch = skills.charAt(i);
                if(Character.isLetter(ch)|| ch == ' '){
                    skillsCheck = false;
                }
                else{
                    System.out.println("Invalid input.Enter again:");
                    skills = input.nextLine();
                }
            }
        }


        System.out.println();
        System.out.println("___|LANGUAGES|          ");
        System.out.println("Enter languages separated by space");
        languages = input.nextLine();
        boolean langCheck = true;
        while(langCheck){
            for (int i =0;i<skills.length();i++){
                char ch = skills.charAt(i);
                if(Character.isLetter(ch) || ch == ' '){
                    langCheck = false;
                }
                else{
                    System.out.println("Invalid input.Enter again:");
                    languages = input.nextLine();
                }
            }
        }

        System.out.println();
        System.out.println(" __|EDUCATION|         ");
        System.out.println("Make sure to give double spaces:");
        education = input.nextLine();
        boolean eduCheck = true;
        while(eduCheck){
            for (int i =0;i<skills.length();i++){
                char ch = skills.charAt(i);
                if(Character.isLetter(ch) || ch == ' '){
                    eduCheck = false;
                }
                else{
                    System.out.println("Invalid input.Enter again:");
                    education = input.nextLine();
                }
            }
        }// while ends here

        System.out.println();
        System.out.println("___|COUNSELLING HISTORY|        ");
        System.out.println("Make sure to give double spaces ");
        counsellingHistory = input.nextLine();
        boolean counsellingCheck = true;
        while(counsellingCheck){
            for (int i =0;i<skills.length();i++){
                char ch = skills.charAt(i);
                if(Character.isLetter(ch) || ch==' '){
                    counsellingCheck= false;
                }
                else{
                    System.out.println("Invalid input.Enter again:");
                    counsellingHistory = input.nextLine();
                }
            }
        }

        System.out.println("Press enter to view your profile:");
        viewMyProfile();

    }// method ends here
    public static void viewMyProfile()

    {

        System.out.println();
        System.out.println("              "+firstName.toUpperCase()+" "+lastName.toUpperCase()+"\n\n"+
                "     ___|PERSONAL INFORMATION|___ \n"+
                "Address:"+address+"\n"+
                "Phone:  "+phone+"\n"+
                "        ______|SKILLS|______      \n"+
                skills.replace(" ","   \n")+"\n"+
                "         ___|LANGUAGES|___        \n"+
                languages.replace(" ","   \n")+"\n"+
                "        ____|EDUCATION|____       \n"+
                education.replace("  ","   \n")+"\n"+
                "        ___|COUNSELLING HISTORY|___       \n"+
                counsellingHistory.replace("  ","   \n")+"\n");

    }// method ends here


    public static void counseleeProfile(){
        System.out.println(                 "Welcome " + name        );
        String qualification1 = "a";
        String qualification2 = "b";
        String qualification3 = "c";
        String gender1= "male";
        String gender2= "female";
        String cnic;
        String M="married";
        String U= "unmarried";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your qualification");
        System.out.println(" a) Intermediate");
        System.out.println(" b) Undergraduate");
        System.out.println(" c) Graduate");
        String answer = input.next().toLowerCase();
        boolean checkQualification=true;

        if (answer.equals(qualification1)){
            System.out.println("You are an intermediate level");
        }
        else if(answer.equals(qualification2)){
            System.out.println("You are graduate level");
        }
        else if(answer.equals(qualification3)){
            System.out.println("You are graduate level");
        }
        else{
            System.out.println("You are not eligible  for counselling ");
        }

        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.println("Age :" + age);

        System.out.print("Enter gender: ");
        String gender=input.next().toLowerCase();
        boolean checkGender= true;
        while (checkGender){
            if (gender.equals(gender1)) {
                System.out.println("Gender: " + gender);
                checkGender = false;
            } // if ends here

            else if (gender.equals(gender2)) {
                System.out.println("Gender: " + gender);
                checkGender = false;

            } //else if ends here
            else {
                System.out.println("Enter gender again");
                gender = input.next();
                checkGender = true;

            } // else ends here

        }// while ends here

        System.out.println("Enter your cnic");
        cnic = input.next();
        boolean checkCnic=true;
        while (checkCnic) {
            boolean isValid = cnic.length() == 15 && Character.isDigit(cnic.charAt(0)) &&
                    Character.isDigit(cnic.charAt(1)) && Character.isDigit(cnic.charAt(2)) &&
                    Character.isDigit(cnic.charAt(3)) && Character.isDigit(cnic.charAt(4)) &&
                    (cnic.charAt(5)) == '-' && Character.isDigit(cnic.charAt(6)) &&
                    Character.isDigit(cnic.charAt(7)) && Character.isDigit(cnic.charAt(8)) &&
                    Character.isDigit(cnic.charAt(9)) && Character.isDigit(cnic.charAt(10)) &&
                    Character.isDigit(cnic.charAt(11)) && Character.isDigit(cnic.charAt(12)) &&
                    (cnic.charAt(13)) == '-' && Character.isDigit(cnic.charAt(14));
            if (isValid) {
                System.out.println("Valid cnic");
                checkCnic = false;

            } // if ends here

            else {
                System.out.println("Invalid cnic");
                System.out.println("Enter your cnic again");
                cnic = input.next();
                System.out.println("Cnic : " + cnic);

            }  // else ends here

        } // while ends here

        System.out.println("Enter your hobbies");

        String hobbies=input.nextLine();
        System.out.println("Hobbies are: " + hobbies);

        System.out.println("Enter your marital status");
        System.out.println("a) Married");
        System.out.println("b) Unmarried");
        String maritalStatus= input.next();
        boolean checkStatus=true;
        while(checkStatus){
            if(maritalStatus.equals(M)){
                System.out.println("Married");
                checkStatus=false;

            } //if ends here

            else{
                System.out.println("Unmarried");
                System.out.println("Enter your marital status again");
                maritalStatus=input.next();
            }//else ends here

        } //while ends here

        System.out.println("Enter your phone number :");
        String phoneNumber=input.nextLine();
        boolean checkNumber = true;
        while (checkNumber) {
            if (phoneNumber.length() >= 11) {
                System.out.println("Valid phone number");
                checkNumber = false;
            } // if ends here

            else{
                System.out.println("Invalid phone number");
                System.out.println("Enter phone number again");
                phoneNumber = input.next();
            } //else ends here

        } // while ends here

        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Press enter to view your profile:");
        viewMyprofile();

    } // method ends here

    public static void viewMyprofile(){
        System.out.println();
        System.out.println("              " + name.toUpperCase() + " " + "\n\n" +
                "     |PERSONAL INFORMATION| \n" +
                "Age: " + age + "\n" +
                "Phone: " + phone + "\n" +
                "CNIC: " + cnic + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "        |Marital Status|      \n" +
                "Marital Status: " + maritalStatus + "\n" +
                "         |Hobbies|        \n" +
                hobbies.replace(" ", "   \n") + "\n" +
                "        |EDUCATION|       \n" +
                "Education: " + answer + "\n" +
                "        |Gender|       \n" +
                "Gender: " + gender + "\n");
    }// method ends here

}// class ends here
