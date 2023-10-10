import java.util.*;

class Myexception extends Exception {
    Myexception(String msg) {
        super(msg);
    }
}

public class NumberStairs {
    static int countNum(int stairs) {
        if (stairs <= -1) {
            try {
                Myexception e = new Myexception("enter a postitive number");
                throw e;
            } catch (Myexception w) {
                System.out.println(w);
                // System.exit(0);
            }
        }
        int result = 0;
        // base case
        if (stairs == 1 || stairs == 0)
            return stairs;
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
/*
 * A try block must be followed by at least one catch block.
 * The catch block must specify the type of exception that it is handling.
 * The catch block can contain code to handle the exception.
 * If the try block does not throw an exception, the catch block will not be
 * executed.
 * If multiple exceptions are thrown, the first catch block that matches the
 * type of the exception will be executed.
 * If no catch block matches the type of the exception, the exception will be
 * propagated up the call stack.
 */