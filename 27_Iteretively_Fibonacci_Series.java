                        //Iteratively fibonacci Series//
import java.util.*;
public class fib{
static int fib(int n)
 {
       int num1=0;
       int num2=1;
  for(int i=0;i<n;i++)
  {
      System.out.print(num1+" ");
      int num3=num1+num2;
       num1=num2;
       num2=num3;
  }
  return 0;
 }
public static void main(String[]args){
   int n=10;
   fib(n); 

}
}