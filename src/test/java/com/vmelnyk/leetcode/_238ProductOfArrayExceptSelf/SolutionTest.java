package com.vmelnyk.leetcode._238ProductOfArrayExceptSelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void productExceptSelf() {
    Solution solution = new Solution();

    assertArrayEquals(new int[] {24, 12, 8, 6}, solution.productExceptSelf(new int[] {1, 2, 3, 4}));
    assertArrayEquals(
        new int[] {0, 0, 9, 0, 0}, solution.productExceptSelf(new int[] {-1, 1, 0, -3, 3}));
  }
}
