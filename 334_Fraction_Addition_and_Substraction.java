/*Question
Given a string expression representing an expression of fraction addition and subtraction, return the calculation result in string format.

The final result should be an irreducible fraction. If your final result is an integer, change it to the format of a fraction that has a denominator 1. So in this case, 2 should be converted to 2/1.

Example 1:

Input: expression = "-1/2+1/2"
Output: "0/1"
Example 2:

Input: expression = "-1/2+1/2+1/3"
Output: "1/3"
Example 3:

Input: expression = "1/3-1/2"
Output: "-1/6"

Constraints:

The input string only contains '0' to '9', '/', '+' and '-'. So does the output.
Each fraction (input and output) has the format ±numerator/denominator. If the first input fraction or the output is positive, then '+' will be omitted.
The input only contains valid irreducible fractions, where the numerator and denominator of each fraction will always be in the range [1, 10]. If the denominator is 1, it means this fraction is actually an integer in a fraction format defined above.
The number of given fractions will be in the range [1, 10].
The numerator and denominator of the final result are guaranteed to be valid and in the range of 32-bit int.

Answer: */
import java.util.*;
public class 334_Fraction_Addition_and_Substraction{
    static String solve(String s){
         int i=0;
         int n=s.length();
         int numerator=0;
         int denomerator=1;

         while(i<n){
               // for symbol + and - // 
             int sign=1;
             if(s.charAt(i)=='+' || s.charAt(i)=='-'){
                //if + then 1 & else '-' then -1 //
                   sign=s.charAt(i)=='-' ? -1:1;
                   i++;
             }
                int num=0;
             while(i<n && Character.isDigit(s.charAt(i))){
                    int val=(s.charAt(i))-'0';
                    num=(num*10)+val;
                    i++;
             }
                //Now symbol - and + ko multiply karne par //
               num*=sign;
        
                 // For Divison operator  '/' //
               i++;  
               //for Denomirator //
             int denom=0;

             while(i< n && Character.isDigit(s.charAt(i))){
                   int val=(s.charAt(i))-'0';
                   denom=(denom*10)+val;
                   i++;
             }

             numerator=numerator*denom +denomerator*num;
             denomerator*=denom;
         }

             //Simplify numerator and denomerator //
         int gcd=gcd(Math.abs(numerator),denomerator);
         numerator/=gcd;
         denomerator/=gcd;


         return numerator+"/"+denomerator;
    }
    static int gcd(int a,int b){
        return b==0 ? a:gcd(b,a%b);
    }

    public static void main(String[] args) {
        String s = "-1/2+1/2";
        System.out.print(solve(s));
    }
}
