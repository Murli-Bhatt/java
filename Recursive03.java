public class Recursive03 {
    public static int calculate(int x,int n){
        if(n ==1){
            return x;
        }
        if(x==0){
            return 0;
        }
        return x*calculate(x, n-1);
    }
    public static void main(String[] args){
        int x =2;
        int n =5;
        int ans = calculate(x, n);
        System.out.println(ans);

    }
    
}
