import java.util.Scanner;

class Insert {
    void insert(int arr[], int e, int index) {
        int temp = arr.length - 1;
        for (int i = temp; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = e;
        display(arr);
    }

    void display(int arr[]) {
        System.out.println("the array after insertion: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class Array_insert {
    public static void main(String[] s) {
        Insert obj = new Insert();
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array size");
        int size = in.nextInt();
        int arr[] = new int[size + 1];
        System.out.println("enter the array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("enter the element to be inserted");
        int e = in.nextInt();
        System.out.println("enter the index at which you want to insert");
        int index = in.nextInt();
        obj.insert(arr, e, index);
    }
}
