class Outer {
    int x = 10;

    class Inner1 {
        int y = 20;

        void Inner_display() {
            System.out.println("prints the value of x from Inner_display() " + x);
            System.out.println("prints the value of y from Inner_display() " + y);
        }
    }

    void Outer_display() {
        Inner1 i = new Inner1();
        System.out.println(i.y); // to access the variables of inner classes in an outer class we have to use
                                 // objects
    }
}

public class Inner {
    public static void main(String[] args) {
        Outer o = new Outer();
        System.out.println("value of variable x from outer class using object of Outer class type" + o.x);
        Outer.Inner1 i = o.new Inner1();
        i.Inner_display();
        o.Outer_display();
        System.out.println("value of variable y from inner class " + i.y);
    }
}
