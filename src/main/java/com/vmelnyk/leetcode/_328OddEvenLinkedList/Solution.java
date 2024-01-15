package com.vmelnyk.leetcode._328OddEvenLinkedList;


import com.vmelnyk.leetcode.ListNode;

class Solution {
  public ListNode oddEvenList(ListNode head) {
    ListNode oddHead = new ListNode(Integer.MAX_VALUE);
    ListNode evenHead = new ListNode(Integer.MAX_VALUE);
    ListNode odd = oddHead;
    ListNode even = evenHead;
    boolean isOdd = true;

    while (head != null) {
      if (isOdd) {
        odd.next = head;
        odd = odd.next;
      } else {
        even.next = head;
        even = even.next;
      }

      isOdd = !isOdd;
      head = head.next;
    }

    odd.next = evenHead.next;
    even.next = null;
    return oddHead.next;
  }
}
