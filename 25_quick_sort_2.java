import java.util.*;
public class raj {
    static void display(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
static int partition(int arr[],int s,int e)
{
    int pivot=arr[s];
      int i=s+1;
      int j=e;
       int temp=0;
     do{
          while(arr[i]<=pivot)
          {
             i++;
          }
          while(arr[j]>pivot)
          {
             j--;
          }
       if(i<j)
       {
           temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
       }
     }while(i<j);

     temp=arr[s];
     arr[s]=arr[j];
     arr[j]=temp;
     return j;
}
static void quicksort(int arr[],int s,int e)
{
       int p=partition(arr,s,e);
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