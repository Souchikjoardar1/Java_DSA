public class Finallydemo {
    static void demo() throws Exception {
        System.out.println(10 / 0);
        throw new Exception("denominator cannot be zero");
    }

    public static void main(String[] args) {
        try {
            demo();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("executed finally");
        }
    }
}