import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PfProject {
    private static String name="";
    private static String email,firstName,lastName;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("*******************************************************************************************************************\n"+
                "                                      *********        *********                              \n"+
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

        System.out.println("Enter" + "\n\t1. If you are counselee" +
                                    "\n\t2. If you are counsellor ");
        int option = input.nextInt();
        if (option == 1) {

            // ..........................................Account menu
            System.out.println("Enter:");
            System.out.println("\t1. To make account\n"+
                                "\t2. To login to your account(NOTE: You cannot login without making account)\n");
            int optionA = input.nextInt();
            if (optionA == 1){
                account(); // Calling the function
            }// if ends here

            else{
                System.out.println("First you need to make an account,Enter 0 to make account:");
                input.nextInt();
                account(); // method call
            }// else ends here


            // .........................................Profile menu
            System.out.println("Enter:\n\t1. To make your profile" +
                                     "\n\t2. To view list of counsellors available");
            int action = input.nextInt();
            if (action == 1) {
                counseleeProfile();  // Method call
            }// if ends here

            else
            {
                viewCounselorList();// Method call
            }//else ends here

            System.out.println("Enter:\n\t1: To choose medium of counselling" +
                                    " \n\t2: To send request to counsellor");

            int act = input.nextInt();
            if (act ==1){
                chooseMedium();  // Method call
            }//if ends here
            else if(act ==2){
                sendRequest();  // Method call
            }// else if ends here


        }// if ends here

        // ...............................................Counsellor menu............................//
        else {
            System.out.println("Enter :");
            System.out.println("\t1. To make account\n"+
                               "\t2. To login to your account(NOTE: You cannot login without making account)\n");
            int optionA1 = input.nextInt();
            if (optionA1 == 1){
                account(); // Method call
            }
            else{
                System.out.println("First you need to make account,Enter 0 to make account: ");
                input.nextInt();
                account();  // Method call
            }
            System.out.println("Enter:\n\t1. To make your profile");
            int actionA = input.nextInt();
            if (actionA == 1) {
                counsellorProfile();  // Method call
            }//if ends here

            System.out.println("\n\t1. To view request box");
            int actionB = input.nextInt();
            if (actionB ==1){
                requestBox();  // Method call
            }

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
        firstName = input.nextLine();
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
        lastName = input.nextLine();
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

            // Creating a file to write account data

            FileOutputStream myAccount = new FileOutputStream("accountFile.txt");
            PrintStream writeAccount = new PrintStream(myAccount);


            System.out.println("Enter username (Note: Your username can have 6 to 12 characters(including Letters,Numbers," +
                    "Dash(-),Period(.),Underscore(_),At(@),plus(+)))");
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
                String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
                if(Pattern.matches(regexPattern,email)){
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
        }// try ends here
        catch(Exception e){
            System.out.println(e.toString());
        }// catch ends here


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

            // Reading data from account file

            File myLogin = new File ("accountFile.txt");
            Scanner readLogin = new Scanner(myLogin);


            while(readLogin.hasNext()){
                String logName =  readLogin.nextLine();
                String eMail = readLogin.nextLine();
                String passWord = readLogin.nextLine();


                System.out.println("You want to Login with:\n\t1. Username\n\t2. Email ");
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

            }// try ends here
        }catch(Exception e){
            System.out.println(e.toString());
        }// catch ends here


    }// method account() ends here
    /*..........................Method to make profile of counsellor......................................*/

    public static void counsellorProfile() {
        Scanner input = new Scanner(System.in);
        System.out.println("                                            *************************                                                                   ");
        System.out.println("__________________________________________  **  MAKE YOUR PROFILE  **  _____________________________________________________________");
        System.out.println("                                            *************************                                                                   ");

        try{

            // Creating file to write the profile data in file

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

            System.out.println("______|Counselling charges|");
            int charges = input.nextInt();

            // writing data in file
            writeProfile.println(address);
            writeProfile.println(phone);
            writeProfile.println(skills);
            writeProfile.println(languages);
            writeProfile.println(education);
            writeProfile.println(counsellingHistory);
            writeProfile.println(charges);


        }// try ends here
        catch(Exception e){
            System.out.println(e.toString());
        }// catch ends here

        System.out.println("_____________________________________________________________________________________________________________________________________");

        System.out.println("Enter 0 to view your profile:");
        input.nextInt();
        viewCounsellorProfile();// calling the function
    }// method ends here

    /*....................................Method to view profile of counselor...........................................*/
    public static void viewCounsellorProfile() {

        try{

            // reading data from file


            File displayProfile = new File("myProfileFile.txt");
            Scanner readProfile  =new Scanner(displayProfile);
            while(readProfile.hasNext()){
                String location = readProfile.nextLine();
                String call = readProfile.nextLine();
                String skill = readProfile.nextLine();
                String [] skillArray = skill.split("  ");// storing in array

                String langs = readProfile.nextLine();
                String [] langsArray = langs.split(" ");// storing in array

                String edu = readProfile.nextLine();
                String [] educateArray = edu.split("  ");// storing in array

                String history = readProfile.nextLine();
                String [] historyArray = history.split(" ");// storing in array

                String charge= readProfile.nextLine();

                System.out.println();
                System.out.println("________________________________________________________________________________________________________________________________");
                System.out.println("              "+name+"\n\n"+
                        "     **************************\n"+
                        "     ** PERSONAL INFORMATION ** \n"+
                        "     **************************\n"+
                        "Address:"+location+"\n"                +
                        "Phone:  "+call+"\n"                  +
                        "Email:"+email+"\n"                    + "\n");
                System.out.println(
                        "         *******************    \n"+
                        "         **    SKILLS     **    \n"+
                        "         *******************    \n");
                for (String s:skillArray){
                    System.out.println("-- "+s);
                }// for loop
                System.out.println(
                        "         *******************    \n"+
                        "         **   LANGUAGES   **    \n"+
                        "         *******************    \n");
                for (String lang: langsArray){
                    System.out.println("-- "+lang);
                } // for loop
                System.out.println(
                        "         *******************    \n"+
                        "         **   EDUCATION   **    \n"+
                        "         *******************    \n");
                for (String education:educateArray){
                    System.out.println("-- "+education);
                } // for loop
                System.out.println(

                        "     **************************  \n"+
                        "     **  COUNSELLING HISTORY **       \n"+
                        "     **************************  \n");
                for (String hist: historyArray){
                    System.out.println("-- "+hist);
                } // for loop
                System.out.println(
                        "      **************************    \n" +
                        "      **  COUNSELLING CHARGES **    \n" +
                        "      **************************  \n"+
                        charge  );
                System.out.println("_____________________________________________________________________________________________________________________________________");

            }// while ends here
        }// try ends here
        catch(Exception e){
            System.out.println(e.toString());
        }// catch ends here

    }// method ends here

    /*..........................................Method to make profile of counselee.............................................*/
    public static void counseleeProfile(){
        System.out.println("                                                 *************************                                                                   ");
        System.out.println("_______________________________________________  **  MAKE YOUR PROFILE  **  __________________________________________________");
        System.out.println("                                                 *************************                                                                   ");


        try{

            // Creating file to write the profile data in file

            FileOutputStream counseleeProfile = new FileOutputStream("counseleeProfileFile.txt");
            PrintStream writeProfile = new PrintStream(counseleeProfile);

            System.out.println("_____|PERSONAL INFORMATION|    ");
        String M= "male";  String F= "female";
        String a="Introvert"; String b="Extrovert";
        Scanner input = new Scanner(System.in);


        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your phone number(03XX-XXXXXXX) :");
        String phoneNumber=input.next();
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
        String gender=input.next().toUpperCase();
        if (gender.equals("M")) {
            gender="Male";
        } // if ends here
        else {
            gender="Female";
        } //else if ends here

        System.out.print("Enter your CNIC: " );
        String CNIC = input.next();
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
            String qualification1="";
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
        String personalityType=input.nextLine().toLowerCase();
        if(personalityType.equals("a")) {
            personalityType="Introvert";
        }
        else{
            personalityType="Extrovert";
        }// else ends here

        System.out.print("Enter your areas of interest eg: biology,physics etc: ");
        String interest=input.nextLine();
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
        String hobbies=input.nextLine();
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

            // Writing data in file
            writeProfile.println(age);
            writeProfile.println(phoneNumber);
            writeProfile.println(gender);
            writeProfile.println(CNIC);
            writeProfile.println(qualification1);
            writeProfile.println(personalityType);
            writeProfile.println(interest);
            writeProfile.println(hobbies);
            System.out.println("________________________________________________________________________________________________________________________________");

            System.out.println("Enter:" +
                               "\n1: To view your profile" +
                               "\n2: To view list of counsellors available");
            int opt = input.nextInt();
            if (opt == 1){
                viewCounseleeProfile();  // method call
            }// if ends here
            else{
                viewCounselorList();  // method call
            }// else ends here


        }// try ends here
        catch (Exception e){
            System.out.println(e.toString());
        }// catch ends here

    } // method ends here

    /*.................................Method to view Counselee profile............................................*/
    public static void viewCounseleeProfile(){

        try{

            // Reading data from file

            File displayCounseleeProfile = new File("counseleeProfileFile.txt");
            Scanner readCounseleeProfile  =new Scanner(displayCounseleeProfile);

            while(readCounseleeProfile.hasNext()){
                int age= Integer.parseInt(readCounseleeProfile.nextLine());
                String phoneNumber = readCounseleeProfile.nextLine();
                String gender = readCounseleeProfile.nextLine();
                String CNIC = readCounseleeProfile.nextLine();
                String qualification1 = readCounseleeProfile.nextLine();
                String personalityType = readCounseleeProfile.nextLine();

                String interest = readCounseleeProfile.nextLine();
                String [] interArray = interest.split(" ");


                String hobbies = readCounseleeProfile.nextLine();
                String [] hobbArray = hobbies.split(" ");

                System.out.println();
                System.out.println("_________________________________________________________________________________________________________________________________");
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
                        personalityType  + "\n");

                System.out.println(
                        "         *******************      \n"+
                        "         **    SKILLS     **      \n"+
                        "         *******************      \n");
                for (String hob: hobbArray){
                    System.out.println(hob);
                }// for loop ends here

                System.out.println(
                        "         *******************       \n"+
                        "         **   EDUCATION   **       \n"+
                        "         *******************       \n"+
                        qualification1+"\n");
                System.out.println(
                        "    *****************************      \n"+
                        "    **    AREAS OF INTEREST    **      \n"+
                        "    *****************************      \n");

                for (String inte: interArray){
                            System.out.println(inte);
                }// for loop ends here
                System.out.println("__________________________________________________________________________________________________________________________________");

            }// while loop ends here


        }// try ends here
        catch(Exception e){
            System.out.println(e.toString());
        }// catch ends here

        Scanner input = new Scanner(System.in);
        System.out.println("Enter:\t\n1: To view your profile\t\n2: To view list of counsellors available");
        int opt1 = input.nextInt();
        if (opt1 == 1){
            viewCounseleeProfile(); // method call
        }
        else{
            viewCounselorList(); // method call
        }

    }// method ends here


    /*......................................Method to view the list of counsellors available...................................*/
    public static void viewCounselorList() {
        try{


            Scanner userInput = new Scanner(System.in);
            ArrayList<String>coun = new ArrayList<String>();

            FileOutputStream file = new FileOutputStream("ViewCounsellorList.txt");
            PrintStream ps = new PrintStream(file);

            ps.println("1,Ali Asad,Ali1@gmail.com,0345-6523234,Reading  Writing  Listening," +
                    "Urdu Arabic English,BS psychology  MS psychology,School Counselling  Education Counselling");
            ps.println("2,Asma Zulfiqar,asma123@yahoo.com,0345-6528894,Social Skills  Patience  Listening," +
                    "Urdu English Punjabi,BS psychology  MS psychology,Career Counselling  Education Counselling");
            ps.println("3,Maryam Zulfiqar,Maryam@yahoo.com,0333-8990789,Communication  Patience  Listening," +
                    "Urdu English,BS in social Science  MS psychology,Career Counselling  Education guidance");
            ps.println("4,Rahat Talha,talhavirk1@gmail.com,0344-9023516,Active listening  Patience," +
                    "English Turkish Urdu,BS Sociology  MS sociology,Mental Counselling  School Counselling");


            // reading data
            FileInputStream fileIn = new FileInputStream("ViewCounsellorList.txt");
            Scanner input = new Scanner(fileIn);
            while (input.hasNext()){
                String counsellor = input.nextLine();
                coun.add(counsellor);
            }// while ends here


            // initializing variables
            int id =0;
            String nameOf="";
            String emailOf = "";
            String numOf="";
            String skillsOf="";String langOf="";String eduOf="",historyOf="";

            System.out.println("                                                 *************************                                                                   ");
            System.out.println("_______________________________________________  ** LIST OF COUNSELLORS **  _____________________________________________________");
            System.out.println("                                                 *************************                                                                   ");

            for(String line: coun){
                String [] sections = line.split(",");

                // Assigning values
                id  = Integer.parseInt(sections[0]);
                nameOf  = sections[1];
                emailOf = sections[2];
                numOf = sections[3];
                skillsOf = sections[4];
                langOf = sections[5];
                eduOf = sections[6];
                historyOf = sections[7];

                // Printing the list of counsellors
                System.out.println("Counsellor ID: "+id);
                System.out.println("Name: "+nameOf);
                System.out.println("..................Contact...............");
                System.out.println("Email: "+emailOf);
                System.out.println(".................Education.............. \n"+eduOf.replace("  ","\n"));
                System.out.println("............Counselling History.........\n"+historyOf.replace("  ","\n"));
                System.out.println();
                System.out.println("-------------------------------------------------------------------------------------------------------------------------------");

            }// for ends here


            System.out.println("                                                ***************************                                                                   ");
            System.out.println("______________________________________________  ** SELECT ONE COUNSELLOR **  ___________________________________________________");
            System.out.println("                                                ***************************                                                                   ");


            // Asking counselee to select a counsellor with id
            System.out.println("Select the counsellor from whom you want to get the counselling, Enter ID: ");
            int counsellorID  = userInput.nextInt();
            for (String line : coun) {
                String[] sections = line.split(",");

                // Assigning values to variables
                id = Integer.parseInt(sections[0]);

                if (counsellorID==id){
                    nameOf = sections[1];
                    emailOf = sections[2];
                    numOf = sections[3];
                    skillsOf = sections[4];
                    langOf = sections[5];
                    eduOf = sections[6];
                    historyOf = sections[7];

                    System.out.println("The profile of the counsellor you selected looks like.........................");
                    System.out.println("Name: "+nameOf);
                    System.out.println("..................Contact...............");
                    System.out.println("Email: "+emailOf);
                    System.out.println("Phone no.: "+numOf);
                    System.out.println("..................Skills................ \n"+skillsOf.replace("  ","\n"));
                    System.out.println(".................Languages.............. \n"+langOf.replace(" ","\n"));
                    System.out.println(".................Education.............. \n"+eduOf.replace("  ","\n"));
                    System.out.println("............Counselling History......... \n"+historyOf.replace("  ","\n"));
                    System.out.println();
                    System.out.println("------------------------------------------------------------------------------");
                    break; // loop will break once the desired counsellor is found with entered id
                }// if ends here
            }// for loop ends here
        }// try ends here
        catch (Exception e){
            System.out.println(e.toString());
        }// catch ends here
    }// method ends here

    /*.............................................Method to choose the counselling medium....................................*/

    public static void chooseMedium() {
        String communicationMedium="";
        Scanner input = new Scanner(System.in);
        System.out.print("Select medium of communication:\n" +
                "a) Audio call\n" +
                "b) Text messages\n");
        communicationMedium = input.nextLine();
        if (communicationMedium.equals("a")) {
            System.out.println("You have selected Audio calls");
        }// if ends here
        else {
            System.out.println("You have successfully selected Text messages");
        }// else ends here

        System.out.println("Enter 0 to move to next step of sending request to counsellor");
        input.nextInt();
        sendRequest();
    }// method ends here


    /*........................................Method to send request to counsellor........................................*/
    public static void sendRequest(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter\n1: To send request to counsellor\n2: To choose another counsellor");
        int request = input.nextInt();
        input.nextLine();
        if (request ==1){
            System.out.println();
            System.out.println("Your request has successfully sent to counsellor.");
            System.out.println("The counsellor has sent you two tests");
            System.out.println("Enter Y to solve test");
            String test = input.nextLine();
            if (test.equals("Y") || test.equals("y")){

                // calling Function
                personalityAssessmentTest();

            }// if ends here

        }// if ends here
        else{
            viewCounselorList();
        }// else ends here

    }// method ends here

    /*..........................................Method to solve the test sent by counsellor......................................*/

    public static void personalityAssessmentTest(){

        Scanner input = new Scanner(System.in);

        System.out.println("                                                ***************************                                                              ");
        System.out.println("______________________________________________  **    ASSESSMENT TEST    **   _________________________________________________");
        System.out.println("                                                ***************************                                                              ");


        try {
            FileOutputStream fileOut = new FileOutputStream("SavePersonalityTest.txt");
            PrintStream fileWrite = new PrintStream(fileOut);

            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("------------------------------------------------| PERSONALITY ASSESSMENT TEST  |-----------------------------------------------");

            // Questions about the personality
            String [] questionPersonality = {
                    "1-Which of the following describes you the best:",
                    "2-Do you make list to do task or not:",
                    "3-Do you want to work alone or in team: ",
                    "4-Are you energetic or lazy:"
            };// array

            // Respective option of questions
            String [] answerPersonality = {
                    "-- Analytical  -- Creative  -- Logical",
                    "-- I make lists  -- I do not make list  -- I keep to do list in my mind",
                    "-- Alone  -- In team  -- Can do work in both environments",
                    "-- Energetic  -- Lazy  -- Depends on mood"
            };// array ends here



            for (int i = 0;i<questionPersonality.length;i++){
                // Displaying the questions
                System.out.println(questionPersonality[i]);
                System.out.println(answerPersonality[i].replace("  ","\n"));

                // Asking for counselee answer
                String yourAnswer = input.nextLine();
                System.out.println(yourAnswer);
                System.out.println();

                // Storing in file
                fileWrite.println(yourAnswer);

            }// for loop ends

            System.out.println("----------------------------------------------|| PERSONALITY  TEST COMPLETED  ||----------------------------------------------");
            System.out.println();
            System.out.println();



    /*..........................................Method to solve the test sent by counsellor......................................*/

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("-----------------------------------------------| Career Assessment test  |-----------------------------------------------------");

            // Questions about career
            String [] questions = {"1-What are your areas of interest in study:",
                    "2-What are your future education goals:",
                    "3-You are interested in: ",
                    "4-You like which form of work:"};// array

            // Respective option of questions
            String [] answers = {"-- Arts  --Science  -- Technology",
                    "-- Going to University  -- Studying private  -- I have not decided yet",
                    "-- Technical  -- Non-Technical  -- None",
                    "-- Theoretical  -- Practical  -- Research Based"};// array


            for (int i = 0;i<questions.length;i++){

                // Displaying the questions and options
                System.out.println(questions[i]);
                System.out.println(answers[i].replace("  ","\n"));

                // Asking for counselee answers
                String  yourAnswer = input.nextLine();
                System.out.println(yourAnswer);
                System.out.println();

                // Writing in file
                fileWrite.println(yourAnswer);
            }// for loop ends here

            System.out.println("--------------------------------------------------------||  TEST COMPLETED  ||-------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\n\n");

            System.out.println("Enter y to submit test ");
            String submit = input.nextLine();
            if(submit.equals("y")|| submit.equals("Y")){
                System.out.println("Your test have been successfully submitted\nEnter 0 to view meetings schedule");
                input.nextInt();
                input.nextLine();
                viewMeetingSchedule();// function call
            }
        }// try ends here
        catch (Exception e){
            System.out.println(e.toString());
        }// catch ends here
    }// method ends here

    public static void viewMeetingSchedule(){
        Scanner input = new Scanner(System.in);



        System.out.println("                                               ***************************                                                                   ");
        System.out.println("_____________________________________________  **   MEETING SCHEDULE    **   ___________________________________________________");
        System.out.println("                                               ***************************                                                                 ");


        System.out.println("Date chosen by the counsellor for meeting is 10/06/2023");
        System.out.println("Time chosen by the counsellor for meeting is 11:30am");
        System.out.println("Enter 0 to move to next step of viewing the suggested career path by counsellor: ");
        input.nextInt();
        input.nextLine();
        viewSuggestedCareerPath();// Method call
    }// method ends here


    /*......................................Method to view the request from counselee............................*/
    public static void requestBox(){


        System.out.println("                                               ***************************                                                                   ");
        System.out.println("_____________________________________________  **      REQUEST BOX      **   ___________________________________________________");
        System.out.println("                                               ***************************                                                                 ");

        Scanner input = new Scanner(System.in);
        int request =1;
        if (request>=0){
            System.out.println("You have received a request from ");

                    String  nameOfCounselee = "Ali Asad";
                    int age= 19;
                    String phoneNumber = "0345-6526272";
                    String gender = "Female";
                    String CNIC = "34601-2802839-0";
                    String qualification1 = "Intermediate in Pre-Engineering";
                    String personalityType = "Introvert";
                    String interest = "Computer Science";
                    String hobbies = "Reading  Photography";


                    System.out.println(".............|| Personal Information ||............");
                    System.out.println("Name: "+nameOfCounselee);
                    System.out.println("Age: "+ age);
                    System.out.println("Phone number: "+ phoneNumber);
                    System.out.println("CNIC: "+CNIC);
                    System.out.println("Personality type: "+personalityType);
                    System.out.println("..................|| Qualification||................\n"+qualification1);
                    System.out.println("..................||   Interests  ||................\n"+interest.replace("  ","\n"));
                    System.out.println("..................||   Hobbies    ||................\n"+hobbies.replace("  ","\n"));
                    System.out.println("--------------------------------------------------------------------------------------------------------------------------");
                    System.out.println();
                }// while loop ends here

                System.out.println("Enter 1 to send Career Assessment Test to counselee ");
                int send = input.nextInt();
                if (send==1){
                    System.out.println("You have successfully send the Assessment test");
                }//if ends here

                System.out.println("The counsellor has filled and submitted the career assessment test");
                System.out.println("Enter 0 to view the test submitted by counselee");
                input.nextInt();
                viewSubmittedTest();// method call

        }// method ends here

    public static void  viewSubmittedTest() {
        Scanner input = new Scanner(System.in);



        System.out.println("                                               *******************************                                                                   ");
        System.out.println("_____________________________________________  **   ASSESSMENT TEST RESULT  **   _______________________________________________");
        System.out.println("                                               *******************************                                                                ");

        System.out.println("\n");
        System.out.println("________________________________________________|| PERSONALITY TEST RESULT ||_____________________________________________________");

            // Questions about the personality
            String[] questions = {
                    "1-Which of the following describes you the best:",
                    "2-Do you make list to do task or not:",
                    "3-Do you want to work alone or in team: ",
                    "4-Are you energetic or lazy:"
            };// array

            // Respective option of questions
            String[] answers = {
                    "-- Analytical  -- Creative  -- Logical",
                    "-- I make lists  -- I do not make list  -- I keep to do list in my mind",
                    "-- Alone  -- In team  -- Can do work in both environments",
                    "-- Energetic  -- Lazy  -- Depends on mood"
            };// array ends here

            String[] answerByUser = {"Analytical", "I make list", "Alone", "Energetic"};

            for (int i = 0; i < questions.length; i++) {
                System.out.println(questions[i]);
                System.out.println(answers[i].replace("  ", "\n"));
                System.out.println("Marked by counselee: " + answerByUser[i]);
                System.out.println();

            }// for loop ends here


            System.out.println("__________________________________________________________________________________________________________________________________");
            System.out.println("\n");
            System.out.println("___________________________________________________|| CAREER TEST RESULT ||_______________________________________________________");


            // Questions about career
            String[] questionCareer = {"1-What are your areas of interest in study:",
                    "2-What are your future education goals:",
                    "3-You are interested in: ",
                    "4-You like which form of work:"};// array

            // Respective option of questions
            String[] answersCareer = {"-- Arts  --Science  -- Technology",
                    "-- Going to University  -- Studying private  -- I have not decided yet",
                    "-- Technical  -- No  -- I will be taking test next month",
                    "-- Theoretical  -- Practical  -- Research Based"};// array

            String[] careerAnswer = {"Technology", "Going to university", "Technical", "Practical"};

            for (int i = 0; i < questionCareer.length; i++) {
                System.out.println(questionCareer[i]);
                System.out.println(answersCareer[i].replace("  ","\n"));
                System.out.println("Marked by counselee: " + careerAnswer[i]);
                System.out.println();

            }// for loop ends here
            System.out.println("__________________________________________________________________________________________________________________________________");
            System.out.println("\n");


            System.out.println("Enter: \n1: To schedule the meetings\n2: To suggest the career path  ");

            int path = input.nextInt();
            input.nextLine();
            if(path==1){
                scheduleMeeting(); // method call
            }// if ends here
            else{
                suggestCareer();
                // method call
            }


    }

    /*................................Method to schedule meetings for counselling sessions.............................*/
    public static void scheduleMeeting(){


        System.out.println("                                              ***************************                                                                   ");
        System.out.println("____________________________________________  ** SCHEDULE THE MEETING  **   ____________________________________________________");
        System.out.println("                                              ***************************                                                                   ");


        Scanner input=new Scanner(System.in);
        String pattern = "^\\d{4}-\\d{2}-\\d{2}$";
        boolean dateFalse=true;
        while(dateFalse){
            System.out.println("Enter meeting date in format: year-month-date eg- 2021-06-03");
            String meetingDate=input.nextLine();
            if (Pattern.matches(pattern, meetingDate)) {
                LocalDate currentDate = LocalDate.now();
                LocalDate userDate = LocalDate.parse(meetingDate);
                if (userDate.isBefore(currentDate)){
                    System.out.println("This is a past date. Enter current or future date/n");
                } else {
                    System.out.println("Date is valid.");
                    dateFalse=false;
                }
            }
            else {
                System.out.println("Date is not valid.");
            }
        }// while ends here
        String timePattern =  "(1[012]|[1-9]):[0-5][0-9](\\s)?(?i)(am|pm)";
        boolean timeValid=true;
        while(timeValid){

            System.out.println("Enter meeting time in format: hh:mm am/pm(no space between time nad am/pm)");
            String meetingTime=input.nextLine();
            if (Pattern.matches(timePattern, meetingTime)) {
                System.out.println("Time is valid.");
                timeValid=false;

            }// if ends here
            else {
                System.out.println("Time is not valid.");
            }// else ends here
        }// while ends here

        System.out.println("The counselee has been informed about the meetings.....");
        System.out.println("The meetings have been held now, Enter 0 to suggest career path: ");
        input.nextInt();
        suggestCareer();//  method call
    }//method ends here


    /*........................................Method to view the suggested career path..................................................../*/
        public static void viewSuggestedCareerPath(){


            Scanner input = new Scanner(System.in);
            System.out.println("                                                 ***************************                                                                   ");
            System.out.println("_______________________________________________  **     CAREER PATH       **   __________________________________________________");
            System.out.println("                                                 ***************************                                                                   ");


            try{

                ArrayList<String> career = new ArrayList<String>();

                // reading data from file
                FileInputStream fileIn = new FileInputStream("SavePersonalityTest.txt");
                Scanner read = new Scanner(fileIn);
                while(read.hasNext()){
                    String answer = read.nextLine();
                    career.add(answer);
                }// while ends here

                String careerOne = career.get(0);
                String careerTwo = career.get(4);

                System.out.println();
                System.out.println("Career suggested is : ");
                if (careerOne.equalsIgnoreCase("Analytical") && careerTwo.equalsIgnoreCase("Arts")){
                    System.out.println("Arts conservator");
                } else if (careerOne.equalsIgnoreCase("Analytical") && careerTwo.equalsIgnoreCase("Science")) {
                    System.out.println("Data Scientist");
                } else if (careerOne.equalsIgnoreCase("Analytical") && careerTwo.equalsIgnoreCase("Technology")) {
                    System.out.println("Business analyst");
                }else if (careerOne.equalsIgnoreCase("Creative") && careerTwo.equalsIgnoreCase("Arts")) {
                    System.out.println("Arts Director");
                } else if (careerOne.equalsIgnoreCase("Creative") && careerTwo.equalsIgnoreCase("Science")) {
                    System.out.println("Science Writer");
                }else if (careerOne.equalsIgnoreCase("Creative") && careerTwo.equalsIgnoreCase("Technology")) {
                    System.out.println("Digital marketer");
                } else if (careerOne.equalsIgnoreCase("Logical") && careerTwo.equalsIgnoreCase("Arts")) {
                    System.out.println("Graphic Designer");
                }else if (careerOne.equalsIgnoreCase("Logical") && careerTwo.equalsIgnoreCase("Technology")) {
                    System.out.println("System analyst");
                } else if(careerOne.equalsIgnoreCase("Logical") && careerTwo.equalsIgnoreCase("Science")) {System.out.println("Research Scientist");

                }// else ends here

                }// try ends here
            catch (Exception e){
                System.out.println(e.toString());
            }// catch ends here

            System.out.println("Enter 0 to move to last step of giving reviews");
            input.nextInt();
            input.nextLine();
            giveReviews();// method call
        }// method ends here



    /*.........................................Method to suggest the career path................................................*/
    public static void suggestCareer(){

        Scanner input = new Scanner(System.in);
        System.out.println("You have viewed the career assessment test....");
        System.out.println("                                                 ****************************                                                                   ");
        System.out.println("_______________________________________________  **  SUGGEST CAREER PATH   **   __________________________________________________");
        System.out.println("                                                 ****************************                                                                   ");
        System.out.println();
        System.out.print(" The career path suggested is: ");
        String careerByCounsellor = input.nextLine();
        System.out.println();
        System.out.println("The counselee is informed about the career path suggested..");
        System.out.println("____________________________|THANK YOU FOR USING OUR APP|_________________________________");

    } // method ends here

    /*.........................................Method to give reviews and ratings................................................*/
    public static void giveReviews(){



        System.out.println("                                                  ***************************                                                                   ");
        System.out.println("_______________________________________________  **  REVIEWS AND RATINGS  **   _________________________________________________");
        System.out.println("                                                  ***************************                                                                   ");

        int rating=0;
        String review="";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a for rating \n"+ "Enter b for review \n" + "Enter c if you dont want to give either of them");
        String select=input.nextLine();
        if(select.equals("a")){
            System.out.println("Enter ratings: ");

            boolean ratingCheck=true;
            while(ratingCheck){
                System.out.println("Rate counsellor from 1 to 5 star : ");
                rating=input.nextInt();
                input.nextLine();
                if(rating==1 || rating==2 || rating==3 || rating==4 || rating==5 ){
                    ratingCheck=false;
                }
                else{
                    System.out.println("Give rating again");
                }
            }// while ends here
            System.out.println("Rating : "+ rating);
        }// if ends here
        else if(select.equals("b")){
            System.out.println("Enter review for the counsellor");
            review=input.nextLine();
            System.out.println("Review: "+ review);

        }// else if ends here
        else{
            System.out.println("Give review: ");
            review=input.nextLine();
            System.out.println("Give ratings: ");
            rating=input.nextInt();
            System.out.println("Rating:" + rating);
            System.out.println("Review: "+ review);
        }// else ends here

        System.out.println("___________________________________________________________|| Thank you for using our app ||___________________________________________________________________________");
        }// method ends here
}// class ends here