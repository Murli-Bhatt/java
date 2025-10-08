//Given an array arr[] of integers, find the maximum sum of a subsequence such that no two elements are adjacent.
public class MaxSumDP {
    public static int maxSum(int ind,int[ ] arr,int dp[]){
        
     if(ind <0) return 0; //for invalid indexes
      if(ind == 0){
            return arr[ind];
        }
        if(dp[ind] != -1){
            return dp[ind];
        }

      //if we pick the current index then we can't pick its adjecent element 
        int pick = arr[ind] + maxSum(ind -2, arr,dp);
      //if we dont pick the current index then we can pick the its adjecent element 
        int notPick =maxSum( ind-1, arr,dp);
        return dp[ind] = Math.max(pick, notPick);
    }
  public static void main(String[] args) {
        int[] arr = {3, 2, 5, 10, 7};
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1); // Initialize memoization array 
        int result = maxSum(n - 1, arr, dp);
        System.out.println("Maximum Sum of Non-Adjacent Elements: " + result);
    }
    
}
