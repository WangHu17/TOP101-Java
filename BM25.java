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

public class Solution {
    ArrayList<Integer> list = new ArrayList<>();

    public int[] postorderTraversal (TreeNode root) {
        dfs(root);
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
    
    public void dfs(TreeNode root){
        if(root == null)return;
        dfs(root.left);
        dfs(root.right);
        list.add(root.val);
    }
}