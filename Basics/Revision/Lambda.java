package Revision;

import java.util.*;
interface I {
    void add(int number1,int number2);

}

public class Lambda {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // anonymous inner class
        // Lambda l = new Lambda() {
        // public void display() {
        // System.out.println("anonymous inner class");
        // }
        // };
        // lambda method
        System.out.println("enter the first number");
        int num1 = in.nextInt();
        System.out.println("enter the second number");
        int num2 = in.nextInt();
        I ld = (num1,num2) -> {// it is a reference of interface I which will be used contain the definition of
                      // the display()
            System.out.println(num1+num2);
        };
        ld.display(num1,num2);
        // l.display();
    }
}
