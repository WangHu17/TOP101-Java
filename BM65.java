import java.util.*;

//最长公共子序列(二)
public class Solution {
    public String LCS (String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if(s1==null||s2==null||len1==0||len2==0)
            return "-1";
        // 长度必须是字符串长度+1
        int[][] dp = new int[len1+1][len2+1];
        for(int i=0; i<=len1; i++)
            dp[i][0] = 0;
        for(int j=0; j<=len2; j++)
            dp[0][j] = 0;
        for(int i=1; i<=len1; i++){
            for(int j=1; j<=len2; j++){
                dp[i][j] = s1.charAt(i-1)==s2.charAt(j-1)?
                    (dp[i-1][j-1]+1):Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i=len1, j=len2; dp[i][j]>=1;){
            if(s1.charAt(i-1) == s2.charAt(j-1)){
                res.append(s1.charAt(i-1));
                i--;
                j--;
            }else if(dp[i-1][j] >= dp[i][j-1]){
                i--;
            }else
                j--;
        }
        return res.length()==0?"-1":res.reverse().toString();
    }
}