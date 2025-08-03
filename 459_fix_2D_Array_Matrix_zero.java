public class 459_fix_2D_Array_Matrix_zero{

  
static int [][] solve(int arr[][]){
      boolean zeroinfirstcol=false;
     
        //yadi first col zero hai //
      for(int row=0;row<arr.length;row++){
           if(arr[row][0]==0){
              zeroinfirstcol=true;
           }
          for(int col=1;col<arr[0].length;col++){
            if(arr[row][col]==0){
              arr[row][0]=0;
              arr[0][col]=0;
            }
          }
      }

     for(int row=arr.length-1;row>=0;row--){
       for(int col = arr[0].length-1;col>=1;col--){
              if(arr[row][0]==0 || arr[0][col]==0){
                 arr[row][col]=0;
              }
       }
       if(zeroinfirstcol){
          arr[row][0]=0;
       }
     }
return arr;
    

}
    public static void main(String[] args) {
        //  int arr[][]={{1,1,1},
        //               {1,0,1},
        //               {1,1,1}
        //             };
 
        int arr[][]={{0,1,2,0},
                     {3,4,5,2},
                     {1,3,1,5}
                    };
        
        int grid[][]=solve(arr);
          for(int n[]:grid){
                for(int n2:n){
                    System.out.print(n2+" ");
                }
                System.out.println();
          }
    }
}
