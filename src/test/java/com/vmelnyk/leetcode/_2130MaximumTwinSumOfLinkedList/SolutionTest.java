package com.vmelnyk.leetcode._2130MaximumTwinSumOfLinkedList;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import com.vmelnyk.leetcode.ListNode;

class SolutionTest {

  @Test
  void pairSum() {
    Solution solution = new Solution();

    ListNode next;
    // 1st CASE
    next = new ListNode(1);
    next = new ListNode(2, next);
    next = new ListNode(4, next);

    assertEquals(6, solution.pairSum(new ListNode(5, next)));
  }
}
