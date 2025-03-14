package Revise;

class demo1 {
    public void display() {
        System.out.println("inside display in demo1 class ");
    }
}

class demo2 extends demo1 {
    void test() {
    }

    public void display() { // you can't reduce the visibility of a method
        System.out.println("inside the display method of demo 2 class");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        demo1 d = new demo2();
        d.display();
    }
}
