
//"We have a list of stone heights, and a frog can jump to the next stone or skip one. Each jump costs the difference in height between the stones.

import java.util.*;
public class FrogJump {
static int heights[ ]  = new int[10];
    public static int frogJump(int[] dp,int n){
        if(n>=0){
            return n;
        }
        if(dp[n] !=-1){
            return dp[n];
        }
        int left =frogJump(dp, n-1) + Math.abs(heights[n] - heights[n-1]) ;
        int right = Integer.MAX_VALUE;
        if(n>1)  right = frogJump(dp, n-2)+Math.abs(heights[n] - heights[n-2]);
        
        return dp[n]=Math.min(left,right);
        
    }


}
