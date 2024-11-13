import java.util.*;
public class negetive{
public static long[] negative(long A[],int n,int k)  
{
     Queue<Long>queue=new LinkedList<Long>();
     
   for(int i=0;i<k;i++)
    {                          //mistake/
         if(A[i]<0)
         {
             queue.add(A[i]);
         }
    }
    long res[]=new long[n-k+1];
    res[0]=(queue.isEmpty())?0:queue.peek();

    for(int i=1;i<n-k+1;i++)                //mistake//
    {
        if(A[i-1]<0)
        {
            queue.remove();
        }
        if(A[i+k-1]<0)
        {
            queue.add(A[i+k-1]);
        }
        res[i]=(queue.isEmpty())?0:queue.peek();
    }
   return res;
}

public static void main(String[]args){
    long arr[]={9,-1,3,-4,-2};
     int n=5;
     int k=3;
     negative(arr,n,k);

}
}