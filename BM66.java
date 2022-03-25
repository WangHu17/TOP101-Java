import java.util.*;

//最长公共子串
public class Solution {
    
    public String LCS (String str1, String str2) {
        int maxLenth = 0, lastIndex = 0;
        int[] dp = new int[str2.length()+1];
        for(int i=0; i<str1.length(); i++){
            for(int j=str2.length()-1; j>=0; j--){
                if(str1.charAt(i) == str2.charAt(j)){
                    dp[j+1] = dp[j] + 1;
                    if(dp[j+1] > maxLenth){
                        maxLenth = dp[j+1];
                        lastIndex = i;
                    }
                }else{
                    dp[j+1] = 0;
                }
            }
        }
        return str1.substring(lastIndex - maxLenth + 1, lastIndex + 1);
    }
}