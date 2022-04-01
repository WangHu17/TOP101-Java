import java.util.*;

//设计LRU缓存结构
public class Solution {
    
    private Map<Integer,Integer> map;
    private int capacity;
    
    public Solution(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>(capacity);
    }

    public void set(int key, int value) {
        if(map.containsKey(key)){
            map.remove(key);
        }
        if(map.size() >= capacity){
            Integer firstKey = map.keySet().iterator().next();
            map.remove(firstKey);
        }
        map.put(key,value);
    }
    
    public int get(int key) {
        Integer value = map.get(key);
        if(value != null){
            if(map.size() > 1){
                map.remove(key);
                map.put(key,value);
            }
        }else
            return -1;
        return value;
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution solution = new Solution(capacity);
 * int output = solution.get(key);
 * solution.set(key,value);
 */