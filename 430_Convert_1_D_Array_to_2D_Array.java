public class 430_Convert_1_D_Array_to_2D_Array {
    
    
    public static void main(String[] args) {
        String s="abcd";
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
              ans+=s.charAt(i);
        }
        System.out.println(ans);
    }
}

