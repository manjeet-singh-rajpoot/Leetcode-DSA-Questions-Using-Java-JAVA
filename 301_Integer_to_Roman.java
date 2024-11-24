public class 301_Integer_to_Roman {

    static String solve(int val[],String sym[],int num){
     
        String result="";
        for(int i=0;i<13;i++){
            if(num==0){
                break;
            }
            int times=num/val[i];

           while(times>0){
                result=result+sym[i];
                times--;
            }
            num=num%val[i];
        }
      return result;
    }
     public static void main(String[] args) {
        int val[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String arr[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        int num=1994;

        System.out.print(solve(val,arr,num));

     }
}
