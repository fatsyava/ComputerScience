package com.vmelnyk.leetcode._206ReverseLinkedList;

import com.vmelnyk.leetcode.ListNode;

class Solution {
  public ListNode reverseList(ListNode head) {
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
