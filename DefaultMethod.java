/*
 * Examples of default methods
 */
interface Animal {
    //Notice use of the default keyword
    public default void eat() {
        System.out.println("Animal eating");
    }

    public void run();

    //This is a PUBLIC method even though it looks like it is package access
    //ALL methods on an interface are public
    void walk();
}

interface HungryAnimal extends Animal {

    public default void eat() {
        System.out.println("Animal is hungrily eating");
    }
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
