public class 448_Permutation_in_a_String {
    
    
  static boolean solve(String s1,String s2){
             if(s1.length() > s2.length()){
                 return false;

             }
            char arr1[]=s1.toCharArray();
            Arrays.sort(arr1);
            String str="";
            for(int i=0;i<s1.length();i++){
               str+=s2.charAt(i);
            }
          char arr2[]=str.toCharArray();
          Arrays.sort(arr2);

          if(Arrays.equals(arr1, arr2)){
              return true;
          }

          StringBuilder sb=new StringBuilder(str);

          for(int i=s1.length();i<s2.length();i++){
                 sb.append(s2.charAt(i));
                // sb.deleteCharAt(0);
                char ch[]=sb.toString().toCharArray();
                Arrays.sort(ch);
                if(Arrays.equals(arr1, ch)){
                       return true;
                }
          }

          return false;

  }
    public static void main(String[] args){
          // String a="ab";
          // String b="eidbaooo";
          
          String a="ab";
          String b="eidboaoo";
          System.out.println(solve(a,b));
    }

}
