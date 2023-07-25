abstract class A {
    void a() {
        System.out.println("aaaa");
    }

    abstract void b();
}

class C extends A {
    void b() {
        System.out.println("bbbb");
    }
}

public class Abstract {
    public static void main(String[] args) {
        C obj = new C();
        obj.b();
        obj.a();
    }
}
