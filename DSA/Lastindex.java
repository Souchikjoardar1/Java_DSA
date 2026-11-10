import java.util.*;

public class Lastindex {
    static int lastIndex(int arr[], int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the target value:");
        int x = in.nextInt();
        System.out.println("The last occurrence of " + x + " is at index " + lastIndex(arr, x));
    }
}
