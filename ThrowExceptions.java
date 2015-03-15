public class ThrowExceptions {
    public static void main(String [] args) {

        toss();
        try {
            tossHard();
        }
        catch (Exception e) {}
    }

    public static void toss() { // NO need to declare exception because it throws a RuntimeException
        throw new RuntimeException();
    }

    public static void tossHard() throws Exception {
        throw new Exception();
    }
}
