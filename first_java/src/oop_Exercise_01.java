import java.util.Random;
import java.util.Scanner;

public class oop_Exercise_01 {
    public static void main(String[] args) {
        System.out.println("Lets start the game");
        Game g = new Game();
        g.takeUserInput();
        g.setGuess(0);
        g.isCorrectNumber();
        System.out.println(g.getGuess());
    }
}
class Game{
    Random ran = new Random(100);
    Scanner sc = new Scanner(System.in);
    int n;
    int user;

    private int noOfGuess ;

    public int getGuess(){
        return noOfGuess;
    }
    public void setGuess(int l){
        noOfGuess=l;
    }
    // Constructor for random number
    public Game(){

        n = ran.nextInt(0,100);

    }
    public int takeUserInput(){
        System.out.print("Enter the number: ");
        user=sc.nextInt();
        return user;
    }
    public void isCorrectNumber(){

        int p = n/2;
        boolean correct = true;
        while (correct){
            if(n==user){
                System.out.println("You entered correct number...");
                correct = false;
            }//correct
            else if (user<=p && user<n){
                System.out.print("The number you entered is too small, Please enter again: ");
                user= sc.nextInt();
            }// less than half of number
            else if(user>p && user<=n+1){
                System.out.println("You are near to guess, Please enter again: ");
                user= sc.nextInt();
            }
            else if (user>n ) {
                System.out.println("The number is too large,  Please enter again: ");
                user= sc.nextInt();
            }

            noOfGuess++;

        }
    }
}