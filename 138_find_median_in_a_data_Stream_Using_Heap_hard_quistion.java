import java.util.*;
public class heap{
    static void finmidian(int arr[],int n)
    {
        PriorityQueue<Double> maxheap=new PriorityQueue<>();
        PriorityQueue<Double>minheap=new PriorityQueue<>();
        
        //Left = maxheap
        //right=minheap
        for(int i=0;i<n;i++)
        {
            minheap.add(-1.0*arr[i]);
            maxheap.add(-1.0*minheap.poll());
            if(maxheap.size()>minheap.size())
            {
                minheap.add(-1.0* maxheap.poll());
            }
           
            if(maxheap.size()!=minheap.size())
            {
                System.out.println(-1.0*minheap.peek());
            }else{
                System.out.println(( maxheap.peek()-minheap.peek())/2);
            }
        }
    }
public static void main(String[]args){
    int A[] = { 5, 15, 1, 3, 2, 8, 7, 9, 10, 6, 11, 4 };
    int N = A.length;
     
    // Function call

finmidian(A,N);
}
}