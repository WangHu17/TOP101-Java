import java.util.*;
//三数之和
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        int len = num.length;
        if(len < 3)return res;
        Arrays.sort(num);
        if(num[0] > 0)return res;
        for(int i=0; i<len-2; i++){
            if(i>0 && num[i] == num[i-1])continue;
            int left = i+1, right = len - 1, target = -num[i];
            while(left < right){
                if(num[left] + num[right] == target){
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(num[i]);
                    list.add(num[left]);
                    list.add(num[right]);
                    res.add(list);
                    while(left<right && num[left] == num[left+1])left++;
                    while(left<right && num[right] == num[right-1])right--;
                    left++;
                    right--;
                }else if(num[left] + num[right] < target)
                    left++;
                else right--;
            }
        }
        return res;
    }
}