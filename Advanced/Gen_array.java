import java.util.*;

@SuppressWarnings("unchecked")
class G<T> {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    ArrayList<T> list = new ArrayList<>();

    G() {
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            Integer e = in.nextInt();
            list.add((T) e);
        }
        printarray(list);
    }

    public void printarray(ArrayList<T> x) {
        System.out.println("the array elements are:");
        for (T a : x) {
            System.out.println(a);
        }
    }
}

public class Gen_array {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        new G<Integer>();
    }
}
