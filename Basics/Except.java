import java.util.Scanner;

public class Except {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int x[] = { 1, 2, 3, 4, 5 };
            System.out.println("enter the a number to divide the 1st element of the array ");
            double y = x[0] / (double) in.nextInt();
            double z = x[10] / x[2];
            System.out.println("the result is =" + y);
            System.out.println("the result is =" + z);
        } catch (ArithmeticException e) {
            System.out.println("divide by zero error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("element unvailable");
        }
        try {
            System.out.println("enter the first number");
            int a = in.nextInt();
            System.out.println("enter the second number");
            int b = in.nextInt();
            double r = (double) a / b;
            System.out.println("the number " + a + "/" + b + " is =" + r);
        } catch (ArithmeticException a) {
            System.out.println("the denominator should be greater than 0");
        } finally {
            System.out.println("come on give a valid input next time");
        }
    }
}
