import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
//删除有序链表中重复的元素-II
public class Solution {
    public ListNode deleteDuplicates (ListNode head) {
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode p = preHead;
        while(p.next != null && p.next.next !=null){
            if(p.next.val == p.next.next.val){
                int temp = p.next.val;
                while(p.next !=null && p.next.val == temp)p.next = p.next.next;
            }else
                p = p.next;
        }
        return preHead.next;
    }
}