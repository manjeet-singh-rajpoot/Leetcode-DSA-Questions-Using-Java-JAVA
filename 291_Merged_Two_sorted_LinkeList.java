/*       Question : 
 *  Merged Two Sorted List: 
 *       
 *     You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 *    
 */      //Answer: 

 public class 291_Merged_Two_sorted_LinkeList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         
        ListNode temp=new ListNode();
        ListNode p=temp;
     
        while(list1!=null && list2!=null){
           if(list1.val>list2.val){
              p.next=list2;
              list2=list2.next;
           }else{
              p.next=list1;
             list1=list1.next;
           }
            p=p.next;
        }
     
       p.next=(list1!=null)?list1:list2;
     
       return temp.next;
     
         }
    
 }