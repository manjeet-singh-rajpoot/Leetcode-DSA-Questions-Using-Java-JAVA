/*p.nextuestion: 
 * 
 * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 

Example 1:


Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]
Example 2:

Input: head = [], val = 1
Output: []
Example 3:

Input: head = [7,7,7,7], val = 7
Output: []
 

Constraints:

The number of nodes in the list is in the range [0, 104].
1 <= Node.val <= 50
0 <= val <= 50
 * 
 */
public class 350_Remove_LinkedList_Elements{
     int val;
     ListNode next;
     ListNode() {};
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

public static ListNode removeelement(ListNode head,int val){
   
     ListNode ans=head;
     ListNode p=ans;
     
     while(p!=null){
          while(p.next!=null && p.next.val==val){
               p.next=p.next.next;
          }
        p=p.next;
     }

     return ans;

}

public static void display(ListNode head){
      while(head!=null){
        System.out.print(head.val+" ");
        head=head.next;
      }
}

    public static void main(String[] args) {
       
    ListNode head=new ListNode();
    ListNode second=new ListNode();
    ListNode third=new ListNode();
    ListNode fourth=new ListNode();
    ListNode five=new ListNode();
    ListNode six=new ListNode();
    ListNode seven=new ListNode();
    
    head.val=1;
    head.next=second;

    second.val=2;
    second.next=third;

    third.val=6;
    third.next=fourth;

    fourth.val=3;
    fourth.next=five;

    five.val=4;
    five.next=six;

    six.val=5;
    six.next=seven;

    seven.val=6;
    seven.next=null;

   System.out.print("Before : ");
   display(head);
  System.out.println();
   System.out.print("After : ");
   head=removeelement(head,6);
   display(head);
}
}

