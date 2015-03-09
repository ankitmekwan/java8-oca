import java.util.ArrayList;

/*
 * Very basic use of a simple lambda expressions
 */
public class LambdaPractice {

    public static void main(String [] args) {
        ArrayList<String>  names =  new ArrayList<String>();

        names.add("john");
        names.add("sally");
        names.add("richard");
        names.add("sue");
        names.add("christopher");
        names.add("aj");
        names.add("sebastian");
        names.add("jose");
        names.add("ted");
        names.add("elizabeth");
        names.add("jr");

        System.out.println(names);

        int minLength = 2;

        //lambdas can access local variables
        names.removeIf(a -> a.length() <= minLength);
        System.out.println(names);

        //Parens can be used around the lambda argument
        names.removeIf((a) -> a.length() < 4);
        System.out.println(names);

        //Parens are REQUIRED if specifying the type
        names.removeIf((String a) -> a.length() > 8);
        System.out.println(names);

        //When using braces {} in the method body,
        // a return statement and semicolons are required
        names.removeIf(a -> {return a.length() == 4;});
        System.out.println(names);
    }
}
