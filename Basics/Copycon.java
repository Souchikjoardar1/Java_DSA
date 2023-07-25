class Copy
{
    int a,b;
    Copy(int a,int b)
    {
        this.a=a;
        this.b=b;
    }    
    Copy(Copy obj)
    {
        System.out.println("the value of a using copy con "+obj.a);
        System.out.println("the value of b using copycon is "+obj.b);
    }
}
public class Copycon
{
    public static void main(String[] args)
    {
        Copy obj=new Copy(10,20);    
        Copy obj1=new Copy(obj); 
        // obj=new Copy(obj);   
    }
}
