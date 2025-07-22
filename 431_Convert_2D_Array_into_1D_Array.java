public class 431_Convert_2D_Array_into_1D_Array {
    import java.util.Arrays;

    
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        int m=arr[0].length;
        int i=0;
        int ans[]=new int[n*m];
          for(int n1[]:arr){
              for(int n2:n1){
                   ans[i++]=n2;
              }
          }

       // System.out.println(Arrays.toString(ans));
        int k=8;
        System.out.println(ans[k-1]);
    }
}

