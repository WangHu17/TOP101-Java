import java.util.ArrayList;
//螺旋矩阵
public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(matrix.length == 0)return list;
        int lx = 0, hx = matrix.length - 1, ly = 0, hy = matrix[0].length - 1;
        while(lx<=hx && ly<=hy)
            circle(lx++, hx--, ly++, hy--, matrix, list);
        return list;
    }
    
    public void circle(int lx, int hx, int ly, int hy, int[][] matrix, ArrayList<Integer> list){
        for(int i=ly; i<= hy; i++)
            list.add(matrix[lx][i]);
        for(int i=lx+1; i<=hx; i++)
            list.add(matrix[i][hy]);
        int m = hx - lx + 1;
        if(m > 1){
            for(int i=hy-1; i>=ly; i--)list.add(matrix[hx][i]);
        }
        int n = hy - ly + 1;
        if(n > 1){
            for(int i=hx-1; i>=lx+1; i--)list.add(matrix[i][ly]);
        }
    }
}