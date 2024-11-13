                    //SELECTION SORT//
//ALGORITHM= selection sort me sabse minimum element ko array ke first element se 
//swap karke laya jata hai.

//isme sabse smallest element ko sabse aage laya jata hai jab first 
//element apne aage aane wale element se bada hai.
import java.util.*;
public class select {
static void display(int arr[],int n)
{
      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
      }
}
static int selection(int arr[],int n)
{
     int temp=0;
          for(int i=0;i<=n-1;i++)
          {
               int min=i;
             for(int j=i+1;j<n;j++)
             {
                  if(arr[min]>arr[j])
                  {
                       min=j;
                  }
             }
             temp=arr[i];
             arr[i]=arr[min];
             arr[min]=temp;
          } 
          return 0;       
}
public static void main(String[]args){
    int arr[]={30,20,50,40,60};
    int n=5;
 display(arr,n);
 selection(arr,n);
 System.out.println();
 display(arr,n);
}
}