public class ThrowExceptionsWithFinally {
    public static void main(String [] args) {
        try {
            tossHard();
        }
        catch (Exception e) {
            System.out.println("Inside the catch block");
        }

        System.out.println("Done with main");
    }

    public static void toss() { // NO need to declare exception because it throws a RuntimeException
        throw new RuntimeException();
    }

    public static void tossHard() throws Exception {
        throw new Exception();
    }
}
