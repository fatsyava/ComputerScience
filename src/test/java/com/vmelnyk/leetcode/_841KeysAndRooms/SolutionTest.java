package com.vmelnyk.leetcode._841KeysAndRooms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void canVisitAllRooms() {
    Solution solution = new Solution();

    assertTrue(solution.canVisitAllRooms(List.of(List.of(1), List.of(2), List.of(3), List.of())));
    assertFalse(
        solution.canVisitAllRooms(
            List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0))));
  }
}
