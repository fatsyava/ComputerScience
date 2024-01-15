package com.vmelnyk.leetcode._1679MaxNumberOfKSumPairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void maxOperations() {
    Solution solution = new Solution();

    assertEquals(2, solution.maxOperations(new int[] {1, 2, 3, 4}, 5));
    assertEquals(1, solution.maxOperations(new int[] {3,1,3,4,3}, 6));
  }
}
