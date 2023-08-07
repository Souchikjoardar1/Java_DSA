import java.util.*;

@SuppressWarnings("unchecked")
class G<T> {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Object[] a = (T[]) new Object[n];// converting array a from Object type to a generic type <T> by downcasting

    G() {
        System.out.println("enter the array elements");
        for (int i = 0; i < n; i++) {
            this.a[i] = in.nextInt();
        }
        toString((T[]) a);// converting array a from Object type to a generic type <T> by downcasting
    }

    public void toString(T x[]) {
        System.out.println("the array elements are:");
        for (T a : x) {
            System.out.println(a);
        }
    }
}

@SuppressWarnings("unchecked")
public class Gen_array {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        new <Integer>G();
    }
}