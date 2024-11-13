import java.util.*;
import java.util.Stack;
public class riverse{
public static String riverse(String str)
{
      Stack<Character>s=new Stack<>();
      char riv[]=new char[str.length()];
       
     for(int i=0;i<str.length();i++)
     {
          s.push(str.charAt(i));
     }
     int i=0;
    while(!s.empty())
    {
          riv[i++]=s.pop();
    }

    return new String(riv);
}
public static void main(String[]args){
   String str="Manjeet";
   System.out.print(riverse(str));

}
}