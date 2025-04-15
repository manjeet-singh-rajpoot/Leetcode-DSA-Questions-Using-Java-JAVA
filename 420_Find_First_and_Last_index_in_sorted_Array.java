//Question 

// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]
// Example 2:

// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]
// Example 3:

// Input: nums = [], target = 0
// Output: [-1,-1]
 

// Constraints:

// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
// nums is a non-decreasing array.
// -109 <= target <= 109
// Seen this question in a real interview before?
// 1/5
// Yes
// No
// Accepted
// 2.6M
// Submissions
// 5.6M
// Acceptance Rate
// 46.4%
// Topics
// Companies
// Similar Questions

public class 420_Find_First_and_Last_index_in_sorted_Array{
    public int[] searchRange(int[] nums, int target) {
        int res[]={-1,-1};
        int l=binarysearch(nums,target,true);
        int r=binarysearch(nums,target,false);
        res[0]=l;
        res[1]=r;

        return res;
}
private int binarysearch(int arr[],int target,boolean issearch){
      int left=0;
      int right=arr.length-1;
      int index=-1;
      while(left<=right){
        int mid=left+(right-left)/2;
        if(arr[mid] > target){
            right=mid-1;
        }else if(arr[mid]<target){
            left=mid+1;
        }else{
            index=mid;
            if(issearch){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
       
      }
       return index;
}
}