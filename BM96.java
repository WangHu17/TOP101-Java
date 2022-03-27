import java.util.*;

//主持人调度（二）
public class Solution {
    public int minmumNumberOfHost (int n, int[][] startEnd) {
        int[] starts = new int[n];
        int[] ends = new int[n];
        for(int i=0; i<n; i++){
            starts[i] = startEnd[i][0];
            ends[i] = startEnd[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int res = 0, end = 0;
        for(int start=0; start<n; start++){
            if(starts[start] >= ends[end])
                end++;
            else
                res++;
        }
        return res;
    }
}