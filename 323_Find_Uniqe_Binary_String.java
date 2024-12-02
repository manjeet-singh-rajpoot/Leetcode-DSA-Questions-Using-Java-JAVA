/*Question:  
     
Given an array of strings nums containing n unique binary strings each of length n, return a binary string of length n that does not appear in nums. If there are multiple answers, you may return any of them.

 

Example 1:

Input: nums = ["01","10"]
Output: "11"
Explanation: "11" does not appear in nums. "00" would also be correct.
Example 2:

Input: nums = ["00","01"]
Output: "11"
Explanation: "11" does not appear in nums. "10" would also be correct.
Example 3:

Input: nums = ["111","011","001"]
Output: "101"
Explanation: "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.
 

Constraints:

n == nums.length
1 <= n <= 16
nums[i].length == n
nums[i] is either '0' or '1'.
All the strings of nums are unique.
 * 
 *     Answer:
 */

import java.util.*;
public class 323_Find_Uniqe_Binary_String{
    static String solve(String nums[]){
        int n=nums.length;
          Set<String>set=new HashSet<>();

          for(String num:nums){
            set.add(num);
          }

          StringBuilder sb=new StringBuilder();
          for(int i=0;i<n;i++){
              sb.append('0');
          }

          String can=sb.toString();

          while(set.contains(can)){
            can=generateNext(can);
          }

          return can;
    }
static String generateNext(String str){
    char chars[]=str.toCharArray();
    int i=chars.length-1;

    while(i>=0 && chars[i]=='1'){
        chars[i]='0';
        i--;
    }

    if(i>=0){
        chars[i]='1';
    }

    return new String(chars);
}

    public static void main(String[] args) {
        String s[]= {"00","01"};
        System.out.print(solve(s));
    }
}
