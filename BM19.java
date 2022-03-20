import java.util.*;

//寻找峰值
public class Solution {
    
    //二分法
    public int findPeakElement (int[] nums) {
        int l = 0, r = nums.length - 1;
        while(l < r) {
            int mid = l + (r-l)/2;
            if(nums[mid] < nums[mid+1])
                l = mid + 1;
            else r = mid;
        }
        return l;
    }
    
    //我的方法：普通方法
    public int findPeakElement1 (int[] nums) {
        int len = nums.length;
        if(len == 1)return 0;
        if(nums[0] > nums[1])return 0;
        if(nums[len-2] < nums[len-1])return len-1;
        for(int i=1; i<nums.length-1; i++){
            if(nums[i] > nums[i-1] && nums[i] > nums[i+1])
                return i;
        }
        return 0;
    }
}