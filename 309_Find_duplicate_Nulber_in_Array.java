/*Question:

    Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
Example 3:

Input: nums = [3,3,3,3,3]
Output: 3
 

Constraints:

1 <= n <= 105
nums.length == n + 1
1 <= nums[i] <= n
 * 
 * 
 */

public class 309_Find_duplicate_Nulber_in_Array {
   static int solve(int arr[]){
    int n=arr.length;
    
     //i i+1                i  i+1
    // 1  1  2  2  3  3  4  5   6 //
    //if(1==1){
    //     return 1
    //  }


    Arrays.sort(arr);
   
    for(int i=0;i<n-1;i++){
        if(arr[i]==arr[i+1]){
            return arr[i];
        }
    }
    return -1;

   } 
    public static void main(String args[]){
        int arr[]={1,2,,5,7,2,1};
        System.out.print(solve(arr));
    }
}
