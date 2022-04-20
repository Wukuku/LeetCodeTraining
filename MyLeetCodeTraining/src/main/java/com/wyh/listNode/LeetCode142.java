package com.wyh.listNode;

/**
 * @Author wu yuhao
 * @Date 2022/4/19
 * @Description
 */
public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(true) {
            if (fast == null || fast.next != null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        ListNode start = head;
        while (start != slow) {
            start = start.next;
            slow = slow.next;
        }
        return slow;
    }
}
