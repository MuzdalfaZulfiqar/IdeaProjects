import java.util.Scanner;

public class careerCounselling {
    private static String name,firstName,lastName,userName="";

    private static String email = "";
    private static String emailConfirm="";
    private static String password="";
    private static String pass = "";
    private static String address = "";
    private static String phone = "";
    private static String skills,languages,education, counsellingHistory = "";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_____________________|Welcome to counselling Master|_______________________");
        System.out.print("Are you a counsellor or counselee?" +
                "\n\t\t\tEnter 1 for counsellor, Enter 0 for counselee: ");
        int option = input.nextInt();
        if (option == 0)
        {
            account();
            System.out.println("Enter 0 to make your profile\nEnter 1 to view counselor's profile");
            int action = input.nextInt();
            if (action == 0){

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
        System.out.println("______|SKILLS|        ");
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
        System.out.println(" ____|EDUCATION|         ");
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

        System.out.println("");
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
}