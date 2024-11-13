import java.util.*;
public class raj{
static void bubblesort(int arr[],int n)
{
     for(int i=0;i<n;i++)
     {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1]){
              int temp=arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;
            }
        }
     }
}
static void findminmaxcandi(int []candi,int n,int k)
{
        bubblesort(candi,n);

        int min=0;
        int buy=0;
        int free=n-1;

       while(buy<=free)
        {
             min=min+candi[buy];
             buy++;
             free=free-k;
        }

    int maxi=0;
      buy=n-1;
      free=0;

     while(free<=buy)
     {
         maxi=maxi+candi[buy];
         buy--;
         free=free+k;
     }

     Vector<Integer>v1=new Vector<>();
     v1.add(min);
     System.out.println("Minimum Money: "+v1);
     
     Vector<Integer>v2=new Vector<>();
     v2.add(maxi);
     System.out.println("maximum Money: "+v2);
}
public static void main(String[]args){
    int n=4;
    int arr[]={3,2,1,4};
    int k=2;

    findminmaxcandi(arr,n,k);


}
}