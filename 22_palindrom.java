import java.util.*;
public class palindrom{
static boolean checkpal(String str,int i,int j)
{
     if(i==j)
     {
        return true;
     }
        if(i>j)
        {
            return false;
        }
    if(str.charAt(i)!=str.charAt(j))
    {
        return false;
    }
    else{
         return checkpal(str,i+1,j-1);
    }
}
public static void main(String[]args){
       String name="raj";
      boolean ispal=checkpal(name,0,name.length()-1);
      if(ispal)
      {
        System.out.println("String is palindrom");
      }
      else{
        System.out.println("String is not palindrom");
      }
}
}