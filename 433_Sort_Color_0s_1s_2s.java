public class 433_Sort_Color_0s_1s_2s {
   static void solve(int arr[]){
    //    int zerocount=0;
    //    int onecount=0;
    //    int twocount=0;
    //    List<Integer>list=new ArrayList<>();
    // for(int i=0;i<arr.length;i++){
    //     if(arr[i]==2){
    //         twocount++;
    //     }else if(arr[i]==1){
    //         onecount++;
    //     }else if(arr[i]==0){
    //         zerocount++;
    //     }
    // }

    // for(int i=0;i<arr.length;i++){
    //      if(zerocount > 0){
    //         list.add(0);
    //         zerocount--;
    //      }else if(onecount > 0){
    //         list.add(1);
    //         onecount--;
    //      }else if(twocount > 0){
    //         list.add(2);
    //         twocount--;
    //      }
    // }

    // for(int i=0;i<list.size();i++){
    //     System.out.print(list.get(i)+" ");
    // }
  int low=0;
  int mid=0;
  int high=arr.length-1;
  while(mid <= high){
     if(arr[mid]==0){
        int temp=arr[low];
        arr[low++]=arr[mid];
        arr[mid++]=temp;
     }else if(arr[mid]==1){
        mid++;
     }else{
        int temp=arr[mid];
        arr[mid]=arr[high];
        arr[high--]=temp;
     }
  }

  for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+" ");
  }

}
    public static void main(String[] args) {
          int arr[]={2,0,2,1,1,0};
          //int arr[]={2,0,1};
          solve(arr);
    }

}
