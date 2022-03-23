import java.util.*;

//大数加法
public class Solution {
    public String solve (String s, String t) {
        if(s == "")return t;
        if(t == "")return s;
        int len1 = s.length() - 1, len2 = t.length() - 1;
        int len = Math.max(len1, len2), i = 0;
        StringBuilder builder = new StringBuilder(len + 1);
        int flag = 0;
        while(i <= len){
            int a = len1 - i < 0 ? 0 : (s.charAt(len1 - i) - '0');
            int b = len2 - i < 0 ? 0 : (t.charAt(len2 - i) - '0');
            int sum = a + b + flag;
            flag = sum/10;
            builder.append(sum%10);
            i++;
        }
        if(flag == 1)builder.append("1");
        return builder.reverse().toString();
    }
}