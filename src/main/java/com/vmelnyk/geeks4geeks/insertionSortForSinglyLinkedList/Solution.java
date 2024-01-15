package com.vmelnyk.geeks4geeks.insertionSortForSinglyLinkedList;

class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}

class Solution {
  public static Node insertionSort(Node head) {
    // code here
    Node sorted = null;
    while (head != null) {
      Node current = head;
      head = head.next;
      if (sorted == null || current.data < sorted.data) {
        // insert to first position due to current.data < sorted.data
        current.next = sorted;
        sorted = current;
      } else {
        // insert between sorted elements
        // sorted1.data <= current.data < sorted2.data
        Node temp = sorted;
        while (temp.next != null && temp.next.data < current.data) {
          temp = temp.next;
        }
        current.next = temp.next;
        temp.next = current;
      }
    }

    return sorted;
  }
}
