/*
 * Examples of default methods on interfaces
 */
interface Animal {
    //Notice use of the default keyword
    public default void eat() {
        System.out.println("Animal eating");
    }

    public void run(); //Standard interface method with no implementation

    //This is a PUBLIC method even though it looks like it is package access
    //ALL methods on an interface are public
    void walk();
}

interface HungryAnimal extends Animal {

    //Here the sub-interface can override its parent's method
    //still needs the default keyword to override correctly
    public default void eat() {
        System.out.println("Animal is hungrily eating");
    }
}

interface CrazyAnimal extends Animal {
    //Here we are redeclaring the previously default method as abstract,
    //so implementors of CrazyAnimal HAVE to define the method
    public void eat();
}


public class DefaultMethod implements Animal {

    public static void main(String [] args) {
        DefaultMethod d = new DefaultMethod();
        d.eat();
        OtherAnimal a = new OtherAnimal();
        a.eat();
    }

    //This method HAS to be implemented
    public void run() {
        System.out.println("I am running");
    }

    public void walk() {
        System.out.println("I am walking");
    }

}

class OtherAnimal implements HungryAnimal {

    public void walk() {}
    public void run() {}

}

class MentalAnimal implements CrazyAnimal {
    public void eat() {}
    public void walk() {}
    ; //random semicolon here doesn't hurt? weird
    ; //random semicolon here doesn't hurt? weird
    public void run() {}
}
