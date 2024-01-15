package com.vmelnyk.leetcode;

import java.util.ArrayList;
import java.util.List;

public final class ListNode {
  public int val;
  public ListNode next;

  public ListNode() {}

  public ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static List<Integer> toList(ListNode head) {
    List<Integer> nodes = new ArrayList<>();
    while (head != null) {
      nodes.add(head.val);
      head = head.next;
    }
    return nodes;
  }
}
