/* Example showing that primitives and their corresponding wrapper classes to not
 * cause a compilation error because of duplicate signatures
 *
 * This is not the case with Arrays/Varargs
 */
public class MethodOverload {
    public static void main(String [] args) {
        byte x = (byte)12;
        byte y = 12;
        Byte z = new Byte(y);
        MethodOverload mo = new MethodOverload();
        mo.print(y);
        mo.print(x);
        mo.print(z);

    }

    public void print(Byte b) {
        System.out.println("Byte called");
    }

    public void print(byte b) {
        System.out.println("byte called");
    }

    public void print(int[] arr) {
        System.out.println("Array");
    }

    //This WONT COMPILE because of the method that takes
    //an int array. According to java, they have the same param list and name
    /*
    public void print(int... nums) {
        System.out.println("Varargs");
    }
    */
}
