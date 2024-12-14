/**
 * Question:
 *    Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105            
 * 
 *    Answer:
*/

public class  340_Traping_Rain_Water_in_Array {
    static int [] getleft(int arr[],int n){
        int left[]=new int[n];
        left[0]=arr[0];

        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);
        }
    return left;
    }
    static int [] getright(int arr[],int n){
        int right[]=new int[n];
        right[n-1]=arr[n-1];

        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
    return right;
    }
    static int solve(int[] arr) {
           int n=arr.length;

           int left[]=getleft(arr, n);
           int right[]=getright(arr,n);

           int sum=0;

           for(int i=0;i<n;i++){
                int h=Math.min(left[i],right[i])-arr[i];
                sum=sum+h;
           }
        return sum;
    }
    public static void main(String[] args) {
     int arr[]={4,2,0,3,2,5};
       System.out.print(solve(arr)); 
    }
}
