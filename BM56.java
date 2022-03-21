import java.util.*;

//有重复项数字的全排列
public class Solution {
    
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    boolean[] mark;
    
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
        if(num.length == 0)return res;
        Arrays.sort(num);
        LinkedList<Integer> list = new LinkedList<>();
        mark = new boolean[num.length];
        backtrack(num, list);
        return res;
    }
    
    public void backtrack(int[] num, LinkedList<Integer> list){
        if(list.size() == num.length){
            res.add(new ArrayList(list));
            return;
        }
        for(int i=0; i<num.length; i++){
            if(mark[i] || (i>0 && num[i] == num[i-1] && !mark[i-1]))
                continue;
            list.add(num[i]);
            mark[i] = true;
            backtrack(num, list);
            list.removeLast();
            mark[i] = false;
        }
    }
    
}