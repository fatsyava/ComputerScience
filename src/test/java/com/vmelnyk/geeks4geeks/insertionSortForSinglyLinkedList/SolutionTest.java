package com.vmelnyk.geeks4geeks.insertionSortForSinglyLinkedList;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void insertionSort() {
    Node head = new Node(30);
    Node node = new Node(23);
    head.next = node;
    node.next = new Node(28);
    node = node.next;
    node.next = new Node(30);
    node = node.next;
    node.next = new Node(11);
    node = node.next;
    node.next = new Node(14);
    node = node.next;
    node.next = new Node(19);
    node = node.next;
    node.next = new Node(16);
    node = node.next;
    node.next = new Node(21);
    node = node.next;
    node.next = new Node(25);
    node = node.next;

    System.out.println(toList(head));

    final Node sorted = Solution.insertionSort(head);

    System.out.println(toList(sorted));

  }

  private static List<Integer> toList(Node head) {
    List<Integer> nodes = new ArrayList<>();
    while (head != null) {
      nodes.add(head.data);
      head = head.next;
    }
    return nodes;
  }
}
