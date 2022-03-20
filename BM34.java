import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 *   public TreeNode(int val) {
 *     this.val = val;
 *   }
 * }
 */
//判断是不是二叉搜索树
public class Solution {
    public boolean isValidBST (TreeNode root) {
        return dfs(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    public boolean dfs(TreeNode root, int l, int r){
        if(root == null)return true;
        if(root.val < l || root.val > r)return false;
        return dfs(root.left, l ,root.val) && dfs(root.right, root.val, r);
    }
}