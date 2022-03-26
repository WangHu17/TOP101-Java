import java.util.*;

//最长上升子序列(一)
public class Solution {
    public int LIS (int[] arr) {
        int len = arr.length;
        if(len == 0)return 0;
        int[] dp = new int[len];
        for(int i=0; i<len; i++){
            dp[i] = 1;
            for(int j =0; j<i; j++){
                if(arr[j] < arr[i])
                    dp[i] = Math.max(dp[i], dp[j]+1);
            }
        }
        return Arrays.stream(dp).max().getAsInt();
    }
}