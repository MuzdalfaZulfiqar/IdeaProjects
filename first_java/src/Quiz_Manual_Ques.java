import java.util.Scanner;
public class Quiz_Manual_Ques {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("__________|Quiz on Global warming|________");
        System.out.print("Are you ready to start quiz(enter y for yes and n for no):");
        String option = input.nextLine();
        while (option.equals("y")){
            System.out.println("Question # 1: ");
            System.out.println("Rising water temperatures is a result of global"
                    + " warming and may eventually increase sea levels due to the dissolving of what?");
            System.out.println("a = mountains \n" +
                    "b = wetlands\n" +
                    "c = riverbeds\n" +
                    "d = glaciers\n");
            System.out.print("Answer: ");
            String answerOne = input.nextLine();
            String a = "mountains";
            String b = "wetlands";
            String c = "riverbeds";
            String d = "glaciers";
            if (answerOne.equals("d")){
                count = count + 1;
                System.out.println("count " + count);}



            System.out.println("Question # 2: ");
            System.out.println("Which is  NOT the negative effect of global warming?");
            System.out.println("a1 = Fish production\n" +
                    "b1 = Temperature rise\n" +
                    "c1 = deforestation\n" +
                    "d2 = Rise in sealevel");
            System.out.print("Answer: ");
            String answerTwo = input.nextLine();
            String a1 = "Fish production";
            String b1 = "Temperature rise";
            String c1 = "deforestation";
            String d1 = "Rise in sealevel";

            if (answerTwo.equals("a1")){
                count = count+1;
                System.out.println(count);}


            System.out.println("Question # 3: ");
            System.out.println("Global warming has caused an increase in:");
            System.out.println("a = Surface temperature\n" +
                    "b = Droughts\n" +
                    "c = heat waves\n" +
                    "d = All of the above");
            System.out.print("Answer: ");
            String answerThree = input.nextLine();
            String a2 = "Surface temperature";
            String b2 = "Droughts";
            String c2 = "heat waves";
            String d2 = "All of the above";
            if (answerThree.equals("d2") ){
                count = count + 1;}


            option = input.nextLine();

            System.out.println(count);}


    }
}
