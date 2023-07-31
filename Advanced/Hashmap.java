import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Hashtable hm = new Hashtable();
        hm.put(1, "souchik");
        hm.put(2, "joardar");
        hm.put(3, "beast");
        System.out.println(hm);
        HashMap h = new HashMap();
        h.put("rohit", "dude");
        h.put("Chikowski", "Alfredo");
        h.put("kacey", "musgraves");
        h.put(null, null);
        System.out.println(h);
        LinkedHashMap l = new LinkedHashMap();
        l.put(10, "easy g");
        l.put(1, "Eminem");
        System.out.println(l);
        // in linked hash map the order of insertion is preserved
        // null keys and values are allowed duplicate values are permitted but keys have
        // to be unique
        Hashtable ht = new Hashtable();
        ht.put(1, "google");
        ht.put(2, "microsoft");
        ht.put(3, "goldman sachs");
        // ht.put(null, "goldman sachs");
        // the above one throws an exception null pointer , the key cannot be null
        System.out.println("hashtable " + ht);
        ht.putIfAbsent(4, "Mozilla"); // the position is empty then only insert this one
        System.out.println("hashtable " + ht);
        TreeMap tm = new TreeMap();
        Integer i = new Integer(1);
        tm.put(i, "chrome");
        System.out.println("treemap " + tm);
        // we can pass an integer object has a key to a tree map
    }
}
