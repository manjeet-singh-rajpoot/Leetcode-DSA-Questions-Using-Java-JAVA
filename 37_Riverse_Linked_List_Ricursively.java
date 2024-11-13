import java.util.*;
public class riversell {
 public static class Node{
    int data;
    Node next;
Node(int data)
{
    this.data=data;
    this.next=null;
}

 }
static void riverse(Node head)
{
       if(head==null)
       {
        return ;
       }
       riverse(head.next);
       System.out.print(head.data+" ");
}
public static void main(String[]args){
    Node head=new Node(20);
    Node second=new Node(30);
    Node third=new Node(40);
    Node fourth=new Node(50);
    Node five=new Node(60);

   head.next=second;
   second.next=third;
   third.next=fourth;
   fourth.next=five;
   five.next=null;

System.out.println("Before insert: ");
 riverse(head);
 System.out.println();

}
}