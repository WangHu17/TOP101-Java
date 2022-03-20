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
//判断是不是二叉搜索树：方法：层次遍历，当遍历到null时，且队列不为空，则返回false
public class Solution {
    public boolean isCompleteTree (TreeNode root) {
        if(root == null)return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean flag = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                TreeNode node = queue.poll();
                if(flag && node != null)return false;
                if(node == null)flag = true;
                else {
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
        }
        return true;
    }
}