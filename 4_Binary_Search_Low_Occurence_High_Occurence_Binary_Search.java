import java.util.*;
public class jolu  {
static int binary(int arr[],int low,int high,int size,int key)
{
     int ans=-1;
       int mid=(low+high)/2;
        if(low>high)
        {
            return -1;
        }
        if(key==arr[mid])
        { 
            ans=mid;
           high=mid-1; 
        }
        if(key>arr[mid])
        {
              return binary(arr,mid+1,high,size,key);
        }
        if(key<arr[mid])
        {
            return binary(arr,low,mid-1,size,key);
        }
    return 0;
}
static int binary2(int arr[],int low,int high,int size,int key)
{
     int ans=-1;
       int mid=(low+high)/2;
        if(low>high)
        {
            return -1;
        }
        if(key==arr[mid])
        {
            ans=mid;
           low=mid+1;  
        }
        if(key>arr[mid])
        {
              return binary(arr,mid+1,high,size,key);
        }
        if(key<arr[mid])
        {
            return binary(arr,low,mid-1,size,key);
        }
    return 0;
}
public static void main(String[]args){
    
    int arr[]={10,20,30,30,30};
      System.out.println("First occurence found: "+binary(arr,0,5,5,30));
      System.out.println("Second occurence found: "+binary2(arr,0,5,5,30));

}
}