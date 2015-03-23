/*
 * Examples of Exceptions
 */
public class Exceptions {

    public static void main(String [] args) {
        System.out.println("a");
        try {
            System.out.println("b");
            noException();
            e();
        }
        finally {
            System.out.println("c");
        }
        System.out.println("d");
    }

   public static void noException() {}{
       System.out.println("No exception thrown here");
   }

    public static void e() {
        throw new RuntimeException();
    }
}
