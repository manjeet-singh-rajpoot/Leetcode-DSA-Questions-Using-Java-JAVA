import java.util.*;
import java.util.Stack;
public class middle{
public static void solve(Stack<Integer>s,int count,int size)
{
   
        if(count==size/2)
        {
            s.pop();
            return;
        }
   int num=s.peek();
   s.pop();
   
    //recursive//

    solve(s,count+1,size);

    s.push(num);
}
public static void deletemid(Stack<Integer>s,int n)
{
        int count=0;
       solve(s,count,n);
}
public static void main(String[]args){
       Stack<Integer>s=new Stack<>();
       s.push(10);
       s.push(20);
       s.push(30);
       s.push(40);
       s.push(50);
    System.out.print("before deletion : "+s+" ");
    deletemid(s,5);
    
    System.out.println();
    System.out.println("after middle delete:\n "+s+" ");
}
}