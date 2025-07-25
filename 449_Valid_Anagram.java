public class 449_Valid_Anagram {
    
static boolean solve(String s,String t){

     if(s.length() > t.length()){
        return false;
     }

         char arr1[]=s.toCharArray();
         char arr2[]=t.toCharArray();

         Arrays.sort(arr1);
         Arrays.sort(arr2);

         if(Arrays.equals(arr1, arr2)){
            return true;
         }

      return false;

}
  public static void main(String[] args) {
      String s="anagram";
      String t="nagaram";
      // String s="rat";
      // String t="car";
      System.out.println(solve(s,t));
  }

}
