package com.vmelnyk.leetcode._1207UniqueNumberOfOccurrences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void uniqueOccurrences() {
    Solution solution = new Solution();

    assertTrue(solution.uniqueOccurrences(new int[] {1, 2, 2, 1, 1, 3}));
    assertFalse(solution.uniqueOccurrences(new int[] {1, 2}));
  }
}
