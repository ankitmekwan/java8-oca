/*Examples of return types*/
public class ReturnTest {

    public static void main(String [] args) {

    }

    public int doIt() {
        short a = 10;
        return a;
    }

    public int returnDouble() {
        double a = 11.01;
        //return a;//WILL NOT COMPILE
        return (int)a;
    }
}
