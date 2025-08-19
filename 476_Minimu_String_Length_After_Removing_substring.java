import java.util.Stack;

public class 476_Minimu_String_Length_After_Removing_substring{
    static int solve(String s){
         Stack<Character>st=new Stack<>();
         for(char ch:s.toCharArray()){
             if(!st.isEmpty()){
               char top=st.peek();
               if((top == 'A' && ch == 'B') || (top == 'C' && ch == 'D')){
                  st.pop();
                  continue;
               }
             }
             st.push(ch);
         }
    return st.size();
    }
    public static void main(String[] args) {
        String  s = "ACBBD";
        System.out.println(solve(s));
    }
}
