import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
public class merge{
    public static class Node{
        int data;
        Node next;
    Node(int data)
    {
         this.data=data;
         this.next=null;
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

static Node merge(Node head,Node five)
{
       Node p=head;
       Node q=five;

       List<Integer>v=new ArrayList<Integer>();
        while(p!=null)
        {
            v.add(p.data);
            p=p.next;
        }
        while(q!=null)
        {
            v.add(q.data);
            q=q.next;
        }
       // Collection.sort(v);
       Node result=new Node(-1);
       Node temp=result;

    for(int i=0;i<v.size();i++)
    {
         result.next=new Node(v.get(i));
         result=result.next;
    }
    temp=temp.next;
    System.out.println("Merging:  ");
    while(temp!=null)
    {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    return result;
}
public static void main(String[]args){

   Node head=new Node(10);
   Node second=new Node(20);
   Node third=new Node(30);
   Node fourth=new Node(40);

   head.next=second;
   second.next=third;
   third.next=fourth;
   fourth.next=null;


   Node five=new Node(50);
   Node six=new Node(60);
   Node seven=new Node(70);
   Node eight=new Node(80);

   five.next=six;
   six.next=seven;
   seven.next=eight;
   eight.next=null;

   merge(head,five);
  
}
}