public class 432_Kth_smallest_element_in_matrix {
    import java.util.Arrays;


    static int solve(int arr[][],int k){
       
        int n=arr.length;
        int m=arr[0].length;
        int i=0;
        int ans[]=new int[n*m];
          for(int n1[]:arr){
              for(int n2:n1){
                   ans[i++]=n2;
              }
          }  
         Arrays.sort(ans);
          return ans[k-1];
    }

    public static void main(String[] args) { 
          //i/p=[[-5]]  k=1   o/p: -5
            //  int mat[][]={{1,5,9},
            //               {10,11,13},
            //               {12,13,15},
            //             };

            int mat[][]={{1,2},
                         {1,3}};
 
             //int mat[][]={{-5}};

            int k=2; //o/p =13 // [1,5,9,10,11,13,12,13,15]
                // time complexity: O(n) space complexity:O(1) //348 leetcode kth smalllest in sorted matrix
            System.out.println(solve(mat,k));
    }
}

}
