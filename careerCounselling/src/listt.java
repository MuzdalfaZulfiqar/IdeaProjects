import java.util.Scanner;

public class listt {
    private static String name,name1,firstName,lastName,userName="";
    private static String email = "";
    private static String address = "";
    private static String phone = "";
    private static String skills,languages,education, counsellingHistory = "";
    private static String gender;
    private static String CNIC;
    public static void main(String[] args) {}
        public static void counselorView(){
        Scanner input = new Scanner(System.in);
        String [][] counselor ={{"ALI ASAD","Street 1,DHA blockA,Lahore", "0345-6526272","ali1@gmail.com","34601-2802839-0","Reading  Painting  Graphic design","Urdu English Arabic",
                "MS Psychology  PHD psychology","Education counselling  School Counselling"},
                {"ASMA ZULFIQAR","Lane2,Street4,Gulberg,Islamabad","0345-6511979", "asma1@gmail.com","34601-2889567-0","Writing  counselling", "Urdu English Turkish",
                        "MS Sociology  PHD Sociology","School counselling  Career Counselling"},
                {"AMAD ALI","Scotland,London","+44 898 141 1234","Amadali12@gmail.com","AC 12 90 34 D","Journalising  Strategy Games","Urdu English Italian","MS Mental Health Counselling  PHD Psychology","Vocational Counselling  Educational Guidance and Counselling"}};
        for (int i = 0;i<counselor.length ;i++){



                name = counselor[i][0];
                address = counselor[i][1];
                phone = counselor[i][2];
                email = counselor[i][3];
                CNIC = counselor[i][4];
                skills = counselor[i][5];
                languages = counselor[i][6];
                education = counselor[i][7];
                counsellingHistory= counselor[i][8];


                view();



        }
    }// counselorView() ends here


public static void view(){

   System.out.println();
        System.out.println("_____________________________________________________________________________________________________________________________________");
        System.out.println("           "+name+"\n"+
                "     **************************\n"+
                "     ** PERSONAL INFORMATION ** \n"+
                "     **************************\n"+
                "Address:"+address+"\n"+
            "Phone:  "+phone+"\n"+
            "Email:"+email+"\n"+
            "CNIC:"+CNIC+"\n"+
            "                                          \n"+
            "         *******************      \n"+
            "         **    SKILLS     **      \n"+
            "         *******************      \n"+
            skills.replace("  ","   \n")+"\n"+
            "                                          \n"+
            "         *******************    \n"+
            "         **   LANGUAGES   **        \n"+
            "         *******************    \n"+
            languages.replace(" ","   \n")+"\n"+
            "                                          \n"+
            "         *******************    \n"+
            "         **   EDUCATION   **      \n"+
            "         *******************    \n"+
            education.replace("  ","   \n")+"\n"+
            "                                          \n"+
            "     **************************  \n"+
            "     **  COUNSELLING HISTORY **       \n"+
            "     **************************  \n"+
            counsellingHistory.replace("  ","   \n")+"\n");
        System.out.println("_____________________________________________________________________________________________________________________________________");


}// method ends here


}

