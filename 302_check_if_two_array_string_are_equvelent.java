import java.util.*;
public class 302_check_if_two_array_string_are_equvelent  {
     
    static boolean solve(String w1[],String w2[]){
         
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        
       for(String s:w1){
           sb1.append(s);
       }
   
       for(String s:w2){
           sb2.append(s);
       }

       if(sb1.toString().equals(sb2.toString())){
        return true;
       }

       return false;

    }
    public static void main(String args[]){
            String word1[]={"ab","c"};
            String word2[]={"a","bc"};

            System.out.println(solve(word1,word2));
    }
}
