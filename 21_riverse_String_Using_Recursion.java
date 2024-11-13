import java.util.*;
public class riverse{
static String riverse(String str)
{
    String temp;
       //base method
       if(str.isEmpty())
       {
        return str;
       }
      /*temp=str[i];
      str[i]=str[j];
      str[j]=temp;
      i++;
      j--;
      riverse(str,i,j);
      */
      return riverse(str.substring(1))+str.charAt(0);
}
public static void main(String[]args){
  String name="Manjeet";
   String str1=riverse(name);
System.out.println(str1);
  
}
}