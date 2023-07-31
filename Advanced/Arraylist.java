import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        System.out.println(al1);
        ArrayList al2 = new ArrayList();
        al2.add("souchik");
        al2.add('c');
        al1.addAll(al2);
        System.out.println(al1);// to join two collections together both arrays will be joined
        // heterogenous dynamic arrays = arraylists
        al2.add(2, al1);
        System.out.println(al2);// adding a whole collection at the any index of another collection
        al1.add(2, "pw");
        System.out.println(al1);// inserting an element as an object at any index
        // auto insertion in a dynamic array
        ArrayList al3 = new ArrayList();
        al3.add(209);
        al3.add(100);
        al3.add(33);
        al3.add(33);
        System.out.println(al3);// the order of insertion is preserved
        // data duplication is allowed
        al3.clear();// for deleting an arraylist all contents but the structure is intact
        System.out.println(al3);
    }
}
