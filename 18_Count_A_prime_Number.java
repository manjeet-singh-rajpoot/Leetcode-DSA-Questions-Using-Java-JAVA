import java.util.*;
public class count {
static boolean isprime(int n)
{
     for(int i=2;i<n;i++)
     {
        if(n%i==0)
        {
            return false;
        }
     }
     return true;
}
static int cprime(int n)
{
    int count=0;
    for(int i=2;i<n;i++)
    {
          if(isprime(i))
          {
              count++;
          }
    }  
    System.out.println(count);
    return 0;
}
public static void main(String[]args){
    int n;
    System.out.println("Enter number : ");
    Scanner s=new Scanner(System.in);
         n=s.nextInt();
     isprime(n);
     cprime(n);

}
}