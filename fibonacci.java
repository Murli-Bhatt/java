public class fibonacci {
    public static void printFibo(int a,int b,int n){
        int c = a+b;
        System.out.println(c);
        if(n==0){
            return;
        }
        printFibo(b, c, n-1);
      
       
    }
    public static void main(String[] args){
       int a=0; int b=1;
       System.out.println(a);
       System.out.println(b);
       int n =7;
       printFibo(a, b, n-2);
    }
    
}
