import java.util.*;
public class ractangle{
static int maxArearactangle(int arr[])
{
    int n=arr.length;
    int ns[]=nextsmallest(arr,n);
    int ps[]=prevsmallest(arr,n);
    int  maxans=0;
    for(int i=0;i<n;i++)
    {
        int curr=(ns[i]-ps[i]-1)*arr[i];
        maxans=Math.max(maxans,curr);
    }
   System.out.println(maxans);
    return maxans;
}
static int[] nextsmallest(int arr[],int n)
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
 
 return ans;
}
static int[] prevsmallest(int arr[],int n)
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
   
    return ans;
}
public static void main(String[]args){
    int arr[]={6,2,5,4,5,1,6};
    int n=7;
    maxArearactangle(arr);
}
}