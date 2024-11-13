import java.util.*;
public class raj{
static int solve(int obs[],int n,int lane,int pos)
{
        n=obs.length-1;
    if(pos==n)
    {
        return 0;
    }
  if(obs[pos+1]!=lane)
  {
     return solve(obs,n,lane,pos+1);
  }else{

    //sideway jum
    int ans=Integer.MAX_VALUE;
     for(int i=1;i<=3;i++)
     {
         if(lane!=i && obs[pos]!=i)
         {
            ans=Math.min(ans,1+solve(obs,n,i,pos));
         }
     }
     return ans;
  }
}
public static void main(String[]args){
    int obst[]={0,1,2,3,0};
    int n=obst.length;

System.out.print(solve(obst,n,2,0));

}
}
