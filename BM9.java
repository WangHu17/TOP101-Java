import java.util.*;
/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
//删除链表的倒数第n个节点
public class Solution {

    public ListNode removeNthFromEnd (ListNode head, int n) {
        if(head == null)return null;
        ListNode pre_head = new ListNode(0);
        pre_head.next = head;
        ListNode p = pre_head, fast = pre_head;
        while(n-- > 0){
            fast = fast.next;
        }
        while(fast != null && fast.next != null){
            p = p.next;
            fast = fast.next;
        }
        p.next = p.next.next;
        return pre_head.next;
    }
    
}