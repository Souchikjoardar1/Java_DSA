package Advanced;

import java.util.*;

public class Treeset {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println("the tree uses the binary search tree data structure " + ts);
        // duplicates not allowed heterogenous data not allowed if childnode is greater
        // than the parent node then the node is placed rightside else place it leftside
        // it uses inorder traversal method
        System.out.println("the higher value of 50 is = " + ts.higher(50));
        System.out.println("the lower value of 50 is = " + ts.lower(50));
        System.out.println("the ceiling value of 40 is =" + ts.ceiling(40));
        System.out.println("the floor value of 40 is =" + ts.floor(40));

    }
}
