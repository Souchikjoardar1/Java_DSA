class Chain {
    Chain(int x, int y) {
        System.out.println("constructor with 2 arguments");
        System.out.println("the product of those arguments is " + (x * y));
    }

    Chain(int a) {
        this(5, 10);
        System.out.println("constructor with 1 argument ");
        System.out.println("'the arguement is " + a);
    }

    Chain() {
        this(5);
        System.out.println("the constructor with no args");
    }
}

public class Chaining {
    public static void main(String[] args) {
        Chain obj = new Chain();
    }
}
