/* Example showing that primitives and their corresponding wrapper classes to not
 * cause a compilation error because of duplicate signatures
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
}
