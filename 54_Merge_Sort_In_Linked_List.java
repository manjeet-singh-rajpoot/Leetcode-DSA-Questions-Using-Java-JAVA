import java.util.*;
public class middle{
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
static Node findmiddle(Node head)
{
       Node slow=head;
       Node fast=head.next;
    while(fast!=null && fast.next!=null)
    {
          slow=slow.next;
          fast=fast.next.next;
    }
    return slow;
}
static Node merge(Node a, Node b) 
    { 
        Node result = null; 
        /* Base cases */
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
  
        /* Pick either a or b, and recur */
        if (a.data <= b.data) { 
            result = a; 
            result.next = merge(a.next, b); 
        } 
        else { 
            result = b; 
            result.next = merge(a, b.next); 
        } 
        return result; 
    } 
  
 static Node mergesort(Node head)
 {
      if(head==null || head.next==null)
      {
         return head;
      }
      //break linked list into two parts left and right//
   Node mid=findmiddle(head);

   Node left=head;
   Node right=mid.next;
   
   mid.next=null;
   left=mergesort(left);
   right=mergesort(right);

   Node result=merge(left,right);

   return result;

 }

public static void main(String[]args){
       Node head=new Node(30);
       Node second=new Node(10);
       Node third=new Node(50);
       Node fourth=new Node(20);
       Node five=new Node(60);
       Node six=new Node(40);
    
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=five;
        five.next=six;
        six.next=null;
    
  //  display(a);

//System.out.println("Middle is : "+middle(a));
System.out.println("mergesort is : ");
   head=mergesort(head);
   display(head);

}
}