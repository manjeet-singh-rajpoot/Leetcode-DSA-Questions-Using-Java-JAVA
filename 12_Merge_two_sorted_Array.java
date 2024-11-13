import java.util.*;
public class merge {
static void display(int arr[],int n)
{
       for(int i=0;i<n;i++)
       {
        System.out.print(arr[i]+" ");
       }
}
static int merge(int arr1[],int n,int arr2[],int m,int arr3[])
{
     int i=0;
     int j=0;
     int k=0;
     while(i<n && j<m)
     {
          if(arr1[i]<arr2[j])
          {
            arr3[k]=arr1[i];
            k++;
            i++;
          }
          else{
            arr3[k]=arr2[j];
            k++;
            j++;
          }
          i++;
          j++;
     } 
     while(i<n)
     {
        arr3[k]=arr1[i];
        i++;
        k++;
     }  
     while(j<m)
     {
         arr3[k]=arr2[j];
         k++;
         j++;
     }
     return 0;
}
public static void main(String[]args){
   int arr1[]={3,2,5,6};
   int arr2[]={6,3,2,7};
   int arr3[]={0};
   //display(arr3,7);
   merge(arr1,4,arr2,4,arr3);
   display(arr3,8);

}
}