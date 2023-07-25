class Outer
{
    static int x=10;
    static int y=20;
    static class Inner
    {
        static void display()
            {
                System.out.println(x);
                System.out.println(y);
            }
    }    
}
public class Static_inner
{
    public static void main(String[] s)
    {
        // Outer.Inner o=new Outer.Inner();
        Outer.Inner.display();
        // o.display();
    }
}
