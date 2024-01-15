package com.vmelnyk.leetcode._206ReverseLinkedList;

import org.junit.jupiter.api.Test;

import java.util.List;
import com.vmelnyk.leetcode.ListNode;

import static com.vmelnyk.leetcode.ListNode.toList;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void reverseList() {
    Solution solution = new Solution();

    ListNode next;
    ListNode result;
    // 1st CASE
    next = new ListNode(5);
    next = new ListNode(4, next);
    next = new ListNode(3, next);
    next = new ListNode(2, next);
    result = solution.reverseList(new ListNode(1, next));

    assertIterableEquals(List.of(5, 4, 3, 2, 1), toList(result));
  }
}
