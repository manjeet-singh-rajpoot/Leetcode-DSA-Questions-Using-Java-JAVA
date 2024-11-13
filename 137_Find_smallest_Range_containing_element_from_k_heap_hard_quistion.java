class GFG {
 
    static final int N = 5;
 
    // array for storing the current index of list i
    static int ptr[] = new int[501];
 
    // This function takes an k sorted lists in the form of
    // 2D array as an argument. It finds out smallest range
    // that includes elements from each of the k lists.
    static void findSmallestRange(int arr[][], int n, int k)
    {
        int i=0;
        int min=0;
        int max=0;
        int minrange=0;
        int mindata = 0; 
        int maxdata = 0;
        int flag, min_index;
 
        // initializing to 0 index;
        for (i = 0; i <= k; i++) {
            ptr[i] = 0;
        }
 
        minrange = Integer.MAX_VALUE;
 
        while (true) {
            // for maintaining the index of list containing
            // the minimum element
            min_index= -1;
            min = Integer.MAX_VALUE;
            max= Integer.MIN_VALUE;
            flag = 0;
 
            // iterating over all the list
            for (i = 0; i < k; i++) {
                // if every element of list[i] is traversed
                // then break the loop
                if (ptr[i] == n) {
                    flag = 1;
                    break;
                }
                // find minimum value among all the list
                // elements pointing by the ptr[] array
                if (ptr[i] < n && arr[i][ptr[i]] < min) {
                    min_index= i; // update the index of the list
                    min = arr[i][ptr[i]];
                }
                // find maximum value among all the list
                // elements pointing by the ptr[] array
                if (ptr[i] < n && arr[i][ptr[i]] > max) {
                    max= arr[i][ptr[i]];
                }
            }
 
            // if any list exhaust we will not get any
            // better answer, so break the while loop
            if (flag == 1) {
                break;
            }
 
            ptr[min_index]++;
 
            // updating the minrange
            if ((max - min) < minrange) {
                mindata = min;
                maxdata  = max;
                minrange =maxdata  -  mindata;
            }
        }
        System.out.printf(
            "The smallest range is [%d, %d]\n", mindata,
            maxdata );
    }
 
    // Driver program to test above function
    public static void main(String[] args)
    {
 
        int arr[][] = { { 4, 7, 9, 12, 15 },
                        { 0, 8, 10, 14, 20 },
                        { 6, 12, 16, 30, 50 } };
 
        int k = arr.length;
 
        findSmallestRange(arr, N, k);
    }
}