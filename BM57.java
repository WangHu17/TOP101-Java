import java.util.*;

//岛屿数量
public class Solution {
    public int solve (char[][] grid) {
        int row = grid.length, col = grid[0].length;
        if(row == 0)return 0;
        int count = 0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == '1'){
                    count++;
                    dfs(grid, i ,j);
                }
            }
        }
        return count;
    }
    
    public void dfs(char[][] grid, int i, int j){
        if(i<0 || i>grid.length-1 || j<0 || j>grid[0].length-1 || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j-1);
        dfs(grid, i, j+1);
    }
}