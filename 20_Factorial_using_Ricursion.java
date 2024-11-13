import java.util.*;
public class fact{
static int factorial(int n)
{
     if(n==0)
     {
        return 1;
     }
     int choti=factorial(n-1);
     int badi=n*factorial(n-1);
     return badi;
}
public static void main(String[]args){
    int n;
    System.out.println("Enter number : ");
    Scanner s=new Scanner(System.in);
         n=s.nextInt();
     int ans=factorial(n);
     System.out.println(ans);
}
}