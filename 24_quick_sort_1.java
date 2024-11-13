import java.util.*;
public class quick{
static void display(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
static int partion(int arr[],int s,int e)
{
       int pivot=arr[s];
       int count=0;
       int temp=0;
       for(int i=s+1;i<=e;i++)
       {
          if(arr[i]<=pivot)
          {
              count++;
          }
       }
    int pivotindex=s+count;

    temp=arr[pivotindex];
    arr[pivotindex]=arr[s];
    arr[s]=temp;

    int i=s;
    int j=e;

    while(i<pivotindex && j>pivotindex)
    {
        while(arr[i]<=pivot)
        {
              i++;
        }
        while(arr[j]>=pivot)
        {
             j--;
        }
        if(i<pivotindex && j>pivotindex)
        {
             temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
        }
        return pivotindex;
    }
    return 0;
}
static void quicksort(int arr[],int s,int e)
{
         int p=partion(arr,s,e);
         if(s>=e)
         {
              quicksort(arr,s,p-1);
              quicksort(arr,p+1,e);
         }
}
public static void main(String[]args){
    int arr[]={2,4,1,6,9};
    int n=5;
    System.out.println("Quicksort is : ");
    quicksort(arr,0,n-1);
    display(arr,n);
}
}