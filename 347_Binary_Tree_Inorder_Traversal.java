/* Question: 
 * 
 *     Given the root of a binary tree, return the inorder traversal of its nodes' values.

 

Example 1:

Input: root = [1,null,2,3]

Output: [1,3,2]

Explanation:



Example 2:

Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

Output: [4,2,6,5,7,1,3,9,8]

Explanation:



Example 3:

Input: root = []

Output: []

Example 4:

Input: root = [1]

Output: [1]

 

Constraints:

The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
 
 * 
 */

public class 347_Binary_Tree_Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode curr = root;
      List<Integer> ans = new ArrayList();
      while(curr!=null){
          if(curr.left==null){
              ans.add(curr.val);
              curr=curr.right;
          }else{
              TreeNode prev = curr.left;
              while(prev.right!=null&&prev.right!=curr){
                  prev = prev.right;
              }
              if(prev.right==null){
                  prev.right=curr;
                  curr=curr.left;
              }
              else{
                  prev.right=null;
                  ans.add(curr.val);
                  curr=curr.right;
              }
          }
      }
      return ans;
  }
}
