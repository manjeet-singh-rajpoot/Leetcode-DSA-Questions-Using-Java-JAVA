/*Question : 

    Two strings are considered close if you can attain one from the other using the following operations:

Operation 1: Swap any two existing characters.
For example, abcde -> aecdb
Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)
You can use the operations on either string as many times as necessary.

Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.

 

Example 1:

Input: word1 = "abc", word2 = "bca"
Output: true
Explanation: You can attain word2 from word1 in 2 operations.
Apply Operation 1: "abc" -> "acb"
Apply Operation 1: "acb" -> "bca"
Example 2:

Input: word1 = "a", word2 = "aa"
Output: false
Explanation: It is impossible to attain word2 from word1, or vice versa, in any number of operations.
Example 3:

Input: word1 = "cabbba", word2 = "abbccc"
Output: true
Explanation: You can attain word2 from word1 in 3 operations.
Apply Operation 1: "cabbba" -> "caabbb"
Apply Operation 2: "caabbb" -> "baaccc"
Apply Operation 2: "baaccc" -> "abbccc"
 

Constraints:

1 <= word1.length, word2.length <= 105
 *     
 * Answer: 
 */

import java.util.*;
public class 306_Determine_if_Two_String_Are_Close{
static boolean solve(String w1,String w2){
      int m=w1.length();
      int n=w2.length();
    
      int freq1[]=new int[26];
      int freq2[]=new int[26];
 
        for(int i=0;i<26;i++){
            freq1[i]=0;
        }

        for(int i=0;i<26;i++){
            freq2[i]=0;
        }

      if(m!=n){
        return false;
      }

    for(int i=0;i<m;i++){
          char ch1=w1.charAt(i);
          char ch2=w2.charAt(i);

          int idx1=ch1-'a';
          int idx2=ch2-'a';

          freq1[idx1]++;
          freq2[idx2]++;
    }
  
    for(int i=0;i<26;i++){
        if((freq1[i]==0 && freq2[i]!=0 ) || (freq1[i]!=0 && freq2[i]==0)){
            return false;
           }
    }

    Arrays.sort(freq1);
    Arrays.sort(freq2);
    
  for(int i=0;i<26;i++){
      if(freq1[i]!=freq2[i]){
        return false;
      }
  }
  return true;
}    
    public static void main(String[] args) {
        // String word1 = "abc";
        // String word2 = "bca";

     //   String word1 = "cabbba", word2 = "abbccc";
         String word1="a";
         String word2="aa";

        System.out.print(solve(word1,word2));
    }
}
