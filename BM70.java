import java.util.*;

//兑换零钱(一)
public class Solution {
    public int minMoney (int[] arr, int aim) {
        int max = aim+1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for(int i=1; i<=aim; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[j] <= i){
                    dp[i] = Math.min(dp[i], dp[i-arr[j]]+1);
                }
            }
        }
        return dp[aim] > aim ? -1 : dp[aim];
    }
}