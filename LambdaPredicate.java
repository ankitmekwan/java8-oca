import java.util.function.*;
import java.util.ArrayList;
import java.util.List;

/*
 * Lamda examples with usage of Predicate, part of java.util.function
 */
public class LambdaPredicate {

    public static void main(String [] args) {

        ArrayList<String>  names =  new ArrayList<String>();

        names.add("john");
        names.add("sally");
        names.add("richard");
        names.add("sue");
        names.add("christopher");
        names.add("alexa");
        names.add("aj");
        names.add("sebastian");
        names.add("jose");
        names.add("jj");
        names.add("ted");
        names.add("elizabeth");
        names.add("jr");
        names.add("mom");

        printType(names, a -> a.length() == 4);

        printType(names, (String a) -> {
                                char first = a.charAt(0);
                                char last = a.charAt(a.length() - 1);
                                return first == last;
                    });

    }

    public static void printType(List<String> list, Predicate<String> type) {
        for(String s: list) {
            if (type.test(s))
                System.out.println(s + " passes the test ");
        }
    }
}
