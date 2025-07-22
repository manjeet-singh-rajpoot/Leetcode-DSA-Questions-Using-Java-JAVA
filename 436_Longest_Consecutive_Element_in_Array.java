public class 436_Longest_Consecutive_Element_in_Array {
    
    
    static int solve(int arr[]){
        Arrays.sort(arr);
        Set<Integer>set=new HashSet<>();
        int longest=0;
        for(int num:arr){
            set.add(num);
        }

        for(int num:set){
             if(! set.contains(num-1)){
                 int length=1;
                 while(set.contains(num+length) ){
                    length++;
                 }
                longest=Math.max(length, longest);
             }
        }

        return longest;
    }

    public static void main(String[] args) {
        //int arr[]={100,4,200,1,3,2};
        //int arr[]={0,3,7,2,5,8,4,6,0,1};
        int arr[]={1,0,1,2};
        System.out.println(solve(arr));
    }


}
