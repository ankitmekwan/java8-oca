/*
 * This is an example of two interfaces that have the same default methods
 * and the abstract class that implements both
 */

abstract interface Bird {
    public default int fly() {return 1;}
}

abstract interface Plane {
    public default int fly() {return 1;}
}

abstract interface Drone {
    public default String fly() {return "s";}
}

public abstract class AbstractDefaultMethod implements Bird, Plane  {
    public static void main(String [] args) {

    }

    // This class MUST define the fly class to resolve the ambiguity
    // of which method to implement, given that both interfaces use the same method signature
    // even though it is abstract!
    public int fly() {return 0;}
}

//can't do this because plane and drone share method signature with different return types
//class FlyingThing implements Plane , Drone { } //WILL NOT COMPILE


