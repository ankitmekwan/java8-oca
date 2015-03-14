class Vehicle {
    private void drive() {
        System.out.println("Vehicle driving");
    }

    /*
     * In this example drive isn't overriden because it is private
     * Therefore dynamic dispatching does not occur and the drive in the
     * super class is the one that's called
     */
    public static void main(String [] args) {
        Car c = new Car();
        c.drive();
        Vehicle v = new Car();
        v.drive(); //Prints vehicle driving
        Vehicle v2 = new Vehicle();
        v2.drive(); //Prints vehicle driving
    }
}

class Car extends Vehicle {
    public void drive() {
        System.out.println("Car driving");
    }
    public static void main(String [] args) {
        Car c = new Car();
        c.drive();
        Vehicle v = new Car();
    }
}
