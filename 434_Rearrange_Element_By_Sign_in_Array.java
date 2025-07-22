public class 434_Rearrange_Element_By_Sign_in_Array {
    
   static int []solve(int arr[]){
    int ans[]=new int[arr.length];
    List<Integer>pos=new ArrayList<>();
    List<Integer>neg=new ArrayList<>();
    int i=0,j=0,k=0,l=0;
       
     while(k < arr.length){
         if(arr[k] > 0){
             pos.add(arr[k]);
             k++;
         }else {
             neg.add(arr[k]);
             k++;
         }
     }

     
   while(l < ans.length){
      ans[l]=pos.get(i);
      l++;
      ans[l]=neg.get(j);
      l++;
    i++;
    j++;
   }


        return ans;
    }
    public static void main(String[] args) {
         // int nums[]={3,1,-2,-5,2,-4};
         // System.out.println(solve(nums));
          int nums[]={-1,1};
         System.out.println(Arrays.toString(solve(nums)));

    }

 
}
