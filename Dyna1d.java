import java.lang.reflect.Array;
import java.util.*;

public class Dyna1d {
    public static int fibonacci(int n, int[] dp) {
        if (n <= 1) {
            return n;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
          return dp[n] = fibonacci(n - 1, dp) + fibonacci(n - 2, dp);

    
       

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(n + "th fibonacci number is : " + fibonacci(n, dp));

    }

}
