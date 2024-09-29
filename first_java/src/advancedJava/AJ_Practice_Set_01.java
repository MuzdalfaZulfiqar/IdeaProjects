package advancedJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AJ_Practice_Set_01 {
    public static void main(String[] args) {
        p1();
    }

    public static void p1(){
        // Problem 1
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Muzdalfa");
        l1.add("Asma");
        l1.add("Maryam");
        l1.add("Ali Asad");
        l1.add("Zulfiqar");
        l1.add("Riffat");
        l1.add("Hanan");
        l1.add("Salaar");
        l1.add("Jahan");
        l1.add("Umar Jahangir");
        System.out.println("The list of students is : ");
        for (String s: l1){
            System.out.println(s);
        }
    }

    public static void p2(){
        // problem 2
        System.out.println("Date class-------");
        Date d = new Date();
        System.out.println(d.getHours()+" : "+d.getMinutes()+" : "+ d.getSeconds());
    }

    public static void p3(){
        // Problem 3
        System.out.println("Calendar class---");
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR)+" : "+c.get(Calendar.MINUTE)+" : "+c.get(Calendar.SECOND));

    }
    public static void p4(){

        // Problem 4
        System.out.println("Java Time API class");
        LocalDateTime Ld = LocalDateTime.now();
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("H : m : s");
        String  s = Ld.format(dt);
        System.out.println(s);
    }

    public static void p5(){
        // Problem 5
        // Set is abstract class ,so we use hashSet which is concrete class
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(13);
        hs.add(14);
        hs.add(15);
        hs.add(12);
        hs.add(24);
        System.out.println(hs);

    }

   }
