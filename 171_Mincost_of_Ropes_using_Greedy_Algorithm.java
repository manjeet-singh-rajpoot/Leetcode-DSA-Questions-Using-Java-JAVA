import java.util.*;
public class raj{
static int mincost(int []arr,int n)
{
       PriorityQueue<Integer>pq=new PriorityQueue<>();
       int res=0;
    for(int i=0;i<n;i++)
       pq.add(arr[i]);

    while(pq.size()>1)
    {
        int f=pq.poll();
        int s=pq.poll();

        res+=f+s;
        pq.add(f+s);
    }
  return res;
}
public static void main(String[]args){
    int n=4;
    int arr[]={4,3,2,6};
System.out.print(mincost(arr,n));
}
}