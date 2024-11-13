import java.util.*;
public class reverse{
static Queue<Integer> riverse(Queue<Integer>q)
{
       if(q.isEmpty())
       {
        return q;
       }
    int data=q.peek();
     q.remove();

    q=riverse(q);

    q.add(data);
    return q;
}
public static void main(String[]args){
    Queue<Integer>q=new LinkedList<>();
   q.add(10);
   q.add(20);
   q.add(30);
    
   q=riverse(q);
 System.out.print(q);

}
}