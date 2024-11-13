import java.util.*;
public class  addition {
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
static Node riverse(Node head)
{
     if(head==null)
     {
        return null;
     }
     riverse(head.next);
     System.out.print(head.data+" ");

      return null;

}
/*
static Node riverse(Node head)
{
    Node prev=null;
    Node curr=head,next=null;
    while(curr!=null)
    {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      //  System.out.print(prev.data+" ");
    }
   
    return prev;
}
 */
static  void insertAttail(Node head,Node tail,Node temp)
{
  
       if(head==null)
       {
           head=temp;
           tail=temp;
           return ;
       }
       else{
        tail.next=temp;
        tail=temp;
      }
       return ;
}
static Node add(Node first,Node second)
{
    Node anshead=null;
    Node anstail=null;
    int sum=0;
    int digit=0;
     int carry=0;
    while(first!=null && second!=null){
      sum=carry+first.data+second.data;
       digit=sum%10;
       Node temp=new Node(digit);
      insertAttail(anshead,anstail,temp);
      carry=sum/10;
      first=first.next;
      second=second.next;
    }
    while(first!=null)
    {
         sum=carry + first.data;
         digit=sum%10;
         Node temp=new Node(digit);
        insertAttail(anshead,anstail,temp);
        carry=sum/10;  
        first=first.next;
    }
    while(second!=null)
    {
         sum=carry+second.data;
         digit=sum%10;
         Node temp=new Node(digit);
        insertAttail(anshead,anstail,temp);
        carry=sum/10;
        second=second.next;
    }
    while(carry!=0)
    {
         sum=carry;
         digit=sum%10;
         Node temp=new Node(digit);
        insertAttail(anshead,anstail,temp);
        carry=sum/10;
    }
    return anshead;
}
static Node addtwo(Node a,Node e)
{
      a=riverse(a);
      e=riverse(e);

      Node ans=add(a,e);

      ans=riverse(ans);

      return ans;

}
public static void main(String[]args){
    Node a=new Node(10);
    Node b=new Node(20);
    Node c=new Node(30);
    Node d=new Node(90);
 
     a.next=b;
     b.next=c;
     c.next=d;
     d.next=null;

     Node e=new Node(10);
     Node f=new Node(20);
     Node g=new Node(30);
     Node h=new Node(90);

     e.next=f;
     f.next=g;
     g.next=h;
     h.next=null;

 // System.out.println("Riverse: ");
  //riverse(a);
 // System.out.println("addition: ");

//  add(a,e);
   addtwo(a,e);
 //  display(a);

}
}