import java.util.*;
public class  pivot{

static int binary(int arr[],int low,int high,int key)
{
        int mid=(low+high)/2;
       if(low>high)
       {
        return -1;
       }
       if(key==arr[mid])
       {
        return mid;
       }
       if(key>arr[mid])
       {
         return binary(arr,mid+1,high,key);
       }
       if(key<arr[mid]){
        return binary(arr,low,mid-1,key);
       }
       return 0;
}
static int getpivot(int arr[],int n)
{
         int low=0;
         int high=n-1;
         int mid=(low+high)/2;
         while(low<=high)
         {
              if(arr[mid]>=arr[0])
              {
                  low=mid+1;
              }
              else{
                    high=mid;
              }
              mid=(low+high)/2;
              return low;
         }
         return 0;
}
static int findpos(int arr[],int n,int k)
{
        int pivot=getpivot(arr,n);
        if(k>=arr[pivot] && k<=arr[n-1])
        {
             return binary(arr,pivot,n-1,k);
        }
        else{
            return binary(arr,0,pivot-1,k);
        }
}
public static void main(String[]args)
{
     int arr[]={3,8,10,14,17};
     int n=5;
    System.out.println(binary(arr,0,n-1,17));
    System.out.println(getpivot(arr,n));
    System.out.println(findpos(arr,5,14));
}
}