import java.time.*;
import java.time.format.*;

/*
 * More methods on instances of LocalDate, LocalTime and LocalDateTime,
 * as well as datetime formatting
 *
 * - format()
 *
 * DateTimeFormatter is in java.time.format
 */
public class DateTimeFormatting {
    public static void main(String [] args) {
        printDateParts();
        printFormattedDates();
    }

    public static void printDateParts() {
        LocalDate d1 = LocalDate.of(2013, 12, 5);
        System.out.println(d1.getDayOfWeek());
        System.out.println(d1.getDayOfMonth());
        System.out.println(d1.getDayOfYear());
        System.out.println(d1.getYear());
        System.out.println(d1.getMonth());
    }

    public static void printFormattedDates() {
        LocalDate date = LocalDate.of(2012, Month.OCTOBER, 11);
        LocalTime time = LocalTime.of(3,11);
        LocalDateTime datetime = LocalDateTime.of(date,time);

        System.out.println(datetime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(datetime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
