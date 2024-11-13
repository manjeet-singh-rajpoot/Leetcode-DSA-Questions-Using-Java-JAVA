import java.util.*;
public class heap {
static int ropes(int arr[],int n)
{
        PriorityQueue<Integer>pq=new PriorityQueue<>();
         
        for(int i=0;i<n;i++)
        {
             pq.add(arr[i]);
        }
    int ans=0;

      while(pq.size()>1)
      {
           int first=pq.poll();
           int second=pq.poll();

           ans+=first+second;
           pq.add(first+second);
      }

      return ans;
}
public static void main(String[]args){
    int arr[] = { 4, 3, 2, 6 };
    int size = arr.length;
    System.out.println("Total cost for connecting"
                       + " ropes is\n: "
                       +ropes(arr, size));

}
}