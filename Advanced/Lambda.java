package Advanced;

interface L {
    void show(int a, float b, String c);
}

public class Lambda {
    public static void main(String[] args) {
        int m = 12;
        // java.lang package
        Integer m1 = m;// autoboxing
        System.out.println(m1.valueOf(m));// function used for boxing int to Integer
        Integer y = 12;
        int y1 = y;// autoboxing
        System.out.println((y.toString()) + 5);
        String x = y.toString(); // convert a integer object (y) into a string object (x)
        Lambda l1 = new Lambda();
        System.out.println(l1.toString());
        Integer m2 = Integer.valueOf("1000", 2);// Integer.valueOf() static func of Integer class takes a String arg as
                                                // input along with the radix which by default is 10 or decimal and
                                                // returns integer object of that particular radix
        System.out.println("converted the value of 1000 into binary " + m2);
        // whenever an object is printed in SOP then object.toString() method is called
        // it returns package.class@hex value of hashcode of object
        L obj = (a, b, c) -> {
            System.out.println("Lambda method show() the values are: " + a + " " + b + " " + c);

            // writing the data types in lambda methods is optional and if there is only

            // statement in the methods body then you can skip the curly braces
            System.out.println("hello lambda");
        };
        obj.show(16, 13f, "Souchik");
        Integer a = Integer.valueOf("A7", 16);// hexadecimal values
        Integer a1 = Integer.reverseBytes(a);// any String values in hex , deci to int convert
        System.out.println(a);
        System.out.println("bytes reversed " + a1);
        System.out.println("the binary form of 1232 is= " + Integer.toBinaryString(1232));
        float i = 12f;
        Float e = 12.4f / 0;
        Float y2 = -12.4f / 0;
        System.out.println("the number is infinity " + e.isInfinite());
        System.out.println(e == Float.POSITIVE_INFINITY);// checking whether the value of the number is equal to
                                                         // postitive infinity from the class Float
        System.out.println(y2 == Float.NEGATIVE_INFINITY);
        Float c = (float) Math.sqrt(-1);// sqrt returns double and accepts double
        System.out.println(c.isNaN());// checks whether it is a number or not
        System.out.println(c != Float.NaN);// static method checks whether it is a number or not
        Character d = 'A';
    }
    
}
