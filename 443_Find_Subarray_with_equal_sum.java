public class 443_Find_Subarray_with_equal_sum {
      
  // leetcode 2395
  static boolean solve(int nums[]){
          Set<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length-1;i++){
              int val=nums[i]+nums[i+1];

              if(set.contains(val)){
                   return true;
              }else{
                set.add(val);
              }
        }
      return false;
  }
    public static void main(String[] args) {
         int nums[]={1,2,3,4,5}; //false
       //  int nums[]={4,2,4}; //true
        // int nums[]={1,-4,4}; //false
       //  int nums[]={0,0}; // false 
         System.out.println(solve(nums));
    }
}

