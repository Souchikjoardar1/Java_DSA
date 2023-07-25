class Rectangle
{
    int length;
    int breadth;
    Rectangle() //non param const
    {
        System.out.println("rectangle()");
        length=breadth=1;
        System.out.println("the value of length breadth "+length+" "+breadth);
    }
    Rectangle(int l,int b)//param const
    {
        System.out.println("rectangle(int ,int)");
        System.out.println(l+" "+b);
        length=l;
        breadth=b;
        System.out.println("the value of length and breadth "+length+" "+breadth);
    }    
}
class Cuboid extends Rectangle
{
    int height;
    Cuboid()
    {
        System.out.println("cuboid()");
        height=1;
        System.out.println("the value of length breadth and height "+length+" "+breadth+" "+height);
    }
    Cuboid(int h)
    {
        System.out.println("cuboid(int)");        
        h=height;
        System.out.println("the value of length breadth and height "+length+" "+breadth+" "+h);
    }
    Cuboid(int l,int b, int h)
    {
        super(l,b);
        System.out.println("the value of height "+height);
        System.out.println("the value of h "+h);
        height=h;
    }
    void volumn ()
    {
        System.out.println("volumn()");
        System.out.println("the value of heigth is ="+height);
        System.out.println("the volumn of the cuboid is="+(length*breadth*height));
    }
}
public class Superconst extends Cuboid
{
    public static void main(String[] args) 
    {
        // Cuboid obj=new Cuboid(); //non param const of parent class
        // Cuboid obj1=new Cuboid(10); //param const of parent class
        Cuboid obj2=new Cuboid(10,20,30);
        obj2.volumn();
    }
}