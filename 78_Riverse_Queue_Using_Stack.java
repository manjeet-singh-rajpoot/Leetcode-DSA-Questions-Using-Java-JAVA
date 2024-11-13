import java.util.*;
import java.util.Queue;
import java.util.Stack;
public class riverse{
public static void main(String[]args){
  Queue<Integer>q=new ArrayDeque<>();
  Stack<Integer>s=new Stack<>();

      q.add(10);
      q.add(20);
      q.add(30);
      q.add(40);
     
      System.out.println("Before reverse : "+q);
      
      while(!q.isEmpty())
      {
         int ele=q.remove();
         s.push(ele);
      }
      while(!s.isEmpty())
      {
         int ele=s.peek();
         s.pop();
        q.add(ele);
      }
      System.out.println("after reverse : "+q);


}
}