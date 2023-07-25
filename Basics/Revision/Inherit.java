class Parent {
    Parent() {
        System.out.println("the constructor of parent class");
    }

    final void display() {
        System.out.println("the display method of parent");
    }
}

class Child extends Parent {
    Child() {
        System.out.println("the constructor of child class");
    }

    static void display() {
        System.out.println("the display method of child class");
    }
}

public class Inherit {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
