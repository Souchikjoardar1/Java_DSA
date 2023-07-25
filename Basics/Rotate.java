import java.util.Scanner;
public class Rotate
{
    void rotate(int arr[])
    {
        int temp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        display(arr);
    }
    void display(int arr[])
    {
        System.out.println("the rotated array left to right");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
class Array_rotate
{
    public static void main(String[] args) 
    {
        Rotate obj=new Rotate();
        Scanner in=new Scanner(System.in);
        System.out.println("enter the array size");
        int size=in.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the array elements");
        for (int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
        obj.rotate(arr);
    }
}
