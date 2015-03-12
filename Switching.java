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

        //This will print nothing since there is no match and no default case
        switch(a) {
            case 'a': System.out.println("a");
            case 'b': System.out.println("b");
                      break;
        }
    }
}
