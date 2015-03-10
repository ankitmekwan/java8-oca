import java.time.*;
import java.time.format.*;

/*
 * More examples of formatting dates
 * Example of parsing dates
 */
public class DateTimeFormatting2 {
    public static void main(String [] args) {
        //First example is a date that takes a DateTimeFormat argument
        LocalDate date1 = LocalDate.of(2013, 10, 15);
        System.out.println(date1.format(DateTimeFormatter.ISO_LOCAL_DATE));

        //Second example is a DateTimeFormatter that takes a date argument
        DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDate.format(date1));

        LocalTime time1 = LocalTime.of(5,12);
        DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        DateTimeFormatter mediumTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(shortTime.format(time1));
        System.out.println(mediumTime.format(time1));

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);
        System.out.println(dateTime1.format(shortDateTime));

        printPatterns();
        printParsedDates();
    }


    public static void printPatterns() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd yyyy MM");

        LocalDateTime dt1 = LocalDateTime.of(2013, Month.APRIL, 3, 2, 11);
        System.out.println(dt1.format(formatter));
        System.out.println(formatter2.format(dt1));
    }

    public static void printParsedDates() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        LocalDate date1 = LocalDate.parse("March 12 1986", formatter);
        System.out.println(date1);

    }
}
