/*             //Quetions: -                 

 * Median in two sorted Arrays:-
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 
 *  
 * 
 * 
 */               //Answer: -         

 public class 288_Median_in_Twosorted_Array{
    public double findMedianSortedArrays(int[] nums1,  int[] nums2){
          int n1=nums1.length;
          int n2=nums2.length; 
             //mergerd array //
        int  nums3[]=new int[n1+n2];
       int k=0;
         for(int i=0;i<n1;i++){
             nums3[k++]=nums1[i];
         }

         for(int j=0;j<n2;j++){
            nums3[k++]=nums2[j];
         }

          Arrays.sort(nums3);

     int total=nums3.length;

         // if total is odd //

        if(total%2==1){
            return (double) nums3[total/2];
            //if even
        }else{
                int midle1=nums3[total/2-1];
                int midle2=nums3[total/2];

               return ((double) midle1 +(double) midle2)/2.0;
          }
    }