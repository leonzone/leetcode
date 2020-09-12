package com.reiser.homework.linkedlist.reversenodesinkgroup;

import com.reiser.homework.linkedlist.ListNode;

/**
 * @author: reiserx
 * Date:2020/9/12
 * Des:
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode hair = dummy;
        ListNode end = dummy;
        while (head.next != null) {
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if (end == null) {
                break;
            }
            ListNode start = hair.next;
            ListNode tail = end.next;
            end.next = null;
            hair.next = reverseGroup(start);
            start.next = tail;
            hair = start;
            end = start;
        }

        return dummy.next;
    }


    public ListNode reverseGroup(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
