public class 465_String_Validation {
 static boolean solve(String s){
      Stack<Integer>st1=new Stack<>();
      Stack<Integer>st2=new Stack<>();
      char Ars[]=s.toCharArray();
      for(int i=0;i<s.length();i++){
          char ch=Ars[i];
          if(ch=='('){
             st1.push(i);
          }else if(ch=='*'){
             st2.push(i);
          }else if(!st1.empty()){
             st1.pop();
          }else if(!st2.isEmpty()){
             st2.pop();
          }else{
            return false;
          }
      }

      while(!st1.isEmpty() && !st2.isEmpty() && st1.peek() < st2.peek()){
          st1.pop();
          st2.pop();
      }
return st1.isEmpty();
 }
    public static void main(String[] args) {
      //  String s="()";
      //  String s="(*)";
         String s="(*))";
        System.out.println(solve(s));
    }
}


