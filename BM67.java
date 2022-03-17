import java.util.*;

//不同路径的数目(一)
public class Solution {
    public int uniquePaths (int m, int n) {
        if(m == 1 || n == 1)return 1;
        return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    }
}