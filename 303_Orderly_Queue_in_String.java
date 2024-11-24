
/*Question : Orderly Queue:

      You are given a string s and an integer k. You can choose one of the first k letters of s and append it at the end of the string.

Return the lexicographically smallest string you could have after applying the mentioned step any number of moves.

 

Example 1:

Input: s = "cba", k = 1
Output: "acb"
Explanation: 
In the first move, we move the 1st character 'c' to the end, obtaining the string "bac".
In the second move, we move the 1st character 'b' to the end, obtaining the final result "acb".
Example 2:

Input: s = "baaca", k = 3
Output: "aaabc"
Explanation: 
In the first move, we move the 1st character 'b' to the end, obtaining the string "aacab".
In the second move, we move the 3rd character 'c' to the end, obtaining the final result "aaabc".
 
 * 
 *        Answer: 
 */


import java.util.*;
import java.util.stream.Stream;
public class 303_Orderly_Queue_in_String{
static String solve(String s,int k){
     
    if(k>1){
        char arr[]=new char[s.length()];
         arr=s.toCharArray();
        Arrays.sort(arr);
      String s1=new String(arr);

      return s1;
    }

     int n=s.length();
    String result=s;
   
    for(int i=1;i<=n-1;i++){
        String temp=s.substring(i)+s.substring(0, i);

       result=(temp.compareTo(result)<0) ? temp:result;
    }

    return result;
    
} 
    public static void main(String[] args) {
        String s="baaca";
        int k=3;

        System.out.print(solve(s,k));
    }
}
