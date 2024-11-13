import java.util.*;
public class merge{
static void display(int arr[],int n)
{
      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
      }
}
static int merge(int arr[],int low,int mid,int high,int n)
{
         int arr2[]=new int[100];
         mid=(low+high)/2;
         int i=low;
         int j=mid+1;
         int k=low;
      while(i<=mid && j<=high)
      {
            if(arr[i]<arr[j])
            {
                 arr2[k]=arr[i];
                 k++;
                 i++;
            }  else{
                 arr2[k]=arr[j];
                k++;
                j++;
            }
      }
      while(i<=mid)
      {
          arr2[k]=arr[i];
          k++;
          i++;
      }
      while(j<=high)
      {
          arr2[k]=arr[j];
          k++;
          j++;
      }
    for(int m=low;m<=high;m++)
    {
         arr[m]=arr2[m];
    }
    return 0;
}
static int mergesort(int arr[],int low,int high,int n)
{
      int mid=(low+high)/2;
      if(low<high)
      {
           mergesort(arr,low,mid,n);
           mergesort(arr,mid+1,high,n);
           merge(arr,low,mid,high,n);
      }
      return 0;
}
public static void main(String[]args){
    int arr[]={30,40,10,20,50};
    int n=5;
    System.out.println("Before display: ");
    display(arr,n);
    System.out.println();
    System.out.println("After display: ");
    mergesort(arr,0,n-1,n);
    display(arr,n);

}
}