package Revision;

import java.util.*;
interface I {
    void add(int number1,int number2);

}

public class Lambda {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1 = in.nextInt();
        System.out.println("enter the second number");
        int num2 = in.nextInt();
        I sum = (left, right) -> System.out.println(left + right);
        sum.add(num1, num2);
    }
}
