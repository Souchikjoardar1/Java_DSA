import java.util.*;
public class Array_prac 
{
    public static void main(String[] s) {
        Scanner in=new Scanner(System.in);
        int A[]={3,9,7,8,12,6,15,5,4,10};
        int flag=0,index=0,sum=0,max=A[0],index1=0;
        System.out.println("enter the element to search in the given array");
        int key=in.nextInt();
        for(int x=0;x<A.length;x++)
        {
            sum+=A[x];
            if (A[x]==key)
            {
            flag=0;
            index=x; 
            }        
        }
        if (flag==0)
            System.out.println("element is found @ position  "+index);
            System.out.println("the sum of all the elements in the array is= "+sum);
        for (int y=0;y<A.length;y++)
        {
            if (A[y]>max)
            {
            max=A[y];
            index1=y;
            }
        }
        System.out.println("the largest element in the array is= "+max+" @ index "+index1);
    }    
}
