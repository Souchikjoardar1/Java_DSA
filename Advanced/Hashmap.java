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
    }
}
