// Java program to find sum of all minimum and maximum 
// elements Of Sub-array Size k. 
import java.util.Deque;
import java.util.LinkedList;
public class raj {
 
    // Returns sum of min and max element of all subarrays 
    // of size k 
    public static int SumOfKsubArray(int arr[] , int k) 
    { 
        int sum = 0;  // Initialize result 
   
        // The queue will store indexes of useful elements 
        // in every window 
        // In deque 'G' we maintain decreasing order of 
        // values from front to rear 
        // In deque 'S' we  maintain increasing order of 
        // values from front to rear 
        Deque<Integer> max=new LinkedList<>(),min=new LinkedList<>();
 
        // Process first window of size K 
        int i = 0; 
        for (i = 0; i < k; i++) 
        { 
            // Remove all previous greater elements 
            // that are useless. 
            while ( !max.isEmpty() && arr[max.peekLast()] >= arr[i]) 
                max.removeLast(); // Remove from rear 
   
            // Remove all previous smaller that are elements 
            // are useless. 
            while ( !min.isEmpty() && arr[min.peekLast()] <= arr[i]) 
              min.removeLast(); // Remove from rear 
   
            // Add current element at rear of both deque 
            min.addLast(i); 
            max.addLast(i); 
        } 
   
        // Process rest of the Array elements 
        for (  ; i < arr.length; i++ ) 
        { 
            // Element at the front of the deque 'G' & 'S' 
            // is the largest and smallest 
            // element of previous window respectively 
            sum += arr[max.peekFirst()] + arr[min.peekFirst()]; 
   
            // Remove all elements which are out of this 
            // window 
            while ( !max.isEmpty() &&max.peekFirst() <= i - k) 
                max.removeFirst(); 
            while ( !min.isEmpty() &&min.peekFirst() <= i - k) 
                min.removeFirst(); 
   
            // remove all previous greater element that are 
            // useless 
            while ( !max.isEmpty() && arr[max.peekLast()] >= arr[i]) 
               max.removeLast(); // Remove from rear 
   
            // remove all previous smaller that are elements 
            // are useless 
            while ( !min.isEmpty() && arr[min.peekLast()] <= arr[i]) 
               min.removeLast(); // Remove from rear 
   
            // Add current element at rear of both deque 
            min.addLast(i); 
            max.addLast(i); 
        } 
   
        // Sum of minimum and maximum element of last window 
        sum += arr[max.peekFirst()] + arr[min.peekFirst()]; 
   
        return sum; 
    } 
 
    public static void main(String args[]) 
    {
        int arr[] = {2, 5, -1, 7, -3, -1, -2} ; 
        int k = 3; 
        System.out.println(SumOfKsubArray(arr, k));
    }
}