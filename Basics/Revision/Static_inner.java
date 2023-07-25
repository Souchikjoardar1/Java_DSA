class Outer {
    int x = 10;
    static int y = 20;
    static {
        System.out.println("inside the static block");
    }

    // only inner classes can be static
    static class S_inner {// can be accessed by the classname.subclassname
        static void x() {
            System.out.println("the value of static variable y is =" + y);
        }
    }

    class inner {
        void x() {
            System.out.println("the value of the non static variable x is" + x);
        }
    }
}

public class Static_inner {
    public static void main(String[] args) {
        Outer.S_inner o = new Outer.S_inner();// the object of static inner class is created using the outer class
        Outer.inner o1 = new Outer().new inner();// the object of both the inner class and outer class is created
        Outer.S_inner.x();// accessing a static way can be accessed with objects also
        // o.x();accessing the x() using ref o
        o1.x();
        System.out.println("the value of variable y from outer class is= " + Outer.y);
    }
}
