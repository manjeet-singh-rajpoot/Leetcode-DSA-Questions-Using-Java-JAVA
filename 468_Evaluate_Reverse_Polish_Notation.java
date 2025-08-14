public class  468_Evaluate_Reverse_Polish_Notation{
public int evalRPN(String[] tokens) {
         Stack<Integer>st=new Stack<>();
         for(String c:tokens){
              if(c.equals("+")){
                 st.push(st.pop() + st.pop());
              }else if(c.equals("-")){
                   int s=st.pop();
                   int f=st.pop();
                   st.push(f-s);
              }else if(c.equals("*")){
                 int s=st.pop();
                 int f=st.pop();
                 st.push(f * s);
              }else if(c.equals("/")){
                int s=st.pop();
                int f=st.pop();
                st.push(f / s);
              }else{
                st.push(Integer.parseInt(c));
              }
         }

         return st.peek();
    }
    
}
