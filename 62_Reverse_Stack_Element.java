import java.util.*;
import java.util.Stack;
public class insert{
static void solve(Stack<Integer>s,int x)
{
     //base case//
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
static void reverse(Stack<Integer>s)
{
  //base//
     if(s.empty())
     {
      return ;
     }
    int num=s.peek();
    s.pop();
  reverse(s);
  insertat(s,num);
}
public static void main(String[]args){
  Stack<Integer>s=new Stack<>();
  s.push(10);
  s.push(20);
  s.push(30);
  s.push(40);
  s.push(50);
  s.push(60);

  System.out.println("before riverse: \n"+s+" ");
  reverse(s);
  //System.out.println();
  System.out.println("after riverse: \n"+s+" ");
}
}