import java.time.*;

/*
 * Demonstrating how the new date time objects are immutable
 * along with methods to add/remove time periods
 *
 * Also show method chaining
 */
public class DatePractice2 {

    public static void main(String [] args) {
        addTime();
        subtractTime();
        chainTime();
    }

    public static void addTime() {
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        System.out.println(d1.plusWeeks(1));
        System.out.println(d1.plusDays(14));
        System.out.println(d1.plusYears(10));
    }

    public static void subtractTime() {
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        System.out.println(d1.minusYears(7));

        LocalTime t1 = LocalTime.of(9,12,32);
        System.out.println(t1);
        System.out.println(t1.minusMinutes(4));
        System.out.println(t1.minusSeconds(4));
        System.out.println(t1.minusNanos(418));
    }

    public static void chainTime() {
        LocalDateTime dt1 = LocalDateTime.of(2013, Month.JULY, 4, 1, 23, 14);
        System.out.println(dt1);
        System.out.println(dt1.plusDays(4));
        System.out.println(dt1.plusDays(4).minusMinutes(10));
        System.out.println(dt1.plusDays(4).minusMinutes(10).plusSeconds(18));

    }

}
