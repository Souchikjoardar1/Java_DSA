package Advanced;

import java.lang.*;

class A {
    public String toString() {
        return "My class A";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(Object o1) {
        return this.hashCode() == o1.hashCode();
    }
}

public class Myobject {
    public static void main(String[] args) {
        Myobject o = new Myobject();
        Myobject o1 = new Myobject();
        System.out.println("checks whether both the objects are same or not " + o.equals(o1));// checks whether both
                                                                                              // these objects refers to
                                                                                              // the same menory address
                                                                                              // ref
        System.out.println("the hascode of the object o is=" + o.hashCode());
        System.out.println("the hascode of the object o1 is=" + o1.hashCode());
        // if (o.hashCode() == o1.hashCode()) {
        // System.out.println("same hascode same reference");
        // } else
        // System.out.println("objects not the same");
        System.out.println(o.toString());
    }
}
