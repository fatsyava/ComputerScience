package com.vmelnyk.leetcode._328OddEvenLinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.vmelnyk.leetcode.ListNode.toList;
import static org.junit.jupiter.api.Assertions.*;
import com.vmelnyk.leetcode.ListNode;

class SolutionTest {

  @Test
  void deleteMiddle() {
    Solution solution = new Solution();

    ListNode next;
    ListNode result;
    // 1st CASE
    next = new ListNode(5);
    next = new ListNode(4, next);
    next = new ListNode(3, next);
    next = new ListNode(2, next);
    result = solution.oddEvenList(new ListNode(1, next));

    assertIterableEquals(List.of(1, 3, 5, 2, 4), toList(result));
    // 2nd CASE
    next = new ListNode(4);
    next = new ListNode(3, next);
    next = new ListNode(2, next);
    result = solution.oddEvenList(new ListNode(1, next));

    assertIterableEquals(List.of(1, 3, 2, 4), toList(result));
    // 3rd CASE
    next = new ListNode(1);
    result = solution.oddEvenList(new ListNode(2, next));

    assertIterableEquals(List.of(2, 1), toList(result));
    // 4th CASE
    result = solution.oddEvenList(new ListNode(1));

    assertIterableEquals(List.of(1), toList(result));
  }
}
