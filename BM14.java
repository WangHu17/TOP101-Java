import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */
//链表的奇偶重排
public class Solution {
    
    //改进
    public ListNode oddEvenList (ListNode head){
        if(head == null)return head;
        ListNode evenHead = head.next;
        ListNode odd = head, even = evenHead;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    
    //我的方法
    public ListNode oddEvenList1 (ListNode head) {
        if(head == null || head.next ==null ||
           head.next.next == null)return head;
        ListNode p = head;
        ListNode head2 = head.next;
        ListNode q = head2;
        while(p.next.next !=null && q.next.next !=null){
            p.next = p.next.next;
            p = p.next;
            q.next = q.next.next;
            q = q.next;
        }
        if(p.next.next !=null){
            p.next = p.next.next;
            p = p.next;
        }
        q.next = null;
        p.next = head2;
        return head;
    }
}