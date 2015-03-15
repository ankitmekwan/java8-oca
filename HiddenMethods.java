/*
 * Example of hidden methods. Hidden methods are static methods
 * that are overridden in subclasses
 */
class Parent {

    public static void test() {

    }

    public static void main(String [] args) {

    }
}

class Child extends Parent {

    public static void test() {
    }
    //static void test() { } // WONT COMPILE - java complains weaker access privilege

    public static void main(String [] args) {

    }
}

class OtherChild extends Parent {
    //public void test() {}  WONT COMPILE because parent method is static
}

class AnotherOtherChild extends Parent {
    //public static int test() {return 1;}//  WONT COMPILE because parent method has return type void
}
