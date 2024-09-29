package advancedJava;

import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class AJ_Gregorian_Calendar {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.APRIL));
        System.out.print(c.get(Calendar.HOUR) + " : ");
        System.out.print(c.get(Calendar.MINUTE) + " : ");
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+" : "+c.get(Calendar.MINUTE)+" : "+c.get(Calendar.SECOND));

        // Concrete class and subClass of Calendar Class
        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(c.get(Calendar.YEAR)));
        System.out.println(g.getTime());

        //  TimeZone Class
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);

    }
}
