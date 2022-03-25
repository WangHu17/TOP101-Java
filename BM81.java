import java.util.*;

//买卖股票的最好时机(二)
public class Solution {
    public int maxProfit (int[] prices) {
        int sum = 0, i=0;
        while(i < prices.length-1){
            if(prices[i] < prices[i+1]){
                sum += prices[i+1] - prices[i];
            }
            i++;
        }
        return sum;
    }
}