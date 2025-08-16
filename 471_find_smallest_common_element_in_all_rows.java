public class 471_find_smallest_common_element_in_all_rows {
   static int  solve(int arr[][]){
      int count[]=new int[10001];

      for(int num1[]:arr){
          for(int n2:num1){
            if(++count[n2]==arr.length){
                return n2;
            }
          }
      }
      return -1;

   } 
    public static void main(String[] args) {
       int[][] mat = {{1,2,3,4,5},{2,4,5,8,10},{3,5,7,9,11},{1,3,3,7,9}};
       System.out.println(solve(mat));
    }
}
