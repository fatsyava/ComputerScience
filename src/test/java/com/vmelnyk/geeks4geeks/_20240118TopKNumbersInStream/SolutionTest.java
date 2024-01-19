package com.vmelnyk.geeks4geeks._20240118TopKNumbersInStream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void kTop() {

    assertIterableEquals(
        List.of(
            List.of(5), List.of(2, 5), List.of(1, 2, 5), List.of(1, 2, 3, 5), List.of(2, 1, 3, 5)),
        Solution.kTop(new int[] {5, 2, 1, 3, 2}, 5, 4));
    assertIterableEquals(
        List.of(
            List.of(2), List.of(1, 2), List.of(2, 1), List.of(1, 2), List.of(2, 1), List.of(1, 2)),
        Solution.kTop(new int[] {2, 1, 2, 1, 2, 1}, 6, 3));
    assertIterableEquals(
        List.of(List.of(3), List.of(3, 4)), Solution.kTop(new int[] {3, 4, 0, 0}, 3, 4));

    // 5th
    assertIterableEquals(
        List.of(List.of(9), List.of(1, 9), List.of(9, 1), List.of(1, 9), List.of(1, 9)),
        Solution.kTop(new int[] {9, 1, 9, 1, 4}, 5, 2));
  }
}
