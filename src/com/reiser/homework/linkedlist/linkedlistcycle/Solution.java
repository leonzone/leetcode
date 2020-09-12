package com.reiser.homework.linkedlist.linkedlistcycle;

import com.reiser.homework.linkedlist.ListNode;

/**
 * @author: reiserx
 * Date:2020/9/10
 * Des:
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            if (fast.next == slow || fast.next.next == slow) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;

        }
        return false;
    }
}
