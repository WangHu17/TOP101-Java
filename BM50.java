import java.util.*;

//两数之和
public class Solution {
    public int[] twoSum (int[] numbers, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i <numbers.length; i++){
            if(map.containsKey(numbers[i])){
                res[0] = map.get(numbers[i]) + 1;
                res[1] = i+1;
            }else
                map.put(target-numbers[i], i);
        }
        return res;
    }
}