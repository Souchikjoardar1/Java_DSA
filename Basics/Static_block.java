class test
{
    static int count=0;
    static
    {
        System.out.println("static block 1");      
    }    
    static 
    {
        System.out.println("static block 2");
    }
    test()
    {
        count++;
    }
}
public class Static_block
{
    public static void main(String[] s) 
    {
        System.out.println("Main");
        test o=new test();   
        new test();
        new test();
        System.out.println("the total number of objects is ="+test.count);
    }
}
