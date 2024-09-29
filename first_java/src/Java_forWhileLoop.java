import java.util.Scanner;

public class Java_forWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the year: ");
        int year = input.nextInt();
        System.out.println("Enter the first day: ");
        int day = input.nextInt();
        int month = 1;
        String monthNew;
        for (month = 1; month <= 12; month++) {
            if (month == 1) {
                monthNew = "January";
                System.out.println("                January  " + year);
                System.out.println("-------------------------------------------------");
                System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat ");
                int jan = 31;
                int count = 0;
                for (int i = 1; i <= jan; i++) {
                    if (i<=day){
                        
                    }
                    System.out.print(i + " \t \t");
                    count++;
                    if (count % 7 == 0) {
                        System.out.println();
                    }
                }
            }
            System.out.println();
            if (month == 2) {
                monthNew = "February";
                System.out.println("          February " + year);

                int feb = 28;
                int febLeap = 29;
                System.out.println("-------------------------------------------------");
                System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat ");

                int count = 0;
                if (year % 4 != 0){
                    for (int i = 1; i <= feb; i++) {
                        System.out.print(i + " \t \t");
                        count++;
                        if (count % 7 == 0) {
                            System.out.println();
                        }
                    }
            }
               else{
                    for (int i = 1; i <= febLeap; i++) {
                        System.out.print(i + " \t \t");
                        count++;
                        if (count % 7 == 0) {
                            System.out.println();
                        }
                    }

                }
            }


            System.out.println();
            if (month == 3) {
                monthNew = "March";
                System.out.println("           March " + year);
                int march = 31;
                System.out.println("-------------------------------------------------");
                System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat ");

                int count = 0;
                for (int i = 1; i <= march; i++) {
                    System.out.print(i + " \t \t");
                    count++;
                    if (count % 7 == 0) {
                        System.out.println();
                    }
                }

            }

            System.out.println();
            if (month == 4) {
                monthNew = "April";
                System.out.println("           April " + year);
                System.out.println("-------------------------------------------------");
                System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat ");
                int april = 30;
                int count = 0;
                for (int i = 1; i <= april; i++) {
                    System.out.print(i + " \t \t");
                    count++;
                    if (count % 7 == 0) {
                        System.out.println();
                    }
                }

            }

            System.out.println();
            if (month == 5) {
                monthNew = "May";
                System.out.println("            May " + year);
                System.out.println("-------------------------------------------------");
                System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat ");
                int may = 31;
                int count = 0;
                for (int i = 1; i <= may; i++) {
                    System.out.print(i + " \t \t");
                    count++;
                    if (count % 7 == 0) {
                        System.out.println();
                    }
                }

            }

            System.out.println();
            if (month == 6) {
                monthNew = "June";
                System.out.println("           June " + year);
                System.out.println("-------------------------------------------------");
                System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat ");
                int june = 30;
                int count = 0;
                for (int i = 1; i <= june; i++) {
                    System.out.print(i + " \t \t");
                    count++;
                    if (count % 7 == 0) {
                        System.out.println();
                    }
                }
            }

            System.out.println();
            if (month == 7) {
                monthNew = "July";
                System.out.println("            July " + year);
                System.out.println("-------------------------------------------------");
                System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat ");
                int july = 31;
                int count = 0;
                for (int i = 1; i <= july; i++) {
                    System.out.print(i + " \t \t");
                    count++;
                    if (count % 7 == 0) {
                        System.out.println();
                    }

                }
            }

            System.out.println();
            if (month == 8) {
                monthNew = "August";
                System.out.println("          August " + year);
                System.out.println("-------------------------------------------------");
                System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat ");
                int august = 31;
                int count = 0;
                for (int i = 1; i <= august; i++) {
                    System.out.print(i + " \t \t");
                    count++;
                    if (count % 7 == 0) {
                        System.out.println();
                    }
                }
            }

            System.out.println();
            if (month == 9) {
                monthNew = "September";
                System.out.println("        September " + year);
                System.out.println("-------------------------------------------------");
                System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat ");
                int sep = 30;
                int count = 0;
                for (int i = 1; i<=sep; i++){
                    System.out.print(i + " \t \t");
                    count++;
                    if (count%7==0){
                        System.out.println();
                    }
                }
            }

            System.out.println();
            if (month == 10) {
                monthNew = "October";
                System.out.println("          October " + year);
                System.out.println("-------------------------------------------------");
                System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat ");
                int oct = 31;
                int count = 0;
                for (int i = 1; i<=oct; i++){
                    System.out.print(i + " \t \t");
                    count++;
                    if (count%7==0){
                        System.out.println();
                    }
                }
            }

            System.out.println();
            if (month == 11) {
                monthNew = "November";
                System.out.println("         November " + year);
                System.out.println("-------------------------------------------------");
                System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat ");
                int novem = 30;
                int count = 0;
                for (int i = 1; i<=novem; i++){
                    System.out.print(i + " \t \t");
                    count++;
                    if (count%7==0){
                        System.out.println();
                    }
                }
            }

            System.out.println();
            if (month == 12) {
                monthNew = "December";
                System.out.println("         December " + year);
                System.out.println("-------------------------------------------------");
                System.out.println("Sun\t\tMon\t\tTue\t\tWed\t\tThu\t\tFri\t\tSat ");
                int dec = 31;
                int count = 0;
                for (int i = 1; i<=dec; i++){
                    System.out.print(i + " \t \t");
                    count++;
                    if (count%7==0){
                        System.out.println();
                    }
                }

            }
        }

    }
}



