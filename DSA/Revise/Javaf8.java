package Revise;

interface Computer {
    void show();

    // we can define methods inside interfaces using default and static keywords
    default void config() {// non static
        System.out.println("inside config");
    }

    static void config2() {
        System.out.println("inside config2");
    }
}

public class Javaf8 {
    public static void main(String[] args) {
        Computer.config2();// static methods defined inside an interface
        Computer c = new Computer() { // anonymous inner class
            public void show() {
            }
        };
        // incase if the method defined inside is a non static method
        c.config();
    }
}