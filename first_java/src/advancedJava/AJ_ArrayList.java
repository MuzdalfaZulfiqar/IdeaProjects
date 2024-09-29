package advancedJava;
import java.util.*;
public class AJ_ArrayList {
        public static void main(String[] args) {
                // syntax of generics
                ArrayList<Integer> l1 = new ArrayList<>();
                ArrayList<Integer> l2 = new ArrayList<>();
                l2.add(11);
                l2.add(12);
                l2.add(13);
                l1.add(1);  // At 2 index
                l1.add(2);  // At 3 index
                l1.add(1);  // At 4 index
                l1.add(4);  // At 5 index
                l1.add(0,-1); // At 1 index
                l1.add(0,0); // At 0 index
                //(It will place element at 0 index and shift other elements towards right)


                //   **   addAll(index,arrayList)
                // if no index then it will add them at end
                // addAll is used to pass arrayList as an argument and also index to where it should start from
                l1.addAll(0,l2);
                //(It will place element at 0 index and shift other elements towards right)


                //  ** contains(element)
                System.out.println(l1.contains(1));

                // ** ensureCapacity(int)  means enhance the capacity of arrayList upto given limit
                l1.ensureCapacity(100);

                // ** indexOf(element)
                System.out.println(l1.indexOf(1));

                // ** lastIndexOf(element)
                System.out.println(l1.lastIndexOf(1));

                // ** remove(index)
                l1.remove(1);
                l1.set(1,23);
                // add will keep adding the elements and moving the others to right in respective order
                // it will not delete any element but
                // set element will remove the element if any at that particular index and will take its place
                System.out.println(l1);
//              for(int i=0;i<l1.size();i++){
//                        System.out.println(l1.get(i));
//                }

                // check if the arraylist is empty or not
                System.out.println(l1.isEmpty());

                // compares two arraylists and return true if they have same size, same corresponding elements
                ArrayList<Integer> l3 = new ArrayList<>(20);
                ArrayList<Integer> l4 = new ArrayList<>();
                l3.add(1);
                l3.add(2);
                l3.add(3);
                l4.add(1);
                l4.add(2);
                l4.add(3);
                System.out.println(l3.equals(l4));

                // it will remove the unused space from arraylist like it was 20 but used only 3
                // so after trimming it had 3 capacity only
                l3.trimToSize();
                System.out.println(l3.size());

                System.out.println(l3.subList(1,3));

                // sort in reverse order
                Collections.sort(l2,Collections.reverseOrder());
        }

}
