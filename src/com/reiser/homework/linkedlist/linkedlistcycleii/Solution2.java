package com.reiser.homework.linkedlist.linkedlistcycleii;

import com.reiser.homework.linkedlist.ListNode;

/**
 * @author: reiserx
 * Date:2020/9/10
 * Des:双指针解决，入环点的问题，太巧妙啦！
 */
public class Solution2 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if (fast == null || fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
