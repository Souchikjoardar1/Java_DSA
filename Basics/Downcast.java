class Super
{
    void display()
    {
        System.out.println("parent class method");
    }   
    void Sup()
    {
        System.out.println("only super class method");
    } 
}
class Sub extends Super
{
    void display()
    {
        System.out.println("child class method");
    }
    void s()
    {
        System.out.println("only sub class method");
    }
}
public class Downcast
{
    public static void main(String[] s)
    {
        // Super obj=new Super();
        Super obj=new Sub();//  
        Sub a=(Sub)obj;//downcasting the ref of superclass gets converted to subclass type
        obj=(Super) new Sub();//upcasting the ref of subclass converted to superclass type
        a.display();  
        a.s();   
        a.Sup();
        // obj1.display();     
        a.s();  
        obj.display();
    }
}
