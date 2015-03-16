/*
 * This is an example of the automatic data type conversions that take place in Java
 */
class Widening {
    public static void main(String [] args) {
        byte b = 11; // We have byte
        b++; //++ keeps the data type - still a byte
        b += 1; //compound operator preserves the data type - still a bype
       // b = b + 1; // compiler error
    }
}
