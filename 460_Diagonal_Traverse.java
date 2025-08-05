public class 460_Diagonal_Traverse {
     static int[] solve(int arr[][]){
         int m=arr.length;
         int n=arr[0].length;
          int ans[]=new int[m*n];
          int row=0;
          int col=0;
          int dir=1;
     
    for(int i=0;i<m*n;i++){
        ans[i]=arr[row][col];
    
          // move upwanrs
        if(dir == 1){
          if(col==n-1){
             row++;
             dir=-1;
          }else if(row==0){
             col++;
             dir=-1;
          }else{
            row--;
            col++;

          }
        }else{
          //downward//
          if(row== m-1){
             col++;
             dir=1;
          }else if(col==0){
            row++;
            dir=1;
          }else{
            row++;
            col--;
          }
        }
    }


       return ans;
}
}
