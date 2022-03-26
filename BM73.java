import java.util.*;

//最长回文子串
public class Solution {
    //方法：中心扩散
    public int getLongestPalindrome (String A) {
        int n = A.length();
        if(n < 2)return n;
        int max = 0;
        for(int i=0; i<n; i++){
            int len1 = helper(A,i,i);
            int len2 = helper(A,i,i+1);
            max =  Math.max(max, Math.max(len1, len2));
        }
        return max;
    }
    
    public int helper(String A, int l, int r){
        while(l >= 0 && r < A.length()){
            if(A.charAt(l) == A.charAt(r)){
                l--;
                r++;
            }else
                break;
        }
        return r - l + 1 - 2;
    }
}