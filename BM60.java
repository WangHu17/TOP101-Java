import java.util.*;

//括号生成
public class Solution {
    
    ArrayList<String> res;
    public ArrayList<String> generateParenthesis (int n) {
        res = new ArrayList<String>();
        backtrack("", 0, 0, n);
        return res;
    }
    
    public void backtrack(String s, int l, int r, int n){
        if(s.length() == 2*n){
            res.add(s);
            return;
        }
        if(l < n)backtrack(s+"(", l+1, r, n);
        if(r < l)backtrack(s+")", l, r+1, n);
    }
}