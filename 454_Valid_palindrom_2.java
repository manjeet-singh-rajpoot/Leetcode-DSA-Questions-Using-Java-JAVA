public class 454_Valid_palindrom_2 {
    
static boolean solve(String s){
       int left=0;
       int right=s.length()-1;

    while (left < right) {
        int ch=s.charAt(left);
        int ch2=s.charAt(right);

         if(ch==ch2){
            left++;
            right--;
         }else{
            return solve2(s, left+1, right) || solve2(s, left, right-1);
         }
    }

return true;

}
static boolean solve2(String s,int left,int right){
    
      while(left < right){
          if(s.charAt(left)!=s.charAt(right)){
              return false;
          }
          left++;
          right--;
      }

    return true;

}
    public static void main(String[] args) {
        // String s="abac";
        //   String s="abca";
          String s="abc";
        System.out.println(solve(s));
    }


}
