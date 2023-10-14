import java.util.*;

// by implementing the runnable interface
class Calc implements Runnable {// implementing the Runnable interface method run()
    public void run() {
        System.out.println("Calc1 executed");
        Scanner in = new Scanner(System.in);
        System.out.println("enter a num1");
        int num1 = in.nextInt();
        System.out.println("enter a num2");
        int num2 = in.nextInt();
        System.out.println("the quotient:- " + ((float) num1 / num2));
    }
}

class Calc1 implements Runnable {// implementing the Runnable interface method run()
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

/*
 * since we have implemented the runnable interface so there is no direct
 * relation between
 * the user defined classes Calc/Calc1 and Thread class without which threads
 * are not created
 * so we need to link them up by passing the reference of the respective classes
 * c1,c to the
 * newly created objects of Thread class type as parametres to there
 * constructors
 * by doing so the normal class objects will become objects of Thread class and
 * will have access to all Thread properties
 */
public class Threads3 {
    public static void main(String[] args) {
        Calc c = new Calc();// normal objects
        Calc1 c1 = new Calc1();
        Thread t = new Thread(c);// objects of thread class
        Thread t1 = new Thread(c1);
        t.start();
        t1.start();
        System.out.println("Main thread executed");
    }
}
/*
 * if we call start() then it creates a thread which will indirectly call the
 * run()
 * if we call run() then no seperate thread will be created and the execution
 * will be single threaded
 * in nature
 * Diff run() v/s start()
 */