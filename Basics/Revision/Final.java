class Test {
    static final int x = 10;
    static final int y;// declaring in class
    static {
        // x = 20; final variables cannot be modified
        y = 20; // initialising in the static block
    }

    final void x() {
        System.out.println("final methods");
    }

}

public class Final extends Test {
    // final void x() {

    // } cannot override the final methods
    public static void main(String[] args) {
        System.out.println(
                "the final variables cannot be modified the final methods cannot be overriden neither can the final classes be extended ");
    }
}
