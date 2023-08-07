import java.util.Scanner;

public class Unique_num {
    static int Unique(int arr[]) {
        int n = arr.length - 1;
        int u = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] != arr[j]) {
                    u = arr[i];
                    break;
                }
            }
        }
        return u;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int s = in.nextInt();
        int arr[] = new int[s];
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("the unique number from this array is= " + Unique(arr));
    }
}
