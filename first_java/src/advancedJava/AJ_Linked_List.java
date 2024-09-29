package advancedJava;
import java.util.ArrayList;
import java.util.*;

public class AJ_Linked_List {
    public static void main(String[] args) {
        // array list uses array faster access difficult to add new elements cost and tiresome task
        // linked list use independent objects
        // have three items  1) value itself  2) prev reference  3) Next reference
        // slow access because we need to iterate from head to tail
        // however it makes easy to add elements at any location by breaking connections between element's
        // prev and next element reference

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l1.add(1);
        l1.add(2);
        l1.add(1);
        l1.add(4);
        l1.add(0,-1);
        l1.add(0,0);
        //(It will place element at 0 index and shift other elements towards right)


        // add at last
        l1.addLast(12);

        //   **   addAll(index,arrayList)
        //l1.addAll(0,l2);
        //(It will place element at 0 index and shift other elements towards right)

        // add at first
        l1.addFirst(122);
        //  ** contains(element)
        System.out.println(l1.contains(1));



        // ** indexOf(element)
        System.out.println(l1.indexOf(1));

        // ** lastIndexOf(element)
        System.out.println(l1.lastIndexOf(1));

        // ** remove(index)
        l1.remove(1);
        l1.set(1,23);

        l1.removeFirstOccurrence(1);
        System.out.println(l1);

        // offer(element) add an element at the end of the list like addLast
        l1.offer(1);
        System.out.println("offer(1) : "+l1);

        // offerLast(element) adds an element at the end of the linked list
        l1.offerLast(2);
        System.out.println("offerLast(2) : "+l1);

        // offerFirst(element)  adds an element at the start of the linked list like addFirst
        l1.offerFirst(0);
        System.out.println("offerFirst(0) : "+l1);
    }
}
