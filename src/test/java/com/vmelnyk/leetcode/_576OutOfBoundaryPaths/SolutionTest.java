package com.vmelnyk.leetcode._576OutOfBoundaryPaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

  @Test
  void findPaths() {
    Solution solution = new Solution();

    assertEquals(6, solution.findPaths(2,2,2,1,1));
    assertEquals(12, solution.findPaths(1,3,3,0,1));
  }
}
