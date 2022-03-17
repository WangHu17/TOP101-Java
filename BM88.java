import java.util.*;

//判断是否为回文字符串
public class Solution {
    public boolean judge (String str) {
        int l = 0, r = str.length() - 1;
        while(l < r){
            if(str.charAt(l) != str.charAt(r))
                return false;
            else{
                l++;
                r--;
            }
        }
        return true;
    }
}