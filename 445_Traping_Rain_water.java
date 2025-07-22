public class 445_Traping_Rain_water {
    

public static int solve(int arr[]){
       int water=0;
       int left=0;
       int right=arr.length-1;
       int leftmax=arr[left];
       int rightmax=arr[right];
       while(left < right){
           if(leftmax < rightmax){
              left++;
              leftmax=Math.max(leftmax,arr[left]);
              water+=leftmax - arr[left];
           }else{
             right--;
             rightmax=Math.max(rightmax,arr[right]);
             water+=rightmax-arr[right];
           }
       }
    return water;
}
    public static void main(String[] args) {
        int arr[]={2,1,0,1,3,2};
        System.out.println(solve(arr));
    }


}
