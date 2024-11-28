import java.util.ArrayList;
import java.util.List;

public class 310_Find_IP_Address_in_Given_integer_String{
    static int n;
    static List<String >result=new ArrayList<>();
 
  static boolean isvalid(String str){
         if(str.charAt(0)=='0'){
             return false;
        }
        int val=Integer.parseInt(str);
        if(val>255){
         return false;
        }
     return true;
  }
 
     static void solve(String s,int idx,int parts,String curr){
         if(idx==n && parts==4){
            result.add(curr.substring(0,curr.length()-1));
              return ;
         }
 
         if(idx+1<=n){
           solve(s,idx+1,parts+1,curr+s.substring(idx,1)+".");
         }
         
         if(idx+2<=n && isvalid(s.substring(idx,2))){
             solve(s,idx+2,parts+1,curr+s.substring(idx,2)+".");
         }
         if(idx+3<=n && isvalid(s.substring(idx,3))){
             solve(s,idx+3,parts+1,curr+s.substring(idx,3)+".");
         }
 
     }
     public List<String> restoreIpAddresses(String s) {
           n=s.length();
           result.clear();
           if(n>12){
             return new ArrayList<>();
           }
         int parts=0;
         String curr="";
         solve(s,0,parts,curr);
 
         return result;  
          
     }
 
    public static void main(String[] args) {
        String s="25525511135";

        System.out.print(restoreIpAddresses(s).toString());
    }
}
