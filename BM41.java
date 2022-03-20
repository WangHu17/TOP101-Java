import java.util.*;

//输出二叉树的右视图
public class Solution {
    
    public int[] solve (int[] xianxu, int[] zhongxu) {
        int len = xianxu.length;
        if(len == 0)return new int[0];
        TreeNode root = buildTree(xianxu, zhongxu, 0, 0, len - 1);
        return levelOrder(root);
    }
    
    public int[] levelOrder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            while(size-- > 0){
                TreeNode node = queue.poll();
                if(node.left != null)queue.offer(node.left);
                if(node.right != null)queue.offer(node.right);
                if(size == 0)res.add(node.val);
            }
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
    
    public TreeNode buildTree(int[] pre, int[] in, int preIndex, int inLeft, int inRight) {
        if(preIndex > pre.length -1 || inLeft > inRight)return null;
        TreeNode node = new TreeNode(pre[preIndex]);
        int index = 0;
        for(int i=inLeft; i<=inRight; i++){
            if(pre[preIndex] == in[i]){
                index = i;
                break;
            }
        }
        node.left = buildTree(pre, in, preIndex + 1, inLeft, index - 1);
        node.right = buildTree(pre, in, preIndex +(index - inLeft + 1), index + 1, inRight);
        return node;
    }
}