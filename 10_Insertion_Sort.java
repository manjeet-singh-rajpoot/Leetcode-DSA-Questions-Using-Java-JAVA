import java.util.*;
public class insert{
static void display(int arr[],int n)
{
      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
      }
}
static int insert(int arr[],int n)
{
        for(int i=0;i<n;i++)
        {
            int temp=arr[i];
            int j=i-1;
          for(; j>=0;j--)
          {
               if(arr[j]>temp)
               {
                 arr[j+1]=arr[j];
               }
               else{
                break;
               }
          }
          arr[j+1]=temp;
        }
         return 0;
}
public static void main(String[]args){
          int arr[]={30,20,40,10,50};
          display(arr,5);
          insert(arr,5);
          System.out.println();
          display(arr,5);
}
}