import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
//判断一个链表是否为回文结构
public class Solution {
    //我的方法：使用栈，双指针
    public boolean isPail (ListNode head) {
        if(head == null || head.next == null)return true;
        Stack<Integer> stack = new Stack<>();
        stack.add(head.val);
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            stack.add(slow.val);
            fast = fast.next.next;
        }
        if(fast.next == null)stack.pop();
        while(slow.next != null) {
            slow = slow.next;
            if(slow.val != stack.pop())return false;
        }
        return true;
    }
    
}