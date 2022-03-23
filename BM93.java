import java.util.*;

//盛水最多的容器
public class Solution {
    public int maxArea (int[] height) {
        int left = 0, right = height.length - 1, max = 0;
        while(left < right) {
            int width = right - left;
            if(height[left] < height[right]){
                max = Math.max(max, width * height[left]);
                left++;
            }else{
                max = Math.max(max, width * height[right]);
                right--;
            }
        }
        return max;
    }
}