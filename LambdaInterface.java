import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/*
 * Another example that shows the use of functional interfaces.
 * This one uses an interface with a method that takes 2 arguments
 */
class LambdaInterface {

    public static void main(String [] args) {
        List<String> makes = new ArrayList<>();
        makes.add("Honda");
        makes.add("GMC");
        makes.add("Chevrolet");
        makes.add("Nissan");
        makes.add("Ford");
        makes.add("Kia");
        makes.add("Porsche");
        makes.addAll(Arrays.asList("Ferrari", "Pontiac", "BMW", "Mercedes"));

        for(String make : makes) {
            useTakeOne((k) -> k.length() % 2 == 0 , make);
        }

        for(int i = 0; i < makes.size() - 2; i++) {
            useTakeTwo((s1, s2) -> s1.length() % 2 == s2.length() % 2, makes.get(i), makes.get(i+1));
        }
    }

    public static void useTakeOne(TakeOne t, String s) {
        if (t.inspect(s)) {
            System.out.println(s +" passes the test");
        }
    }

    public static void useTakeTwo(TakeTwo t, String s, String r) {
        if (t.inspect(s, r)) {
            System.out.println(s + " and " + r +" pass the test");
        }
    }

}

interface TakeOne {
    public boolean inspect(String a);
}

interface TakeTwo {
    public boolean inspect(String a, String b);
}
