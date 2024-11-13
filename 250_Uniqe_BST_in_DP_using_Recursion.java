import java.util.*;
public class raj{
static int uniqBST(int n)
{
     if(n<=1)
     {
          return 1;
     }
    int ans=0;
    for(int i=1;i<=n;i++)
    {
       ans=ans+uniqBST(i-1)*uniqBST(n-i);
    }

    return ans;
}
public static void main(String[]args){
    int n=3;
    System.out.print(uniqBST(n));

}
}