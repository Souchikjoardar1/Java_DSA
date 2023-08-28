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
        I ld = () -> {
            System.out.println("lambda method");
        };
        ld.display();
        // l.display();
    }
}
