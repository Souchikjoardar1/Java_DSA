class Outer
{
    void display()
    {
        class Inner
        {
            void innerdisplay()
            {
                System.out.println("hello from a method inside inner class inside innerdisplay()");
            }
        }
        interface Fi
        {
            void data();
            void set();
        }
        abstract class A
        {
            void b()
            {
                System.out.println("method b");
            }
            abstract void a();
        }
        Inner obj=new Inner();
        obj.innerdisplay();
        Fi ob=new Fi(){ //anonymous inner class (overriding the abstract method in the interface)
            public void data()
            {
                System.out.println("Overriden data method");
            }
            public void set()
            {
                System.out.println("Overriden set method");
            }
        };
        A ob1=new A(){//anonymous inner class (overriding the abbstract method in the abstract class)
            void a()
            {
                System.out.println("overidden abstract method a()");
            }
        };
        ob.set();//called using ref of interface
        ob.data();//called using ref of interface
        ob1.a();//called using ref of abstract class
        ob1.b();//called using ref of abstract class 
    }  
}
class Local_Inner
{
    public static void main(String[] s) {
        Outer in=new Outer();
        in.display();
    }
}
