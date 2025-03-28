/*Question : 
 * 
 *     Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

 

Example 1:


Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
Output: 7
Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
Example 2:

Input: grid = [[1,2,3],[4,5,6]]
Output: 12
 

Constraints:

m == grid.length
n == grid[i].length
1 <= m, n <= 200
0 <= grid[i][j] <= 200
Seen this question in a real interview before?
1/5
Yes
No
Accepted
1.4M
Submissions
2.2M
Acceptance Rate
66.0%

 */

public class 407_Minimum_Path_Sum_Using_DP {
    static int solve(int grid[][]){
        int m=grid.length;
        int n=grid[0].length;

    for(int i=0;i<m;i++){
        for(int j=0;j<m;j++){
               if(i==0 && j==0){
                  continue;
               }
               else if(i==0){
                   grid[i][j]+=grid[i][j-1];
               }else if(j==0){
                   grid[i][j]+=grid[i-1][j];
               }else{
                   grid[i][j]+=Math.min(grid[i-1][j],grid[i][j-1]);
               }
        }
    }

    return grid[m-1][n-1];
    }
    
    public static void main(String args[]){
        int grid[][] = {{1,3,1}
                        ,{1,5,1},
                        {4,2,1}};
   System.out.print(solve(grid));

    }
}
