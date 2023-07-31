import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(20);
        al.add(50);
        al.add(70);
        al.add(44);

        // for accessing and modifying elements in the collection
        for (int i = 0; i < al.size(); i++) {
            int a = (Integer) al.get(i); // auto unboxing and downcasting
            System.out.println("the arraylist via for loop " + (a));
        }

        // for each loop can also be used
        for (Object o : al) {
            int a = (Integer) o;
            System.out.println("the arraylist via for each loop " + (a)); // o is an object not an Integer
        }

        // since not all the colelction classes allow index based accessing hence we'll
        // use Iterators
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            int i = itr.next();
            System.out.println("element (Iterator) " + i);
        }

        // print from a reversed list of items using linkedIterator
        ListIterator<Integer> litr = al.listIterator(al.size());
        while (litr.hasPrevious()) {
            int i = litr.previous();
            System.out.println("element (ListIterator) " + i);
        }
    }
}