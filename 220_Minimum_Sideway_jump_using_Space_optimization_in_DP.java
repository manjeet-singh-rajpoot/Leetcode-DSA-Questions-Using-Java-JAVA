import java.util.*;
public class raj{
static int solve(int obs[])
{
   int n=obs.length-1;
   int curr[]=new int[n+1];
   int next[]=new int[n+1];
    
    next[0]=0;
    next[1]=0;
    next[2]=0;
    next[3]=0;

    for(int pos=n-1;pos>=0;pos--)
    {
          for(int lane=1;lane<=3;lane++)
          {
                if(obs[pos+1]!=lane)
                {
                   curr[lane]=next[lane];
                }else{
                   int ans=Integer.MAX_VALUE;

                   for(int i=1;i<=3;i++)
                   {
                      if(lane!=i && obs[pos]!=i)
                      {
                          ans=Math.min(ans,1+next[i]);
                      }
                   }
                   curr[lane]=ans;
                }
                next=curr;
          }
    }
    return Math.min(next[2],Math.min(1+next[1],1+next[3]));
  
}
public static void main(String[]args){
    int obst[]={0,1,2,3,0};
    int n=obst.length;

System.out.print(solve(obst));

}
}
