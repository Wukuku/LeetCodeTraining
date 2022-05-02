package com.wyh.listNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Author wu yuhao
 * @Date 2022/4/30
 * @Description
 */
public class LeetCode23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> (a.val - b.val));
        for (ListNode head : lists) {
            if (head != null) {
                pq.add(head);
            }
        }
        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            pre.next = node;
            if (node.next != null) {
                pq.add(node.next);
            }
            pre = pre.next;
        }
        return dummy.next;
    }
}
