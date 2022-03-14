import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
// 单链表的排序
public class Solution {
    //我的方法：先取出所有节点值排序，再生成新的链表
    public ListNode sortInList (ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode new_head = null, pre = null;
        for(Integer n:list){
            ListNode node = new ListNode(n);
            if(pre == null){
                new_head = node;
                pre = node;
            }else pre.next = node;
            pre = node;
        }
        pre.next = null;
        return new_head;
    }
    
}