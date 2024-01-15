package com.vmelnyk.leetcode._2095DeleteTheMiddleNodeOfLinkedList;

import java.util.ArrayList;
import java.util.List;

import com.vmelnyk.leetcode.ListNode;

class Solution {
  public ListNode deleteMiddle(ListNode head) {
    ListNode dummy = new ListNode(0, head);
    ListNode slow = dummy;
    ListNode fast = dummy;

    while (fast.next != null && fast.next.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }

    // Delete the middle node.
    slow.next = slow.next.next;
    return dummy.next;
  }

  public ListNode deleteMiddleMy(ListNode head) {
    List<ListNode> nodes = new ArrayList<>();
    do {
      nodes.add(head);
      head = head.next;
    } while (head != null);

    final int size = nodes.size();
    final int deletePosition = size / 2;

    final ListNode removed = nodes.remove(deletePosition);
    if (deletePosition > 0) {
      nodes.get(deletePosition - 1).next = removed.next;
    } else {
      return null;
    }

    return nodes.get(0);
  }
}
