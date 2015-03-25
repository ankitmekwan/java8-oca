public class Unary {
    public static void main(String []  args) {
        int i = 0;
        i = i++; //Tricky, i is assigned itself before the increment runs so it never changes
        System.out.println("I is " + i); //prints 0

        int k = 0;
        k = ++k;
        System.out.println("K is " + k); //prints 1

        int j = 0;
        j++;
        System.out.println("J is " + j);
    }
}
