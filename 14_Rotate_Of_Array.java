import java.util.*;
public class rotate {
    static void display(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
 static int rotate(int arr[],int d,int n)
 {
         d=d%n;
      int temp[]=new int[n];
      int k=0;
    for(int i=d;i<n;i++)
    {
         temp[k]=arr[i];
         k++;
    }
    for(int i=0;i<d;i++)
    {
        temp[k]=arr[i];
        k++;
    }
    for(int i=0;i<n;i++)
    {
         arr[i]=temp[i];
    }
       return 0;
 }
public static void main(String[]args){
    int arr[]={1,2,3,4,5};
    int n=5;
   rotate(arr,2,n);
   display(arr,n);
}
}