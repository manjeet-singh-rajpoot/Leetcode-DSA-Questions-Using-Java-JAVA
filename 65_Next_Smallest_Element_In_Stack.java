import java.util.*;
import java.util.Stack;
public class check{
static void nextsmallest(int arr[],int n)
{
    Stack<Integer>s=new Stack<>();
    s.push(-1);
    int ans[]=new int[n];
    for(int i=n-1;i>=0;i--)
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
  int arr[]={3,4,1,4};
  int n=4;
  nextsmallest(arr,n);    

}
}