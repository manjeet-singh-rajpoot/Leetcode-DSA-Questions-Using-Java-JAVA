                          //Binary Search Without Ricursive//

import java.util.*;
public class Binary {
static int binary(int arr[],int key,int n)
{
        int low=0;
        int high=n-1;
        int mid=(low+high)/2;
      // while(low<=mid && mid<=high)
      while(low<=high)
       {
            if(key==arr[mid])
            {
                  return mid;
            }
            else if(key>arr[mid])
            {
                 //right wala parts//
                 low=mid+1;
            System.out.println(low);
            }
            else{
                //left wala parts//
                  high=mid-1;
            System.out.println(high);
            }
            mid=(low+high)/2;
          return -1;
       }
       return 0;
}
public static void main(String[]args)
{
    int arr2[]={10,20,30,40,50};
   // System.out.println(binary(arr,10,5));
  // int size=sizeof(arr2)/sizeof(int);    
    int ind=binary(arr2,20,5);
    System.out.println(ind);
}
}