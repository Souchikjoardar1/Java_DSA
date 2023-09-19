import java.util.*;

class Bs {
    public void bubble(int arr[]) {
        // for every itteraction we will get the biggest element at the end
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap between arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

}

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[] = { 10, 56, 33, 78, 2, 70 };
        Bs b = new Bs();
        System.out.println("the original array is:- ");
        System.out.println(Arrays.toString(arr));
        b.bubble(arr);
        System.out.println("the sorted array:- ");
        System.out.println(Arrays.toString(arr));
    }
}
