import java.util.*;
public class raj{
public static int frequency(int arr[],int n)
{
    int a=0;
    int b=0;
    int count=0;
    for(int i=0;i<n;i++)
    {
      //  int count=0;
        for(int j=0;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
            }
        }
        if(count>b)
        {
            b=count;
            a=arr[i];
        }
    
    }
    return a;
}
public static void main(String[]args){
   int arr[]={1,2,3,4,1,1};
    int n=arr.length;

    System.out.print("max frequency is: "+frequency(arr,n));
}
}