import java.util.Scanner;

class Negativedimexception extends Exception {
    public String toString() {
        return "the dimensions of a rectangle should be greater than 0";
    }
}

public class Throwthrowsdemo {// defining my own Exception by inheriting the Exception class
    static int check_dim(int length, int breadth) throws Negativedimexception {// throws tells the compiler that the
                                                                               // following
        // method throws an exception
        if (length < 0 || breadth < 0) {
            // throw new Exception("The length and breadth must be greater than 0");
            // throwing the object of Exception class along with a message
            throw new Negativedimexception();
        } else
            return length * breadth;
    }

    static void Area(int l, int b) throws Negativedimexception {
        System.out.println("the area is= " + check_dim(l, b));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the length");
        int l = in.nextInt();
        System.out.println("enter the breadth");
        int b = in.nextInt();
        try {
            Area(l, b);
        } catch (Negativedimexception e) {
            // System.out.println(e.getMessage());// getMessage() will print the msg present
            // inside the constructor of the
            // Exception class which is invoked by new Exception()
            System.out.println(new Negativedimexception().toString());// object of negative dim class for invoking
                                                                      // toString()
        }
    }
}