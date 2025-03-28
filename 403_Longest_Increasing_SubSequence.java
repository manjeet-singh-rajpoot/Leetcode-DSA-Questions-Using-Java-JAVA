
/*
 * Question :
 * 
 * Given an integer array nums, return the length of the longest strictly increasing subsequence.

 

Example 1:

Input: nums = [10,9,2,5,3,7,101,18]
Output: 4
Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
Example 2:

Input: nums = [0,1,0,3,2,3]
Output: 4
Example 3:

Input: nums = [7,7,7,7,7,7,7]
Output: 1
 

Constraints:

1 <= nums.length <= 2500
-104 <= nums[i] <= 104
 

Follow up: Can you come up with an algorithm that runs in O(n log(n)) time complexity?
 * 
 */



public class 403_Longest_Increasing_SubSequence{
static int solve(int arr[]){

    int n=arr.length;
    if(arr==null || arr.length==0){
        return 0;
    }
int dp[]=new int[n];
  for(int i=0;i<n;i++){
      dp[i]=1;
  }

for(int i=1;i<n;i++){
    for(int j=0;j<i;j++){
        if(arr[i]>arr[j]){
            dp[i]=Math.max(dp[i],dp[j]+1);
        }
    }
}

int maxLIS=0;

for(int i=0;i<n;i++){
    maxLIS=Math.max(maxLIS,dp[i]);
}

return maxLIS;

}
    public static void main(String[] args) {
        
        int nums[] = {10,9,2,5,3,7,101,18};
        System.out.print(solve(nums));
    }
}