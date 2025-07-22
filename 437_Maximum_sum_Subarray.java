public class 437_Maximum_sum_Subarray {
    
static  int solve(int arr[]){
     int currsum=0;
     int maxsum=Integer.MIN_VALUE;
     
     for(int i=0;i<arr.length;i++){
          currsum+=arr[i];
          if(currsum > maxsum){
            maxsum=currsum;
          }
          if(currsum < 0){
              currsum=0;
          }
     }

     return maxsum;
}
    
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
          System.out.println(solve(arr));
    }


}
