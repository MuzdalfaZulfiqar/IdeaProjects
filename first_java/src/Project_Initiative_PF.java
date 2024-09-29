import java.util.Scanner;

public class Project_Initiative_PF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a counsellor or counselee(enter 1 for counsellor and 0 for counselee): ");
        int option = input.nextInt();
        if (option == 0)
        {

            account();
        }
        else
        {
            account();

        }// else ends here


    }
    public static void  account()
    {
        System.out.println("_________|Create account|_______");
        Scanner input = new Scanner(System.in);
        String firstName = " ";
        String lastName = " ";
        String email = " ";
        String password = " ";
        String name= "";
        System.out.print("Enter username: ");
        name = input.nextLine();
        System.out.print("Enter your first name: ");
        firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        lastName = input.nextLine();
        System.out.print("Enter your email address: ");
        email = input.nextLine();
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
                System.out.println("Your password must have at least 8 characters, Enter again:");
                password = input.nextLine();

            }// else ends here

        }// while ends here

        System.out.println("Your account have been created");



        System.out.println("_________|Login|_________");
        String username = "";
        String pass = "";
        String emailConfirm = "";
        System.out.print("Login with username or email(0 for email and 1 for username): ");
        int choice = input.nextInt();
        if (choice == 1)
        {
            System.out.print("Enter username: ");
            username = input.nextLine();
            input.nextLine();
            boolean user = true;
            while(user)
            {
                if(username.equals(name)){
                    System.out.println("Your username is correct!");
                    user = false;
                }
                else{
                    System.out.println("Your username is wrong, Enter again: ");
                    System.out.println("NAME"+ name);
                    username = input.nextLine();

                }
            }// while ends here

        }// if ends here
        else
        {
            System.out.println("Enter email: ");
            emailConfirm = input.nextLine();
            input.nextLine();
            boolean emailCheck = true;
            while(emailCheck){
                if (emailConfirm.equals(email))
                {
                    emailCheck = false;
                }// if ends here
                else
                {
                    System.out.println("This email is wrong, Enter again:");
                    emailConfirm = input.nextLine();


                }// else ends here
            }// while ends here

        }// else ends here

        System.out.print("Enter password(At least 8 characters): ");
        pass = input.nextLine();
        input.nextLine();
        boolean word = true;
        while(word)
        {
            if (pass.equals(password))
            {
            System.out.print("You are successfully logged in..");
            word = false;
            } // if ends here
            else
            {
            System.out.print("Your password is wrong, Enter again:");
            pass = input.nextLine();


            }// else ends here

        }// while ends here
        }// method account() ends here
}




