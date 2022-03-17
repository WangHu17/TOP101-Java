import java.util.*;
//合并两个有序的数组(不开辟空间)
public class Solution {
    public void merge(int A[], int m, int B[], int n) {
        int k = m + n - 1;
        m--;
        n--;
        while(m>=0 && n>=0){
            if(A[m] >= B[n])
                A[k--] = A[m--];
            else
                A[k--] = B[n--];
        }
        while(n>=0){
            A[k--] = B[n--];
        }
    }
}