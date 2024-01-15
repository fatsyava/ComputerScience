package com.vmelnyk.leetcode._2130MaximumTwinSumOfLinkedList;


import com.vmelnyk.leetcode.ListNode;

class Solution {
  public int pairSum(ListNode head) {
    final ListNode middleNode = getMiddleNode(head);

    // `tail` points to the end of the reversed second half.
    ListNode tail = reverseList(middleNode);

    int result = 0;
    while (tail != null) {
      result = Math.max(result, head.val + tail.val);
      head = head.next;
      tail = tail.next;
    }

    return result;
  }

  private ListNode getMiddleNode(ListNode head) {
    ListNode slow = head, fast = head;
    // `slow` points to the start of the second half.
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
  }

  private ListNode reverseList(ListNode head) {
    ListNode node = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = node;
      node = head;
      head = next;
    }
    return node;
  }
}
