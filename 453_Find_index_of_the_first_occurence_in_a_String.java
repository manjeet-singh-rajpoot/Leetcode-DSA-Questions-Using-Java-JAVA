public class 453_Find_index_of_the_first_occurence_in_a_String {
    

    static int solve(String s,String t){
         int n1=s.length();
         int n2=t.length();
     
          for(int i=0,j=t.length();j<=s.length();i++,j++){
               if(s.substring(i,j).equals(t)){
                  return i;
               }
          }
        return -1;
    }
    public static void main(String[] args) {
          String s="sadbutsad";
          String t="sad";
          // String s="leetcode";
          // String t="leeto";
          System.out.println(solve(s,t));
    }


}
