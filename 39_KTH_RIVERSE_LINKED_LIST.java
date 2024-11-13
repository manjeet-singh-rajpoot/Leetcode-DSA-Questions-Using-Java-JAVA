
    import java.util.*;
public class riverse{
       public static class Node{
        int data;
        Node next;
      Node(int data)
     {
          this.data=data;
          this.next=null;
      }
 } 


 static Node group(Node head,int k)
 {
        Node prev=null;
        Node p=head;
        Node next=null;
        int count=0;
    if(head==null)
    {
        return null;
    }
    while(p!=null && count<k)
    {
        next=p.next;
        p.next=prev;
        prev=p;
        p=next;
        count++;
    }
    if(next!=null)
    {
        head.next=group(next,k);
    }
  // System.out.print(head.data+" ");
    return prev;
}
static void display(Node head){
     while(head!=null)
     {
         System.out.print(head.data+" ");
         head=head.next;
     }
}

public static void main(String[]args){
    Node head=new Node(10);
    Node second=new Node(20);
    Node third=new Node(30);
    Node fourth=new Node(40);

    Node five=new Node(50);
    Node six=new Node(60);
   // Node third=new Node(40);
   // Node fourth=new Node(50);

   head.next=second;
   second.next=third;
   third.next=fourth;
   fourth.next=five;
   five.next=six;
   six.next=null;

System.out.println("kTH riverse: ");
head=group(head,3);
display(head);
 System.out.println();

}
}
