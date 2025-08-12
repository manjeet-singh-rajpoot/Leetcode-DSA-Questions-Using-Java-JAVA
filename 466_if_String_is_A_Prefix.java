public class 466_if_String_is_A_Prefix {
    
 static boolean solve(String s,String words[]){
     //Leetcode 1961//
     StringBuilder sb=new StringBuilder();
     for(String w:words){
        sb.append(w);
        if(s.equals(sb.toString())){
            return true;
        }
        if(s.indexOf(sb.toString())==-1){
            return false;
        }
     }
return false;
      

 }
    public static void main(String[] args) {
       String s = "iloveleetcode"; 
      // String words[] = {"i","love","leetcode","apples"};
       String words[]={"apples","i","love","leetcode"};
      System.out.println(solve(s,words));
    }
}
