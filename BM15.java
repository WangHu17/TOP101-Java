import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
//删除有序链表中重复的元素-I
public class Solution {

    public ListNode deleteDuplicates (ListNode head) {
        if(head == null || head.next == null)return head;
        ListNode p = head;
        while(p.next != null){
            if(p.val == p.next.val)p.next = p.next.next;
            else p = p.next;
        }
        return head;
    }
    
}