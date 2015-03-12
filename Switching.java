/*
 * Examples of switch case statements
 */
public class Switching {
    public static void main(String [] args) {
        switch1();

    }

    public static void switch1() {
        char a = 'a';

        switch(a) { } //EMPTY SWITCH WILL COMPILE

        //This will print nothing since there is no match and no default case
        switch(a) {
            case 'b': System.out.println("b");
                      break;
        }
        System.out.println("");

        switch(a) {
            case 'b': System.out.println("b");
            //case 'b': System.out.println("b"); // WILL NOT COMPILE, duplicate case
                      break;
        }
        System.out.println("");

        //This will print default
        switch(a) {
            case 'b': System.out.println("b");
                      break;
            default:  System.out.println("default case");
        }
        System.out.println("");

        //This will print a and b because of the fallthrough
        switch(a) {
            case 'a': System.out.println("a");
            case 'b': System.out.println("b");
                      break;
        }
        System.out.println("");

        //This will only print 'a'
        switch(a) {
            case 'a': System.out.println("a");
                      break;
            case 'b': System.out.println("b");
                      break;
        }
        System.out.println("");

        //Prints default, d and m
        switch(a) {
            case 'b': System.out.println("b");
            case 'e': System.out.println("e");
            case 'c': System.out.println("c");
            default:  System.out.println("default case");
            case 'd': System.out.println("d");
            case 'm': System.out.println("m");
        }
        System.out.println("");

        /* Will not compile, can't switch on doubles
        double db = 10.0;
        switch (db) {
            case 11: System.out.println("won't work");
        }
        */
    }
}
