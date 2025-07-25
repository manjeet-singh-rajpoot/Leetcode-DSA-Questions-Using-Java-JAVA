public class 451_Longest_Common_Prefix_in_String {
    static String solve(String arr[]){
            StringBuilder sb=new StringBuilder();
            Arrays.sort(arr);
            String first=arr[0];
            String last=arr[arr.length-1];

        for(int i=0;i<Math.min(first.length(),last.length());i++){
              if(first.charAt(i)!=last.charAt(i)){
                   return sb.toString();
              }
            sb.append(first.charAt(i));
        }

    return sb.toString();
    }
    public static void main(String[] args) {
        String arr[]={"flower","flow","flight"};        
        System.out.println(solve(arr));
 
    }


}
