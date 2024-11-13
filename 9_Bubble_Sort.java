                   //Bubble sort //
//round 1:-
//isme do element[arr[0] & arr[1]] ek dusre se compare karte hai yadi arr[0] ka element 
//bada hai to use apne aage aane wale ELEMENT se swap karte hai.

//round 2:- 
//ab do element ko phir se compare karenge[arr[1] ko arr[2] se ] yadi arr[1] ka elemnt 
//bada hai to use apne aage aane wale ELEMENT se swap karte hai.

//.....yahi paases and step (n-1) bar chalega.

import java.util.*;
public class bubble {
static void display(int arr[],int n)
{
       for(int i=0;i<n;i++)
       {
        System.out.print(arr[i]+" ");
       }
}
static int bubble(int arr[],int n)
{
    int temp=0;
       for(int i=0;i<n;i++)
       {
             for(int j=0;j<n-1;j++)
             {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;    
                }
             }
       }
       return 0;
}
public static void main(String[]args){
  int arr[]={30,10,40,20,50};
  int n=5;
display(arr,n);
System.out.println();
bubble(arr,5);
display(arr,n);
}
}