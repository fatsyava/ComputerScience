package com.vmelnyk.geeks4geeks.q9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void maxSubarraySum() {
    Solution solution = new Solution();
    long actual = solution.maxSubarraySum(new int[] {0}, 1);
    assertEquals(0L, actual);
  }

  @Test
  void example0() {
    Solution solution = new Solution();
    long actual = solution.maxSubarraySum(new int[] {1, 2, 3, -2, 5}, 5);
    assertEquals(9L, actual);
  }

  @Test
  void example1() {
    Solution solution = new Solution();
    long actual = solution.maxSubarraySum(new int[] {-1, -2, -3, -4}, 4);
    assertEquals(-1L, actual);
  }
}
