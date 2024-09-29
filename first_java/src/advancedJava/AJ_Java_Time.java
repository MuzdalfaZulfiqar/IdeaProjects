package advancedJava;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AJ_Java_Time {
    public static void main(String[] args) {
        // In previous methods it was possible to change the date but that's no the case for this class
        // It is immutable
        // We do not create the object of this class sout

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);// considers nanoSeconds
    }
}
