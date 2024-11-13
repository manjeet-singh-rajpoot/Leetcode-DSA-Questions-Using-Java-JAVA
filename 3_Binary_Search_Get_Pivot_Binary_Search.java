import java.util.*;
public class pivot  {
static int getpivot(int arr[],int n)
{
        int s=0;
        int e=n-1;
        int mid=(s+e)/2;
      while(s<=e)
      {
          if(arr[mid]>=arr[0])
          {
               s=mid+1; 
          }
          else{
              e=mid;
          }
        mid=(s+e)/2;
        return s;
      }
      return 0;
}
public static void main(String[]args){
   int arr[]={3,8,10,14,17};
   System.out.println(getpivot(arr,5)); 

}
}