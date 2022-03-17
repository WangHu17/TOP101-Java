import java.util.*;

//最小花费爬楼梯
public class Solution {
    public int minCostClimbingStairs (int[] cost) {
        int n = cost.length;
        int[] count = new int[n];
        count[0] = cost[0];
        count[1] = cost[1];
        for(int i=2; i<n; i++)
            count[i] = Math.min(count[i-1], count[i-2]) + cost[i];
        return Math.min(count[n-1], count[n-2]);
    }
}