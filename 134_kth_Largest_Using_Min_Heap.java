import java.util.*;
public class kth_Largest_Using_Min_Heap{
    static int kthlargest(int arr[],int n,int k)
    {
          PriorityQueue<Integer>min=new PriorityQueue<>();
          int sum=0;
          for(int i=0;i<n;i++)
          {
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(min.size()<k)
                {
                    min.add(sum);
                }
                else{
                    if(sum>min.peek())
                    {
                         min.poll();
                         min.add(sum);
                    }
                }
            }
          }

          return min.peek();
    }
public static void main(String[]args){
    int a[] = { 20, -5, -1 };
    int N = a.length;
    int K = 3;

    // Function call
    System.out.println(kthlargest(a, N, K));

}
}