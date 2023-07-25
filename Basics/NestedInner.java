class Outer
{
    int x=10;
    class Inner
    {
        int y=20;
        void Innerdisplay()
        {
            System.out.println("inside Innerdisplay() "+x);
            System.out.println("inside Innerdisplay() "+y);
        }
    }
    void outerdisplay()
    {
        Inner i=new Inner();
        i.Innerdisplay();
        System.out.println("displaying the value of variable y from a method inside the outerclass "+i.y);
    }
    
}
public class NestedInner
{
    public static void main(String[] s)
    {
        Outer obj=new Outer();
        obj.outerdisplay();
        //accesing the inner class from another outer class
        Outer.Inner i=new Outer().new Inner();
        System.out.println("accesing the inner class variable y from another outer class "+i.y);
        i.Innerdisplay();
    }
}