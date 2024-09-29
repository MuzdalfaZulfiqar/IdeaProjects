import java.util.Scanner;
public class lab_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter: ");
        // Taking inputs
        System.out.print("Day:");
        int day = input.nextInt();
        System.out.print("Month:");
        int month = input.nextInt();
        System.out.print("Year:");
        int year = input.nextInt();
        boolean date = validDate(day,month,year);
        if(date){
            System.out.println("Valid date");
        }
        else{
            System.out.println("Invalid date");
        }
    }// main ends here

    public static boolean validDate(int day, int month, int year){
       boolean  isDateValid = true;
       if(year>=1930 && year <=3000){
           if(month >=1 && month <=12){
               if(month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month ==11
               || month == 12){
                   if(day>=1 && day<=31){
                       isDateValid= true;
                   }
                   else{
                       isDateValid = false;
                   }
               }// if ends here
               else if(month == 2){
                   if(year% 4==0){
                       if(day>=1 && day<=29){
                           isDateValid= true;
                       }
                       else{
                           isDateValid = false;
                       }
                   }
                   else{
                       if(day>=1 && day<=28){
                           isDateValid= true;
                       }
                       else{
                           isDateValid = false;
                       }
                   }
               } // else if ends here
               else{
                   if(day>=1 && day<=30){
                       isDateValid= true;
                   }
                   else{
                       isDateValid = false;
                   }
               }// else ends here
           }
           else{
               isDateValid = false;
           }
       }// if ends here
       else{
           isDateValid = false;
       }// else ends here
       return isDateValid;
    }// method ends here
}// class ends here
