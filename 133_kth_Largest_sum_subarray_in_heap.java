import java.util.*;
public class largest{
static int kthlargest(int arr[],int k,int n)
{
       ArrayList<Integer>result=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        int sum=0;
        for(int j=i;j<n;j++)
        {
            sum+=arr[j];
            result.add(sum); 
        }
       }
       Collections.sort(result, Collections.reverseOrder());
    
    return result.get(k-1);
}
public static void main(String[]args){
    int a[] = { 20, -5, -1 };
    int N = a.length;
    int K = 3;

    // Function call
    System.out.println(kthlargest(a, N, K));
}
}