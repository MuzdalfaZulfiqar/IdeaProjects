import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.*;
import java.util.Scanner;

public class cs {
    private static String name="";
    private static String email;
    private static String address;
    private static String phone= "";
    private static String skills,languages,education, counsellingHistory = "";
    private static String gender,CNIC,personalityType,phoneNumber,hobbies,interest,qualification1;
    private static int age;

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("*******************************************************************************************************************\n"
                    +"                                      *********        *********                              \n"+
                    "                                      *********        *********                              \n"+
                    "                                      **               **                                     \n"+
                    "                                      **  CAREER       **   COUNSELLING                       \n"+
                    "                                      **               **                                     \n"+
                    "                                      *********        *********                              \n"+
                    "                                      *********        *********                              \n"+
                    "*********************************************************************************************************************");
            System.out.println("                                                      Made by:                                                      ");
            System.out.println( "                                MUZDALFA ZULFIQAR                        SABEEN IRFAN                               ");
            System.out.println("_____________________________________________________________________________________________________________________");

            System.out.println("Enter" + "\n\t1. If you are counselee\n\t2. If you are counsellor ");
            int option = input.nextInt();
            if (option == 1) {
                System.out.println("Enter:");
                System.out.println("1. To make account\n"+
                        "2. To login to your account\n");
                int optionA = input.nextInt();
                if (optionA == 1){
                    account(); // Calling the function
                }// if ends here
                else{
                    System.out.println("First you need to make an account,Enter 0 to make account:");
                    input.nextInt();
                    account();
                }// else ends here/
                System.out.println("Enter:\n1. To make your profile\n2. To view counselor's profile");
                int action = input.nextInt();
                if (action == 1) {
                    counseleeProfile();
                }
                else
                {
                    viewCounselorList();
                }
            }// if ends here
            else {
                System.out.println("CHOOSE:");
                System.out.println("1. To make account\n"+
                        "2. To login to your account------>You cannot login without making account\n");
                int optionA1 = input.nextInt();
                if (optionA1 == 1){
                    account();
                }
                else{
                    System.out.println("First you need to make account, Enter 0 to make account: ");
                    input.nextInt();
                    account();
                }
                System.out.println("Enter:\n 1. To make your profile.");
                int actionA = input.nextInt();
                if (actionA == 1) {
                    counsellorProfile();
                }//if ends here
            }// else ends here
        }// main ends here
        /* .............................................Method to make account......................................... */
        public static void  account()
        {
            System.out.println("                                                     *************************                                                                   ");
            System.out.println("___________________________________________________  **  MAKE YOUR ACCOUNT  **  _____________________________________________________");
            System.out.println("                                                     *************************                                                                   ");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your first name: ");
            String firstName = input.nextLine();
            boolean firstCheck = true;
            while (firstCheck){
                for (int i = 0; i< firstName.length(); i++){
                    char ch = firstName.charAt(i);
                    if (Character.isLetter(ch) && !Character.isDigit(ch)){
                        firstCheck = false;
                    }// if ends here
                    else{
                        System.out.println("Invalid input,Enter again:");
                        firstName = input.nextLine();
                    }// else ends here
                }// for loop ends here
            }//while ends here

            System.out.print("Enter your last name: ");
            String lastName = input.nextLine();
            boolean lastCheck = true;
            while (lastCheck){
                for (int i = 0; i< lastName.length(); i++){
                    char ch = lastName.charAt(i);
                    if (Character.isLetter(ch) && !Character.isDigit(ch)){
                        lastCheck = false;
                    }// if ends here
                    else{
                        System.out.print("Invalid input,Enter again:");
                        lastName = input.nextLine();
                    }// else ends here
                }// for loop ends here
            }//while ends here

            name = firstName.toUpperCase()+" "+ lastName.toUpperCase();


            try{
                FileOutputStream myAccount = new FileOutputStream("accountFile.txt");
                PrintStream writeAccount = new PrintStream(myAccount);
                System.out.println("Enter username (Note: Your username can have 6 to 12 characters(including Letters,Numbers,Dash(-),Period(.),Underscore(_),At(@),plus(+)))");
                String loginName = input.nextLine(); // Taking input for username
                boolean nameCheck = true;
                while(nameCheck){
                    if(loginName.length()>=6 && loginName.length()<=12) {
                        for(int i = 0; i< loginName.length(); i++){
                            char ch = loginName.charAt(i);
                            if (Character.isLetterOrDigit(ch) || ch == '@' ||
                                    ch =='_' || ch == '.' || ch =='-' || ch=='+'){
                                nameCheck = false;
                            }
                            else{
                                System.out.print("Your entered character is not meeting conditions.\nEnter again: ");
                                loginName = input.nextLine();
                            }
                        }// for loop ends here
                    }// if ends here
                    else{
                        System.out.print("Username must have 6 to 12 characters.\n"+"Enter again: ");
                        loginName = input.nextLine();
                    }
                }// while ends here

                System.out.print("Enter your email address: ");
                email = input.nextLine();
                boolean emailCorrect = true;
                while(emailCorrect) {
                    if(email.endsWith("@gmail.com")){
                        emailCorrect = false;
                    }// if ends here
                    else {
                        System.out.print("Invalid email. Enter again:");
                        email = input.nextLine();
                    }// else ends here
                }// while loop ends here

                System.out.print("Enter your password(At least 8 characters): ");
                String password = input.nextLine();
                boolean passCheck = true;
                while(passCheck) {
                    if (password.length()>=8) {
                        passCheck = false;
                    }// if ends here
                    else {
                        System.out.print("Your password must have at least 8 characters, Enter again:");
                        password = input.nextLine();
                    }// else ends here
                }// while ends here


                writeAccount.println(loginName);
                writeAccount.println(email);
                writeAccount.println(password);
            }catch(Exception e){
            System.out.println(e.toString());
        }


            System.out.println("                                 ");
            System.out.println("Your account has been created........"); System.out.println();
            System.out.println("______________________________________________________________________________________________________________________________________");
            System.out.println("Press 0 to login to your account\n");
            int option1 = input.nextInt();
            login();// Calling the login function
        }
        /*.............................................Method to login to the account........................................ */
        public static void login(){
            System.out.println("                                                  *************************                                                                   ");
            System.out.println("__________________________________________________  **  LOGIN TO ACCOUNT   **  ______________________________________________________");
            System.out.println("                                                  *************************                                                                   ");
            Scanner input = new Scanner(System.in);

            try{
                File myLogin = new File ("accountFile.txt");
                Scanner readLogin = new Scanner(myLogin);
                while(readLogin.hasNext()){
                    String logName =  readLogin.nextLine();
                    String eMail = readLogin.nextLine();
                    String passWord = readLogin.nextLine();
                    

                    System.out.print("You want to Login with:\n" + "\t1. Username.\n"+ "\t2. Email: ");
                    int choice = input.nextInt();
                    input.nextLine();
                    if (choice == 1) {
                        System.out.print("Enter username: ");
                        String userName = input.nextLine();
                        boolean user = true;
                        while(user) {
                            if(userName.equals(logName)){
                                user = false;
                            }// if ends here
                            else{
                                System.out.print("Your username is wrong, Enter again: ");
                                userName = input.nextLine();
                            }//else ends here
                        }// while ends here
                    }// if ends here
                    else {
                        System.out.print("Enter your email address: ");
                        String emailConfirm = input.nextLine();
                        boolean emailCheck = true;
                        while(emailCheck){
                            if (emailConfirm.equals(eMail)) {
                                emailCheck = false;
                            }// if ends here
                            else {
                                System.out.print("This email is wrong, Enter again:");
                                emailConfirm = input.nextLine();
                            }// else ends here
                        }// while ends here
                    }// else ends here

                    System.out.print("Enter password: ");
                    String pass = input.nextLine();
                    input.nextLine();
                    boolean word = true;
                    while(word) {
                        if (pass.equals(passWord)) {
                            System.out.println("You are successfully logged in..");
                            System.out.println();
                            System.out.println("_____________________________________________________________________________________________________________________________________");
                            word = false;
                        } // if ends here
                        else {
                            System.out.print("Your password is wrong.\nEnter again:");
                            pass = input.nextLine();
                        }// else ends here
                    }// while ends here



                }
            }catch(Exception e){
                System.out.println(e.toString());
            }


        }// method account() ends here
        /*..........................Method to make profile of counsellor......................................*/

        public static void counsellorProfile() {
            Scanner input = new Scanner(System.in);
            System.out.println("                                            *************************                                                                   ");
            System.out.println("__________________________________________  **  MAKE YOUR PROFILE  **  _____________________________________________________________");
            System.out.println("                                            *************************                                                                   ");

            try{
                FileOutputStream myProfile = new FileOutputStream("myProfileFile.txt");
                PrintStream writeProfile = new PrintStream(myProfile);

                System.out.println("______|PERSONAL INFORMATION|    ");
                System.out.print("Address(Must have street no,city,zip code):");
                String address = input.nextLine();

                System.out.print("Phone(03XX-XXXXXXX):");
                String phone = input.nextLine();
                boolean phoneCheck = true;
                while(phoneCheck) {
                    if (phone.length()==12 && phone.charAt(0)== '0' && (phone.charAt(1)=='3') && ((phone.charAt(2)=='0') || phone.charAt(2)=='1' || phone.charAt(2)=='2' || phone.charAt(2)=='3'
                            || phone.charAt(2)=='4' || phone.charAt(2)=='5' || phone.charAt(2)=='6') && phone.charAt(4)=='-' &&
                            Character.isDigit(phone.charAt(5) ) && Character.isDigit(phone.charAt(6)) && Character.isDigit(phone.charAt(7)) && Character.isDigit(phone.charAt(8))
                            && Character.isDigit(phone.charAt(9)) && Character.isDigit(phone.charAt(10)) && Character.isDigit(phone.charAt(11))) {
                        phoneCheck=false;
                    }// if ends here
                    else {
                        System.out.println("Invalid phone number.\nEnter again: ");
                        phone = input.nextLine();
                    }//else ends here
                }// while ends here

                System.out.println();
                System.out.println("_____|SKILLS|        ");
                System.out.println("Make sure to give double spaces");
                String skills = input.nextLine();
                boolean skillsCheck =  true;
                while(skillsCheck){
                    for (int i = 0; i< skills.length(); i++){
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
                System.out.println("_____|LANGUAGES|          ");
                System.out.println("Enter languages separated by space");
                String languages = input.nextLine();
                boolean langCheck = true;
                while(langCheck){
                    for (int i =0;i<languages.length();i++){
                        char ch = languages.charAt(i);
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
                System.out.println("_____|EDUCATION|         ");
                System.out.println("Make sure to give double spaces:");
                String education = input.nextLine();
                boolean eduCheck = true;
                while(eduCheck) {
                    for (int i =0;i<education.length();i++) {
                        char ch = education.charAt(i);
                        if(Character.isLetter(ch) || ch == ' '){
                            eduCheck = false;
                        }// if ends here
                        else{
                            System.out.println("Invalid input.Enter again:");
                            education = input.nextLine();
                        }// else ends here
                    }// for loop ends here
                }// while ends here

                System.out.println();
                System.out.println("_____|COUNSELLING HISTORY|        ");
                System.out.println("Make sure to give double spaces ");
                String counsellingHistory = input.nextLine();
                boolean counsellingCheck = true;
                while(counsellingCheck){
                    for (int i =0;i<counsellingHistory.length();i++){
                        char ch = counsellingHistory.charAt(i);
                        if(Character.isLetter(ch) || ch==' '){
                            counsellingCheck= false;
                        }
                        else{
                            System.out.println("Invalid input.Enter again:");
                            counsellingHistory = input.nextLine();
                        }
                    }// for loop ends here
                }// while loop ends here
                writeProfile.println(address);
                writeProfile.println(phone);
                writeProfile.println(skills);
                writeProfile.println(languages);
                writeProfile.println(education);
                writeProfile.println(counsellingHistory);
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
            
            System.out.println("_____________________________________________________________________________________________________________________________________");

            System.out.println("Enter 0 to view your profile:");
            input.nextInt();
            viewCounsellorProfile();
        }// method ends here

        /*....................................Method to view profile of counselor...........................................*/
        public static void viewCounsellorProfile() {
            
            try{
                File displayProfile = new File("myProfileFile.txt");
                Scanner readProfile  =new Scanner(displayProfile);
                while(readProfile.hasNext()){
                    String location = readProfile.nextLine();
                    String call = readProfile.nextLine();
                    String skill = readProfile.nextLine();
                    String langs = readProfile.nextLine();
                    String edu = readProfile.nextLine();
                    String history = readProfile.nextLine();


                    System.out.println();
                    System.out.println("_____________________________________________________________________________________________________________________________________");
                    System.out.println("              "+name+"\n\n"+
                            "     **************************\n"+
                            "     ** PERSONAL INFORMATION ** \n"+
                            "     **************************\n"+
                            "Address:"+location+"\n"                +
                            "Phone:  "+call+"\n"                  +
                            "Email:"+email+"\n"                    + "\n"+
                            "         *******************    \n"+
                            "         **    SKILLS     **    \n"+
                            "         *******************    \n"+
                            skill.replace("  ","   \n")+"\n\n"+
                            "         *******************    \n"+
                            "         **   LANGUAGES   **    \n"+
                            "         *******************    \n"+
                            langs.replace(" ","   \n")+"\n\n"+
                            "         *******************    \n"+
                            "         **   EDUCATION   **    \n"+
                            "         *******************    \n"+
                            edu.replace("  ","   \n")+"\n\n"+
                            "     **************************  \n"+
                            "     **  COUNSELLING HISTORY **       \n"+
                            "     **************************  \n"+
                            history.replace("  ","   \n")+"\n");
                    System.out.println("_____________________________________________________________________________________________________________________________________");

                }
            }catch(Exception e){
                System.out.println(e.toString());
            }
            
        }// method ends here

        /*..........................................Method to make profile of counselee.............................................*/
        public static void counseleeProfile(){
            System.out.println("                                            *************************                                                                   ");
            System.out.println("__________________________________________  **  MAKE YOUR PROFILE  **  _____________________________________________________________");
            System.out.println("                                            *************************                                                                   ");
            System.out.println("_____|PERSONAL INFORMATION|    ");
            String M= "male";  String F= "female";
            String a="Introvert"; String b="Extrovert";
            Scanner input = new Scanner(System.in);
            System.out.print("Enter age: ");
            age = input.nextInt();

            System.out.print("Enter your phone number(03XX-XXXXXXX) :");
            phoneNumber=input.next();
            boolean checkNumber = true;
            while (checkNumber) {
                if(phoneNumber.length()==12 && phoneNumber.charAt(0)=='0' && phoneNumber.charAt(1)=='3' && (phoneNumber.charAt(2)=='0' ||
                        phoneNumber.charAt(2)=='1' || phoneNumber.charAt(2)=='2' || phoneNumber.charAt(2)=='3' || phoneNumber.charAt(2)=='4'
                        || phoneNumber.charAt(2)=='5'|| phoneNumber.charAt(2)=='6') && phoneNumber.charAt(4)=='-'  && Character.isDigit(phoneNumber.charAt(5))
                        && Character.isDigit(phoneNumber.charAt(6)) && Character.isDigit(phoneNumber.charAt(7)) && Character.isDigit(phoneNumber.charAt(8))
                        && Character.isDigit(phoneNumber.charAt(9))) {
                    checkNumber=false;
                }// if ends here
                else{
                    System.out.println("Invalid phone number,Enter again: ");
                    phoneNumber=input.next();
                }// else ends here
            }// while loop ends here

            System.out.print("Your gender:Enter M for male or Enter F for female : ");
            gender=input.next().toUpperCase();
            if (gender.equals("M")) {
                gender="Male";
            } // if ends here
            else {
                gender="Female";
            } //else if ends here

            System.out.print("Enter your CNIC: " );
            CNIC = input.next();
            boolean checkCnic=true;
            while (checkCnic) {
                boolean isValid = CNIC.length() == 15   &&   Character.isDigit(CNIC.charAt(0))    &&   Character.isDigit(CNIC.charAt(1))
                        && Character.isDigit(CNIC.charAt(2)) && Character.isDigit(CNIC.charAt(3)) && Character.isDigit(CNIC.charAt(4)) &&
                        (CNIC.charAt(5)) == '-' &&  Character.isDigit(CNIC.charAt(6))  &&  Character.isDigit(CNIC.charAt(7))  &&
                        Character.isDigit(CNIC.charAt(8)) && Character.isDigit(CNIC.charAt(9)) && Character.isDigit(CNIC.charAt(10)) &&
                        Character.isDigit(CNIC.charAt(11)) && Character.isDigit(CNIC.charAt(12)) && (CNIC.charAt(13))=='-'
                        &&  Character.isDigit(CNIC.charAt(14));
                if (isValid) {
                    checkCnic = false;
                } // if ends here
                else {
                    System.out.println("Invalid CNIC, Enter your CNIC again");
                    CNIC = input.next();
                }  // else ends here
            } // while ends here

            System.out.println("Your qualification:\n"+ "\tEnter 0 for intermediate.\n\tEnter 1 for undergraduate level ");
            int option=input.nextInt();
            if(option==0)
            {
                String qualification= "Intermediate";
                System.out.println("Intermediate in:\n"+ "\tEnter 0 for Pre-Engineering\n" +
                        "\tEnter 1 for Pre-medical\n" + "\tEnter 2 for Computer Science\n"+
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
                        "\tEnter 0 for Physics major \n" +"\tEnter 1 for Biology major\n" +
                        "\tEnter 2 for Computer Science major \n"+ "\tEnter 3 for Business major \n"+
                        "\tEnter 4 for chemistry major\n"+ "\tEnter 5 for mathematics major\n"+ "\tEnter 6 for arts major");
                int interlevel=input.nextInt();
                input.nextLine();
                if(interlevel==0){
                    qualification1="Physics major";
                }
                else if(interlevel==1){
                    qualification1="Biology major";
                }
                else if(interlevel==2){
                    qualification1="Computer Science major ";
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
            }// else ends here

            System.out.print("Your personality type(Enter a for introvert or enter b for extrovert): " );
            personalityType=input.nextLine().toLowerCase();
            if(personalityType.equals("a")) {
                personalityType="Introvert";
            }
            else{
                personalityType="Extrovert";
            }// else ends here

            System.out.print("Enter your areas of interest eg: biology,physics etc: ");
            interest=input.nextLine();
            boolean interestCheck = true;
            while(interestCheck){
                for (int i =0;i<interest.length();i++){
                    char c = interest.charAt(i);
                    if((c>='a' && c<='z') || (c>='A'&& c<='Z') || c == ' ') {
                        interestCheck = false;
                    }// if ends here
                    else {
                        System.out.println("Invalid input.Enter again:");
                        interest = input.nextLine();
                    }// else ends here
                }// for loop ends here
            }// while loop ends here

            System.out.print("Enter your hobbies(Separated by space): ");
            hobbies=input.nextLine();
            boolean hobbiesCheck=true;
            while(hobbiesCheck){
                for (int i =0;i<hobbies.length();i++){
                    char c = hobbies.charAt(i);
                    if((c>='a' && c<='z') || (c>='A'&& c<='Z') || c == ' ') {
                        hobbiesCheck = false;
                    }// if ends here
                    else {
                        System.out.println("Invalid input.Enter again:");
                        hobbies = input.nextLine();
                    }// else ends here
                }// for loop ends here
            }//while loop ends here

            System.out.println("_____________________________________________________________________________________________________________________________________");
            System.out.println("Press 0 to view your profile:");
            input.nextInt();
            viewCounseleeProfile();
        } // method ends here

        /*.................................Method to view Counselee profile............................................*/
        public static void viewCounseleeProfile(){
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("_____________________________________________________________________________________________________________________________________");
            System.out.println("              " + name + "\n\n" +
                    "     ************************** \n"+
                    "     ** PERSONAL INFORMATION ** \n"+
                    "     ************************** \n"+
                    "Age: " + age + "\n" +
                    "CNIC: " + CNIC + "\n" +
                    "Phone Number: " + phoneNumber + "\n" +
                    "Gender: "+gender + "\n\n"+
                    "      *************************    \n"+
                    "      **   PERSONALITY TYPE  **    \n"+
                    "      *************************    \n"+
                    personalityType  + "\n"+
                    "         *******************      \n"+
                    "         **    SKILLS     **      \n"+
                    "         *******************      \n"+
                    hobbies.replace(" ","   \n")+"\n\n"+
                    "         *******************       \n"+
                    "         **   EDUCATION   **       \n"+
                    "         *******************       \n"+
                    qualification1+"\n"+
                    "    *****************************      \n"+
                    "    **    AREAS OF INTEREST    **      \n"+
                    "    *****************************      \n"+
                    interest.replace(" "," \n"));
            System.out.println("_____________________________________________________________________________________________________________________________________");
            System.out.println("Press 0 to view Counselors available");
            input.nextInt();
            viewCounselorList();
        }// method ends here

        public static void viewCounselorList() {
            Scanner input = new Scanner(System.in);
            String [][] counselor ={{"ALI ASAD","Street 1,DHA blockA,Lahore", "0345-6526272","ali1@gmail.com", "Reading  Painting  Graphic design",
                    "Urdu English Arabic", "MS Psychology  PHD psychology","Education counselling  School Counselling"},
                    {"ASMA ZULFIQAR","Lane2,Street4,Gullberg,Islamabad","0345-6511979", "asma1@gmail.com","Writing  counselling", "Urdu English Turkish",
                            "MS Sociology  PHD Sociology","School counselling  Career Counselling"},
                    {"AMAD ALI","Scotland,London","+44 898 141 1234","Amadali12@gmail.com","Journalising  Strategy Games",
                            "Urdu English Italian","MS Mental Health Counselling  PHD Psychology","Vocational Counselling  Educational Guidance and Counselling"}};
            for (int i = 0;i<counselor.length ;i++){
                name = counselor[i][0]; address = counselor[i][1];
                phone = counselor[i][2];email = counselor[i][3];
                skills = counselor[i][4];
                languages = counselor[i][5]; education = counselor[i][6];
                counsellingHistory= counselor[i][7];
                System.out.println();
                System.out.println("Counsellor-ID:"+(i+1));
                viewCounsellorProfile();
            }// for loop ends here
        }// counselorView() ends here
    }

