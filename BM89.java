import java.util.*;
/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
//合并区间
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals, (a,b)->a.start - b.start);
        ArrayList<Interval> res = new ArrayList<Interval>();
        int i=0, len = intervals.size();
        while(i < len){
            int start = intervals.get(i).start;
            int end = intervals.get(i).end;
            while(i < len-1 && intervals.get(i+1).start <= end){
                end = Math.max(end, intervals.get(i+1).end);
                i++;
            }
            res.add(new Interval(start,end));
            i++;
        }
        return res;
    }
}