                        //Recursive binary search//
import java.util.*;    
public class binari {
static int binary(int arr[],int start,int end,int size,int key)
{
        int mid=(start+end)/2;
        if(start>end)
        {
            return -1;
        }
         if(arr[mid]==key)
         {
            return mid;
         }
         //right wala part//
         if(key>arr[mid])
         {
             return binary(arr,mid+1,end,size,key);
         }
         else{
            return binary(arr,start,mid-1,size,key);
         }
}
public static void main(String[]args){
     int arr[]={10,20,30,40,50};
     for(int i=0;i<5;i++)
     {
          System.out.print(arr[i]+" ");
     }
     System.out.println("found: "+binary(arr,0,5,5,20));
}
}