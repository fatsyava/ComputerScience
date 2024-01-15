package com.vmelnyk.geeks4geeks.longestSubarrayWithSumDivisibleByK;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void longSubarrWthSumDivByK() {
    Solution solution = new Solution();

    assertEquals(4, solution.longSubarrWthSumDivByK(new int[] {2, 7, 6, 1, 4, 5}, 6, 3));
  }
}
