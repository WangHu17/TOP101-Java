import java.util.*;
//字符串变形
public class Solution {
    public String trans(String s, int n) {
        StringBuilder builder = new StringBuilder();
        String[] words = s.split(" ");
        int len = s.length() - 1, k = words.length - 1;
        for(int i=len; i>=0;){
            if(s.charAt(i) == ' '){
                builder.append(' ');
                i--;
            }else{
                for(Character c:words[k].toCharArray()){
                    builder.append(Character.isUpperCase(c)?Character.toLowerCase(c):Character.toUpperCase(c));
                    i--;
                }
                k--;
            }
        }
        return builder.toString();
    }
}