package com.wyh.listNode;

/**
 * @Author wu yuhao
 * @Date 2022/2/3
 * @Description 反转链表
 */

public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        ListNode last = null;
        while (head != null) {
            ListNode nextHead = head.next;
            head.next = last;
            last = head;
            head = nextHead;
        }
        return last;
    }
}
