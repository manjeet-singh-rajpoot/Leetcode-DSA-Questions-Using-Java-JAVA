/*Question : Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

 

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.
 

Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 *   
 * Answer: 
 * 
 */

public class 311_Find_The_index_of_First_Occurence{
    public static int strStr(String s1, String s2) {
        int m=s1.length();
        int n=s2.length();

      for(int i=0;i<=m-n;i++){
          for(int j=0;j<n;j++){

             if(s1.charAt(i+j)!=s2.charAt(j)){
                break;
             }
               
               if(j==n-1){
                return i;
               }
             
          }
      }
      return -1;
    }
    public static void main(String[] args) {
        String s1="sadbutsad";
        String s2="sad";

        System.out.print(strStr(s1,s2));
    }
}
