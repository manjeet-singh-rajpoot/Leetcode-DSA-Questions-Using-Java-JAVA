import java.util.*;
import java.util.Stack;
public class next{

static void checkprev(int arr[],int n)
{
     Stack<Integer>s=new Stack<>();
     s.push(-1);
     int ans[]=new int[n];
    for(int i=0;i<n;i++)
    {
          int curr=arr[i];
        while(!s.empty() && s.peek()>=curr)
        {
             s.pop();
        }
        ans[i]=s.peek();
        s.push(curr);
    }   
    for(int i=0;i<n;i++)
    {
        System.out.print(ans[i]+" ");
    }
}

public static void main(String[]args){
      int arr[]={3,5,6,2};
      int n=4;
    
      System.out.println("Ckeck prev: ");
      checkprev(arr,n);
     
}
}