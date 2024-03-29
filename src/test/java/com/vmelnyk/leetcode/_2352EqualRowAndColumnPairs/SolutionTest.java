package com.vmelnyk.leetcode._2352EqualRowAndColumnPairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void equalPairs() {
    Solution solution = new Solution();

    assertEquals(1, solution.equalPairs(new int[][] {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}}));
    assertEquals(
        3,
        solution.equalPairs(new int[][] {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}}));
    assertEquals(4, solution.equalPairs(new int[][] {{13, 13}, {13, 13}}));
    assertEquals(9, solution.equalPairs(new int[][] {{13, 13, 13}, {13, 13, 13}, {13, 13, 13}}));
    assertEquals(4, solution.equalPairs(new int[][] {{13, 13, 14}, {13, 13, 13}, {13, 13, 13}}));
  }
}
