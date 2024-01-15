package com.vmelnyk.geeks4geeks.merge2SortedLinkedListInReverseOrder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GfGTest {

  @Test
  void example1_1() {
    GfG gfG = new GfG();

    Node list1 = new Node(1);
    list1.next = new Node(3);

    Node list2 = new Node(2);
    list2.next = new Node(4);


    Node result = gfG.mergeResult(list1, list2);

    assertNotNull(result);
    assertEquals(4, result.data);
    result = result.next;
    assertEquals(3, result.data);
    result = result.next;
    assertEquals(2, result.data);
    result = result.next;
    assertEquals(1, result.data);
    result = result.next;
    assertNull(result);
  }

  @Test
  void example1_2() {
    GfG gfG = new GfG();

    Node list1 = new Node(5);
    list1.next = new Node(10);
    Node head = list1.next;
    head.next = new Node(15);
    head = head.next;
    head.next = new Node(40);

    Node list2 = new Node(2);
    list2.next = new Node(3);
    head = list2.next;
    head.next = new Node(20);


    Node result = gfG.mergeResult(list1, list2);

    assertNotNull(result);
    assertEquals(40, result.data);
    result = result.next;
    assertEquals(20, result.data);
    result = result.next;
    assertEquals(15, result.data);
    result = result.next;
    assertEquals(10, result.data);
    result = result.next;
    assertEquals(5, result.data);
    result = result.next;
    assertEquals(3, result.data);
    result = result.next;
    assertEquals(2, result.data);
    result = result.next;
    assertNull(result);
  }
}
