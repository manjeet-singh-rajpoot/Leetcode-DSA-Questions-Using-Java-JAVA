import java.util.*;
public class prime {
static boolean isprime(int n)
{
     if(n<=1)
     {
        return false;
     }
      for(int i=2;i<n;i++)
      {
         if(n%i==0)
         {
            return false;
         }
      }
      return true;
}
public static void main(String[]args){
    int n;
  System.out.println("Enter number : ");
   Scanner s=new Scanner(System.in);
        n=s.nextInt();
   if(isprime(n))
   {
     System.out.println("it is a prime number ");
   }
   else{
    System.out.println("It is not a prime number ");
   }
}
}