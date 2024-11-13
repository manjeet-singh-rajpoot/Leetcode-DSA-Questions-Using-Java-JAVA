import java.util.*;
public class squre   {
 static int binary(int n)
 {
       int low=0;
       int high=n-1;
       int mid=(low+high)/2;
     long ans=-1;
       while(low<=high)
       {
            long  squre=mid*mid;
        if(squre==n)
        {
             return mid;
        }
        if(squre<n)
        {
           //  ans=mid;
             low=mid+1;  
        }
        else{
              high=mid-1;
        }
        mid=(low+high)/2;
       // return ans;
       }
       //return ans;
       return 0;
 }
 static int squreroot(int x)
 {
      return binary(x);
 }
public static void main(String[]args){
     //  int x=9;
     // double l=Math.sqrt(x);
     // System.out.println(l);
  //  int arr[]={}
  // System.out.println(binary(5));
   System.out.println(squreroot(100));
}
}