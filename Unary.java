public class Unary {
    public static void main(String []  args) {
        int i = 0;
        i = i++; //Tricky, i is assigned itself before the increment runs so it never changes
        System.out.println("I is " + i); //prints 0
    }
}
