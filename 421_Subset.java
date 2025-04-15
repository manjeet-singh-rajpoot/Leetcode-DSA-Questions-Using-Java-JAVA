
/*
 * 
 * Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 

Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.

Seen this question in a real interview before?
1/5
Yes
No
Accepted
2.4M
Submissions
3M
Acceptance Rate
80.5%
Topics
Companies
Similar Questions
Discussion (186)
 */




 class 421_Subset{
    public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>>dp=new ArrayList<>();
            List<Integer>subset=new ArrayList<>();
            createsubset(nums,0,subset,dp);
        return dp;
    }


    private void createsubset(int nums[],int index,List<Integer>subset,List<List<Integer>>res){
          
      if(index==nums.length){
          res.add(new ArrayList<>(subset));
          return;
      }

      subset.add(nums[index]);
      createsubset(nums,index+1,subset,res);

      subset.remove(subset.size()-1);
      createsubset(nums,index+1,subset,res);

    

    }
}
