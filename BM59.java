import java.util.*;

//N皇后问题
public class Solution {
    
    int[] arr;
    int count = 0, max;
    public int Nqueen (int n) {
        if(n==1)return 1;
        arr = new int[n];
        max = n;
        backtrack(0);
        return count;
    }
    
    public void backtrack(int n){
        if(n == max){
            count++;
            return;
        }
        for(int i=0; i<max; i++){
            arr[n] = i;
            if(judge(n))backtrack(n+1);
        }
    }
    
    public boolean judge(int n){
        for(int i=0; i<n; i++){
            if(arr[i] == arr[n] || Math.abs(n-i) == Math.abs(arr[n] - arr[i]))
                return false;
        }
        return true;    
    }
}