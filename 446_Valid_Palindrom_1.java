public class 446_Valid_Palindrom_1 {
       // Leetcode 42 pending//
    static boolean solve(String str){
          //125 leetcode//
          
       str=str.toLowerCase().replaceAll("[^a-z0-9]", "");
       int low=0;
       int high=str.length()-1;
       while(low < high){
          if(str.charAt(low) != str.charAt(high)){
              return false;
          }
          low++;
          high--;
       }

       return true;
         
    }
 
    
      public static void main(String[] args) {
          //int arr[]={0,1,0,2,1,0,1,3,2,1,2,1}; 
           //String s="A man is a car";
           //String s="A man, a plan, a canal: Panama";
           //String s="A man is a car";
            // String s=" ";
            String s="race a car";
          System.out.println(solve(s));
      }
}


