import java.util.*;

//最长无重复子数组
public class Solution {
    
    //解法二：HashSet
    public int maxLength (int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int left = 0, right = 0, max = 0;
        while(right < arr.length){
            if(set.contains(arr[right]))
                set.remove(arr[left++]);
            else{
                set.add(arr[right++]);
                max = Math.max(max, set.size());
            }
        }
        return max;
    }
    
    //解法二：队列
    public int maxLength2 (int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        int max = 0;
        for(int n:arr){
            while(queue.contains(n))queue.poll();
            queue.add(n);
            max = Math.max(max, queue.size());
        }
        return max;
    }
    
    //解法一：双指针 + HashMap
    public int maxLength1 (int[] arr) {
        int len = arr.length, max = 0, j=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<len; i++){
            if(map.containsKey(arr[i])){
                j = Math.max(j, map.get(arr[i]) + 1);
            }
            map.put(arr[i], i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}