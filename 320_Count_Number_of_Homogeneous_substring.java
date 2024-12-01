/*Question: 

      Given a string s, return the number of homogenous substrings of s. Since the answer may be too large, return it modulo 109 + 7.

A string is homogenous if all the characters of the string are the same.

A substring is a contiguous sequence of characters within a string.

 

Example 1:

Input: s = "abbcccaa"
Output: 13
Explanation: The homogenous substrings are listed as below:
"a"   appears 3 times.
"aa"  appears 1 time.
"b"   appears 2 times.
"bb"  appears 1 time.
"c"   appears 3 times.
"cc"  appears 2 times.
"ccc" appears 1 time.
3 + 1 + 2 + 1 + 3 + 2 + 1 = 13.
Example 2:

Input: s = "xy"
Output: 2
Explanation: The homogenous substrings are "x" and "y".
Example 3:

Input: s = "zzzzz"
Output: 15
 * 
 * 
 */
public class 320_Count_Number_of_Homogeneous_substring{
   static int solve(String s){
       int n=s.length();
       int mod=1000000007;
       int length=0;
       int result=0;

       for(int i=0;i<n;i++){
           if(i>0 && s.charAt(i)==s.charAt(i-1)){
               length=length+1;
           }
           else{
              length=1;
           }
          
           result=(result+length)%mod;
       }

       return result;

   }
    public static void main(String[] args) {
       String s = "abbcccaa";
       System.out.print(solve(s)); 
    }
}
