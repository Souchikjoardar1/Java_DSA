import java.util.*;

class S {
    public int sqrt(int arr[], int num) {
        int high = num;
        int low = 0;
        int result = -1;
        while (low <= high) {
            int mid = (high + low) / 2;
            long value = mid * mid;
            if (num == value) {// perfect square number
                return mid;
            } else if (num > value) {// not perfect square
                result = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return result;
    }
}

public class Square_root {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        S b = new S();
        System.out.println("enter the number to find the sqrt");
        int e = in.nextInt();
        int arr[] = new int[e];
        for (int i = 0; i < e; i++) {
            arr[i] = i;
        }
        System.out.println("the square of the number using binary search is= " + b.sqrt(arr, e));
    }
}
