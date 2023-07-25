interface L {
    public abstract void show(int a, float b, String c);
}

public class Lambda implements L {
    public static void main(String[] args) {
        // L obj = (a, b, c) ->{ System.out.println("Lambda method show() the values
        // are: " + a + " " + b + " " + c);
        // // writing the data types in lambda methods is optional and if there is only
        // one
        // // statement in the methods body then you can skip the curly braces
        // System.out.println("hello lambda");
        // };
        L obj1 = new L() {
            public void show(int a, float b, String c) {
                System.out.println("anonymous inner class");
            }
        };
        obj1.show(16, 13f, "Souchik");
    }