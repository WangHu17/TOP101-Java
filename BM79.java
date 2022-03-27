import java.util.*;

//打家劫舍(二)
public class Solution {
    public int rob (int[] nums) {
        int n = nums.length;
        int money1 = money(nums, 0 , n-1);
        int money2 = money(nums, 1 , n);
        return Math.max(money1, money2);
    }
    
    public int money(int[] nums, int l, int r){
        int prepre = 0, pre = 0, cur = 0;
        for(int i=l; i<r; i++){
            cur = Math.max(pre, prepre + nums[i]);
            prepre = pre;
            pre = cur;
        }
        return pre;
    }
}