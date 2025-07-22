public class 444_missing_element_in_Array {
    
static int solve(int arr[]){
    Arrays.sort(arr);
      int res=arr.length;
      for(int i=0;i<arr.length;i++){
          res += i - arr[i];
      }

      return res;
   } 
    public static void main(String[] args) {
        // int arr[]={9,6,4,2,3,5,7,0,1};
        // int arr[]={0,1};
       //int arr[]={3,0,1};
       int arr[]={0};
         System.out.println(solve(arr));
    }


}
