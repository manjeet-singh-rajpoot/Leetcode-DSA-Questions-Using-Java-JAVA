import java.util.*;
import java.util.Stack;
public class sort{
static void sortstack(Stack<Integer>s)
{
      if(s.empty())
      {
        return ;
      }
    int num=s.peek();
    s.pop();
   
    sortstack(s);
    sortinsert(s,num);
}
static void sortinsert(Stack<Integer>s,int num)
{
   if(s.empty() || (!s.empty() && s.peek()<num))
   {
       s.push(num);
       return;
   }
  int n=s.peek();
  s.pop();

  sortinsert(s,num);
  s.push(n);

}
public static void main(String[]args){
    Stack<Integer>s=new Stack<>();
      s.push(30);
      s.push(20);
      s.push(50);
      s.push(10);
    
      System.out.print("before: \n"+s+" ");
      sortstack(s);
      System.out.println();
      System.out.print("after: \n"+s+" ");

}
}