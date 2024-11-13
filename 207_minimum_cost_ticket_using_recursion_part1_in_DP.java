import java.util.*;
public class raj{
static int solve(int n,int days[],int cost[], int index)
{    
     if(index>=n)
     {
        return 0;
     }
    //for 1 days//
   int option1=cost[0]+solve(n,days,cost,index+1);

   int i;
   //for 7 days//

 for(i=index;i<n && days[i]<days[index]+7;i++);

 int option2=cost[1]+solve(n,days,cost,i);

   //for 30 days//

   for(i=index; i<n && days[i]<days[index]+30;i++);

 int option3=cost[2]+solve(n,days,cost,i);

 return Math.min(option1,Math.min(option2,option3));
}
static int minticket(int n,int days[],int cost[])
{
    int index=0;
   return solve(n,days,cost,0);
}
public static void main(String[]args){
int days[]={1,4,6,7,8,20};
int cost[]={2,7,15};
int n=days.length;
System.out.print(minticket(n, days, cost));

}
}