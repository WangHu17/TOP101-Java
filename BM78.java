import java.util.*;

//打家劫舍(一)
public class Solution {
    public int rob (int[] nums) {
        int len = nums.length;
        if(len == 1)return nums[0];
        if(len == 2)return Math.max(nums[0], nums[1]);
        int[] money = new int[len];
        money[0] = nums[0];
        money[1] = Math.max(nums[0],nums[1]);
        for(int i=2; i<len; i++){
            money[i] = Math.max(money[i-1], money[i-2] + nums[i]);
        }
        return money[len-1];
    }
}