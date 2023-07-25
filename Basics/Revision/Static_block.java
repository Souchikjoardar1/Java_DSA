class Test {
    static {
        System.out.println("static block 1");
    }
    static {
        System.out.println("static block 2");
    }
}

public class Static_block {
    public static void main(String[] args) {
        Test t = new Test();// without creating this object the test class with never be loaded and neither
                            // will be the static blocks within
        System.out.println("main()");
        // order of execution static block1,static block 2 , main() iff the class test
        // is loaded
    }
}
