import java.util.*;

class Calc extends Thread {
    public void run() {// overrides the run() of runnable interface
        System.out.println("Calc1 executed");
        Scanner in = new Scanner(System.in);
        System.out.println("enter a num1");
        int num1 = in.nextInt();
        System.out.println("enter a num2");
        int num2 = in.nextInt();
        System.out.println("the quotient:- " + ((float) num1 / num2));
    }
}

class Calc1 extends Thread {
    public void run() {
        System.out.println("Calc1 executed");
        Scanner in = new Scanner(System.in);
        System.out.println("enter a num1");
        int num1 = in.nextInt();
        System.out.println("enter a num2");
        int num2 = in.nextInt();
        System.out.println("the product is:-" + (num1 * num2));
    }
}

public class Threads2 {
    public static void main(String[] args) {
        Calc c = new Calc();
        Calc1 c1 = new Calc1();
        c.start();
        c1.start();
        System.out.println("Main thread executed");
    }
}