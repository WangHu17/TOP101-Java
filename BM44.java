import java.util.*;

//有效括号序列
public class Solution {
    public boolean isValid (String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for(char c:chars){
            if(c == ')'){
                if(!stack.isEmpty() && stack.peek() == '(')stack.pop();
                else return false;
            }else if(c == '}'){
                if(!stack.isEmpty() && stack.peek() == '{')stack.pop();
                else return false;
            }else if(c == ']'){
                if(!stack.isEmpty() && stack.peek() == '[')stack.pop();
                else return false;
            }else
                stack.push(c);
        }
        return stack.isEmpty();
    }
}