import java.util.*;

public class NumberStairs {
    static int countNum(int stairs) {
        int result = 0;
        // base case
        if (stairs <= 1)
            return 1;
        else {
            result = countNum(stairs - 1) + countNum(stairs - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of stairs ");
        int stairs = in.nextInt();
        int result = countNum(stairs + 1);
        // the relationship b/w number of ways of climbing stairs problem and fibonacci
        // problem
        // the number of ways of climbing stairs = fibonacci(number of stairs+1)
        System.out.println("the total number of ways is=" + result);
    }
}
