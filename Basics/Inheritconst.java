class Parent 
{
    Parent()
    {
        System.out.println("this is the parent constructor");
    }    
}
class Child extends Parent
{
    Child()
    {
        super();//optional
        System.out.println("this is the child constructor");
    }
}
public class Inheritconst extends Child
{
    public static void main(String[] args) 
    {
        Parent obj1=new Parent();
        obj1=new Child();
        obj1=new Parent();
    }
}
