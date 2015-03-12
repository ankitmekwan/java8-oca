public class Primitives {

    public static void main(String[] args) {
        double y = 1.0;
      //float x = 1.0;  //WILL NOT COMPILE
        float x = 1.0f; //WORKS! BECAUSE of the 'f'
        float x2 = 100; //f isn't needed because there is no decimal in the literal

        short a = 10;
        short b = 20;

      //short c =  a + b; //WILL NOT COMPILE - type of a + b is int
        short c = (short)( a + b); //WORKS because of the cast
    }

}
