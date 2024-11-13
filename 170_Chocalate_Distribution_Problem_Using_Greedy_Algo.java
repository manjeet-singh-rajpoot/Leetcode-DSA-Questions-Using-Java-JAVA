import java.util.*;
public class raj{
static int chocalate(int []a,int n,int m)
{
      sort(a);
      int i=0;
      int j=m-1;
    int mini=Integer.MAX_VALUE;
    while(j<a.length)
    {
        int d=a[j]-a[i];
        mini=Math.min(mini,d);
        i++;
        j++;
    }
    return mini;
}
static void sort(int arr[])
{
     for(int i=0;i<arr.length;i++)
     {
        for(int j=0;j<arr.length-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
     }
}
public static void main(String[]args){
    int N=8;
    int M=5;
    int A[]={3,4,1,9,56,7,9,12};

    System.out.print(chocalate(A,N,M));
}
}