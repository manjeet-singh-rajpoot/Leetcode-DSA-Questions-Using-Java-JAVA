import java.util.*;
import java.util.Stack;
public class element{
static void solve(Stack<Integer>s,int x)
{
       if(s.empty())
       {
          s.push(x);
          return ;
       }
     
     int num=s.peek();
        s.pop();
    //recursive//
      solve(s,x);
    s.push(num);
}
static Stack<Integer>insertat(Stack<Integer>s,int x)
{
      solve(s,x);
      return s;
}
public static void main(String[]args){
     Stack<Integer>s=new Stack<>();
     s.push(10);
     s.push(20);
     s.push(30);
     s.push(40);
    insertat(s,9);
    System.out.print(s+" ");


}
}