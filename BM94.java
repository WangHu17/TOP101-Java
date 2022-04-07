import java.util.*;

//接雨水问题
public class Solution {

    public long maxWater (int[] arr) {
        int len = arr.length;
        if(arr == null || len <= 2)return 0;
        int left = 0, right = len - 1, sum = 0;
        int min = Math.min(arr[left], arr[right]);
        while(left < right){
            if(arr[left] < arr[right]){
                left++;
                if(arr[left] < min)
                    sum += min - arr[left];
                else
                    min = Math.min(arr[left], arr[right]);
            }else{
                right--;
                if(arr[right] < min)
                    sum += min - arr[right];
                else
                    min = Math.min(arr[left], arr[right]);
            }
        }
        return sum;
    }
}