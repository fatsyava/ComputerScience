package com.vmelnyk.geeks4geeks.reverseFirstKElementsOfQueue;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GfGTest {

  @Test
  void modifyQueue() {
    GfG solution = new GfG();

    assertIterableEquals(
        List.of(3, 2, 1, 4, 5), solution.modifyQueue(new LinkedList<>(List.of(1, 2, 3, 4, 5)), 3));

    assertIterableEquals(
        List.of(1, 2, 3, 4), solution.modifyQueue(new LinkedList<>(List.of(4, 3, 2, 1)), 4));
  }
}
