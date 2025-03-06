/*
 * Question : 
 * 
 *   Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.


 

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"
Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
 

Constraints:

1 <= num1.length, num2.length <= 200
num1 and num2 consist of digits only.
Both num1 and num2 do not contain any leading zero, except the number 0 itself.
 */
public class 395_Multiply_String {
    import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {

      BigInteger bnum1=new BigInteger(num1);
      BigInteger bnum2=new BigInteger(num2);

      BigInteger mul=bnum1.multiply(bnum2);

      return (String.valueOf(mul));
      
         

    }
}
}
