
public class 342_Factorial_of_Large_Number {
    static int fact(int n){
        if(n==0 ||n==1){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n=10;

        System.out.print(fact(n));
    }
}
