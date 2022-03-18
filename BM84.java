import java.util.*;

//最长公共前缀
public class Solution {
    public String longestCommonPrefix (String[] strs) {
        if(strs.length == 0 || strs == null)return "";
        int row = strs.length, col = strs[0].length();
        for(int i=0; i<col; i++){
            char c = strs[0].charAt(i);
            for(int j=1; j<row; j++){
                if(strs[j].length() == i || strs[j].charAt(i) != c)
                    return strs[0].substring(0,i);
            }
        }
        return strs[0];
    }
}