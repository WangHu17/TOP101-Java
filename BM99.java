import java.util.*;
//顺时针旋转矩阵
public class Solution {
    public int[][] rotateMatrix(int[][] mat, int n) {
        //方法一：新建一个二维数组依次赋值
        //方法二：先按对角线翻转，再左右翻转即可
        int t = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                t = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = t;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                t = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = t;
            }
        }
        return mat;
    }
}