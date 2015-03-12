# java8-oca
Practicing for Java 8 OCA Exam

## Review
- lambdas
- date/time
- default interface methods
- static interface methods

## Notes
It is not possible to construct a date or time object directly
```
LocalDate d1 = new LocalDate(); // WILL NOT COMPILE
```

You cannot have a static method and a non-static method with the same name in the same class
```
//WILL NOT COMPILE
public class StaticTest {
    public static void test() {
        //do nothing
    }

    public void test() {
        //do nothing
    }

    public static void main(String [] args) {
        test();
    }
}
```
