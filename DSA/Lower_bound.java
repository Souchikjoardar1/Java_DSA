import java.util.*;
class Lb {
    public int find_first_occurence(int arr[],int e){
        int high=arr.length-1;
        int low=0;
        int result=-1;
        while(low<=high){
            int mid=(high+low)/2;
            if(arr[mid]==e){
            result=mid;
            high=mid-1;//traversing the leftside of the array            
        }
        else if(arr[mid]>e){
            high=mid-1;
        }
        else
        low=mid+1;
    }
    return result;
}
}
public class Lower_bound{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Lb b=new Lb();
        System.out.println("enter the size of the array ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array elements ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter the number to be searched ");
        int e=in.nextInt();
        if (b.find_first_occurence(arr,e)==-1)
        System.out.println("value not found ");
        else
        System.out.println("the occurence of the element is:-  "+b.find_first_occurence(arr,e));
    }
}
