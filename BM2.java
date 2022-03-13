import java.util.*;
/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
//将一个节点数为 size 链表 m 位置到 n 位置之间的区间反转
public class Solution {

    public ListNode reverseBetween (ListNode head, int m, int n) {
        ListNode pre_head = new ListNode(0);
        pre_head.next = head;
        ListNode pre = pre_head;
        for(int i=0; i<m-1; i++)pre = pre.next;
        ListNode cur = pre.next;
        ListNode next;
        for(int i=0; i<n-m; i++){
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return pre_head.next;
    }
    
}