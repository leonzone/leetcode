package com.reiser.homework.linkedlist.linkedlistcycleii;

import com.reiser.homework.linkedlist.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: reiserx
 * Date:2020/9/10
 * Des:
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> hash = new HashSet<>();

        while (head != null) {
            if (hash.contains(head)) {
                return head;
            }
            hash.add(head);
            head = head.next;
        }
        return null;
    }
}
