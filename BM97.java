import java.util.*;

//旋转数组
public class Solution {
    public int[] solve (int n, int m, int[] a) {
        m = m % n;
        //方法一：循环右移
//         for(int i=0; i<m; i++){
//             int t = a[n-1];
//             for(int j=n-1; j>=1; j--){
//                 a[j] = a[j-1];
//             }
//             a[0] = t;
//         }
        //方法二：翻转
        reverse(a,0,n-1);
        reverse(a,0,m-1);
        reverse(a,m,n-1);
        return a;
    }
    
    public void reverse(int[] a, int l, int r){
        while(l<r){
            int t = a[l];
            a[l++] = a[r];
            a[r--] = t;
        }
    }
}