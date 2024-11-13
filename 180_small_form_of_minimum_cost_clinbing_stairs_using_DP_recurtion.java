import java.util.*;
public class  raj{
static int solve(int n,int i)
{
     if(i==n)
     {
        return 1;
     }
     if(i>n){
        return 0;
     }

       return (solve(n,i+1)+solve(n,i+2));
}
public static void main(String[]args){
  int i=0;
  int n=3;
  System.out.print(solve(n,i));  

}
}