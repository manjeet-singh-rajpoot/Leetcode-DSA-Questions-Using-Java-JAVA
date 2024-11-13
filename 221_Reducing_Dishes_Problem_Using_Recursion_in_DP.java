import java.util.*;
public class raj{
static int solve(int arr[],int index,int time)
{
    Arrays.sort(arr);
       if(index==arr.length)
       {
        return 0;
       }
    int include=arr[index]*(time+1)+solve(arr,index+1,time+1);
    int exclude=0+solve(arr,index+1,time);

    return Math.max(include,exclude);
}
public static void main(String[]args){
    int satisfaction[]={-1,-8,0,5,-9};
    System.out.print(solve(satisfaction,0,0));

}
}