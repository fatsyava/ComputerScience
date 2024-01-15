package com.vmelnyk.leetcode._2095DeleteTheMiddleNodeOfLinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
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
    next = new ListNode(6);
    next = new ListNode(2, next);
    next = new ListNode(1, next);
    next = new ListNode(7, next);
    next = new ListNode(4, next);
    next = new ListNode(3, next);
    result = solution.deleteMiddle(new ListNode(1, next));

    assertIterableEquals(List.of(1, 3, 4, 1, 2, 6), toList(result));
    // 2nd CASE
    next = new ListNode(4);
    next = new ListNode(3, next);
    next = new ListNode(2, next);
    result = solution.deleteMiddle(new ListNode(1, next));

    assertIterableEquals(List.of(1, 2, 4), toList(result));
    // 3rd CASE
    next = new ListNode(1);
    result = solution.deleteMiddle(new ListNode(2, next));

    assertIterableEquals(List.of(2), toList(result));
    // 4th CASE
    result = solution.deleteMiddle(new ListNode(1));

    assertIterableEquals(List.of(), toList(result));
  }
}
