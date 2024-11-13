import java.util.*;
public class raj{
static int solve(int num1[],int num2[],int swapped,int index)
{
        if(index==num1.length)
        {
            return 0;
        }
   int prev1=num1[index-1];
   int prev2=num2[index-1];

   int ans=Integer.MAX_VALUE;
//catch swapp
    if(swapped==1)
    {
        int temp=prev1;
        prev1=prev2;
        prev2=temp;
    }
    //no swap
    if(num1[index]>prev1  && num2[index]>prev2)
    {
         ans=solve(num1,num2,0,index+1);
    }
   //swap
    if(num1[index]>prev2 && num2[index]>prev1)
    {
        ans=Math.min(ans,1+solve(num1,num2,1,index+1));
    }

return ans;
}
static int solve1(int num1[],int num2[])
{
    num1[0]=-1;
    num2[0]=-1;

    int swapped=0;

    return solve(num1,num2,swapped,1);

}
public static void main(String[]args){
    int num1[]={1,3,5,4};
    int num2[]={1,2,3,7};

    System.out.print(solve1(num1,num2));

}
}