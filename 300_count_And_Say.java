public class 300_count_And_Say{
static String solve(int n){
        if(n==1){
            return "1";
        }
    
        String say=solve(n-1);

        String result="";
    for(int i=0;i<say.length();i++){
        char ch=say.charAt(i);
      
        int count=1;

        while(i < say.length()-1 && say.charAt(i)==say.charAt(i+1)){
               count++;
               i++;
        }
        result=result+Integer.toString(count)+Character.toString(ch);
    }
    return result;
}
    public static void main(String args[]){
          int n=4;
        System.out.print(solve(n));
    }
}
