public class 457_Transpose_Matrix {

    static int[][] solve(int arr[][]){
         int ans[][]=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                ans[j][i]=arr[i][j];
            }
        }
return ans;
    }

    public static void main(String[] args) {
        //   int mat[][]={{1,2,3},
        //                {4,5,6},
        //                {7,8,9}
        //               };

        int mat[][]={{1,2,3},{4,5,6}};
        
           int arr[][]=solve(mat);

            for(int num1[]:arr){
                for(int num2:num1){
                    System.out.print(num2+" ");
                }
                System.out.println();
            }

    }
}
