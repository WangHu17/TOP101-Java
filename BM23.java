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
//二叉树的前序遍历
public class Solution {
    
    ArrayList<Integer> list = new ArrayList<>();

    public int[] preorderTraversal (TreeNode root) {
        dfs(root);
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
    
    public void dfs(TreeNode root){
        if(root == null)return;
        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
    
}