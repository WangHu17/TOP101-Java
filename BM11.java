import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
//链表相加(二)
public class Solution {
    public ListNode addInList (ListNode head1, ListNode head2) {
        if(head1 == null)return head2;
        if(head2 == null)return head1;
        head1 = reverse(head1);
        head2 = reverse(head2);
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        int flag = 0;
        while(head1 !=null || head2 !=null){
            int sum = flag;
            if(head1 != null){
                sum += head1.val;
                head1 = head1.next;
            }
            if(head2 != null){
                sum += head2.val;
                head2 = head2.next;
            }
            flag = sum/10;
            cur.next = new ListNode(sum%10);
            cur = cur.next;
        }
        if(flag != 0)cur.next = new ListNode(flag);
        return reverse(head.next);
    }
    
    public ListNode reverse(ListNode head){
        ListNode pre = null, cur = head, next = null;
        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}