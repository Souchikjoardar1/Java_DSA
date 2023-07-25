abstract class A
{
    void a()
    {
        System.out.println("method a()");
    } 
    abstract void b();
}
class B extends A
{
    void b()
    {
        System.out.println("definition of b()");
    }
    void c()
    {
        System.out.println("method c()");
    }
} 
class C 
{
    public static void main(String[] s) 
    {
        A obj=new B();   
        obj.b();   
        // obj.c();  
    }
}
