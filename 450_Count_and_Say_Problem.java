public class 450_Count_and_Say_Problem {
    
static String solve(int n){
      String ans="1";
      for(int i=1;i<n;i++){
         ans=solve2(ans);
      }
      return ans;
   }
   
static  String solve2(String ans){
       StringBuilder sb=new StringBuilder();
       int count=1;
       for(int i=1;i<ans.length();i++){
             if(ans.charAt(i) == ans.charAt(i-1)){
                  count++;
             }else{
                sb.append(count).append(ans.charAt(i-1));
                count=1;
             }
       }

    sb.append(count).append(ans.charAt(ans.length()-1));

return sb.toString();
}
    public static void main(String[] args) {
         
      int n=4;
      System.out.println(solve(n));  

    }


}
