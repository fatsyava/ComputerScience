package com.vmelnyk.geeks4geeks.largestSumSubarrayOfSizeAtLeastK;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void example1() {
    Solution solution = new Solution();
    assertEquals(-1, solution.maxSumWithK(new long[] {-4, -2, 1, -3}, 4, 2));
    assertEquals(-3, solution.maxSumWithK(new long[] {-4, -3, -2, -1}, 4, 2));
    assertEquals(6, solution.maxSumWithK(new long[] {1, 1, 1, 1, 1, 1}, 6, 2));
    assertEquals(21, solution.maxSumWithK(new long[] {1, 2, 3, 4, 5, 6}, 6, 2));
  }
}
