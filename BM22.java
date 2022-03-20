import java.util.*;

//比较版本号
public class Solution {
    public int compare (String version1, String version2) {
        String[] split1 = version1.split("\\.");
        String[] split2 = version2.split("\\.");
        int len1 = split1.length;
        int len2 = split2.length;
        int maxLen = Math.max(len1, len2);
        for(int i=0; i<maxLen; i++){
            int v1 = len1 <= i ? 0 : Integer.parseInt(split1[i]);
            int v2 = len2 <= i ? 0 : Integer.parseInt(split2[i]);
            if(v1 != v2)return v1 > v2 ? 1 : -1;
        }
        return 0;
    }
}