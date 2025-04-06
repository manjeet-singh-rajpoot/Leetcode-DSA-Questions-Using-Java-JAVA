/*
 * Question:
 *    You are given a sorted unique integer array nums.

A range [a,b] is the set of all integers from a to b (inclusive).

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
 

Example 1:

Input: nums = [0,1,2,4,5,7]
Output: ["0->2","4->5","7"]
Explanation: The ranges are:
[0,2] --> "0->2"
[4,5] --> "4->5"
[7,7] --> "7"
Example 2:

Input: nums = [0,2,3,4,6,8,9]
Output: ["0","2->4","6","8->9"]
Explanation: The ranges are:
[0,0] --> "0"
[2,4] --> "2->4"
[6,6] --> "6"
[8,9] --> "8->9"
 

Constraints:

0 <= nums.length <= 20
-231 <= nums[i] <= 231 - 1
All the values of nums are unique.
nums is sorted in ascending order.

Seen this question in a real interview before?
1/5
Yes
No
Accepted
758.8K
Submissions
1.4M
Acceptance Rate
52.7%
Topics
Companies
 */

public class 417_Summury_Ranges {
    
        public List<String> summaryRanges(int[] nums) {
              List<String>ans=new ArrayList<>();
         
         if(nums.length==0){
                return ans;
            }
           int a=nums[0];
           
    
            for(int i=1;i<nums.length;i++){
                  if(nums[i]!=nums[i-1]+1){
                       if(a==nums[i-1]){
                           ans.add(String.valueOf(a));
                       }else{
                          ans.add(a+"->"+nums[i-1]);
                       }
                    a=nums[i];
                  }
            }
            if(a==nums[nums.length-1]){
                  ans.add(String.valueOf(a));
            }else{
                ans.add(a+"->"+nums[nums.length-1]);
            }
               
            return ans;
        }
    }

