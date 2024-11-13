import java.util.*;
public class come{
       public static class Node{
        int data;
        Node next;
      Node(int data)
     {
          this.data=data;
          this.next=null;
      }
 } 

 static void display(Node ptr)
 {
      while(ptr!=null)
      {
          System.out.print(ptr.data+" ");
          ptr=ptr.next;
      }
 }

 static Node getcompo(Node head)
 {
        int zerocount=0;
        int onecount=0;
        int twocount=0;
    Node temp=head;
    while(temp!=null)
    {
           if(temp.data==0)
           {
                zerocount++;
           }
           else if(temp.data==1)
           {
               onecount++;
           }
           else if(temp.data==2)
           {
              twocount++;
           }
             temp=temp.next; 
    }
    temp=head;  
    while(temp!=null)
    {
        if(zerocount!=0)
        {
            temp.data=0;
             zerocount--;
        }
        else if(onecount!=0)
        {
            temp.data=1;
             onecount--;
        }
        else if(twocount!=0)
        {
            temp.data=2;
            twocount--;
        }
            temp=temp.next;
    }
    return head;

 }

public static void main(String[]args){
    Node head=new Node(0);
    Node second=new Node(1);
    Node third=new Node(0);
    Node fourth=new Node(2);
    Node five=new Node(1);

   head.next=second;
   second.next=third;
   third.next=fourth;
   fourth.next=five;
   five.next=null;

System.out.println("Before insert: ");
 display(head);
 System.out.println();


System.out.println("sorting: ");
head=getcompo(head);
display(head);

}
}
