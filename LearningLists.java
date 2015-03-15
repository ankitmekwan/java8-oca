import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class LearningLists {

    public static void main (String [] args) {
        List<String> makes = new ArrayList<>();
        System.out.println(makes.isEmpty());

        makes.add("Honda");
        makes.add("Nissan");
        makes.add("Subaru");

        System.out.println(makes.isEmpty());

        System.out.println(makes);
        makes.add(0, "Kia");
        makes.add(0, "BMW");

        System.out.println(makes);
        makes.clear();

        System.out.println(makes);
        makes.addAll(Arrays.asList("Honda", "Nissan", "Subaru", "Kia", "BMW"));
        System.out.println(makes);

        System.out.println(makes.contains("Honda"));
        System.out.println(makes.contains("Ford"));

        System.out.println(makes.containsAll(Arrays.asList("Honda", "BMW")));
        System.out.println(makes.containsAll(Arrays.asList("Ford", "BMW")));

        System.out.println(makes.get(2));
        makes.set(2, "Dodge");
        System.out.println(makes.get(2));

        System.out.println(makes.indexOf("Ford"));
        makes.add("Ford");
        System.out.println(makes.indexOf("Ford"));

        System.out.println(makes.size());

        System.out.println(makes.toArray(new String [0] ));

    }
}
