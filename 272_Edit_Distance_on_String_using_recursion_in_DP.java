import java.util.*;
public class raj{
static int solve(String str1,String str2,int i,int j)
{
        if(i==str1.length()){
           return str2.length()-j;
        }
       if(j==str2.length()){
        return str1.length()-i;
       }
       int ans=0;
       if(str1.charAt(i)==str2.charAt(j)){
          return solve(str1,str2,i+1,j+1);
       }else{
        int insert=1+solve(str1,str2,i,j+1);
        int delete=1+solve(str1,str2,i+1,j);
        int replace=1+solve(str1,str2,i+1,j+1);

        ans=Math.min(insert,Math.min(delete,replace));
       }
    return ans;
}
public static void main(String[]args){
String str1="horse";
String str2="ros";
System.out.print(solve(str1,str2,0,0));

}
}