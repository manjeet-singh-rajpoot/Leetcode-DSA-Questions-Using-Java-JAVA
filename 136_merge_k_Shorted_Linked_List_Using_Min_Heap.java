import java.util.*;
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
static class NodeComparator implements Comparator<Node> {
         public int compare(Node k1,Node k2)
         {
              if(k1.data>k2.data)
              {
                return 1;
              }
              else if(k1.data<k2.data)
              {
                return -1;
              }
              return -1;
         }
}
static Node mergeLL(Node arr[],int k)
{
     PriorityQueue<Node>queue=new PriorityQueue<>(new NodeComparator());

     Node at[]=new Node[k];
     Node head=new Node(0);
     Node tail=head;

     for(int i=0;i<k;i++)
     {
        if(arr[i]!=null)
        {
            queue.add(arr[i]);
        }
     }
     if(queue.isEmpty())
     {
        return null;
     }

     while(!queue.isEmpty())
     {
        Node curr=queue.poll();

        tail.next=curr;
        tail=tail.next;

        if(curr.next!=null)
        {
           queue.add(curr.next);
        }
     }
return head.next;
}
static void display(Node head)
{
    while(head!=null)
    {
        System.out.print(head.data+" ");
        head=head.next;
    }
}
public static void main(String[]args){
    int n=3;
   Node a[]=new Node[n];

   //LinkedList1//
   Node head1=new Node(40);
    a[0]=head1;
   head1.next=new Node(43);
   head1.next.next=new Node(80);
   head1.next.next.next=new Node(79);

     //LinkedList2//
     Node head2=new Node(10);
     a[1]=head2;
     head2.next=new Node(30);
     head2.next.next=new Node(50);
     head2.next.next.next=new Node(60);

      //LinkedList3//
      Node head3=new Node(46);
      a[2]=head3;
      head3.next=new Node(76);
      head3.next.next=new Node(87);
      head3.next.next.next=new Node(97);
 
 Node res=mergeLL(a,n);
if(res!=null)
display(res);
System.out.println();
}
}