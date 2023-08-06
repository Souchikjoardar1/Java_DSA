import java.util.*;

public class Smalllarge {
    static int[] sortarray(int arr[]) {
        Arrays.sort(arr);
        int a[] = { arr[0], arr[arr.length - 1] };
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int s = in.nextInt();
        int arr[] = new int[s];
        System.out.println("enter the array of elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int a[] = sortarray(arr);
        System.out.println("the smallest and the largest elements of the array are = " + a[0] + " " + a[1]);
    }
}
