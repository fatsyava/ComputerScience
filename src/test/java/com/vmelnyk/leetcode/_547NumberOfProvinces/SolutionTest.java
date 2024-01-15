package com.vmelnyk.leetcode._547NumberOfProvinces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void findCircleNum() {
    Solution solution = new Solution();

    assertEquals(2, solution.findCircleNum(new int[][] {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
    assertEquals(3, solution.findCircleNum(new int[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}));
  }
}
