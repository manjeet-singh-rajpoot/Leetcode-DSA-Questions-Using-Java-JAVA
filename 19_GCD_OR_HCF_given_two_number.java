import java.util.*;
public class god {
static int gcd(int a,int b)
{
       if(a==0)
       {
        return b;
       }
       if(b==0)
       {
        return a;
       }
       while(a!=b)
       {
          if(a>b)
          {
              a=a-b;
          }else{
            b=b-a;
          }
       }
       return a;
}
public static void main(String[]args){
    int a,b;
System.out.print("Enter 1st number: ");
Scanner s=new Scanner(System.in);
      a=s.nextInt();
System.out.print("Enter 2nd number : ");
     b=s.nextInt();
 int ans=gcd(a,b);
 System.out.println("gcd is : "+ans);
}
}