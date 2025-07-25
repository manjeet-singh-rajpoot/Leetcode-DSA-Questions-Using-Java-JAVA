public class 452_String_to_Integer {
   

    static int solve(String s){
           s=s.trim();
           long num=0;
           int sign=1;
           int i=0;
           int n=s.length();
           if(s.length()==0){
              return 0;
           }
           if(s.charAt(i)=='-' || s.charAt(i)=='+'){
               sign=(s.charAt(i)=='-' ? -1 :1);
               i++;
           }

           while(i < n && Character.isDigit(s.charAt(i))){
                  num=(num * 10) + (s.charAt(i) -'0');
                  if((num * sign) > Integer.MAX_VALUE){
                      return Integer.MAX_VALUE;
                  }
                  if((num * sign) < Integer.MIN_VALUE){
                     return Integer.MIN_VALUE;
                  }
                  i++;
           }
         return (int) (num * sign);

    }
    public static void main(String[] args) {
         // String s="42";
          String s=" -042";
         //  String s="1337c0d3";
         //  String s="0-1";
        // String s="0-1";
       //   String s="word in 987";

          System.out.println(solve(s));
    }

 
}
