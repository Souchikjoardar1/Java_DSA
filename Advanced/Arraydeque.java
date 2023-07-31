import java.util.*;

public class Arraydeque {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(100);
        ad.add("pw");
        ad.addFirst('c');
        ad.addLast('a');
        System.out.println("the collection 1 " + ad);
        ArrayDeque ad1 = new ArrayDeque();
        ad1.offer("chikowski");
        ad1.offerFirst(250);
        ad1.offerLast(true);
        System.out.println("the collection 2 " + ad1);
        ArrayList<Integer> al = new ArrayList<Integer>(List.of(40, 30, 66, 22, 20));
        Iterator i = al.iterator();
        System.out.println("the arraylist is : ");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        // index based insertion or deletion is not allowed both heterogenous and
        // homogenous data is stored duplicates are allowed
        // difference between offer() and add() is that offer might be rejected and so
        // does the insertion of data at either end but that's not the case in case of
        // add()
    }
}
