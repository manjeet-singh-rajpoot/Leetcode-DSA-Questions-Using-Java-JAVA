public class 473_consecutive_Character {
  
    static int solve(String s){
      int count=1;
      int mx=Integer.MIN_VALUE;
      for(int i=1;i<s.length();i++){
        if(s.charAt(i)==s.charAt(i-1)){
            count++;
        }else{
            count=1;
        }
        mx=Math.max(mx, count);
      }

      return mx;
    
    }
    public static void main(String[] args) {
        String s="leetcode";
        System.out.println(solve(s));
    }
}


