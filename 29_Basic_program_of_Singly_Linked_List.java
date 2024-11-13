import java.util.*;
public class linked{
    public static class Node{
        int data;
        Node next;
    Node(int data)
    {
        this.data=data;
       // this.next=null;
    }
}
static void display(Node s)
{
      while(s!=null)
      {
          System.out.print(s.data+" ");
          s=s.next;
      }
}
public static void main(String[]args){
       Node a=new Node(10);
       Node b=new Node(20);
       Node c=new Node(30);
       Node d=new Node(40);
    
        a.next=b;
        b.next=c;
        c.next=d;
    
    display(a);

}
}