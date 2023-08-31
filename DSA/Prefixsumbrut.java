import java.util.*;

public class Prefixsumbrut {
    static int Prefix_sum(int arr[][], int r1, int c1, int r2, int c2) {
        int sum = 0;
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                sum += arr[i][j];
            }
        }
        printarray(arr);
        return sum;
    }

    static void printarray(int arr[][]) {
        for (var i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the total no of rows");
        int r = in.nextInt();
        System.out.println("enter the total no of columns");
        int c = in.nextInt();
        System.out.println("from row num : ");
        int r1 = in.nextInt();
        System.out.println("to row num : ");
        int r2 = in.nextInt();
        System.out.println("from column :");
        int c1 = in.nextInt();
        System.out.println("to column :");
        int c2 = in.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("enter the array elements ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("the original array: ");
        System.out.println("the sum of the array elements at those indexes is= " + Prefix_sum(arr, r1, c1, r2, c2));

    }
}
