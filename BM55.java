import java.util.*;

public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(num.length == 0)return res;
        permuting(num, 0, res);
        return res;
    }
    
    public void permuting(int[] num, int pos, ArrayList<ArrayList<Integer>> res){
        if(pos == num.length - 1){
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int n:num)list.add(n);
            res.add(list);
        }
        for(int i=pos; i<num.length; i++){
            swap(num, pos, i);
            permuting(num, pos+1, res);
            swap(num, i ,pos);
        }
    }
    
    public int[] swap(int[] num, int a, int b){
        int t = num[a];
        num[a] = num[b];
        num[b] = t;
        return num;
    }
}