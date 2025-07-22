public class 438_Check_if_Array_sorted_roteted {
        static boolean solve(int arr[]){
          int count=0;
          int n=arr.length;
          for(int i=0;i<n;i++){
            if(arr[i] > arr[(i+1)%n]){
                count++;
            }
          }
        return count<=1;
    }
    public static void main(String[] args) {
          //int nums[]={3,4,5,1,2};
          int nums[]={1,2,3};
          //int nums[]={2,1,3,4};
          System.out.println(solve(nums));
    }

}
