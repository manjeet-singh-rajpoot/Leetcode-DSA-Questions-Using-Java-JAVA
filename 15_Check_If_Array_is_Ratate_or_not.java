import java.util.*;
public class rotate {
static void display(int arr[],int n)
{
    for(int i=0;i<n;i++)
    {
    System.out.print(arr[i]+" ");
    }
}
static boolean rotate(int arr[],int n)
{
      int count=0;
      for(int i=1;i<n;i++)
      {
          if(arr[i-1]>arr[i])
          {
             count++;
          }
    
      }
      if(arr[n-1]>arr[0])
      {
         count++;
      }
      return count==1;
}
public static void main(String[]args){
     int arr[]={10,20,30,40,50};
     int n=5;
  rotate(arr,n);
  display(arr,n);

}
}