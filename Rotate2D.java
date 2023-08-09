import java.util.*;

class Rotate2D {
    static void rotatedarray(int arr[][], int r, int c) {
        int[][] rotated = new int[c][r]; // Create a new array to store rotated elements

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                rotated[j][r - 1 - i] = arr[i][j];
                /*
                 * The new row index is the original column index (j).
                 * The new column index is the total rows (r) minus 1 and subtracting the
                 * original row index (i).
                 */
            }
        }

        printarray(rotated);
    }

    static void printarray(int arr[][]) {
        for (var i : arr) {
            System.out.println(Arrays.toString(i));
        }
    }

    /*
     * It uses a loop to go through each "mat" in an array called "arr".
     * For each "mat" in the array, it prints out the contents of that "mat" as a
     * string.
     * The for loop is like a way to repeat some actions for each item in a list.
     * var is used to automatically infer the data type of the variable. In this
     * case, it's being used to represent each "mat" in the array "arr".
     * "mat" is a temporary variable that will hold one item from the "arr" array
     * during each iteration of the loop.
     * System.out.println() is a command to display something on the screen.
     * Arrays.toString(mat) takes the "mat" array and converts its contents into a
     * string so that it can be printed.
     * So, overall, the code is looping through each "mat" in the "arr" array and
     * printing out the contents of each "mat" as a string.
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int r = in.nextInt();
        System.out.println("enter the number of columns");
        int c = in.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("enter the array elements");
        for (int i = 0; i < r; i++) {// row
            for (int j = 0; j < c; j++) {// column
                System.out.println("Row[" + i + "]Col[" + j + "]");
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("the original array is: ");
        printarray(arr);
        System.out.println("the rotated array is: ");
        rotatedarray(arr, r, c);
    }
}