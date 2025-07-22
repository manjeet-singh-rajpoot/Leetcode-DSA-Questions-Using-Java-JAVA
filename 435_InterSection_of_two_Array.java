public class 435_InterSection_of_two_Array {
    
 
   static int []solve(int arr1[],int arr2[]){
   Set<Integer>set1=new HashSet<>();
   Set<Integer>set2=new HashSet<>();
   int ind=0;

   for(int num:arr1){
      set1.add(num);
   }

   for(int num:arr2){
    if(set1.contains(num)){
        set2.add(num);
    }
   }

   int ans[]=new int[set2.size()];

   for(int num:set2){
      ans[ind++]=num;
   }

return ans;
}   
    public static void main(String[] args) {
        int arr1[]={1,2,2,1};
        int arr2[]={2,2};

        System.out.println(Arrays.toString(solve(arr1,arr2)));
    }


}
