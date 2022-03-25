import java.util.*;

//矩阵的最小路径和
public class Solution {
    
    public int minPathSum (int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(i==0 && j!=0){
                    matrix[i][j] += matrix[i][j-1];
                }else if(i!=0 && j==0){
                    matrix[i][j] += matrix[i-1][j];
                }else if(i>0 && j>0){
                    matrix[i][j] += Math.min(matrix[i-1][j], matrix[i][j-1]);
                }
            }
        }
        return matrix[row-1][col-1];
    }
    
}