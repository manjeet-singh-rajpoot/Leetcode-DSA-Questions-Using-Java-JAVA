
public class 425_Window_Sum_in_k_SubArray {

    //window sum ka use k sum nikalne me hota hai kisi array ka subarray me //
      
    static int maxsubarray(int nums[],int k){
           int maxsum=0;
           int windowsum=0;
        for(int i=0;i<k;i++){
              windowsum+=nums[i];
        }
  
        for(int i=k;i<nums.length;i++){
              windowsum+=nums[i]-nums[i-k];
              maxsum=Math.max(maxsum, windowsum);
        }

        return maxsum;

    }
    public static void main(String[] args) {
        int  nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        int k=3;
        System.out.println(maxsubarray(nums,k)); 
    }
}
    

