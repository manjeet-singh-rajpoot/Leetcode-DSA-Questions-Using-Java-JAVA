public class 429_K_th_Largest_element_in_Array { 
static int solve(int arr[],int k){
       
      Arrays.sort(arr);
       // 1,2,3,4,5,6// k=2
        //6-2=4
      
    
    return arr[arr.length-k];
       

}

    public static void main(String[] args) {
          //int arr[]={3,2,3,1,2,4,5,5,6};
          // int k=4;
          int arr[]={3,2,1,5,6,4};
           int k=2;
          System.out.println(solve(arr,k));
    }
}


