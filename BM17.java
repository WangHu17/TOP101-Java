import java.util.*;

//二分查找-I
public class Solution {

    public int search (int[] nums, int target) {
        int len = nums.length;
        if(len == 0)return -1;
        int left = 0, right = len - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target)return mid;
            else if(nums[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
    
}