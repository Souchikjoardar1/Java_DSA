package Advanced;

public class Box {
    public static void main(String[] args) {
        int m = 10;
        Integer m1 = m;// autoboxing
        System.out.println("the static way" + Integer.toString(m));// static way
        System.out.println("the non static way" + m1.toString(m));// non static way
        Integer x = 10;
        int x1 = x;// autounboxing

    }
}
