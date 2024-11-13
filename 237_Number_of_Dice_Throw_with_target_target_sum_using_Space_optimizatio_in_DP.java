import java.util.*;
public class raj{
static int solve(int d,int f,int t)
{
      int curr[]=new int[t+1];
      int prev[]=new int[t+1];
      
    //mistack//
      prev[0]=1;

      for(int dice=1;dice<=d;dice++)
      {
         for(int target=1;target<=t;target++)
         {
              int ans=0;
            for(int i=1;i<=f;i++)
            {
                 if(target-i>=0)
                 {
                    ans=ans+prev[target-i];
                 }
            }
            curr[target]=ans;
         }

         prev=curr;
      }
      return prev[t];
}
public static void main(String[]args){
    int n=3,m=6,x=12;
    System.out.print(solve(n,m,x));

}
}
