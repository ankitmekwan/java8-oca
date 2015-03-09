import java.time.*;

/*
 * Demonstrate more methods:
 * -isBefore
 * -isAfter
 * -toEpochDay
 * -toEpochTime //TODO
 */
public class DatePractice3 {

    public static void main(String [] args) {
        printEpoch();
        printBefore();
        printAfter();

        printPeriod();
    }

    public static void printEpoch() {
        LocalDate d1 = LocalDate.of(2013, 11, 3);
        System.out.println(d1);
        System.out.println(d1.toEpochDay());
        //System.out.println(d1.toEpochTime()); DOES NOT COMPILE

        LocalTime t1 = LocalTime.of(1,45);
        System.out.println(t1);
        //System.out.println(t1.toEpochTime()); DOES NOT COMPILE

        LocalDateTime dt1 = LocalDateTime.of(d1,t1);
        System.out.println(dt1);
        //System.out.println(dt1.toEpochDay()); WILL NOT COMPILE

    }

    public static void printBefore() {
        LocalTime t1 = LocalTime.of(1,45);
        System.out.println(t1);
        LocalTime t2 = LocalTime.of(2,55);
        System.out.println(t2);
        System.out.println(t2.isBefore(t1));

        LocalDate d1 = LocalDate.of(2014, 11, 3);
        LocalDate d2 = LocalDate.of(2013, 11, 3);
        System.out.println(d2.isBefore(d1));
        System.out.println(d1.isBefore(d2));
    }

    public static void printAfter() {
        LocalTime t1 = LocalTime.of(1,45);
        System.out.println(t1);
        LocalTime t2 = LocalTime.of(2,55);
        System.out.println(t2);
        System.out.println(t2.isAfter(t1));

        LocalDate d1 = LocalDate.of(2014, 11, 3);
        LocalDate d2 = LocalDate.of(2013, 11, 3);
        System.out.println(d2.isAfter(d1));
        System.out.println(d1.isAfter(d2));
    }

    public static void printPeriod() {
        Period p1 = Period.ofMonths(1);
        LocalDate d1 = LocalDate.of(2014, 11, 3);
        //Supports addition/subtraction of Periods
        System.out.println(d1.plus(p1));
        System.out.println(d1.minus(p1));

        LocalTime t1 = LocalTime.of(5,34);
        //System.out.println(t1.plus(p1)); RUNTIME ERROR: Adding months to a time

        Period yearAndADay = Period.of(1,0,1);
        System.out.println(d1.plus(yearAndADay));

        //WARNING: Period methods can't be chained!
        //The following code creates a period of 1 week
        //NOT 1 week and 1 day
        Period.ofDays(1).ofWeeks(1);
    }
}
