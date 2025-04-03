
/*
 * Question : 
 *    
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8
Seen this question in a real interview before?
1/5
Yes
No
Accepted
2.3M
Submissions
3M
Acceptance Rate
76.7%
Topics
Companies
 * 
 */
public class 413_Generate_Parenthesis {
    public List<String> generateParenthesis(int n) {
            List<String>ans=new ArrayList<>();
            dfs(0,0,"",n,ans);

   return ans;

    }
  private void dfs(int openP,int closeP,String s,int n,List<String>res){

     if(openP==closeP && openP + closeP == n * 2){
           res.add(s);
           return ;
     }

     if(openP < n){
          dfs(openP+1,closeP,s + "(",n,res);
     }

     if(closeP < openP){
          dfs(openP,closeP+1,s + ")",n,res);
     }

  }
}
  public static void main(String[] args) {
    
  }    

