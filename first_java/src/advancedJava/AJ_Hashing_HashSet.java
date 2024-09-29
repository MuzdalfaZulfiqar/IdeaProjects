package advancedJava;

import java.util.HashMap;
import java.util.HashSet;

public class AJ_Hashing_HashSet {
    public static void main(String[] args) {
        // Hashing is technique to convert range of key value pairs into range of key value indices
        // make search and insertion fast

        // array of size 10
        // hash function gives us indices in array like we use function f(x) = x % 10;
        // we have           x        f(x)
        //                  72         72%10 = 2 (72 will be stored at index 2)
        //                  39         39%10 = 9 (39 will be stored at index 9h)
        //                  11         11%10 = 1 (11 will be stored at index 1)
        // we can face issue when two elements will have same remainder, so we should leave some spaces in array
        // this is called hasCollision , and we have several techniques to handle this
        // 1)-- the technique we are using is open addressing
        // which says that if you encounter any collision place the new element in new position
        // 2)-- Chaining if two elements have same index we wil not place both at that index
        // and point it towards the linked list and store both at that like 72,92
        // we use classes
        // HshSet
        // HashMap
        // LinkedHashMap
        // HashTable

        HashSet<Integer> h1 = new HashSet<>(10,0.75f);
        // HashSet does not allow repetition
        h1.add(82);
        h1.add(6);
        h1.add(62);
        h1.add(11);
        System.out.println(h1);

    }
}
