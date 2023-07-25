interface Test {
    public abstract void method1();
}

interface Test1 extends Test {
    public abstract void method2();

    private void method3() {
        System.out.println("private method 3 chained inside method 4");
    }

    default void method4() {
        method3();
    }
}

class Interface implements Test1 {
    public void method1() {
        System.out.println("method 1 od interface Test");
    }

    public void method2() {
        System.out.println("method 2 of interface Test1");
    }

    public static void main(String[] args) {
        Interface i = new Interface();
        i.method1();
        i.method2();
        i.method4();
    }
}