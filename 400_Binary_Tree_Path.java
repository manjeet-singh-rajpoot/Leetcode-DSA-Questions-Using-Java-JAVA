/*Question : 
 * 
 * Given the root of a binary tree, return all root-to-leaf paths in any order.

A leaf is a node with no children.

 

Example 1:

Input: root = [1,2,3,null,5]
Output: ["1->2->5","1->3"]

Example 2:

Input: root = [1]
Output: ["1"]

 

Constraints:

    The number of nodes in the tree is in the range [1, 100].
    -100 <= Node.val <= 100


 */

public class 400_Binary_Tree_Path {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
         } 
         public List<String> binaryTreePaths(TreeNode root) {
         
            List<String>ans=new ArrayList<>();
            if(root!=null){
                  Search(root,"",ans);
            }
            return ans;
    
        }
        void Search(TreeNode root ,String path ,List<String>ans){
            if(root.left==null && root.right==null){
                ans.add(path+root.val);
            }
           if(root.left!=null){
               Search(root.left,path+root.val+"->",ans);
           }
           if(root.right!=null){
             Search(root.right,path+root.val+"->",ans);
           }
    
        }
    }

