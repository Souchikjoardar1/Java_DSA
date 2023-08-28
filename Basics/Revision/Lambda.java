package Revision;

interface I {
    void display();

}

public class Lambda {
    public static void main(String[] args) {

        // anonymous inner class
        // Lambda l = new Lambda() {
        // public void display() {
        // System.out.println("anonymous inner class");
        // }
        // };
        // lambda method
        I ld = () -> {// it is a reference of interface I which will be used contain the definition of
                      // the display()
            System.out.println("lambda method");
        };
        ld.display();
        // l.display();
    }
}
