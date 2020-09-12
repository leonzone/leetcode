package com.reiser.homework.linkedlist.swapnodesinpairs;

import com.reiser.homework.linkedlist.ListNode;

/**
 * @author: reiserx
 * Date:2020/9/10
 * Des: 暴力解法
 */
public class Solution {


    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode tmp_pre = null;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode tmp_next = head.next.next;
        head = head.next;
        while (true) {
            cur.next = pre;
            pre.next = tmp_next;
            if (tmp_pre != null) {
                tmp_pre.next = cur;
            }
            if (tmp_next == null || tmp_next.next == null) {
                break;
            }
            tmp_pre = pre;
            pre = tmp_next;
            cur = pre.next;
            tmp_next = cur.next;


        }
        return head;
    }
}