import java.util.*;

//最长的括号子串
public class Solution {
    /**
     * 
     * @param s string字符串 
     * @return int整型
     */
    public int longestValidParentheses (String s) {
        int max = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }else{
                stack.pop();
                if(stack.isEmpty()){
                    stack.push(i);
                }else{
                    max = Math.max(max, i-stack.peek());
                }
            }
        }
        return max;
    }
}