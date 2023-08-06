import java.util.*;

public class Lastindex {
    static int lastIndex(int arr[], int x) {
        int index = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x)
                index = i;
        }
        if (index < 0)
            return -1;
        else
            return index;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter the number yoou wanna find the last occurence of ");
        int x = in.nextInt();
        System.out.println("the last occurence of " + x + " is at index" + lastIndex(arr, x));
    }
}
