
import java.util.Random;
public class Java_Generate_random_numbers {
    public static void main(String[] args) {
        Random ran = new Random();
        int number = ran.nextInt(2,3);


        int [] myList = {1,5,2,3,5,5};
        double temp= myList[0];
        for (int i = 1; i < myList.length; i++) {
            System.out.println("i " + i);
            myList[i-1]  = myList[i];
            System.out.println(myList[i-1]);
        }


        myList[myList.length-1] = (int) temp;

        System.out.println(myList[myList.length-1]);

// shifting right
        int[] array = {1, 2, 3, 4, 5};
        int temmp = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = temmp;

        // Print the shifted array
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
