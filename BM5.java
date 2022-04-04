import java.util.*;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
//合并k个已排序的链表
public class Solution {
    // 方法一：分治排序
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        return merge(lists,0,lists.size()-1);
    }
    
    public ListNode merge(ArrayList<ListNode> lists, int l, int r){
        if(l==r)return lists.get(l);
        if(l>r)return null;
        int mid = l + (r-l)/2;
        return mergeTwoList(merge(lists,l,mid),merge(lists,mid+1,r));
    }
    
    public ListNode mergeTwoList(ListNode p1, ListNode p2){
        ListNode node = new ListNode(-1);
        ListNode temp = node;
        while(p1 != null && p2 != null){
            if(p1.val <= p2.val){
                node.next = p1;
                p1 = p1.next;
            }else{
                node.next = p2;
                p2 = p2.next;
            }
            node = node.next;
        }
        node.next = p1!=null?p1:p2;
        return temp.next;
    }
    
    // 方法二：优先队列
     public ListNode mergeKLists1(ArrayList<ListNode> lists) {
        Queue<ListNode> pQueue = new PriorityQueue<>((v1,v2)->v1.val-v2.val);
        for(ListNode node:lists){
            if(node!=null)
                pQueue.offer(node);
        }
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while(!pQueue.isEmpty()){
            ListNode minNode = pQueue.poll();
            cur.next = minNode;
            cur = cur.next;
            if(minNode.next != null)
                pQueue.offer(minNode.next);
        }
        return head.next;
    }
}