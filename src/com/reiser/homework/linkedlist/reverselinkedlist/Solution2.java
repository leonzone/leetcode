package com.reiser.homework.linkedlist.reverselinkedlist;

import com.reiser.homework.linkedlist.ListNode;

/**
 * @author: reiserx
 * Date:2020/9/9
 * Des:递归解法
 */

class Solution2 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }
}