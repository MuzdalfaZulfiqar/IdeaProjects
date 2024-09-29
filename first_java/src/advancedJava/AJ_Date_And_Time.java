package advancedJava;
import java.time.*;
import java.util.Date;

public class AJ_Date_And_Time {
    public static void main(String[] args) {

        long ms = System.currentTimeMillis();
        System.out.println(ms);
        System.out.println("The number of milliseconds passed since 1970 : "+System.currentTimeMillis());
        System.out.println("The number of hours passed since 1970 : "+System.currentTimeMillis()/1000/3600);
        System.out.println("The number of years passed since 1970 : "+System.currentTimeMillis()/1000/3600/365/24);
//        Date d = new Date();
//        System.out.println(d);
//        System.out.println(d.getTime());
//        System.out.println(d.getDate());  // deprecated
//        System.out.println(d.getYear());  // deprecated
//        System.out.println(d.getDay());   // deprecated

    }
}
