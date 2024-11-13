import java.util.*;
public class mist{
static void reverse(int k)
{
      Stack<Integer>s=new Stack<>();
      Queue<Integer>q=new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        System.out.println("Before: "+q);
    for(int i=0;i<k;i++)
    {
          int val=q.remove();
          s.push(val);
    }
    while(!s.isEmpty())
    {
         int val=s.peek();
         s.pop();
         q.add(val);
    }
   int ele=q.size()-k;
     for(int i=ele;i>0;i--)
    {
        int val=q.remove();
        q.add(val);
    }
    
    System.out.println("after: "+q);
}
public static void main(String[]args){
    reverse(3);
}
}
