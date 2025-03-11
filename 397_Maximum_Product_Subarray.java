/*Question : 
 * 
 *   Given an integer array nums, find a

that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

 

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.

Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.

 

Constraints:

    1 <= nums.length <= 2 * 104
    -10 <= nums[i] <= 10
    The product of any subarray of nums is guaranteed to fit in a 32-bit integer.

 */

public class 397_Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int l=0;
        int r=0;
        int n=nums.length;

for(int i=0;i<n;i++){
  l=(l==0 ? 1 : l)*nums[i];
  r=(r==0 ? 1: r)*nums[n-1-i];
  res=Math.max(res,Math.max(l,r));
}

return res;
    }
}
