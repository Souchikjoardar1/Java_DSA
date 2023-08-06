import java.util.*;

public class Array {
    static void printArr(int a[]) {
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr1[] = new int[5];
        System.out.println("enter the array elements");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = in.nextInt();
        }
        printArr(arr1);
        int arr2[] = Arrays.copyOf(arr1, arr1.length);
        System.out.println("the copied array is");
        printArr(arr2);
        arr2[0] = 19;
        arr2[2] = 45;
        System.out.println("the copied array after changes");
        printArr(arr2);
        System.out.println("the original arrays after changes to the copied array");
        printArr(arr1);// deep copy
        int arr3[] = arr2;
        printArr(arr3);// print the copied array
        arr3[0] = 12;
        arr3[1] = 3;
        printArr(arr2);// print the original array
        int[] arr4 = Arrays.copyOfRange(arr3, 0, arr3.length);// starting index in inclusive but the ending index is
                                                              // exclusive
        printArr(arr4);
    }
}
