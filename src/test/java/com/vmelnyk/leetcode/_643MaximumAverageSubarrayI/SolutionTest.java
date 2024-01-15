package com.vmelnyk.leetcode._643MaximumAverageSubarrayI;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void findMaxAverage() {
    Solution solution = new Solution();

    assertEquals(12.75, solution.findMaxAverage(new int[] {1, 12, -5, -6, 50, 3}, 4));
    assertEquals(5, solution.findMaxAverage(new int[] {5}, 1));
  }
}
