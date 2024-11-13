import java.util.*;
public class negetive{
static void negetive(int arr[],int n,int k)
{
     
        for(int i=0;i<(n-k+1);i++)
        {
              for(int j=0;j<k;j++)
              {
                  if(arr[i+j]<0)
                  {
                     System.out.print(arr[i+j]+" ");
                  }
              }
        }
}
public static void main(String[]args){
     int arr[]={-2,3,-4,1};
     int n=arr.length;
     int k=2;
    negetive(arr,n,k);

}
}