package com.wyh.alg.listNode;

/**
 * @Author wu yuhao
 * @Date 2022/2/1
 * @Description
 */
/* 判断连标是否有环：
                1 快慢指针
                2 Hash表
 */
public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != slow) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
