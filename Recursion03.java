public class Recursion03 {
    //logn Stack Height
    public static int calcu(int  x ,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2 ==0){
            return calcu(x, n/2)*calcu(x, n/2);
        }
        else{
            return calcu(x, n/2)*calcu(x, n/2)*x;
        }
    }
    public static void main(String[] args){
        int x =2;
        int n =6;
        int ans = calcu(x, n);
        System.out.println(ans);
    }
    
}
