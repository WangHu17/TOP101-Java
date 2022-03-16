import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */
//合并二叉树:已知两颗二叉树，将它们合并成一颗二叉树。合并规则是：都存在的结点，
//就将结点值加起来，否则空的位置就由另一个树的结点来代替。
public class Solution {
    public TreeNode mergeTrees (TreeNode t1, TreeNode t2) {
        if(t1 == null)return t2;
        if(t2 == null)return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}