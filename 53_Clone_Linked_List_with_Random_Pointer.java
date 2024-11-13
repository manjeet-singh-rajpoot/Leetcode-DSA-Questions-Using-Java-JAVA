import java.util.*;
import java.util.HashMap;
public class random{
    public static class Node{
          int data;
          Node next;
          Node random;
        Node(int data)
        {
             this.data=data;
             this.next=null;
             this.random=null;
        }
    }
static void display(Node head){

      
    System.out.print(head.data+" "+"->("+head.random.data+") ");
         head=head.next;
        while(head!=null)
        {
            System.out.print(head.data+" "+"->("+head.random.data+ ") ");
            head=head.next;
        }

        System.out.println();
}
static Node clonelinkedlist(Node head)
{
    HashMap<Node,Node>mp=new HashMap<>();
        Node temp=head;

        Node nhead=new Node(temp.data);
        mp.put(temp,nhead);
    
        //asetis head and head ke next ke liye//
        while(temp.next!=null)
        {
            nhead.next=new Node(temp.next.data);
            temp=temp.next;
            nhead=nhead.next;
            mp.put(temp,nhead);
        }
      temp=head;
    
       //random pointer ke liye//
      while(temp!=null)
      {
          mp.get(temp).random=mp.get(temp.random);
          temp=temp.next;
      }

      return mp.get(head);
}
public static void main(String[]args){
       Node head=new Node(1);
       Node second=new Node(2);
       Node third=new Node(3);
       Node fourth=new Node(4);
       Node five=new Node(5);

       head.next=second;
       head.random=third;

       second.next=third;
       second.random=head;

       third.next=fourth;
       third.random=five;

       fourth.next=five;
       fourth.random=third;
      
       five.random=second;
       five.next=null;

        System.out.println("Before:  ");
          display(head);

       System.out.println("After:  ");
        head=clonelinkedlist(head);
        display(head);

}
}