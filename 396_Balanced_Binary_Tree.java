/*Question : 
 * 
 *  Given a binary tree, determine if it is height-balanced.

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: true
Example 2:


Input: root = [1,2,2,3,3,null,null,4,4]
Output: false
Example 3:

Input: root = []
Output: true
 

Constraints:

The number of nodes in the tree is in the range [0, 5000].
-104 <= Node.val <= 104
 */

public class 396_Balanced_Binary_Tree {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

    public boolean isBalanced(TreeNode root) {
            return height(root)!=-1;
    }

    public static int height(TreeNode root){
          if(root==null){
            return 1;
          }  
        
        int lefthight=height(root.left);
        if(lefthight==-1){
            return -1;
        }

        int righthight=height(root.right);
        if(righthight==-1){
            return -1;
        }

        if(Math.abs(lefthight-righthight) > 1){
            return -1;
        }

        return Math.max(lefthight,righthight) + 1;
         
    }
}
