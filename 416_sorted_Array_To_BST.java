/*
 * Question :
 *    Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

 

Example 1:


Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:


Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums is sorted in a strictly increasing order.

Seen this question in a real interview before?
1/5
Yes
No
Accepted
1.4M
Submissions
1.9M
Acceptance Rate
73.7%
Topics
Companies
Similar Questions
 */
public class 416_sorted_Array_To_BST {
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
class 416_sorted_Array_To_BST {
    public TreeNode sortedArrayToBST(int[] nums) {
          return solve(nums,0,nums.length-1);    
    }

  private TreeNode solve(int nums[],int left,int right){
       if(left>right){
           return null;
       }
    int mid=(left+right) / 2;
    TreeNode root=new TreeNode(nums[mid]);
    root.left=solve(nums,left,mid-1);
    root.right=solve(nums,mid+1,right);
    return root;
  }
}
}
