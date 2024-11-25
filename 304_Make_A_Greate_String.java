import java.util.Stack;

public class 304_Make_A_Greate_String{
static String solve(String s){

       Stack<Character>s1=new Stack<>();

        for(int i=0;i<s.length();i++){
            
              if((!s1.empty()) && Math.abs(s1.peek()-s.charAt(i))==32){
                    s1.pop();
              }else{
                  s1.push(s.charAt(i));
              }
        }

        char res[]=new char[s1.size()];
        
        for(int i=res.length-1;i>=0;i--){
            res[i]=s1.pop();
        }
     return new String(res);

}
    public static void main(String[] args) {
        String s="leEeetcode";

        System.out.println(solve(s));
    }
}
