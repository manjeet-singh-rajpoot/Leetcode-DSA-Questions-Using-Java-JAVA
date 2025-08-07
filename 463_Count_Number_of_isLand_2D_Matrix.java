public class 463_Count_Number_of_isLand_2D_Matrix {


    static int row;
    static int col;
    static int dirs[][]={
        {-1,0}, //up direction
        {0,1}, //right direction
        {1,0},//down direction
        {0,-1},//left direction
    };
  static boolean dfs(int row,int col,int grid1[][],int grid2[][],boolean vis[][]){
            vis[row][col]=true;
            int rows=grid1.length;
            int cols=grid1[0].length;
            boolean isiland=true;
        if(grid1[row][col]==0){
            isiland=false;
        }
          //neighbours cells//
    
    for(int dir[]:dirs){
         int nextR=row + dir[0];
         int nextC=col+dir[1];
         
         if(nextR >= 0 && nextC >=0 && nextR < rows && nextC < cols && grid2[nextR][nextC] ==1 && vis[nextR][nextC]==false){
             boolean b=dfs(nextR, nextC, grid1, grid2, vis);
             isiland= isiland && b;
         }

    }
return isiland;

  }
  static int solve(int grid1[][],int grid2[][]){
       row=grid1.length;
       col=grid1[0].length;
      
       boolean vis[][]=new boolean[row][col];
        int count =0;
       for(int i=0;i<row;i++){
          for(int j=0;j<col;j++){
               if(vis[i][j]==false && grid2[i][j]==1){
                  if(dfs(i, j, grid1, grid2, vis)){
                       count++;
                  }
               }
          }
       }
    return count;
        
   } 
  

    public static void main(String[] args) {
        int grid1[][]={{1,1,1,0,0},
                       {0,1,1,1,1},
                       {0,0,0,0,0},
                       {1,0,0,0,0},
                       {1,1,0,1,1}
                      };
        int grid2[][]={{1,1,1,0,0},
                       {0,0,1,1,1},
                       {0,1,0,0,0},
                       {1,0,1,1,0},
                       {0,1,0,1,0},
                    };

        System.out.println(solve(grid1,grid2));
        
    }
}


