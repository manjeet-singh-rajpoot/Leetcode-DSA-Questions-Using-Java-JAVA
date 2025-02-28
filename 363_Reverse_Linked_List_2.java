/*Question : 
 * Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.

 

Example 1:


Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]
Example 2:

Input: head = [5], left = 1, right = 1
Output: [5]
 

Constraints:

The number of nodes in the list is n.
1 <= n <= 500
-500 <= Node.val <= 500
1 <= left <= right <= n
 * 
 */
public class 363_Reverse_Linked_List_2 {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     
 public static void display(ListNode head){
            while(head!=null){
              System.out.print(head.val+" ");
              head=head.next;
            }
      }
public static ListNode reverseBetween(ListNode head, int left, int right) {
             if(left==right){
                return head;
             }
            ListNode p=head;
               
            for(int i=0;i<left-1;i++){
                 p=p.next;
            }
        ListNode q=head;
        for(int i=0;i<right-1;i++){
            q=q.next;
        }

        ListNode prev=new ListNode();
        while(p.next!=q){
              prev.val=p.val;
              p.val=q.val;
              q.val=prev.val;
               p=p.next;
            
        }
return head;

      }
    
    public static void main(String[] args) {

    ListNode head=new ListNode();
    ListNode second=new ListNode();
    ListNode third=new ListNode();
    ListNode fourth=new ListNode();
    ListNode five=new ListNode();

    
    head.val=1;
    head.next=second;

    second.val=2;
    second.next=third;

    third.val=3;
    third.next=fourth;

    fourth.val=4;
    fourth.next=five;

    five.val=5;
    five.next=null;

 System.out.println("Before: ");
 display(head);
 System.out.println();
 System.out.println("After: ");
 head=reverseBetween(head,2,4);
 display(head);   
}
}
