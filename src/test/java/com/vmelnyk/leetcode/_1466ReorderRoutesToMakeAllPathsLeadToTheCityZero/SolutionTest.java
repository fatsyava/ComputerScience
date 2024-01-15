package com.vmelnyk.leetcode._1466ReorderRoutesToMakeAllPathsLeadToTheCityZero;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void minReorder() {
    Solution solution = new Solution();

    assertEquals(3, solution.minReorder(6, new int[][] {{1, 3}, {2, 3}, {4, 0}, {4, 5}, {0, 1}}));
    assertEquals(2, solution.minReorder(5, new int[][] {{1, 0}, {1, 2}, {3, 2}, {3, 4}}));
    assertEquals(0, solution.minReorder(3, new int[][] {{1, 0}, {2, 0}}));

    assertEquals(3, solution.minReorder(5, new int[][] {{1, 0}, {1, 2}, {2, 3}, {3, 4}}));
    assertEquals(4, solution.minReorder(5, new int[][] {{0, 1}, {1, 2}, {2, 3}, {1, 4}}));

    assertEquals(0, solution.minReorder(3, new int[][] {{2, 1}, {1, 0}}));
    assertEquals(2, solution.minReorder(5, new int[][] {{4, 3}, {2, 3}, {1, 2}, {1, 0}}));
    assertEquals(0, solution.minReorder(5, new int[][] {{4, 3}, {3, 2}, {2, 1}, {1, 0}}));
  }
}
