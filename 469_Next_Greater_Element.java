public class 469_Next_Greater_Element {
     public int[] secondGreaterElement(int[] nums) {
          int n=nums.length;
          int ans[]=new int[n];
          Stack<Integer>st=new Stack<>();
          for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }else{
                ans[i]=st.peek();
            }
            st.push(nums[i]);
          }

   return ans;     
   
    } 
}
