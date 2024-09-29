import java.util.Random;
import java.util.Scanner;
public class rock_Scissor_Paper {
    public static void main(String[] args) {
        System.out.println( "------|Welcome to rock scissor paper|-----");
        Scanner stc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = stc.next();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many rounds you want to play: ");
        int user_round =sc.nextInt();
        System.out.println("--------|This is round 1|------");
        int round = 0;
        int comp_winner = 0;
        int user_winner = 0;
        int draw =0;
        while (round < user_round){
            Random input  =new Random();
            int comp = input.nextInt(0,3);


            System.out.println(name +" Enter 0 for rock, 1 for scissor and 2 for paper:");
            int guess = sc.nextInt();

            if (comp == 0 && guess == 1){
                System.out.println("Computer is the winner!");
                comp_winner = comp_winner+1;
            }
            else if (comp == 0 && guess == 2){
                System.out.println( name + "! You are the winner!");
                user_winner = user_winner +1;
            }
            else if (comp == 0 && guess == 0){
                System.out.println("This is a draw!");
                draw = draw +1;
            }
            else if (comp == 1 && guess == 0){
                System.out.println( name + "! You are the winner!");
                user_winner = user_winner +1;
            }
            else if (comp == 1 && guess == 2){
                System.out.println("Computer is the winner!");
                comp_winner = comp_winner+1;
            }
            else if (comp == 1 && guess == 1){
                System.out.println("This is a draw!");
                draw = draw +1;
            }
            else if (comp == 2 && guess == 0){
                System.out.println("Computer is the winner!");
                comp_winner = comp_winner+1;
            }
            else if (comp == 2 && guess == 1){
                System.out.println( name + "! You are the winner!");
                user_winner = user_winner +1;
            }
            else if (comp == 2 && guess == 2){
                System.out.println("This is a draw!");
                draw = draw +1;
            }
        round = round +1;
            if (round == user_round){
                break;
            }
            System.out.println("--------|This is round " + (round +1 )+ "|------");
        } // while loop ends
        System.out.println("The computer have won " +comp_winner+ " rounds");
        System.out.println(name+ " You have won " + user_winner+ " rounds");
        System.out.println("There are "+draw+" draws!");
        if (user_winner>comp_winner){
            System.out.println("````````|You are a pro! My Girl!|```````");
        }
        else{
            System.out.println("Ops! You lose !");
        }
    }// function ends
} // class ends
