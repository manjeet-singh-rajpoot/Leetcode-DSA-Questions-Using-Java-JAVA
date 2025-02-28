/*Question : 
 *   Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

 

Example 1:


Input: head = [1,2,2,1]
Output: true
Example 2:


Input: head = [1,2]
Output: false
 

Constraints:

The number of nodes in the list is in the range [1, 105].
0 <= Node.val <= 9
 
 */
import java.util.*;
public class 368_Palindrom_Linked_List{
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

public static boolean isPalindrome(ListNode head) {
        
         List<Integer>list=new ArrayList<>();

          while(head!=null){
              list.add(head.val);
              head=head.next;
        }

             int left=0;
             int right=list.size()-1;
             
    while(left<right && list.get(left)==list.get(right)){
          left++;
          right--;
    }

    return left>=right;


}
    public static void main(String[] args) {
        ListNode head=new ListNode();
        ListNode second=new ListNode();
        ListNode third=new ListNode();
        ListNode fourth=new ListNode();
    
        
        head.val=1;
        head.next=second;
    
        second.val=2;
        second.next=third;
    
        third.val=2;
        third.next=fourth;
    
        fourth.val=1;
        fourth.next=null;
    
     System.out.println("Before: ");
     display(head);
     System.out.println();
     System.out.println("After: ");
     System.out.println(isPalindrome(head));
     display(head);
    }
}
