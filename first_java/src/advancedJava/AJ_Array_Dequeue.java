package advancedJava;

import java.util.ArrayDeque;
import  apnaCollege.*;
public class AJ_Array_Dequeue {
    public static void main(String[] args) {
        // It helps to insert the elements at the start and at last
        // like array is 1,2,3 ,and we want to add 4 at first and 5 at last,
        // so it becomes 4,1,2,3,5

        // Queue means
        // Insertion from left and deletion from right
        // Dequeue where De means double ended
        // Insertion from left/right and deletion from left/right


        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();
        ad1.add(1);
        ad1.add(2);
        ad1.add(11);
        ad1.add(12);

        // addAll(collection) adds all the elements of that collection at last
        ad1.addAll(ad2);
        ad1.addFirst(0);
        ad1.addLast(13);

        System.out.println("First element : "+ad1.getFirst());
        System.out.println("Last element : "+ad1.getLast());
        System.out.println(ad1);
    }
}
