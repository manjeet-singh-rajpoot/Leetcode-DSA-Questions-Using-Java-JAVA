import java.util.*;
public class linked{
    public static class Node{
        int data;
        Node next;
    Node(int data)
    {
         this.data=data;
    }
}

static void display(Node head)
{
      while(head!=null)
      {
        System.out.print(head.data+" ");
        head=head.next;
      }
}

static Node deleteatfirst(Node head)
{
     Node p=head;
     Node q=head;
     head=head.next;
     p=null;
     return head;
}

static Node deleteend(Node head)
{
    Node p=head;
    Node q=head.next;
    while(q.next!=null)
    {
        p=p.next;
        q=q.next;
    }
   p.next=null;
   q.next=null;
   return head;
}

static Node deleteatindex(Node head,int index)
{
     Node p=head;
     Node q=head.next;
     Node r=q.next;
     int i=0;
    while(i!=index-1)
    {
        p=p.next;
        q=q.next;
        r=r.next;
        i++;
    }
    p.next=r;
    q=null;
    return head;

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
 display(head);
 System.out.println();

 System.out.println("after insert: ");
  head=deleteatfirst(head);
 display(head);

  System.out.println();
  System.out.println("after index: ");
  head=deleteatindex(head,2);
  display(head);

  System.out.println();
  System.out.println("after end: ");
  head=deleteend(head);
 display(head);


}
}