/*Question : 
 * 
 *   Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 

Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1

 */
public class 360_Sqrt_x_using_Binary_Search {
    static int solve(int x){
         if(x==0){
            return x;
         }
        int s=1;
        int e=x;
       
     
        while(s<=e){
            int mid=s+(e-s)/2;
            if(mid==x/mid){
                return mid;
            }else if(mid > x/mid){
                e=mid-1;
            }else{
                s=s+1;
            }
        }
    return e;

    }

    public static void main(String[] args) {
        int x=4;
        System.out.print(solve(x));
    }
}
