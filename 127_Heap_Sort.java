public class deletionHeap {
    static void heapify(int arr[], int n, int i)
    {
        int root = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l] > arr[root])
            root = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r] > arr[root])
           root = r;
 
        // If largest is not root
        if (root != i) {
            int swap = arr[i];
            arr[i] = arr[root];
            arr[root] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, root);
        }
    }
    static void sort(int arr[])
    {
        int N = arr.length;

        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);

        // One by one extract an element from heap
        for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
    // Function to delete the root from Heap
    static int deleteRoot(int arr[], int n)
    {
        // Get the last element
        int lastElement = arr[n - 1];
 
        // Replace root with first element
        arr[0] = lastElement;
 
        // Decrease size of heap by 1
        n = n - 1;
 
        // heapify the root node
        heapify(arr, n, 0);
 
        // return new size of Heap
        return n;
    }
 
    /* A utility function to print array of size N */
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
 
    // Driver Code
    public static void main(String args[])
    {
        // Array representation of Max-Heap
        // 10
        //    /  \
        // 5    3
        //  / \
        // 2   4
        int arr[] = { 10, 5, 3, 2, 4 };
 
        int n = arr.length;
 
      //  n = deleteRoot(arr, n);
 
         sort(arr);
        printArray(arr, n);
    }
}