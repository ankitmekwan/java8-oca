interface Test {
    int onlyInTest = 1;
    int value = 1;
    public static final int value2 = 2;
    public final static int value3 = 3;

    public static int getNum() {
        return 1;
    }
}

interface Test2 {
    int value = 1;
    public static final int value2 = 2;
    public final static int value3 = 3;
}

class InterfaceVariables implements Test, Test2 {

    public static void main(String [] args) {
        InterfaceVariables i = new InterfaceVariables();
        //Static vars defined on the interface are accessible via a reference
        //to an implementing class
        System.out.println(i.onlyInTest);

        //Same trick as above doesn't work on static methods
        //i.getNum(); //WILL NOT COMPILE

        //Must prefix the interface name for it to work
        Test.getNum();

        //WILL NOT COMPILE
        //Because value is declared in both Test and Test2 interfaces
        //note that merely implementing the interface won't cause a compilation issue,
        //only USING the variable as in the line below will cause the error
        //System.out.println(i.value);
        //

    }

}
