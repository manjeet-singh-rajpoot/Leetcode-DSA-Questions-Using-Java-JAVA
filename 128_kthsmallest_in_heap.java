import java.util.*;
public class heap{
    static void heapify(int arr[],int n,int i)
    {
        int root=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left< n && arr[left]>arr[root])
        {
               root=left;
        }
        if(right<n && arr[right]>arr[root])
        {
            root=right;
        }
        if(root!=i)
        {
            int temp=arr[i];
            arr[i]=arr[root];
            arr[root]=temp;

            heapify(arr, n,0);
        }
    }
static void heapsort(int arr[])
{
    int n=arr.length;
    for(int i=n-1;i>=0;i--)
    {
        int temp=arr[i];
        arr[i]=arr[0];
        arr[0]=temp;

        heapify(arr, i, 0);
    }
}
static void kthsmallest(int arr[],int k)
{
   
    heapsort(arr);
    System.out.print(arr[k-1]);
}
public static void main(String[]args){
    int arr[] = { 10, 5, 3, 2, 4 };
    int n=arr.length;

    kthsmallest(arr,5);

}
}