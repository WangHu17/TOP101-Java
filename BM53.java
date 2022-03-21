import java.util.*;

//缺失的第一个正整数
public class Solution {
   
    public int minNumberDisappeared (int[] nums) {
        int n = nums.length;
        int[] count = new int[n+1];
        for(int num:nums){
            if(num > 0 && num <= n)count[num] = 1;
        }
        for(int i=1; i<n+1; i++){
            if(count[i] == 0)return i;
        }
        return n+1;
    }
    
}