import java.lang.reflect.Array;
import java.util.*;

public class Dyna1d {
    public static int fibonacci(int n, int[] mp) {
        if (n <= 1) {
            return n;
        }
        if (mp[n] != -1) {
            return mp[n];
        }
          return mp[n] = fibonacci(n - 1, mp) + fibonacci(n - 2, mp);

    
       

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int[] mp = new int[n+1];
        Arrays.fill(mp, -1);
        System.out.println(n + "th fibonacci number is : " + fibonacci(n, mp));

    }

}
