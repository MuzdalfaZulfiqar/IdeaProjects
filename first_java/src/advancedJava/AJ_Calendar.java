package advancedJava;

import java.util.Calendar;
import java.util.TimeZone;

public class AJ_Calendar {
    public static void main(String[] args) {
        // Calendar class is abstract class we cannot create instance of this class
        // it has static method which gives us the instance of this class
//        Calendar c = Calendar.getInstance();
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());


    }
}
