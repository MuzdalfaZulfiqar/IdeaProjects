import java.util.Scanner;

public class careerC {

        private static String name,name1,firstName,lastName,userName="";
        private static String email = "";
        private static String address = "";
        private static String phone = "";
        private static String skills,languages,education, counsellingHistory = "";
        private static String gender;
        private static String CNIC;
        private static String personalityType;
        private static String phoneNumber;
        private static int age;
        private static String hobbies;
        private static String qualification1;
        private  static String interest;

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
                if (action == 0)
                {
                    counseleeProfile();

                }
                else
                {

                }


            }// if ends here
            else
            {
                account();
                System.out.println("Enter 0 to make your profile.\nEnter 1 to view counselee's profile");
                int action = input.nextInt();
                if (action == 0)
                {
                    counsellorProfile();
                }//if ends here

                else
                {


                }// else ends here


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
            boolean firstCheck = true;
            while (firstCheck)
            {
                for (int i =0;i<firstName.length();i++){
                    char ch = firstName.charAt(i);
                    if (Character.isLetter(ch)){
                        firstCheck = false;
                    }// if ends here
                    else{
                        System.out.println("Invalid input,Enter again:");
                        firstName = input.nextLine();
                    }// else ends here
                }// for loop ends here
            }//while ends here


            System.out.print("Enter your last name: ");
            lastName = input.nextLine();
            boolean lastCheck = true;
            while (lastCheck){
                for (int i =0;i<lastName.length();i++){
                    char ch = lastName.charAt(i);
                    if (Character.isLetter(ch)){
                        lastCheck = false;
                    }// if ends here
                    else{
                        System.out.println("Invalid input,Enter again:");
                        lastName = input.nextLine();
                    }// else ends here
                }// for loop ends here
            }//while ends here
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
            String password = input.nextLine();
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
                String emailConfirm = input.nextLine();
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
            String pass = input.nextLine();
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
            String [][] counselor = new String[7][5];
            for (int i = 0;i<7;i++){
                for(int j=0;j<5;j++){
                    counselor[i][j]=null;

                    System.out.println("             _____________|Make your Profile|____________");
                    System.out.println("     ___|PERSONAL INFORMATION|___    ");

                    System.out.println("Name;");
                    name1 = counselor[0][0] = input.nextLine();

                    System.out.print("Address(Must have street no,city,zip code):");
                    address =counselor[0][1] = input.nextLine();

                    System.out.print("Phone(03XX-XXXXXXX):");
                    phone = input.nextLine();
                    boolean phoneCheck = true;
                    while(phoneCheck)
                    {
                        if (phone.length()==12 && phone.charAt(0)== '0' && (phone.charAt(1)=='3') && ((phone.charAt(2)=='0')
                                || phone.charAt(2)=='1' || phone.charAt(2)=='2' || phone.charAt(2)=='3'
                                || phone.charAt(2)=='4' || phone.charAt(2)=='5' || phone.charAt(2)=='6') &&
                                phone.charAt(4)=='-')
                        {
                            phoneCheck=false;
                        }// if ends here
                        else
                        {
                            System.out.println("Invalid phone number.\nEnter again: ");
                            phone = input.nextLine();
                        }//else ends here
                    }// while ends here

                }
            }






            System.out.println("Your CNIC:");
            CNIC = input.nextLine();
            boolean checkCnic=true;
            while (checkCnic) {
                if(CNIC.length() == 15 && Character.isDigit(CNIC.charAt(0)) &&
                        Character.isDigit(CNIC.charAt(1)) && Character.isDigit(CNIC.charAt(2)) &&
                        Character.isDigit(CNIC.charAt(3)) && Character.isDigit(CNIC.charAt(4)) &&
                        (CNIC.charAt(5)) == '-' && Character.isDigit(CNIC.charAt(6)) &&
                        Character.isDigit(CNIC.charAt(7)) && Character.isDigit(CNIC.charAt(8)) &&
                        Character.isDigit(CNIC.charAt(9)) && Character.isDigit(CNIC.charAt(10)) &&
                        Character.isDigit(CNIC.charAt(11)) && Character.isDigit(CNIC.charAt(12)) &&
                        (CNIC.charAt(13))=='-' &&  Character.isDigit(CNIC.charAt(14))){


                    checkCnic = false;

                } // if ends here

                else
                {
                    System.out.println("Invalid CNIC, Enter your CNIC again");
                    CNIC = input.nextLine();

                }  // else ends here
            } // while ends here


            System.out.println();
            System.out.println("_____|SKILLS|        ");
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
                }// for loop ends here
            }// while loop ends here


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
                }// for loop ends here
            }// while loop ends here

            System.out.println();
            System.out.println(" ____|EDUCATION|         ");
            System.out.println("Make sure to give double spaces:");
            education = input.nextLine();
            boolean eduCheck = true;
            while(eduCheck)
            {
                for (int i =0;i<skills.length();i++)
                {
                    char ch = skills.charAt(i);
                    if(Character.isLetter(ch) || ch == ' '){
                        eduCheck = false;
                    }
                    else{
                        System.out.println("Invalid input.Enter again:");
                        education = input.nextLine();
                    }
                }// for loop ends here
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
                }// for loop ends here
            }// while loop ends here

            System.out.println("Press enter to view your profile:");
            viewMyProfile();

        }// method ends here
        public static void viewMyProfile()

        {

            System.out.println();
            System.out.println("_______________________________________________");
            System.out.println("              "+firstName.toUpperCase()+" "+lastName.toUpperCase()+"\n\n"+
                    "     ___|PERSONAL INFORMATION|___ \n"+
                    "Address:"+address+"\n"+
                    "Phone:  "+phone+"\n"+
                    "Email:"+email+"\n"+
                    "CNIC: "+CNIC+"\n"+
                    "        ______|SKILLS|______      \n"+
                    skills.replace(" ","   \n")+"\n"+
                    "         ___|LANGUAGES|___        \n"+
                    languages.replace(" ","   \n")+"\n"+
                    "        ____|EDUCATION|____       \n"+
                    education.replace("  ","   \n")+"\n"+
                    "        ___|COUNSELLING HISTORY|___       \n"+
                    counsellingHistory.replace("  ","   \n")+"\n");
            System.out.println("_________________________________________________");

        }// method ends here

        public static void counseleeProfile(){
            System.out.println("             _____________|Make your Profile|____________");
            System.out.println("     ___|PERSONAL INFORMATION|___    ");
            String M= "male";
            String F= "female";
            String a="Introvert";
            String b="Extrovert";
            Scanner input = new Scanner(System.in);


            System.out.print("Enter age: ");
            age = input.nextInt();



            System.out.print("Enter your phone number(03XX-XXXXXXX) :");
            phoneNumber=input.next();
            boolean checkNumber = true;
            while (checkNumber) {
                if(phoneNumber.length()==12){
                    checkNumber=false;
                }// if ends here
                else{
                    System.out.println("Invalid phone number,Enter again: ");
                    phoneNumber=input.next();
                }// else ends here

            }// while loop ends here

            System.out.print("Enter M for male or Enter F for female : ");
            gender=input.next().toUpperCase();
            if (gender.equals("M"))
            {
                gender="Male";
            } // if ends here

            else
            {
                gender="Female";

            } //else if ends here


            System.out.print("Enter your CNIC: " );
            CNIC = input.next();
            boolean checkCnic=true;
            while (checkCnic) {
                boolean isValid = CNIC.length() == 15 && Character.isDigit(CNIC.charAt(0)) &&
                        Character.isDigit(CNIC.charAt(1)) && Character.isDigit(CNIC.charAt(2)) &&
                        Character.isDigit(CNIC.charAt(3)) && Character.isDigit(CNIC.charAt(4)) &&
                        (CNIC.charAt(5)) == '-' && Character.isDigit(CNIC.charAt(6)) &&
                        Character.isDigit(CNIC.charAt(7)) && Character.isDigit(CNIC.charAt(8)) &&
                        Character.isDigit(CNIC.charAt(9)) && Character.isDigit(CNIC.charAt(10)) &&
                        Character.isDigit(CNIC.charAt(11)) && Character.isDigit(CNIC.charAt(12)) &&
                        (CNIC.charAt(13))=='-' &&  Character.isDigit(CNIC.charAt(14));
                if (isValid)
                {
                    checkCnic = false;

                } // if ends here

                else
                {
                    System.out.println("Invalid CNIC, Enter your CNIC again");
                    CNIC = input.nextLine();

                }  // else ends here
            } // while ends here

            System.out.println("Your qualification:\n"+
                    "\tEnter 0 for intermediate or Enter 1 for undergraduate level ");
            int option=input.nextInt();
            if(option==0)
            {
                String qualification= "Intermediate";
                System.out.println("Intermediate in:\n"+
                        "\tEnter 0 for Pre-Engineering\n" +
                        "\tEnter 1 for Pre-medical\n" +
                        "\tEnter 2 for Computer Science\n"+
                        "\tEnter 3 for ICOM");
                int interlevel=input.nextInt();
                if(interlevel==0){
                    qualification1="Intermediate in Pre-Engineering";
                }
                else if(interlevel==1){
                    qualification1="Intermediate in Pre-Medical";
                }
                else if(interlevel==2){
                    qualification1="Intermediate in ICS";
                }
                else{
                    qualification1= "Intermediate in ICOM";
                }
            }// if ends here

            else {
                String qualification= "Undergraduate";
                System.out.println("Undergraduate major:\n"+
                        "\tEnter 0 for Physics major \n"
                        + "\tEnter 1 for Biology major\n" +
                        "\tEnter 2 for Computer Science major \n"+
                        "\tEnter 3 for Business major \n"+
                        "\tEnter 4 for chemistry major\n"+
                        "\tEnter 5 for mathematics major\n"+
                        "\tEnter 6 for arts major");
                int interlevel=input.nextInt();
                if(interlevel==0){
                    qualification1="Physics major";
                }
                else if(interlevel==1){
                    qualification1="Biology major";
                }
                else if(interlevel==2){
                    qualification1=" Computer Science major ";
                }
                else if(interlevel==3){
                    qualification1="Business major";
                }
                else if (interlevel==4){
                    qualification1="Chemistry major";
                }
                else if(interlevel==5){
                    qualification1="Mathematics major";
                }
                else{
                    qualification1="Arts major";
                }
            }


            System.out.print("Your personality type(Enter a for introvert or enter b for extrovert): " );
            personalityType=input.next().toLowerCase();
            if(personalityType.equals("a"))
            {
                personalityType="Introvert";
            }
            else{
                personalityType="Extrovert";
            }// else ends here




            System.out.print("Enter your areas of interest eg: biology,physics etc: ");
            interest=input.next();
            boolean interestCheck = true;
            while(interestCheck){
                for (int i =0;i<interest.length();i++){
                    char c = interest.charAt(i);
                    if((c>='a' && c<='z') || (c>='A'&& c<='Z') || c == ' ')
                    {
                        interestCheck = false;
                    }// if ends here
                    else
                    {
                        System.out.println("Invalid input.Enter again:");
                        interest = input.next();
                    }// else ends here
                }// for loop ends here
            }// while loop ends here

            System.out.print("Enter your hobbies(Separated by space): ");
            hobbies=input.nextLine();
            boolean hobbiesCheck=true;
            while(hobbiesCheck){
                for (int i =0;i<hobbies.length();i++){
                    char c = hobbies.charAt(i);
                    if((c>='a' && c<='z') || (c>='A'&& c<='Z') || c == ' ')
                    {
                        hobbiesCheck = false;
                    }// if ends here
                    else
                    {
                        System.out.println("Invalid input.Enter again:");
                        hobbies = input.next();
                    }// else ends here
                }// for loop ends here
            }//while loop ends here



            System.out.println("Press enter to view your profile:");
            viewProfile();

        } // method ends here


        public static void viewProfile(){
            System.out.println();
            System.out.println("_______________________________________________");
            System.out.println("              " + firstName.toUpperCase() +" "+ lastName.toUpperCase() + " " + "\n\n" +
                    "     _|PERSONAL INFORMATION|_ \n" +
                    "Age: " + age + "\n" +
                    "CNIC: " + CNIC + "\n" +
                    "Phone Number: " + phoneNumber + "\n" +
                    "Gender: "+gender + "\n"+
                    "         ___|Hobbies|___        \n" +
                    hobbies.replace(" ","   \n")+"\n"+
                    "        ___|EDUCATION|___       \n" +
                    "Education: " + qualification1 + "\n" +
                    "        ___|Areas of interest|___       \n" +
                    interest.replace(" ","   \n")+"\n"+
                    "        __|Personality Type|__       \n" +
                    "Personality Type: " +personalityType  + "\n");
            System.out.println("_______________________________________________");
        }// method ends here


    }
