package com.wyh.alg.listNode;

/**
 * @Author wu yuhao
 * @Date 2022/4/18
 * @Description
 */
public class LeetCode25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode a ,b;
        a = head;
        b = head;
        for (int i = 0; i < k; i++) {
            if (b == null) {
                return head;
            }
            b = b.next;
        }
        ListNode newHead = reverse(a,b);
        a.next = reverseKGroup(b, k);
        return newHead;
    }
    public ListNode reverse(ListNode a, ListNode b) {
        ListNode cur = a;
        ListNode next = b;
        ListNode pre = null;
        while (cur != b) {
           next = cur.next;
           cur.next = pre;
           pre = cur;
           cur = next;
        }
        return pre;
    }
}
