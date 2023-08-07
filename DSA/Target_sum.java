import java.util.Scanner;

public class Target_sum {
    static int triplet_sum(int arr[], int x) {
        int flag = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == x)
                        flag++;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter the target number");
        int x = in.nextInt();
        System.out.println("the no of triplets which can achieve the target sum are " + triplet_sum(arr, x));
    }
}
