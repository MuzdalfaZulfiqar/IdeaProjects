public class Java_breakAnd_Continue {
    public static void main(String[] args) {
       // break and continue using loops
//        for (int i = 0;i<5;i++){
//            System.out.println(i);
//            System.out.println("I am learning java!");
//            if(i==2){
//                System.out.println("Ending loop!");
//                break; // it ends the loop at that particular condition
//            }
//        }
//        int j = 0;
//        do{
//            System.out.println(j);
//            System.out.println("I am learning java!");
//            if (j == 2) {
//                System.out.println("Ending loop!");
//                break; // it ends the loop at that particular condition
//            }
//            j++;
//
//        }while (j < 5);
//
//            System.out.println("The End");




//        for (int i = 0;i<5;i++){
//
//            if(i==2){
//                System.out.println("Ending loop!");
//                continue; // it ends the loop at that particular condition
//            }
//            System.out.println(i);
//            System.out.println("I am learning java!");

//        }
        int j = 0;
        do{
            j++;

            if (j == 2) {
                System.out.println("Ending loop!");
                continue; // it ends the loop at that particular condition
            }
            System.out.println(j);
            System.out.println("I am learning java!");


        }while (j < 5);
        System.out.println("The End");
    }
}
