import java.util.*;
public class raj{
static int solve(int arr[],int buy,int index,int limit)
{
    if(index==arr.length)
    {
        return 0;
    }
    if(limit==0)
    {
        return 0;
    }

  int profit=0;

  if(buy==1)
  {
    //buy karo
      int buykaro=-arr[index]+solve(arr,0,index+1,limit);
      int skipkaro=0+solve(arr,1,index+1,limit);

      profit=Math.max(buykaro,skipkaro);
  }else{
    int sellkaro=+arr[index]+solve(arr,1,index+1,limit-1);
    int skipkaro=0+solve(arr,0,index+1,limit);
    profit=Math.max(sellkaro,skipkaro);
  }

  return profit;
}
public static void main(String[]args){
int prices[]={3,3,5,0,0,3,1,4};
System.out.print(solve(prices,1,0,2));    

}
}