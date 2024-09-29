package advancedJava;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AJ_Time_Formatter {
    public static void main(String[] args) {
        // Here we got the current date
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        // Here we set the format(Standard)
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        // Now we want to relate our date to this format
        String myDate = dt.format(df);
        System.out.println(myDate);


        // Either create a formatter like this or we can also

        // In numbers form
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String st = dt.format(dtf);
        System.out.println("User-defined Formatter(Numbers) : "+st);

        // In day of week(Text form)
        DateTimeFormatter dtDay = DateTimeFormatter.ofPattern("MM-E-yyyy");
        String st1 = dt.format(dtDay);
        System.out.println("User-defined Formatter(Text) : "+st1);

        // Time (use  h:m a(a for am/pm  and H for 24 hours format))(Text form)
        DateTimeFormatter dtAMPM = DateTimeFormatter.ofPattern("MM-E-yyyy - h : m a ");
        String st2 = dt.format(dtAMPM);
        System.out.println("User-defined Formatter(AM/PM) : "+st2);

        // Use the built-in format like this one
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String s = dt.format(df2);
        System.out.println("Built-in Formatter : "+s);


    }
}
