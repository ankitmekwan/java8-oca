import java.time.*;

/*
 * Illustrates simple usage of the new date and time objects
 * introduced in Java 8
 */
public class DatePractice {

    public static void main(String [] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        printDate();
        printTime();
        printDateTime();
    }

    public static void printDate() {
        LocalDate date1 = LocalDate.of(2015, Month.MARCH, 16);
        System.out.println(date1);

        LocalDate date2 = LocalDate.of(2000, Month.DECEMBER, 8);
        System.out.println(date2);

        //Can use ints (1-12) for the month value too
        //April 8th, 2006
        LocalDate date3 = LocalDate.of(2006, 4, 8);
        System.out.println(date3);

    }

    public static void printTime() {
        //hour and minute
        LocalTime time1 = LocalTime.of(3,15);
        System.out.println(time1);

        //hour,minute and second
        LocalTime time2 = LocalTime.of(3, 15, 23);
        System.out.println(time2);

        //hour,minute,second and NANOseconds
        LocalTime time3 = LocalTime.of(22, 59, 23, 4001);
        System.out.println(time3);
    }

    public static void printDateTime() {
        //This uses all parameters
        LocalDateTime dt1 = LocalDateTime.of(2015, Month.MAY, 3, 6, 23, 19, 200);
        System.out.println(dt1);

        LocalDate ld = LocalDate.of(2011, Month.JUNE, 13);
        LocalTime lt = LocalTime.of(2, 24, 12);

        //Here we combine a LocalDate and a LocalTime to create
        // a LocalDateTime
        LocalDateTime dt = LocalDateTime.of(ld, lt);
        System.out.println(dt);
    }
}
