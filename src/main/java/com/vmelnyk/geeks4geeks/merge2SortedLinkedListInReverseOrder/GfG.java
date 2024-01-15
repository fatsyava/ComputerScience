package com.vmelnyk.geeks4geeks.merge2SortedLinkedListInReverseOrder; /* Structure of the node*/

class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}

class GfG {
  Node mergeResult(Node node1, Node node2) {
    // Your code here
    Node node = null, tmp;
    while (node1 != null || node2 != null) {

      final boolean bothPresent = node1 != null && node2 != null;

      if (bothPresent && node1.data < node2.data) {
        tmp = node1;
        node1 = node1.next;
        tmp.next = node;
        node = tmp;
      } else if (bothPresent) {
        tmp = node2;
        node2 = node2.next;
        tmp.next = node;
        node = tmp;
      } else if (node1 != null) {
        tmp = node1;
        node1 = node1.next;
        tmp.next = node;
        node = tmp;
      } else if (node2 != null) {
        tmp = node2;
        node2 = node2.next;
        tmp.next = node;
        node = tmp;
      }
    }

    return node;
  }
}
