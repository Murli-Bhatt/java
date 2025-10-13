import java.util.*;
// - Problem: Given an array nums, where each element represents your maximum jump length from that position, determine if you can reach the last index.
// Example
// Input: nums = [2,3,1,1,4]
// Output: true
// Explanation: Jump 1 step to index 1, then 3 steps to the last index.

public class JumpGame{
    public static boolean canJump(int[] jumps){
        int n = jumps.length;
        Boolean[] dp = new Boolean[n];
        return canReach(jumps, dp, n);
    }
    public static boolean canReach(int[] jumps,Boolean[] dp,int indx){
        if(indx >= jumps.length-1) return true;
        if(dp[indx] !=null) return dp[indx];
        int maxjump = jumps[indx];
        for(int i = 1;i<maxjump;i++){
            if(canReach(jumps, dp, indx +1))
            {
                dp[indx] = true;
                return true;

            }
            
            

        }
        dp[indx] = false;
        return false;

    }
    public static void main(String[] args){
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(canJump(nums));
    }

}
