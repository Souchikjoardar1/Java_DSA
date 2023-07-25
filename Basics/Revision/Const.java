class A {
    int length;
    int breadth;

    A(int a, int b) {
        length = a;
        breadth = b;
        System.out.println("the value of length and breadth is =" + length + " " + breadth);
    }

    A(int b, float a) {
        length = b;
        breadth = (int) a;
        System.out.println("the value of length and breadth is =" + length + " " + breadth);
    }

    // A() {
    // }
}

public class Const {
    public static void main(String[] args) {
        A obj = new A(10, 20);
        new A(30, 20);
        new A(12, 30); // invoke the constructor twice to get diff results
        System.out.println("the value of length is=" + obj.length + "" + "the value of breadth is=" + obj.breadth);
    }
}
