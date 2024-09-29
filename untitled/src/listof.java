import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class listof {
    public static void main(String[] args) {
//        viewListOfCounsellor();
//    }
//    public static void viewListOfCounsellor(){
//        try{
//
//
//            Scanner userInput = new Scanner(System.in);
//            ArrayList<String>coun = new ArrayList<String>();
//
//            FileOutputStream file = new FileOutputStream("ViewCounsellorList.txt");
//            PrintStream ps = new PrintStream(file);
//
//            ps.println("1,Ali Asad,Ali1@gmail.com,0345-6523234,Reading  Writing  Listening,Urdu Arabic English,BS psychology  MS psychology,School Counselling  Education Counselling");
//            ps.println("2,Asma Zulfiqar,asma123@yahoo.com,0345-6528894,Social Skills  Patience  Listening,Urdu English Punjabi,BS psychology  MS psychology,Career Counselling  Education Counselling");
//            ps.println("3,Maryam Zulfiqar,Maryam@yahoo.com,0333-8990789,Communication  Patience  Listening,Urdu English,BS in social Science  MS psychology,Career Counselling  Education guidance");
//            ps.println("4,Rahat Talha,talhavirk1@gmail.com,0344-9023516,Active listening  Patience,English Turkish Urdu,BS Sociology  MS sociology,Mental Counselling  School Counselling");
//
//            FileInputStream fileIn = new FileInputStream("ViewCounsellorList.txt");
//            Scanner input = new Scanner(fileIn);
//            while (input.hasNext()){
//                String counsellor = input.nextLine();
//                coun.add(counsellor);
//            }
//            System.out.println(coun);
//
//            // initializing variables
//            int id =0;
//            String nameOf=""; String emailOf = "";String numOf="";
//            String skillsOf="";String langOf="";String eduOf="",historyOf="";
//            System.out.println("................................................List of counsellors..................................................");
//            for(String line: coun){
//                String [] sections = line.split(",");
//
//                // Assigning values
//                id  = Integer.parseInt(sections[0]);
//                nameOf  = sections[1]; emailOf = sections[2];
//                numOf = sections[3]; skillsOf = sections[4];
//                langOf = sections[5];eduOf = sections[6];
//                historyOf = sections[7];
//
//                // Printing the list of counsellors
//                System.out.println("Counsellor ID: "+id);
//                System.out.println("Name: "+nameOf);
//                System.out.println("..................Contact...............");
//                System.out.println("Email: "+emailOf);
//                System.out.println(".................Education.............. \n"+eduOf.replace("  ","\n"));
//                System.out.println("............Counselling History.........\n"+historyOf.replace("  ","\n"));
//                System.out.println();
//                System.out.println("----------------------------------------------------------------------------------------------");
//
//            }// for ends here
//
//
//
//            // Asking counselee to select a counsellor with id
//            System.out.println("Select the counsellor from whom you want to get the counselling, Enter ID: ");
//            int counsellorID  = userInput.nextInt();
//            for (String line : coun) {
//                String[] sections = line.split(",");
//
//                // Assigning values to variables
//                id = Integer.parseInt(sections[0]);
//
//                if (counsellorID==id){
//                    nameOf = sections[1];
//                    emailOf = sections[2];
//                    numOf = sections[3];
//                    skillsOf = sections[4];
//                    langOf = sections[5];
//                    eduOf = sections[6];
//                    historyOf = sections[7];
//
//                    System.out.println("The profile of the counsellor you selected looks like.........................");
//                    System.out.println("Name: "+nameOf);
//                    System.out.println("..................Contact...............");
//                    System.out.println("Email: "+emailOf);
//                    System.out.println("Phone no.: "+numOf);
//                    System.out.println("..................Skills................ \n"+skillsOf.replace("  ","\n"));
////                    System.out.println(".................Languages.............. \n"+langOf.replace(" ","\n"));
////                    System.out.println(".................Education.............. \n"+eduOf.replace("  ","\n"));
////                    System.out.println("............Counselling History.........\n"+historyOf.replace("  ","\n"));
////                    System.out.println();
////                    System.out.println();
////                    System.out.println("----------------------------------------------------------------------------------------------");
////                    break; // loop will break once the desired counsellor is found with entered id
////                }// if ends here
////            }// for loop ends here
////
////        }// try ends here
////        catch (Exception e){
////            System.out.println(e.toString());
////        }// catch ends here
////
////        System.out.println("                                            *********                                                                   ");
////        System.out.println("______________  *  MAKE YOUR PROFILE  *  _____________________");
////        System.out.println("                                            *********                                          ");
//
//
//        String[] questions = {
//                "What is your preferred work environment?",
//                "What are your main strengths?",
//                "What are your long-term career goals?",
//                "What skills do you want to develop?",
//                "What are your interests and passions?"
//        };
//
//        String[] answerChoices = {
//                "Option A, Option B, Option C",
//                "Option A, Option B, Option C",
//                "Option A, Option B, Option C",
//                "Option A, Option B, Option C",
//                "Option A, Option B, Option C"
//        };
//
//        // Create a scanner to read user input
//        Scanner scanner = new Scanner(System.in);
//
//        // Display the questions and get user's answers
//        for (int i = 0; i < questions.length; i++) {
//            System.out.println(questions[i]);
//            System.out.println(answerChoices[i]);
//
//            System.out.print("Enter your answer: ");
//            String answer = scanner.nextLine();
//            System.out.println();
//        }
//    }// method ends here
//
//
//
//    }

//
//        int rating=0;
//        String review="";
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter :\n\t a for rating \n\t  b for review \n\t c if you don't want to give either of them");
//        String select=input.nextLine();
//        if(select.equals("a")){
//            System.out.println("Enter ratings: ");
//
//            boolean ratingCheck=true;
//            while(ratingCheck){
//                System.out.println("Rate counsellor from 1 to 5 star : ");
//                rating=input.nextInt();
//                input.nextLine();
//                if(rating==1 || rating==2 || rating==3 || rating==4 || rating==5 ){
//                    ratingCheck=false;
//                }
//                else{
//                    System.out.println("Give rating again");
//                }
//            }
//        }
//        else if(select.equals("b")){
//            System.out.println("Enter review for the counsellor");
//            review=input.nextLine();
//        }
//        else{
//            System.out.println("Nothing selected");
//        }
//        if(review=="")
//            System.out.println("Review: None");
//        else
//            System.out.println("Review : "+ review);
//        if(rating==1)
//            System.out.println("Rating: *");
//        else if(rating==2)
//            System.out.println("Rtaing: **");
//        else if(rating==3)
//            System.out.println("Rating: ***");
//        else if(rating==4)
//            System.out.println(" Rating :4 ****");
//        else if(rating==5)
//            System.out.println("Rating:5 *****");
//        else
//
//            System.out.println("Rating:None");

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
    }}