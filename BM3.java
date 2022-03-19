import java.util.*;
/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
//链表中的节点每k个一组翻转
public class Solution {

    public ListNode reverseKGroup (ListNode head, int k) {
        if(head == null || k <= 1)return head;
        ListNode node = head;
        for(int i=0; i<k; i++){
            if(node == null)return head;
            node = node.next;
        }
        ListNode res = reverse(head,node);
        head.next = reverseKGroup(node,k);
        return res;
    }
    
    public ListNode reverse(ListNode l, ListNode r){
        ListNode pre = null, cur = l, next = null;
        while(cur != r) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    
}