import java.util.*;

public class HouseRobbery {

    // Helper function 
    public static int maxSum(int[] arr, int n, int[] dp) {
        if (n == 0) return arr[0];
        if (n < 0) return 0;
        if (dp[n] != -1) return dp[n];

        int pick = arr[n] + maxSum(arr, n - 2, dp);
        int notPick = maxSum(arr, n - 1, dp);

        return dp[n] = Math.max(pick, notPick);
    }



    public static int maxRobbery(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        if (n == 1) return arr[0];

        //  Exclude last house
        int[] dp1 = new int[n - 1];
        Arrays.fill(dp1, -1);
        int ans1 = maxSum(Arrays.copyOfRange(arr, 0, n - 1), n - 2, dp1);

        //  Exclude first house
        int[] dp2 = new int[n - 1];
        Arrays.fill(dp2, -1);
        int ans2 = maxSum(Arrays.copyOfRange(arr, 1, n), n - 2, dp2);

        return Math.max(ans1, ans2);
    }

    public static void main(String[] args) {
        int[] arr = {230, 450, 789, 234, 567, 785};
        System.out.println("Maximum Robbery Amount: " + maxRobbery(arr));
    }
}