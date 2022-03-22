import java.util.*;

//矩阵最长递增路径
public class Solution {
    
    int[][] mark;
    public int solve (int[][] matrix) {
        int max = 0, row = matrix.length, col = matrix[0].length;
        mark = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                max = Math.max(max, dfs(matrix, i, j, -1));
            }
        }
        return max;
    }
    
    public int dfs(int[][] matrix, int i, int j, int pre){
        if(matrix[i][j] <= pre)return 0;
        if(mark[i][j] != 0)return mark[i][j];
        int max = 0;
        if(i>0)max = Math.max(max, dfs(matrix, i-1, j, matrix[i][j]));
        if(i<matrix.length-1)max = Math.max(max, dfs(matrix, i+1, j, matrix[i][j]));
        if(j>0)max = Math.max(max, dfs(matrix, i, j-1, matrix[i][j]));
        if(j<matrix[0].length-1)max = Math.max(max, dfs(matrix, i, j+1, matrix[i][j]));
        mark[i][j] = max + 1;
        return max + 1;
    }
}