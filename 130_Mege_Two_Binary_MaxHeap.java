import java.util.*;
public class heap{
static void heapify(int arr[],int n,int i)
{
       int root=i;

       int left=2*i+1;
       int right=2*i+2;
      
      if(left<n && arr[left]>arr[root])
      {
        root=left;
      }else{
        root=i;
      }
      if(right<n && arr[right]>arr[root])
      {
        root=right;
      }
      if(root!=i)
      {
        int temp=arr[root];
        arr[root]=arr[i];
        arr[i]=temp;

        heapify(arr, n,root);
      }
}
static void mergetwoheap(int arr[],int a[],int b[],int n,int m)
{
    for(int i=0;i<n;i++)
    {
        arr[i]=a[i];
    }
    for(int i=0;i<m;i++)
    {
        arr[n+i]=b[i];
    }
         n=n+m;
    for(int i=n/2-1;i>=0;i--)
    {
         heapify(arr, n, i);  
    }
}
public static void main(String[]args){
    int[] a = { 10, 5, 6, 2 };
        int[] b = { 12, 7, 9 };
        int N = a.length;
        int M = b.length;
 
        int[] merged = new int[M + N];
 
        // Function call
        mergetwoheap(merged, a, b, N, M);
 
        for (int i = 0; i < M + N; i++)
            System.out.print(merged[i] + " ");
      //  System.out.println();

}
}
