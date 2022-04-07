import java.util.*;

//最小覆盖子串
public class Solution {

    public String minWindow (String S, String T) {
        Map<Character,Integer> window = new HashMap<>();
        Map<Character,Integer> target = new HashMap<>();
        for(Character c:T.toCharArray()){
            target.put(c, target.getOrDefault(c,0)+1);
        }
        int left = 0, right = 0, match = 0, min = S.length()+1, start = -1;
        while(right < S.length()){
            char c1 = S.charAt(right);
            right++;
            if(target.containsKey(c1)){
                window.put(c1, window.getOrDefault(c1,0)+1);
                if(window.get(c1) == target.get(c1))
                    match++;
            }
            while(match == target.size()){
                if(min > right - left){
                    start = left;
                    min = right - left;
                }
                char c2 = S.charAt(left);
                left++;
                if(target.containsKey(c2)){
                    window.put(c2, window.getOrDefault(c2,0)-1);
                    if(window.get(c2) < target.get(c2))
                        match--;
                }
            }
        }
        return start == -1 ? "" : S.substring(start, start + min);
    }
    
}