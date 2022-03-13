/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//判断链表中是否有环
public class Solution {
    public boolean hasCycle(ListNode head) {
        while(head != null){
            if(head.val == 100001)return true;
            head.val = 100001;
            head = head.next;
        }
        return false;
    }
}